package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.BasePage;


public class MainPage extends BasePage {

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement signUpLoginLink;

    public WebElement getSignUpLoginLink() {

        return signUpLoginLink;
    }


    public MainPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage clickSignUpLogin() {
        click(signUpLoginLink);

        return new LoginPage(getDriver());
    }
}