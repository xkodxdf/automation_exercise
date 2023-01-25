package common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.MainPage;


public abstract class BaseTest {

    private WebDriver driver;
    private final String BASE_URL = "https://www.automationexercise.com/";


    public WebDriver getDriver() {

        return driver;
    }

    public String getBaseUrl() {

        return BASE_URL;
    }


    @BeforeMethod
    protected void beforeMethod() {
        driver = new BaseUtils().initDriver();
    }

    @AfterMethod
    protected void quitDriver() {
        driver.quit();
    }

    protected MainPage openMainPage() {
        driver.get(BASE_URL);

        return new MainPage(getDriver());
    }
}