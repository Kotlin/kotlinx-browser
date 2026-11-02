import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {parse} from 'webidl2';

const __dirname = path.dirname(fileURLToPath(import.meta.url));
const rootDir = path.resolve(__dirname, '..');
const idlDir = path.resolve(rootDir, 'idl');
const webrefJsonPath = path.resolve(rootDir, 'webref-idl.json');

async function main() {
    console.log(`Reading IDL files from ${idlDir}...`);
    const files = (await fs.readdir(idlDir)).filter(f => f.endsWith('.idl')).sort();
    if (files.length === 0) {
        console.error(`No .idl files found in ${idlDir}. Run copy script first.`);
        process.exit(1);
    }
    console.log(`Found ${files.length} .idl files.`);

    const parsedASTs = {};
    let errorCount = 0;

    for (const file of files) {
        const spec = path.basename(file, '.idl');
        const text = await fs.readFile(path.join(idlDir, file), 'utf-8');
        try {
            parsedASTs[spec] = parse(text);
        } catch (err) {
            console.error(`Error parsing ${file}:`, err.message);
            errorCount++;
        }
    }

    if (errorCount > 0) {
        console.error(`Parsing failed with ${errorCount} errors.`);
        process.exit(1);
    }

    console.log(`Writing parsed ASTs to ${webrefJsonPath}...`);
    await fs.writeFile(webrefJsonPath, JSON.stringify(parsedASTs, null, 2) + '\n', 'utf-8');
    console.log(`Successfully parsed ${files.length} IDL files to ${path.relative(rootDir, webrefJsonPath)}.`);
}

main().catch(err => {
    console.error('Failed to generate JSON from IDL files:', err);
    process.exit(1);
});
