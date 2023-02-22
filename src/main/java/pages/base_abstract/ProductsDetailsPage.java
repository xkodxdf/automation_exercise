package pages.base_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsDetailsPage extends TopMenuPage {

    @FindBy(xpath = "//div[@class='product-information']/h2")
    private WebElement productName;

    @FindBy(xpath = "//p[contains(.,'Category')]")
    private WebElement productCategory;

    @FindAll({
            @FindBy(xpath = "//div[@class='product-information']/h2"),
            @FindBy(xpath = "//p[contains(.,'Category')]"),
            @FindBy(xpath = "//div[@class='product-information']/span/span"),
            @FindBy(xpath = "//b[contains(., 'Availability')]"),
            @FindBy(xpath = "//b[contains(., 'Condition')]"),
            @FindBy(xpath = "//b[contains(., 'Brand')]")
    })
    private List<WebElement> productInfo;

    @FindBy(xpath = "//div[@class='product-information']/span/span")
    private WebElement productPrice;

    @FindBy(xpath = "//b[contains(., 'Availability')]")
    private WebElement productAvailability;

    @FindBy(xpath = "//b[contains(., 'Condition')]")
    private WebElement productCondition;

    @FindBy(xpath = "//b[contains(., 'Brand')]")
    private WebElement productBrand;


    public ProductsDetailsPage(WebDriver driver) {
        super(driver);
    }


    public List<WebElement> getProductInfo() {

        return productInfo;
    }

    public WebElement getProductName() {

        return productName;
    }

    public WebElement getProductCategory() {

        return productCategory;
    }

    public WebElement getProductPrice() {

        return productPrice;
    }

    public WebElement getProductAvailability() {

        return productAvailability;
    }

    public WebElement getProductCondition() {

        return productCondition;
    }

    public WebElement getProductBrand() {

        return productBrand;
    }

    @Override
    public boolean verifyElementVisibility(WebElement element) {
        return super.verifyElementVisibility(element);
    }
}
