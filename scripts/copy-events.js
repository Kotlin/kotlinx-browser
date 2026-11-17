import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import events from '@webref/events';

const __dirname = path.dirname(fileURLToPath(import.meta.url));
const rootDir = path.resolve(__dirname, '..');
const webrefEventsPath = path.resolve(rootDir, 'webref-events.json');

// The events crawled from the same specs as @webref/idl: the generator reads it to type `on<event>` handler attributes.
// Keep the @webref/events version in package.json in step with @webref/idl (the release from the same crawl).
async function main() {
    const all = await events.listAll();
    console.log(`Found ${all.length} events in @webref/events.`);
    await fs.writeFile(webrefEventsPath, JSON.stringify(all, null, 2) + '\n', 'utf-8');
    console.log(`Wrote ${path.relative(rootDir, webrefEventsPath)}.`);
}

main().catch(err => {
    console.error('Failed to copy @webref/events:', err);
    process.exit(1);
});
