package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.ProductsDetailsPage;
import pages.base_abstract.TopMenuPage;

import java.util.List;

public class ProductsPage extends TopMenuPage {

    @FindBy(xpath = "//input[@id='search_product']")
    private WebElement searchProductInput;

    @FindBy(xpath = "//button[@id='submit_search']")
    private WebElement submitSearch;

    @FindBy(xpath = "//h2[@class='title text-center']")
    private WebElement h2SearchedProducts;

    @FindBy(xpath = "//div[@class='features_items']/div[@class='col-sm-4']")
    private List<WebElement> searchedProductsList;

    @FindBy(xpath = "//div[@class='features_items']")
    private WebElement productList;

    @FindAll({
            @FindBy(xpath = "//a[contains(@href, '/product_details/')]")
    })
    private List<WebElement> productListContent;


    public ProductsPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getSearchProductInput() {

        return searchProductInput;
    }

    public WebElement getSubmitSearch() {

        return submitSearch;
    }

    public WebElement getH2SearchedProducts() {

        return h2SearchedProducts;
    }

    public WebElement getProductList() {

        return productList;
    }

    public List<WebElement> getProductListContent() {

        return productListContent;
    }

    public List<WebElement> getSearchedProductsList() {

        return searchedProductsList;
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

    public ProductsPage clickSubmitSearch() {
        click(submitSearch);

        return new ProductsPage(getDriver());
    }

    public ProductsPage searchProduct(String textToSearch) {
        searchProductInput.sendKeys(textToSearch);
        clickSubmitSearch();

        return new ProductsPage(getDriver());
    }

    public boolean isH2SearchedProductsDisplayed() {

        return verifyElementVisibility(h2SearchedProducts);
    }

    public boolean isSearchedProductsDisplayed() {
        for (WebElement el : searchedProductsList) {
            if (! verifyElementVisibility(el)) {
                return false;
            }
        }

        return true;
    }
}
