// Updates mdn/summaries.json and mdn/commit from MDN's metadata (https://developer.mozilla.org/en-US/metadata.json):
// the one-paragraph summary of every Web API page, keyed by its path (`Web/API/Element/getAttribute`), and the
// mdn/content commit it was built from. Run by `./gradlew :generator:updateMdnSummaries`, the output is committed:
// MDN publishes no versioned release of its content, so this is how it is pinned and reviewed.
//
// The summaries are MDN prose, licensed CC-BY-SA 2.5 by Mozilla Contributors (see NOTICE), unlike the rest of the
// repository. The generator prints them into KDoc, each with a link to its page.

import fs from 'node:fs/promises';
import path from 'node:path';

const METADATA = 'https://developer.mozilla.org/en-US/metadata.json';
const PREFIX = '/en-US/docs/';
const SECTION = 'Web/API/';

async function main() {
    const outDir = process.argv[2];
    if (!outDir) throw new Error('usage: node scripts/fetch-mdn.js <output directory>');

    const response = await fetch(METADATA);
    if (!response.ok) throw new Error(`${METADATA}: ${response.status} ${response.statusText}`);
    const entries = await response.json();

    const summaries = {};
    for (const {mdn_url: url, summary} of entries) {
        if (!url.startsWith(PREFIX + SECTION) || !summary) continue;
        summaries[url.slice(PREFIX.length)] = summary.trim();
    }
    const sorted = Object.fromEntries(
        Object.entries(summaries).sort()
    );

    // The newest page's last commit: the state of mdn/content the metadata was built from.
    const latest = entries.reduce(
        (a, b) =>
            (!a || b.modified > a.modified ? b : a),
        null
    );

    const commit = latest?.source?.last_commit_url;
    if (!commit) throw new Error('cannot determine the mdn/content commit of the metadata');

    await fs.mkdir(outDir, {recursive: true});
    await fs.writeFile(path.join(outDir, 'summaries.json'), JSON.stringify(sorted, null, 2) + '\n', 'utf-8');
    await fs.writeFile(path.join(outDir, 'commit'), commit + '\n', 'utf-8');
    console.log(`Wrote ${Object.keys(sorted).length} summaries of mdn/content ${commit} to ${outDir}.`);
}

main().catch(err => {
    console.error(err.message);
    process.exit(1);
});
