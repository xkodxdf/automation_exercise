package common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
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

    @AfterTest
    protected void deleteAccountAfterRun() {
        beforeMethod();
        LoginPage loginPage = openMainPage().clickSignUpLogin();
        loginPage
                .fillLoginPageLoginForm()
                .clickLoginButton();
        if (loginPage.getCurrentUrl().equals(getBaseUrl())) {
            loginPage.clickDeleteAccount();
            quitDriver();
        } else {
            quitDriver();
        }
    }

    protected MainPage openMainPage() {
        driver.get(BASE_URL);

        return new MainPage(getDriver());
    }
}