// Verifies that the generator's IR is lossless: the IR of every spec, rendered back as Web IDL by
// `./gradlew :generator:dumpIdlIr`, must re-parse with webidl2 into exactly the committed webref-idl.json.
// Run after `npm run ingest` when bumping @webref/idl or webidl2: `npm run check:ir-roundtrip`.
import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {parse} from 'webidl2';

const __dirname = path.dirname(fileURLToPath(import.meta.url));
const rootDir = path.resolve(__dirname, '..');
const renderedDir = path.resolve(rootDir, 'generator/build/idl-ir');

async function main() {
    const corpus = JSON.parse(await fs.readFile(path.resolve(rootDir, 'webref-idl.json'), 'utf-8'));
    let problems = 0;
    for (const spec of Object.keys(corpus)) {
        let rendered;
        try {
            rendered = await fs.readFile(path.join(renderedDir, `${spec}.idl`), 'utf-8');
        } catch {
            console.error(`${spec}: not rendered; run ./gradlew :generator:dumpIdlIr first`);
            problems++;
            continue;
        }
        let reparsed;
        try {
            reparsed = parse(rendered);
        } catch (err) {
            console.error(`${spec}: rendered IR does not parse: ${err.message}`);
            problems++;
            continue;
        }
        const expected = corpus[spec];
        const index = reparsed.findIndex((d, i) => JSON.stringify(d) !== JSON.stringify(expected[i]));
        if (index !== -1 || reparsed.length !== expected.length) {
            const at = index !== -1 ? index : Math.min(reparsed.length, expected.length);
            console.error(`${spec}: IR round-trip differs at definition #${at} (${expected[at]?.name ?? expected[at]?.target ?? '?'})`);
            problems++;
        }
    }
    if (problems > 0) {
        console.error(`IR round-trip failed for ${problems} spec(s).`);
        process.exit(1);
    }
    console.log(`IR round-trip is lossless for all ${Object.keys(corpus).length} specs.`);
}

main().catch(err => {
    console.error(err);
    process.exit(1);
});
