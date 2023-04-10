package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.PageFactory.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static configuration.BaseTest.getInstance;

public class AccountMenu {
@FindBy(xpath = "//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x xudqn12 x3x7a5m x6prxxf xvq8zen xk50ysn xzsf02u x1yc453h'and text()='Log Out']")
 private WebElement logOutButton;

    public AccountMenu(WebDriver driver) {
        initElements(driver, this);
    }

        public void clickOnLogOutButton(){
            new WebDriverWait(getInstance(), ofSeconds(10))
                    .until(elementToBeClickable(logOutButton)).click();
        }
}
