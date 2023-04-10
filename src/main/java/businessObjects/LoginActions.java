package businessObjects;

import data.User;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginActions extends LoginPage {

    public LoginActions(WebDriver driver) {
        super(driver);
    }

    public void login(User user) {
        addEmail(user);
        addPassword(user);
        clickOnSignInButton();
    }

}
