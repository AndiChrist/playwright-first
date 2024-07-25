import { test, expect } from '@playwright/test';

test.use({
    ignoreHTTPSErrors: true
});

test('login', async ({ page }) => {
    test.setTimeout(120000);

    await page.goto('https://lac-silicon-slb.staging.dc.lac.internal/');
    await page.frameLocator('iframe[name="appframe0"]').getByPlaceholder('Username').click();
    await page.frameLocator('iframe[name="appframe0"]').getByPlaceholder('Username').fill('lacqa');
    await page.frameLocator('iframe[name="appframe0"]').getByPlaceholder('Username').press('Tab');
    await page.frameLocator('iframe[name="appframe0"]').getByPlaceholder('Password').fill('zVTa18u7zk%4eQrm8R4x');
    await page.frameLocator('iframe[name="appframe0"]').getByPlaceholder('Password').press('Enter');
});