import common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
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

    @Test
    public void testSearchProduct() {
        String textToSearch = "jeans";
        String expectedHeaderText = "SEARCHED PRODUCTS";
        SoftAssert softAssert = new SoftAssert();

        ProductsPage productsPage = openMainPage()
                .clickProducts()
                .searchProduct(textToSearch);

        softAssert.assertTrue(productsPage.isH2SearchedProductsDisplayed());
        softAssert.assertEquals(productsPage.getH2SearchedProducts().getText(), expectedHeaderText);
        softAssert.assertTrue(productsPage.isSearchedProductsDisplayed());
        softAssert.assertAll();
    }
}
