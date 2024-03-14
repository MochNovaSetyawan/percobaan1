package pages;

import com.microsoft.playwright.Page;

public class loginPage {
    private Page page;

    private String field_email = "[name='email']";
    private String field_password = "[name='password']";
    private String button_login = "[class='mantine-qo1k2 mantine-Button-label']";

    public loginPage (Page page) {
        this.page = page;
    }

    public void login() {
        page.locator(field_email).fill("nova");
        page.locator(field_password).fill("nova");
        page.locator(button_login).click();
    }
}
