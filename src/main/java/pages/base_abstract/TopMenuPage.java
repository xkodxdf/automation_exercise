package pages.base_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.DeleteAccountPage;
import pages.LoginPage;

public class TopMenuPage extends BasePage {

    @FindBy(xpath = "//a[@href='/']/img")
    private WebElement logo;

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement signUpLoginLink;

    @FindBy(xpath = "//a[text()[contains(.,'Logged in as')]]")
    private WebElement loggedInAsText;

    @FindBy(xpath = "//a[@href='/delete_account']")
    private WebElement deleteAccount;


    public TopMenuPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getSignUpLoginLink() {

        return signUpLoginLink;
    }

    public WebElement getLogo() {

        return logo;
    }

    public WebElement getLoggedInAsText() {

        return loggedInAsText;
    }

    public WebElement getDeleteAccount() {

        return deleteAccount;
    }


    public LoginPage clickSignUpLogin() {
        click(signUpLoginLink);

        return new LoginPage(getDriver());
    }

    public boolean isLogoDisplayed() {

        return verifyElementVisibility(logo);
    }

    public DeleteAccountPage clickDeleteAccount() {
        click(deleteAccount);

        return new DeleteAccountPage(getDriver());
    }
}
