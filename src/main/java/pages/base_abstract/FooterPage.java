package pages.base_abstract;

import common.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage extends TopMenuPage {

    @FindBy(xpath = "//div[@class='single-widget']/h2")
    private WebElement subscriptionH2text;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement subscriptionEmailInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement subscriptionSubmitButton;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    private WebElement subscriptionSuccessMessage;


    public FooterPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getSubscriptionH2text() {

        return subscriptionH2text;
    }

    public WebElement getSubscriptionEmailInput() {

        return subscriptionEmailInput;
    }

    public WebElement getSubscriptionSubmitButton() {

        return subscriptionSubmitButton;
    }

    public WebElement getSubscriptionSuccessMessage() {

        return subscriptionSuccessMessage;
    }


    public FooterPage scrollToSubscription() {
        scrollToElement(subscriptionEmailInput);

        return new FooterPage(getDriver());
    }

    public FooterPage inputEmail() {
        input(new Credentials().getEmail(), subscriptionEmailInput);

        return new FooterPage(getDriver());
    }

    public FooterPage inputEmail(String email) {
        input(email, subscriptionEmailInput);

        return new FooterPage(getDriver());
    }

    public void clickSubmitButton() {
        click(subscriptionSubmitButton);
    }
}
