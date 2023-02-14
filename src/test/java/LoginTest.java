import common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testSignUpHeader() {
        String expectedSignUpHeaderText = "New User Signup!";

        LoginPage loginPage = openMainPage().clickSignUpLogin();

        Assert.assertTrue(loginPage.isSignUpHeaderDisplayed());
        Assert.assertEquals(loginPage.getSignUpHeaderText(), expectedSignUpHeaderText);
    }

    @Test
    public void testLoginHeader() {
        String expectedLoginHeaderText = "Login to your account";

        LoginPage loginPage = openMainPage().clickSignUpLogin();

        Assert.assertTrue(loginPage.isLoginHeaderDisplayed());
        Assert.assertEquals(loginPage.getLoginHeaderText(), expectedLoginHeaderText);

    }

    @Test
    public void testLoginIncorrectUser() {
        String expectedErrorMessage = "Your email or password is incorrect!";

        LoginPage loginPage = openMainPage().clickSignUpLogin();

        loginPage
                .inputLoginEmail("wrong@email.com")
                .inputLoginPassword("wrongPassword")
                .clickLoginButton();

        Assert.assertTrue(loginPage.isLoginErrorMessageDisplayed());
        Assert.assertEquals(loginPage.getLoginErrorText(), expectedErrorMessage);
    }

    @Test
    public void testUserLogOut() {
        String loginPageUrl = "https://www.automationexercise.com/login";

        LoginPage loginPage = openMainPage()
                .clickSignUpLogin()
                .fillLoginPageLoginForm()
                .clickLoginButton()
                .clickLogOut();

        Assert.assertEquals(loginPage.getCurrentUrl(), loginPageUrl);
        Assert.assertTrue(loginPage.getSignUpLoginLink().isDisplayed());
    }
}
