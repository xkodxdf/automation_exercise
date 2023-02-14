import common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;


public class MainPageTest extends BaseTest {

    @Test
    public void testPageIsLoaded() {
        String expectedUrl = getBaseUrl();
        String expectedTitle = "Automation Exercise";

        MainPage mainPage = openMainPage();

        Assert.assertEquals(mainPage.getCurrentUrl(), expectedUrl);
        Assert.assertEquals(mainPage.getTitle(), expectedTitle);
        Assert.assertTrue(mainPage.getLogo().isDisplayed());
    }
}
