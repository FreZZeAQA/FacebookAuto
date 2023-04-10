package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.*;
import static org.openqa.selenium.support.PageFactory.initElements;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static configuration.BaseTest.*;

public class GamingPage {
    @FindBy(xpath = "//span[text()='Top picks for you']")
    private WebElement topPicksText;

    public GamingPage(WebDriver driver) {
        initElements(driver, this);
    }

    public String getElementText(){
        new WebDriverWait(getInstance(), ofSeconds(10)).until(visibilityOf(topPicksText));
       return topPicksText.getText();
    }
}
