import common.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.base_abstract.ProductsDetailsPage;

public class ProductsDetailsTest extends BaseTest {

    @Test
    public void testViewProduct() {
        String productsDetalsUrl = "https://www.automationexercise.com/product_details/";

        ProductsDetailsPage productsDetailsPage = openMainPage()
                .clickProducts()
                .clickProductListViewItem(1);

        Assert.assertTrue(productsDetailsPage.getCurrentUrl().contains(productsDetalsUrl));

        for (WebElement el : productsDetailsPage.getProductInfo()) {
            Assert.assertTrue(productsDetailsPage.verifyElementVisibility(el));
        }
    }
}
