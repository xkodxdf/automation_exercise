import common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

    @Test
    public void testSignUpHeader() {
        String expectedSignUpHeaderText = "New User Signup!";

        LoginPage loginPage = openMainPage().clickSignUpLogin();

        Assert.assertTrue(loginPage.isSignUpHeaderDisplayed());
        Assert.assertEquals(loginPage.getSignUpHeaderText(), expectedSignUpHeaderText);
    }
}
