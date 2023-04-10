package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import static java.lang.System.setProperty;

public enum BrowsersFactory implements AbstractWebDriver {
    CHROME {
        @Override
        public WebDriver createDriver() {
            setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
            return new ChromeDriver(getOptions());
        }

        public ChromeOptions getOptions() {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            return options;
        }
    },
    EDGE {
        @Override
        public WebDriver createDriver() {
            setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
            return new EdgeDriver(getOptions());
        }

        public EdgeOptions getOptions() {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--disable-notifications");
            return options;
        }
    }
}
