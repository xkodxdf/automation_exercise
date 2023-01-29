package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.NavigationBarPage;

public class DeleteAccountPage extends NavigationBarPage {

    @FindBy(xpath = "//h2[@data-qa='account-deleted']/b")
    private WebElement accountDeletedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    private WebElement continueButton;


    public DeleteAccountPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getAccountDeletedText() {

        return accountDeletedText;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }


    public boolean isAccountDeletedTextDisplayed() {

        return verifyElementVisibility(accountDeletedText);
    }

    public MainPage clickContinueButton() {
        click(continueButton);

        return new MainPage(getDriver());
    }

}
