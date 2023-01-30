package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.TopMenuPage;


public class LoginPage extends TopMenuPage {

    @FindBy(xpath = "//div[@class='signup-form']/h2")
    private WebElement signUpHeader;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    private WebElement SignUpName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement SignUpEmail;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement signUpButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getSignUpHeader() {

        return signUpHeader;
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

    public LoginPage inputSignUpName(String name) {
        input(name, SignUpName);

        return new LoginPage(getDriver());
    }

    public LoginPage inputSignUpEmail(String email) {
        input(email, SignUpEmail);

        return new LoginPage(getDriver());
    }

    public SignUpPage clickSignUpButton() {
        click(signUpButton);

        return new SignUpPage(getDriver());
    }
}
