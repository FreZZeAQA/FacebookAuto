package tests;

import configuration.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static data.User.DEFAULT_USER;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pages.GeneralPageOptions.FRIENDS;
import static pages.PageExpressions.*;
import static pages.PageExpressions.friendsPage;

public class FriendsTests extends BaseTest {

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
    void verifySettingsButtonSelected() {
        loginPage
                .login(DEFAULT_USER);
        generalPage
                .clickOnGeneralOption(FRIENDS);
        friendsPage
                .clickOnSettingsButton();
        assertTrue
                (friendsPage.isSwitchButtonIsSelected());

    }
}
