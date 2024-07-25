import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions());
            Page page = context.newPage();
            page.navigate("https://lac-silicon-slb.staging.dc.lac.internal/");
            page.frameLocator("iframe[name=\"appframe0\"]").getByPlaceholder("Username").click();
            page.frameLocator("iframe[name=\"appframe0\"]").getByPlaceholder("Username").fill("lacqa");
            page.frameLocator("iframe[name=\"appframe0\"]").getByPlaceholder("Username").press("Tab");
            page.frameLocator("iframe[name=\"appframe0\"]").getByPlaceholder("Password").fill("zVTa18u7zk%4eQrm8R4x");
            page.frameLocator("iframe[name=\"appframe0\"]").getByPlaceholder("Password").press("Enter");
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(" SL Vertrag")).getByRole(AriaRole.CELL).first().click();
            page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Angebot")).click();
            page.frameLocator("iframe[name=\"appframe0\"]").frameLocator("iframe[name=\"search_frame\"]").getByLabel("Vertragsnr.", new FrameLocator.GetByLabelOptions().setExact(true)).press("Escape");
            page.frameLocator("iframe[name=\"appframe0\"]").frameLocator("iframe[name=\"search_frame\"]").getByLabel("Vertragsnr.", new FrameLocator.GetByLabelOptions().setExact(true)).click();
            page.frameLocator("iframe[name=\"appframe0\"]").frameLocator("iframe[name=\"search_frame\"]").getByLabel("Vertragsnr.", new FrameLocator.GetByLabelOptions().setExact(true)).fill("1234");
            page.onceDialog(dialog -> {
                System.out.println(String.format("Dialog message: %s", dialog.message()));
                dialog.dismiss();
            });
            page.frameLocator("iframe[name=\"appframe0\"]").frameLocator("iframe[name=\"search_frame\"]").getByLabel("Vertragsnr.", new FrameLocator.GetByLabelOptions().setExact(true)).press("Enter");
        }
    }
}