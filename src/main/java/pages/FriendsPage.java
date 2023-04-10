package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.*;
import static org.openqa.selenium.support.PageFactory.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static configuration.BaseTest.*;

public class FriendsPage {
    @FindBy(xpath = "//div[@aria-label='Edit notification settings']")
    private WebElement settingsButton;
    @FindBy(xpath = "//input[@aria-label='Show notification dots']")
    private WebElement switchButton;

    public FriendsPage(WebDriver driver) {
        initElements(driver, this);
    }

    public void clickOnSettingsButton() {
        settingsButton = new WebDriverWait(getInstance(), ofSeconds(10))
                .until(elementToBeClickable(settingsButton));
        settingsButton.click();
    }

    public boolean isSwitchButtonIsSelected() {
        switchButton = new WebDriverWait(getInstance(), ofSeconds(10))
                .until(visibilityOf(switchButton));
        return switchButton.isSelected();
    }

}

