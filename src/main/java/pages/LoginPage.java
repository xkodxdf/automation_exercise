package pages;

import common.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.TopMenuPage;


public class LoginPage extends TopMenuPage {

    @FindBy(xpath = "//div[@class='login-form']/h2")
    private WebElement loginHeader;

    @FindBy(xpath = "//div[@class='signup-form']/h2")
    private WebElement signUpHeader;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement loginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    private WebElement SignUpName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement SignUpEmail;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement signUpButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getLoginHeader() {

        return loginHeader;
    }

    public WebElement getSignUpHeader() {

        return signUpHeader;
    }

    public WebElement getLoginEmail() {

        return loginEmail;
    }

    public WebElement getLoginPassword() {

        return loginPassword;
    }

    public WebElement getLoginButton() {

        return loginButton;
    }

    public WebElement getSignUpName() {

        return SignUpName;
    }

    public WebElement getSignUpEmail() {

        return SignUpEmail;
    }

    public WebElement getSignUpButton() {

        return signUpButton;
    }


    public boolean isSignUpHeaderDisplayed() {
        return verifyElementVisibility((signUpHeader));
    }

    public String getSignUpHeaderText() {

        return getText(signUpHeader);
    }

    public LoginPage inputSignUpName(String name) {
        input(name, SignUpName);

        return new LoginPage(getDriver());
    }

    public LoginPage inputSignUpName() {
        input(new Credentials().getName(), SignUpName);

        return new LoginPage(getDriver());
    }

    public LoginPage inputSignUpEmail(String email) {
        input(email, SignUpEmail);

        return new LoginPage(getDriver());
    }

    public LoginPage inputSignUpEmail() {
        input(new Credentials().getEmail(), SignUpEmail);

        return new LoginPage(getDriver());
    }

    public LoginPage fillLoginPageSignUpForm() {
        inputSignUpName();
        inputSignUpEmail();

        return new LoginPage(getDriver());
    }

    public SignUpPage clickSignUpButton() {
        click(signUpButton);

        return new SignUpPage(getDriver());
    }
}
