import common.BaseTest;
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
}
