package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import static configuration.BrowsersFactory.*;
import static java.lang.System.*;
import static org.openqa.selenium.support.PageFactory.*;

public class BaseTest {

    private static ThreadLocal<WebDriver> driver;

    public static void start(BrowsersFactory browser){
        driver = new ThreadLocal<>();

        switch (browser){
            case EDGE -> driver.set(EDGE.createDriver());
            case CHROME -> driver.set(CHROME.createDriver());
        }
    }


    public static WebDriver getInstance() {
        if (driver == null) {
            start(EDGE);
        }
        return driver.get();
    }


    public BaseTest() {
        getInstance().get("https://www.facebook.com/");
        initElements(driver.get(), this);
    }
}


