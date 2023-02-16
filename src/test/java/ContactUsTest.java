import common.BaseTest;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;

public class ContactUsTest extends BaseTest {

    @Test
    public void testContactUsFormHeader() {
        String expectedHeaderText = "GET IN TOUCH";

        ContactUsPage contactUsPage = openMainPage().clickContactUs();

        Assert.assertTrue(contactUsPage.isContactFormHeaderDisplayed());
        Assert.assertEquals(contactUsPage.getContactFormHeaderText(), expectedHeaderText);
    }

    @Test
    public void testContactUsFormSubmitting() {
        String expectedText = "Success! Your details have been submitted successfully.";

        ContactUsPage contactUsPage = openMainPage()
                .clickContactUs()
                .fillContactUsForm()
                .clickSubmit();

        Assert.assertTrue(contactUsPage.isSuccessMessageDisplayed());
        Assert.assertEquals(contactUsPage.getSuccessMessageText(), expectedText);
    }
}
