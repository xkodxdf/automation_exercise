import common.BaseTest;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import pages.DeleteAccountPage;


public class DeleteAccountTest extends BaseTest {

    @Test
    public void testRegisterUser() {

        DeleteAccountPage deleteAccountPage = openMainPage()
                .clickSignUpLogin()
                .fillLoginPageSignUpForm()
                .clickSignUpButton()
                .fillSignUpPageSignUpForm()
                .clickCreateAccount()
                .clickContinueButton()
                .clickDeleteAccount();

        assertTrue(deleteAccountPage.isAccountDeletedTextDisplayed());
    }
}