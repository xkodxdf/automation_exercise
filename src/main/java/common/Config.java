package common;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public abstract class Config {

    final String chromeDriver = "chrome";
    final String chromeDriverPath = "src/main/resources/web_driver/chromedriver.exe";
    final ChromeOptions chromeOptions = new ChromeOptions();
    final String firefoxDriver = "firefox";
    final String getGeckoDriverPath = "src/main/resources/web_driver/geckodriver.exe";
    final FirefoxOptions firefoxOptions = new FirefoxOptions();
    final String BROWSER = firefoxDriver;
    final String CHROME_WINDOW_SIZE = "--window-size=1920,1080";
    final String FIREFOX_WINDOW_WIDTH = "--width=1920";
    final String FIREFOX_WINDOW_HEIGHT = "--height=1080";
    final int IMPLICITLY_WAIT_SEC = 10;

}
