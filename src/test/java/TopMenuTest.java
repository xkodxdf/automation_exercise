import common.BaseTest;
import common.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class TopMenuTest extends BaseTest {

    @Test
    public void testLoggedInText() {
        String expectedLoggedInText = "Logged in as " + new Credentials().getName();

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
}
