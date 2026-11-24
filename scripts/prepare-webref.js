// Writes the generator's inputs from the webref packages pinned in package-lock.json into the directory given as the
// only argument (Gradle passes generator/build/webref):
//  - webref-idl.json: the Web IDL of every spec in @webref/idl, parsed by webidl2 (spec shortname → definitions);
//  - webref-events.json: @webref/events, the event each `on…` handler receives;
//  - webref-css.json: the properties of @webref/css, for the CSSStyleProperties attributes that CSSOM defines in prose
//    rather than IDL;
//  - bcd-api.json: from @mdn/browser-compat-data (BCD), the MDN page and status of every Web API interface and of its
//    members, constructors (`Element.Element`), static members (`URL.canParse_static`) and events (`Element.click_event`),
//    for the KDoc of the generated declarations.
// Run by `./gradlew :generator:prepareWebref` with the Node.js of gradle-node-plugin; not committed.
// @webref/idl, @webref/events and @webref/css must come from the same webref crawl (compare `npm view <pkg> time`).

import fs from 'node:fs/promises';
import path from 'node:path';
import {listAll as listIdl} from '@webref/idl';
import events from '@webref/events';
import css from '@webref/css';
import {parse} from 'webidl2';
import bcd from '@mdn/browser-compat-data/forLegacyNode';

async function write(outDir, name, value) {
    await fs.writeFile(path.join(outDir, name), JSON.stringify(value, null, 2) + '\n', 'utf-8');
}

/** What the KDoc uses of a BCD compat statement: the MDN page, if there is one, and whether it is deprecated. */
function docs(compat) {
    return {mdnUrl: compat.mdn_url ?? null, deprecated: compat.status?.deprecated ?? false};
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

    const api = {};
    for (const [name, entry] of Object.entries(bcd.api)) {
        const members = {};
        for (const [key, member] of Object.entries(entry)) {
            if (key !== '__compat' && member.__compat) members[key] = docs(member.__compat);
        }
        api[name] = {...docs(entry.__compat), members};
    }
    await write(outDir, 'bcd-api.json', api);

    console.log(`Wrote ${Object.keys(idl).length} specs, events, ${properties.length} CSS properties and BCD for ${Object.keys(api).length} interfaces to ${outDir}.`);
}

main().catch(err => {
    console.error(err.message);
    process.exit(1);
});
