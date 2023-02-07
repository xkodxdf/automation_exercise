import common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountCreatedPage;


public class AccountCreatedTest extends BaseTest {

    @Test
    public void testAccountCreatedHeader() {
        String expectedHeaderText = "ACCOUNT CREATED!";

        AccountCreatedPage accountCreatedPage = openMainPage()
                .clickSignUpLogin()
                .fillLoginPageSignUpForm()
                .clickSignUpButton()
                .fillSignUpPageSignUpForm()
                .clickCreateAccount();

        Assert.assertTrue(accountCreatedPage.isAccountCreatedHeaderDisplayed());
        Assert.assertEquals(accountCreatedPage.getAccCreatedHeaderText(), expectedHeaderText);

        accountCreatedPage
                .clickContinueButton()
                .clickDeleteAccount();
    }
}
