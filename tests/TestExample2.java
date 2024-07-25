import com.microsoft.playwright.junit.UsePlaywright;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.*;

import org.junit.jupiter.api.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.*;

@UsePlaywright
public class TestExample2 {
    @Test
    void test(Page page) {
        page.navigate("https://lac-silicon-slb.staging.dc.lac.internal/");
        page.frameLocator("iframe[name=\"appframe0\"]").getByPlaceholder("Username").click();
        page.frameLocator("iframe[name=\"appframe0\"]").getByPlaceholder("Password").click();
        page.frameLocator("iframe[name=\"appframe0\"]").getByPlaceholder("Username").click();
        page.frameLocator("iframe[name=\"appframe0\"]").getByPlaceholder("Username").fill("lacqa");
        page.frameLocator("iframe[name=\"appframe0\"]").getByPlaceholder("Username").press("Enter");
        page.frameLocator("iframe[name=\"appframe0\"]").getByPlaceholder("Password").click();
        page.frameLocator("iframe[name=\"appframe0\"]").getByPlaceholder("Password").fill("zVTa18u7zk%4eQrm8R4x");
        page.frameLocator("iframe[name=\"appframe0\"]").getByPlaceholder("Password").click();
        page.frameLocator("iframe[name=\"appframe0\"]").locator("#loginarea").click();
        page.frameLocator("iframe[name=\"appframe0\"]").getByPlaceholder("Password").click();
        page.frameLocator("iframe[name=\"appframe0\"]").getByPlaceholder("Password").press("Enter");
        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(" SL Vertrag")).getByRole(AriaRole.CELL).first().click();
        page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("EK Daten Test")).click();
        page.getByText("Menü").click();
        page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("EDV Routinen")).click();
        page.frameLocator("iframe[name=\"appframe0\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Speichern")).click(new Locator.ClickOptions()
                .setButton(MouseButton.RIGHT));
        page.frameLocator("iframe[name=\"appframe0\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Speichern")).click(new Locator.ClickOptions()
                .setButton(MouseButton.RIGHT));
        assertThat(page.frameLocator("iframe[name=\"appframe0\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Loginparameter wechseln"))).isClickable();
    }
}