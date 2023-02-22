import common.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.base_abstract.ProductsDetailsPage;

public class ProductsDetailsTest extends BaseTest {

    @Test
    public void testViewProduct() {
        ProductsDetailsPage productsDetailsPage = openMainPage()
                .clickProducts()
                .clickProductListViewItem(1);

        for (WebElement el : productsDetailsPage.getProductInfo()) {
            Assert.assertTrue(productsDetailsPage.verifyElementVisibility(el));
        }
    }
}
