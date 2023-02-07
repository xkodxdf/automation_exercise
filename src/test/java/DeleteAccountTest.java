import common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DeleteAccountPage;


public class DeleteAccountTest extends BaseTest {

    @Test
    public void testRegisterUser() {
        String expectedAccDeletedText = "ACCOUNT DELETED!";

        DeleteAccountPage deleteAccountPage = openMainPage()
                .clickSignUpLogin()
                .fillLoginPageSignUpForm()
                .clickSignUpButton()
                .fillSignUpPageSignUpForm()
                .clickCreateAccount()
                .clickContinueButton()
                .clickDeleteAccount();

        Assert.assertTrue(deleteAccountPage.isAccountDeletedTextDisplayed());
        Assert.assertEquals(deleteAccountPage.getAccDeletedHeaderText(), expectedAccDeletedText);
    }
}