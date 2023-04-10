package tests;

import configuration.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static data.User.DEFAULT_USER;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pages.PageExpressions.*;
import static pages.PageExpressions.loginPage;

public class AccountMenuTests extends BaseTest {

    @AfterEach
    public void closeBrowser() {
        getInstance().close();
    }
    @BeforeEach
    public void maximizeWindow() {
        getInstance().manage().window().maximize();
    }

    @Test
    @Timeout(15)
    void verifyLogOut() {
        loginPage
                .login(DEFAULT_USER);
        generalPage
                .clickOnAccountButton();
        accountMenu
                .clickOnLogOutButton();
        assertTrue
                (loginPage.isPasswordInputExists());
    }

}
