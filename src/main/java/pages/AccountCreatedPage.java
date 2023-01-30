package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.TopMenuPage;

public class AccountCreatedPage extends TopMenuPage {

    @FindBy(xpath = "//h2[@data-qa='account-created']/b")
    private WebElement accountCreatedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    private WebElement continueButton;


    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getAccountCreatedText() {

        return accountCreatedText;
    }

    public WebElement getContinueButton() {

        return continueButton;
    }


    public boolean isAccountCreatedTextDisplayed() {

        return verifyElementVisibility(accountCreatedText);
    }

    public MainPage clickContinueButton() {
        click(continueButton);

        return new MainPage(getDriver());
    }
}
