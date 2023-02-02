import common.BaseTest;
import common.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
import pages.AccountCreatedPage;
import pages.DeleteAccountPage;
import pages.MainPage;


public class DeleteAccountTest extends BaseTest {

    @Test
    public void testRegisterUser() {

        AccountCreatedPage accountCreatedPage = openMainPage()
                .clickSignUpLogin()
                .fillLoginPageSignUpForm()
                .clickSignUpButton()
                .fillSignUpPageSignUpForm()
                .clickCreateAccount();

        String expectedHeaderText = "ACCOUNT CREATED!";

        Assert.assertTrue(accountCreatedPage.isAccountCreatedHeaderDisplayed());
        Assert.assertEquals(accountCreatedPage.getAccCreatedHeaderText(), expectedHeaderText);

        MainPage mainPage = accountCreatedPage.clickContinueButton();

        String expectedLoggedInText = "Logged in as " + new Credentials().getName();

        Assert.assertTrue(mainPage.isLoggedInAsDisplayed());
        Assert.assertEquals(mainPage.getLoggedInAsText(), expectedLoggedInText);

        DeleteAccountPage deleteAccountPage = mainPage.clickDeleteAccount();

        String expectedAccDeletedText = "ACCOUNT DELETED!";

        Assert.assertTrue(deleteAccountPage.isAccountDeletedTextDisplayed());
        Assert.assertEquals(deleteAccountPage.getAccDeletedHeaderText(), expectedAccDeletedText);
    }
}