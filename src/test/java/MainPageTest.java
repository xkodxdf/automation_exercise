import common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;


public class MainPageTest extends BaseTest {

    @Test
    public void testLogoIsDisplayed() {
        MainPage mainPage = openMainPage();

        Assert.assertTrue(mainPage.getLogo().isDisplayed());
    }
}
