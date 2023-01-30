import common.BaseTest;

import static org.testng.Assert.assertTrue;

import common.Credentials;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.DeleteAccountPage;


public class DeleteAccountTest extends BaseTest {

    @Test
    public void testRegisterUser() {
        Credentials creds = new Credentials();
        MainPage mainPage = openMainPage();

        DeleteAccountPage deleteAccountPage =
                mainPage.clickSignUpLogin()
                        .inputSignUpName(creds.getName())
                        .inputSignUpEmail(creds.getEmail())
                        .clickSignUpButton()
                        .chooseMaleGender()
                        .inputPassword(creds.getPassword())
                        .inputDateOfBirth(creds.getDayOfBirth(),
                                creds.getMonthOfBirth(),
                                creds.getYearOfBirth())
                        .selectNewsletterCheckBox()
                        .selectSpecialOffersCheckBox()
                        .inputFirstName(creds.getFirstName())
                        .inputLastName(creds.getLastName())
                        .inputAddress(creds.getAddress())
                        .inputAddress2(creds.getAddress2())
                        .selectCountry(creds.getCountry())
                        .inputState(creds.getState())
                        .inputCity(creds.getCity())
                        .inputZipcode(creds.getZipcode())
                        .inputMobileNumber(creds.getMobileNumber())
                        .clickCreateAccount()
                        .clickContinueButton()
                        .clickDeleteAccount();

        assertTrue(deleteAccountPage.isAccountDeletedTextDisplayed());
    }
}