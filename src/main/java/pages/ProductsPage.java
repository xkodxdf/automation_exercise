package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.ProductsDetailsPage;
import pages.base_abstract.TopMenuPage;

import java.util.List;

public class ProductsPage extends TopMenuPage {

    @FindBy(xpath = "//div[@class='features_items']")
    private WebElement productList;

    @FindAll({
            @FindBy(xpath = "//a[contains(@href, '/product_details/')]")
    })
    private List<WebElement> productListContent;


    public ProductsPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getProductList() {

        return productList;
    }

    public List<WebElement> getProductListContent() {

        return productListContent;
    }


    public ProductsDetailsPage clickProductListViewItem(int item) {
        if (item > 0 && item <= productListContent.size()) {
            click(productListContent.get(item - 1));

            return new ProductsDetailsPage(getDriver());
        }
        System.out.println("--Item with this number: " + item + ", was not found.");
        System.out.println("--Quantity of elements in Product List: " + productListContent.size());

        return new ProductsDetailsPage(getDriver());
    }
}
