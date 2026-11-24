// Writes the generator's inputs from the webref packages pinned in package-lock.json into the directory given as the
// only argument (Gradle passes generator/build/webref):
//  - webref-idl.json: the Web IDL of every spec in @webref/idl, parsed by webidl2 (spec shortname → definitions);
//  - webref-events.json: @webref/events, the event each `on…` handler receives;
//  - webref-css.json: the properties of @webref/css, for the CSSStyleProperties attributes that CSSOM defines in prose
//    rather than IDL.
// Run by `./gradlew :generator:prepareWebref` with the Node.js of gradle-node-plugin; not committed.
// @webref/idl, @webref/events and @webref/css must come from the same webref crawl (compare `npm view <pkg> time`).

import fs from 'node:fs/promises';
import path from 'node:path';
import {listAll as listIdl} from '@webref/idl';
import events from '@webref/events';
import css from '@webref/css';
import {parse} from 'webidl2';

async function write(outDir, name, value) {
    await fs.writeFile(path.join(outDir, name), JSON.stringify(value, null, 2) + '\n', 'utf-8');
}

async function main() {
    const outDir = process.argv[2];
    if (!outDir) throw new Error('usage: node scripts/prepare-webref.js <output directory>');
    await fs.mkdir(outDir, {recursive: true});

    const idlFiles = await listIdl();
    const idl = {};
    const errors = [];

    const specs = Object.keys(idlFiles).sort();

    for (const spec of specs) {
        try {
            idl[spec] = parse(await idlFiles[spec].text());
        } catch (err) {
            errors.push(`${spec}: ${err.message}`);
        }
    }

    if (errors.length > 0) throw new Error(`webidl2 cannot parse ${errors.length} spec(s):\n${errors.join('\n')}`);
    await write(outDir, 'webref-idl.json', idl);

    await write(outDir, 'webref-events.json', await events.listAll());

    const {properties} = await css.listAll();
    await write(outDir, 'webref-css.json', properties);

    console.log(`Wrote ${Object.keys(idl).length} specs, events and ${properties.length} CSS properties to ${outDir}.`);
}

main().catch(err => {
    console.error(err.message);
    process.exit(1);
});
