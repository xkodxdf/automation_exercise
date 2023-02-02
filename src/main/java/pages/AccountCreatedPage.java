package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.TopMenuPage;

public class AccountCreatedPage extends TopMenuPage {

    @FindBy(xpath = "//h2[@data-qa='account-created']/b")
    private WebElement accountCreatedHeader;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    private WebElement continueButton;


    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getAccountCreatedHeader() {

        return accountCreatedHeader;
    }

    public WebElement getContinueButton() {

        return continueButton;
    }


    public boolean isAccountCreatedHeaderDisplayed() {

        return verifyElementVisibility(accountCreatedHeader);
    }

    public String getAccCreatedHeaderText() {

        return getText(accountCreatedHeader);
    }

    public MainPage clickContinueButton() {
        click(continueButton);

        return new MainPage(getDriver());
    }
}
