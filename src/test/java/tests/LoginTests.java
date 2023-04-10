package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import configuration.BaseTest;

import static data.User.*;
import static org.junit.jupiter.api.Assertions.*;
import static pages.PageExpressions.*;


public class LoginTests extends BaseTest {

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
    void verifyCorrectCredentialLogin() {
        loginPage
                .login(DEFAULT_USER);
        assertTrue
                (homePage.isStoriesButtonDisplayed());

    }
}