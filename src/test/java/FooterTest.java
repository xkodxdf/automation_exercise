import common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.base_abstract.FooterPage;

public class FooterTest extends BaseTest {

    @Test
    public void testSubscription() {
        String expectedH2Text = "SUBSCRIPTION";
        String expectedSuccessMessage = "You have been successfully subscribed!";

        openMainPage();
        FooterPage footerPage = new FooterPage(getDriver());
        footerPage.subscribeToUpdates();

        Assert.assertEquals(footerPage.getSubscriptionH2text().getText(), expectedH2Text);
        Assert.assertTrue(footerPage.getSubscriptionSuccessMessage().isDisplayed());
        Assert.assertEquals(footerPage.getSubscriptionSuccessMessage().getText(), expectedSuccessMessage);
    }
}
