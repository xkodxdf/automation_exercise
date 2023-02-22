import common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestCasesPage;

public class TestCasesTest extends BaseTest {

    @Test
    public void testNavigateToTestCasesPage() {
        String expectedTitle = "Automation Practice Website for UI Testing - Test Cases";
        String expectedUrl = "https://www.automationexercise.com/test_cases";

        TestCasesPage testCasesPage = openMainPage().clickTestCases();

        Assert.assertEquals(testCasesPage.getCurrentUrl(), expectedUrl);
        Assert.assertEquals(testCasesPage.getTitle(), expectedTitle);
    }
}
