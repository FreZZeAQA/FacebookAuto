package tests;

import configuration.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static data.User.DEFAULT_USER;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pages.GeneralPageOptions.GAMING;
import static pages.PageExpressions.*;
import static pages.PageExpressions.generalPage;

@Execution(ExecutionMode.CONCURRENT)
public class GeneralTests extends BaseTest {

    @AfterEach
    public void closeBrowser() {
        getInstance().close();
    }
    @BeforeEach
    public void maximizeWindow() {
        getInstance().manage().window().maximize();
        }

    @Test
    @Timeout(25)
    void verifyGamingButton() {
        loginPage
                .login(DEFAULT_USER);
        generalPage
                .clickOnGeneralOption(GAMING);
        assertEquals
                ("Top picks for you", gamingPage.getElementText());
    }

    @Test
    @Timeout(15)
    void verifySearchContext() {
        loginPage
                .login(DEFAULT_USER);
        generalPage
                .addSearchContext("Ihor Stakhiv");
        assertTrue
                (generalPage.isSearchForButtonExists());

    }
}
