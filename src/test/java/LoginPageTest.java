import common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

    @Test
    public void testSignUpFormH2Text() {
        final String expectedText = "New User Signup!";

        LoginPage loginPage = openMainPage().clickSignUpLogin();

        Assert.assertTrue(loginPage.getH2SignUpForm().isDisplayed());
        Assert.assertEquals(loginPage.getH2SignUpForm().getText(), expectedText);
    }
}
