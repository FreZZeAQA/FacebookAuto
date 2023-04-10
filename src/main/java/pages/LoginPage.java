package pages;

import data.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.PageFactory.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static configuration.BaseTest.getInstance;

public class LoginPage {
    @FindBy(id = "email")
    private WebElement emailInput;
    @FindBy(id = "pass")
    private WebElement passwordInput;
    @FindBy(xpath = "//button[@value='1']")
    private WebElement signInButton;

    public LoginPage(WebDriver driver) {
        initElements(driver, this);
    }

    public void addEmail(User user) { //incorrect methods name, Should be addUsername or setUsername
        emailInput.sendKeys(user.getLOGIN());
    }

    public void addPassword(User user) { //incorrect methods name, Should be addUsername or setUsername
        passwordInput.sendKeys(user.getPASSWORD());
    }

    public void clickOnSignInButton() { // Should be named for example: clickOnLoginBtn
        signInButton.click();
    }

    public boolean isPasswordInputExists() {
        waitForVisibilityOfPasswordInput();
       return passwordInput.isDisplayed();
    }
    public void waitForVisibilityOfPasswordInput() {
        new WebDriverWait(getInstance(), ofSeconds(10))
                .until(visibilityOf(passwordInput));
    }
}
