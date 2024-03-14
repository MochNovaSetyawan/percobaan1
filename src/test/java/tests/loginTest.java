package tests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.Test;
import pages.loginPage;

public class loginTest {

    @Test
    public void successfulLoginTest() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            loginPage LoginPage = new loginPage(page);

            page.navigate("https://sso.portaverse.co.id/login");
            LoginPage.login();

        }
    }
}
