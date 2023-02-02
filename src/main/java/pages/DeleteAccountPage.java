package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.TopMenuPage;

public class DeleteAccountPage extends TopMenuPage {

    @FindBy(xpath = "//h2[@data-qa='account-deleted']/b")
    private WebElement accountDeletedHeader;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    private WebElement continueButton;


    public DeleteAccountPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getAccountDeletedHeader() {

        return accountDeletedHeader;
    }

    public WebElement getContinueButton() {

        return continueButton;
    }


    public boolean isAccountDeletedTextDisplayed() {

        return verifyElementVisibility(accountDeletedHeader);
    }

    public String getAccDeletedHeaderText() {

        return getText(accountDeletedHeader);
    }

    public MainPage clickContinueButton() {
        click(continueButton);

        return new MainPage(getDriver());
    }

}
