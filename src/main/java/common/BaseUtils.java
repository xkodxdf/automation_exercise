package common;

import io.github.bonigarcia.wdm.WebDriverManager;
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
                WebDriverManager.chromedriver().clearDriverCache().setup();
                driver = new ChromeDriver(chromeOptions.addArguments(CHROME_WINDOW_SIZE, "--remote-allow-origins=*"));
                break;
            case firefoxDriver:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(firefoxOptions.addArguments(FIREFOX_WINDOW_WIDTH, FIREFOX_WINDOW_HEIGHT));
                break;
            default:
                Assert.fail("!!!incorrect parameter in browser variable!!!\n" +
                        "BROWSER = " + BROWSER);
        }
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT_SEC));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY_WAIT_SEC));

        return driver;
    }
}