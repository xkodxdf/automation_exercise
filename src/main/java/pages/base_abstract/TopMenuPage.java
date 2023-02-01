package pages.base_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.DeleteAccountPage;
import pages.LoginPage;

public abstract class TopMenuPage extends BasePage {

    @FindBy(xpath = "//a[@href='/']/img")
    private WebElement logo;

    @FindBy(xpath = "//ul/li[1]/a")
    private WebElement homeLink;

    @FindBy(xpath = "//ul/li[2]/a")
    private WebElement productsLink;

    @FindBy(xpath = "//ul/li[3]/a")
    private WebElement cartLink;

    @FindBy(xpath = "//ul/li[4]/a")
    private WebElement signUpLoginLink;

    @FindBy(xpath = "//ul/li[5]/a")
    private WebElement testCasesLink;

    @FindBy(xpath = "//ul/li[6]/a")
    private WebElement apiTestingLink;

    @FindBy(xpath = "//ul/li[7]/a")
    private WebElement videoTutorsLink;

    @FindBy(xpath = "//ul/li[8]/a")
    private WebElement contactUsLink;

    @FindBy(xpath = "//a[text()[contains(.,'Logged in as')]]")
    private WebElement loggedInAsText;

    @FindBy(xpath = "//a[@href='/delete_account']")
    private WebElement deleteAccount;


    public TopMenuPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getLogo() {

        return logo;
    }

    public WebElement getHomeLink() {

        return homeLink;
    }

    public WebElement getProductsLink() {

        return productsLink;
    }

    public WebElement getCartLink() {

        return cartLink;
    }

    public WebElement getSignUpLoginLink() {

        return signUpLoginLink;
    }

    public WebElement getTestCasesLink() {

        return testCasesLink;
    }

    public WebElement getApiTestingLink() {

        return apiTestingLink;
    }

    public WebElement getVideoTutorsLink() {

        return videoTutorsLink;
    }

    public WebElement getContactUsLink() {

        return contactUsLink;
    }

    public WebElement getLoggedInAsText() {

        return loggedInAsText;
    }

    public WebElement getDeleteAccount() {

        return deleteAccount;
    }


    @Override
    public String getTitle() {

        return getDriver().getTitle();
    }

    @Override
    public String getCurrentUrl() {

        return getDriver().getCurrentUrl();
    }

    @Override
    public String getText(WebElement element) {

        return element.getText();
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
