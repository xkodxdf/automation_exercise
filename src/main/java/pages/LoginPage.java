package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.NavigationBarPage;


public class LoginPage extends NavigationBarPage {

    @FindBy(xpath = "//div[@class='signup-form']/h2")
    private WebElement h2SignUpForm;


    protected LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getH2SignUpForm() {

        return h2SignUpForm;
    }
}
