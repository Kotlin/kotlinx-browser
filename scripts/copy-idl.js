import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {listAll} from '@webref/idl';

const __dirname = path.dirname(fileURLToPath(import.meta.url));
const rootDir = path.resolve(__dirname, '..');
const idlDir = path.resolve(rootDir, 'idl');

async function main() {
    console.log('Resolving @webref/idl files...');
    const allIdlFiles = await listAll();
    const specNames = Object.keys(allIdlFiles).sort();
    console.log(`Found ${specNames.length} IDL specifications in @webref/idl.`);

    // Get pinned package versions
    const pkgJsonPath = path.resolve(rootDir, 'package.json');
    const pkgJson = JSON.parse(await fs.readFile(pkgJsonPath, 'utf-8'));

    // Ensure idl directory exists and clean old files
    await fs.mkdir(idlDir, {recursive: true});
    const existingFiles = await fs.readdir(idlDir);
    for (const file of existingFiles) {
        if (file.endsWith('.idl') || file === 'version.json') {
            await fs.unlink(path.join(idlDir, file));
        }
    }

    // Extract IDL files into idl/
    console.log(`Copying ${specNames.length} .idl files into ${idlDir}...`);
    for (const spec of specNames) {
        const idlFile = allIdlFiles[spec];
        const text = await idlFile.text();
        const destPath = path.join(idlDir, `${spec}.idl`);
        await fs.writeFile(destPath, text, 'utf-8');
    }

    console.log('Copy complete:');
    console.log(` - ${specNames.length} IDL files copied to ${path.relative(rootDir, idlDir)}/`);
}

main().catch(err => {
    console.error('Failed to copy IDL files:', err);
    process.exit(1);
});
