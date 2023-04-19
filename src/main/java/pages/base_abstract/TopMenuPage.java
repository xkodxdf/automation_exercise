package pages.base_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.*;

public abstract class TopMenuPage extends BasePage {

    @FindBy(xpath = "//a[@href='/']/img")
    private WebElement logo;

    @FindBy(xpath = "//li/a[@href='/']")
    private WebElement homeLink;

    @FindBy(xpath = "//li/a[@href='/products']")
    private WebElement productsLink;

    @FindBy(xpath = "//li/a[@href='/view_cart']")
    private WebElement cartLink;

    @FindBy(xpath = "//li/a[@href='/login']")
    private WebElement signUpLoginLink;

    @FindBy(xpath = "//a[@href='/logout']")
    private WebElement logOutLink;

    @FindBy(xpath = "//li/a[@href='/test_cases']")
    private WebElement testCasesLink;

    @FindBy(xpath = "//li/a[@href='/api_list']")
    private WebElement apiTestingLink;

    @FindBy(xpath = "//i[@class='fa fa-youtube-play']/parent::a")
    private WebElement videoTutorsLink;

    @FindBy(xpath = "//a[@href='/contact_us']")
    private WebElement contactUsLink;

    @FindBy(xpath = "//i[@class='fa fa-user']/parent::a")
    private WebElement loggedInAs;

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

    public WebElement getLogOutLink() {

        return logOutLink;
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

    public WebElement getLoggedInAs() {

        return loggedInAs;
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

    public ProductsPage clickProducts() {
        click(productsLink);

        return new ProductsPage(getDriver());
    }

    public LoginPage clickSignUpLogin() {
        click(signUpLoginLink);

        return new LoginPage(getDriver());
    }

    public TestCasesPage clickTestCases() {
        click(testCasesLink);

        return new TestCasesPage(getDriver());
    }

    public LoginPage clickLogOut() {
        click(logOutLink);

        return new LoginPage(getDriver());
    }

    public ContactUsPage clickContactUs() {
        click(contactUsLink);

        return new ContactUsPage(getDriver());
    }

    public boolean isLogoDisplayed() {

        return verifyElementVisibility(logo);
    }

    public boolean isLoggedInAsDisplayed() {

        return verifyElementVisibility(loggedInAs);
    }

    public String getLoggedInAsText() {

        return getText(loggedInAs);
    }

    public DeleteAccountPage clickDeleteAccount() {
        click(deleteAccount);

        return new DeleteAccountPage(getDriver());
    }

    public CartPage clickCart() {
        click(cartLink);

        return new CartPage(getDriver());
    }
}
