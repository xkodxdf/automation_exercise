import common.BaseTest;
import common.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class TopMenuTest extends BaseTest {

    @Test
    public void testLoggedInText() {
        String expectedLoggedInText = "Logged in as " + getName();

        MainPage mainPage = openMainPage()
                .clickSignUpLogin()
                .fillLoginPageSignUpForm()
                .clickSignUpButton()
                .fillSignUpPageSignUpForm()
                .clickCreateAccount()
                .clickContinueButton();

        Assert.assertTrue(mainPage.isLoggedInAsDisplayed());
        Assert.assertEquals(mainPage.getLoggedInAsText(), expectedLoggedInText);

        mainPage.clickDeleteAccount();
    }

    @Test
    public void testLoginCorrectUser() {
        String expectedLoggedInText = "Logged in as " + getLoginName();

        MainPage mainPage = openMainPage()
                .clickSignUpLogin()
                .fillLoginPageLoginForm()
                .clickLoginButton();

        Assert.assertEquals(mainPage.getLoggedInAsText(), expectedLoggedInText);
    }
}
