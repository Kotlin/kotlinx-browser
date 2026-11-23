import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import css from '@webref/css';

const __dirname = path.dirname(fileURLToPath(import.meta.url));
const rootDir = path.resolve(__dirname, '..');
const webrefCssPath = path.resolve(rootDir, 'webref-css.json');

// The CSS properties crawled from the same specs as @webref/idl: CSSOM defines one CSSStyleProperties attribute per
// property in prose, not in IDL, so the generator reads their names from here. Only the fields it reads are kept, so
// the committed file stays a reviewable diff. Keep the @webref/css version in package.json in step with @webref/idl
// (the release from the same crawl).
async function main() {
    const {properties} = await css.listAll();
    const trimmed = properties
        .map(({name, legacyAliasOf, styleDeclaration}) => ({name, legacyAliasOf, styleDeclaration}))
        .sort((a, b) => a.name.localeCompare(b.name));
    console.log(`Found ${trimmed.length} properties in @webref/css.`);
    await fs.writeFile(webrefCssPath, JSON.stringify(trimmed, null, 2) + '\n', 'utf-8');
    console.log(`Wrote ${path.relative(rootDir, webrefCssPath)}.`);
}

main().catch(err => {
    console.error('Failed to copy @webref/css:', err);
    process.exit(1);
});
