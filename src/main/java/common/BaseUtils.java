package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;

final class BaseUtils extends Config {

    WebDriver initDriver() {
        WebDriver driver = null;
        switch (BROWSER) {
            case chromeDriver:
                System.setProperty("webdriver.chrome.driver", chromeDriverPath);
                driver = new ChromeDriver(chromeOptions.addArguments(BROWSER_WINDOW_SIZE));
                break;
            case firefoxDriver:
                System.setProperty("webdriver.gecko.driver", getGeckoDriverPath);
                driver = new FirefoxDriver(firefoxOptions.addArguments(BROWSER_WINDOW_SIZE));
                break;
            default:
                Assert.fail("!!!incorrect parameter in browser variable!!!\n" +
                        "BROWSER = " + BROWSER);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY_WAIT_SEC));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(IMPLICITLY_WAIT_SEC));

        return driver;
    }
}