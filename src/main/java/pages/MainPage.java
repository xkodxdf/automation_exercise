package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.NavigationBarPage;


public class MainPage extends NavigationBarPage {

    @FindBy(xpath = "//a[@href='/']/img")
    private WebElement logo;

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement signUpLoginLink;

    public WebElement getSignUpLoginLink() {

        return signUpLoginLink;
    }

    public WebElement getLogo() {

        return logo;
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage clickSignUpLogin() {
        click(signUpLoginLink);

        return new LoginPage(getDriver());
    }
}