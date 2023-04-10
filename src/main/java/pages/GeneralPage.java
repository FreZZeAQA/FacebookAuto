package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static java.time.Duration.*;
import static org.openqa.selenium.support.PageFactory.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static configuration.BaseTest.*;

public class GeneralPage {

    @FindBy(xpath = "//input[@aria-label='Search Facebook']")
    private WebElement searchInput;
    @FindBy(xpath = "//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft' and text()='Search for ']")
    private WebElement searchForButton;
    @FindBy(xpath = "//div[@class='x78zum5 x1n2onr6']")
    private WebElement accountButton;
    @FindBy(xpath = "//div[@class='x6s0dn4 x78zum5 x1s65kcs x1n2onr6']//a[@aria-label]")
    private List<WebElement> middleButtons;


    public GeneralPage(WebDriver driver) {
        initElements(driver, this);
    }


    public void addSearchContext(String context) {
        searchInput.sendKeys(context);
    }

    public boolean isSearchForButtonExists() {
        waitForVisibilityOfSearchButton();
        return searchForButton.isDisplayed();
    }

    public void waitForVisibilityOfSearchButton() {
        new WebDriverWait(getInstance(), ofSeconds(10))
                .until(visibilityOf(searchForButton));
    }

    public void clickOnGeneralOption(GeneralPageOptions generalPageOption) {
        middleButtons
                .stream()
                .filter
                        (webElement -> webElement.getAttribute("aria-label")
                                .equals(generalPageOption.getAriaLabelValue()))
                .findFirst().get().click();
    }

    public void clickOnAccountButton() {
        accountButton.click();
    }
}


