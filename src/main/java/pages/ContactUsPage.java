package pages;

import common.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.reporters.jq.Main;
import pages.base_abstract.TopMenuPage;

public class ContactUsPage extends TopMenuPage {

    @FindBy(xpath = "//div[@class='contact-form']//h2")
    private WebElement contactFormHeader;

    @FindBy(xpath = "//input[@data-qa='name']")
    private WebElement name;

    @FindBy(xpath = "//input[@data-qa='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@data-qa='subject']")
    private WebElement subject;

    @FindBy(xpath = "//textarea[@data-qa='message']")
    private WebElement message;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement uploadFile;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submit;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    private WebElement successMessage;

    @FindBy(xpath = "//a[@class='btn btn-success']")
    private WebElement backToHome;


    public ContactUsPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getContactFormHeader() {

        return contactFormHeader;
    }

    public WebElement getName() {

        return name;
    }

    public WebElement getEmail() {

        return email;
    }

    public WebElement getSubject() {

        return subject;
    }

    public WebElement getMessage() {

        return message;
    }

    public WebElement getUploadFile() {

        return uploadFile;
    }

    public WebElement getSubmit() {

        return submit;
    }

    public WebElement getSuccessMessage() {

        return successMessage;
    }

    public WebElement getBackToHome() {

        return backToHome;
    }


    public boolean isContactFormHeaderDisplayed() {

        return verifyElementVisibility(contactFormHeader);
    }

    public String getContactFormHeaderText() {

        return getText(contactFormHeader);
    }

    public ContactUsPage inputName(String name) {
        input(name, this.name);

        return new ContactUsPage(getDriver());
    }

    public ContactUsPage inputName() {
        input(new Credentials().getName(), name);

        return new ContactUsPage(getDriver());
    }

    public ContactUsPage inputEmail(String email) {
        input(email, this.email);

        return new ContactUsPage(getDriver());
    }

    public ContactUsPage inputEmail() {
        input(new Credentials().getEmail(), email);

        return new ContactUsPage(getDriver());
    }

    public ContactUsPage inputMessage(String message) {
        input(message, this.message);

        return new ContactUsPage(getDriver());
    }

    public ContactUsPage inputMessage() {
        input("Test test test test!", message);

       return new ContactUsPage(getDriver());
    }

    public ContactUsPage uploadFile(String pathToFile) {
        uploadFile(uploadFile, pathToFile);

        return new ContactUsPage(getDriver());
    }

    public ContactUsPage uploadFile() {
        uploadFile(uploadFile, new Credentials().getTxtFileForUploadPath());

        return new ContactUsPage(getDriver());
    }

    public ContactUsPage fillContactUsForm() {
        inputName();
        inputEmail();
        inputMessage();
        uploadFile();

        return new ContactUsPage(getDriver());
    }

    public ContactUsPage clickSubmit() {
        click(submit);
        acceptAlert();

        return new ContactUsPage(getDriver());
    }

    public boolean isSuccessMessageDisplayed() {

        return verifyElementVisibility(successMessage);
    }

    public String getSuccessMessageText() {

        return getText(successMessage);
    }

    public MainPage clickHome() {
        click(backToHome);

        return new MainPage(getDriver());
    }
}
