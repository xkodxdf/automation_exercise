import common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class MainTest extends BaseTest {

    @Test
    public void testTitleText() {
        String mainPageTitle = "Automation Exercise";

        String actualTitle = openBaseUrl().getTitle();

        Assert.assertEquals(actualTitle, mainPageTitle);
    }
}