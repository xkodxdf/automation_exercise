package pages.base;

import org.openqa.selenium.WebDriver;


public abstract class BasePage {

    private WebDriver driver;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return driver;
    }

    public String getTitle() {

        return getDriver().getTitle();
    }

    public String getCurrentUrl() {

        return getDriver().getCurrentUrl();
    }
}
