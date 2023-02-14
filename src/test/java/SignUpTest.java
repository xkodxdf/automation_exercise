import common.BaseTest;
import common.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class SignUpTest extends BaseTest {

    @Test
    public void testAccountInformationHeader() {
        String expectedAccInfoText = "ENTER ACCOUNT INFORMATION";

        SignUpPage signUpPage = openMainPage()
                .clickSignUpLogin()
                .fillLoginPageSignUpForm()
                .clickSignUpButton();

        Assert.assertTrue(signUpPage.isAccountInfoHeaderDisplayed());
        Assert.assertEquals(signUpPage.getAccountInfoHeaderText(), expectedAccInfoText);
    }

    @Test
    public void testRegistrationWithExistingEmail() {
        String expectedErrorMessage = "Email Address already exist!";

        SignUpPage signUpPage = openMainPage()
                .clickSignUpLogin()
                .inputSignUpName()
                .inputSignUpEmail(new Credentials().getLoginEmail())
                .clickSignUpButton();

        Assert.assertTrue(signUpPage.isEmailAlreadyExistErrDisplayed());
        Assert.assertEquals(signUpPage.getEmailAlreadyExistError().getText(), expectedErrorMessage);
    }
}
