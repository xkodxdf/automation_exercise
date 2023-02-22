import common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;

public class ProductsTest extends BaseTest {

    @Test
    public void testNavigateToProductsPage() {
        String expectedTitle = "Automation Exercise - All Products";
        String expectedUrl = "https://www.automationexercise.com/products";

        ProductsPage productsPage = openMainPage().clickProducts();

        Assert.assertEquals(productsPage.getCurrentUrl(), expectedUrl);
        Assert.assertEquals(productsPage.getTitle(), expectedTitle);
        Assert.assertTrue(productsPage.getProductList().isDisplayed());
    }
}
