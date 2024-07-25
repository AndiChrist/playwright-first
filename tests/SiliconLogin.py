import re
from playwright.sync_api import Page, expect


@pytest.fixture(scope="session")
def browser_context_args(browser_context_args, playwright):
    return {"ignore_https_errors": True}


def test_example(page: Page) -> None:
    page.goto("https://lac-silicon-slb.staging.dc.lac.internal/")
    page.frame_locator("iframe[name=\"appframe0\"]").get_by_placeholder("Username").click()
    page.frame_locator("iframe[name=\"appframe0\"]").get_by_placeholder("Username").fill("lacqa")
    page.frame_locator("iframe[name=\"appframe0\"]").get_by_placeholder("Username").press("Tab")
    page.frame_locator("iframe[name=\"appframe0\"]").get_by_placeholder("Password").fill("zVTa18u7zk%4eQrm8R4x")
    page.frame_locator("iframe[name=\"appframe0\"]").get_by_placeholder("Password").press("Enter")
    page.get_by_role("row", name=" SL Vertrag").get_by_role("cell").first.click()
    page.get_by_role("cell", name="Angebot").click()
    page.frame_locator("iframe[name=\"appframe0\"]").frame_locator("iframe[name=\"search_frame\"]").get_by_label("Vertragsnr.", exact=True).press("Escape")
    page.frame_locator("iframe[name=\"appframe0\"]").frame_locator("iframe[name=\"search_frame\"]").get_by_label("Vertragsnr.", exact=True).click()
    page.frame_locator("iframe[name=\"appframe0\"]").frame_locator("iframe[name=\"search_frame\"]").get_by_label("Vertragsnr.", exact=True).fill("1234")
    page.once("dialog", lambda dialog: dialog.dismiss())
    page.frame_locator("iframe[name=\"appframe0\"]").frame_locator("iframe[name=\"search_frame\"]").get_by_label("Vertragsnr.", exact=True).press("Enter")
