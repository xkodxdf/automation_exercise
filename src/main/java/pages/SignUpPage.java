package pages;

import common.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.base_abstract.TopMenuPage;

public class SignUpPage extends TopMenuPage {

    @FindBy(xpath = "//form[@action='/signup']/p")
    private WebElement emailAlreadyExistError;

    @FindBy(xpath = "//div[@class='login-form']/h2")
    private WebElement accountInfoHeader;

    @FindBy(xpath = "//input[@id='id_gender1']")
    private WebElement genderMale;

    @FindBy(xpath = "//input[@id='id_gender2']")
    private WebElement genderFemale;

    @FindBy(xpath = "//input[@data-qa='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//select[@data-qa='days']")
    private WebElement dayOfBirthDropDown;

    @FindBy(xpath = "//select[@data-qa='months']")
    private WebElement monthOfBirthDropDown;

    @FindBy(xpath = "//select[@data-qa='years']")
    private WebElement yearsOfBirthDropDown;

    @FindBy(xpath = "//input[@id='newsletter']")
    private WebElement newsletterCheckBox;

    @FindBy(xpath = "//input[@id='optin']")
    private WebElement specialOffersCheckBox;

    @FindBy(xpath = "//input[@data-qa='first_name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@data-qa='last_name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@data-qa='company']")
    private WebElement companyName;

    @FindBy(xpath = "//input[@data-qa='address']")
    private WebElement address;

    @FindBy(xpath = "//input[@data-qa='address2']")
    private WebElement address2;

    @FindBy(xpath = "//select[@data-qa='country']")
    private WebElement countyDropDown;

    @FindBy(xpath = "//input[@data-qa='state']")
    private WebElement state;

    @FindBy(xpath = "//input[@data-qa='city']")
    private WebElement city;

    @FindBy(xpath = "//input[@data-qa='zipcode']")
    private WebElement zipcode;

    @FindBy(xpath = "//input[@data-qa='mobile_number']")
    private WebElement mobileNumber;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    private WebElement createAccountButton;


    public SignUpPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getEmailAlreadyExistError() {

        return emailAlreadyExistError;
    }

    public WebElement getAccountInfoHeader() {

        return accountInfoHeader;
    }

    public WebElement getGenderMale() {

        return genderMale;
    }

    public WebElement getGenderFemale() {

        return genderFemale;
    }

    public WebElement getPasswordField() {

        return passwordField;
    }

    public WebElement getDayOfBirthDropDown() {

        return dayOfBirthDropDown;
    }

    public WebElement getMonthOfBirthDropDown() {

        return monthOfBirthDropDown;
    }

    public WebElement getYearsOfBirthDropDown() {

        return yearsOfBirthDropDown;
    }

    public WebElement getNewsletterCheckBox() {

        return newsletterCheckBox;
    }

    public WebElement getSpecialOffersCheckBox() {

        return specialOffersCheckBox;
    }

    public WebElement getFirstName() {

        return firstName;
    }

    public WebElement getLastName() {

        return lastName;
    }

    public WebElement getCompanyName() {

        return companyName;
    }

    public WebElement getAddress() {

        return address;
    }

    public WebElement getAddress2() {

        return address2;
    }

    public WebElement getCountyDropDown() {

        return countyDropDown;
    }

    public WebElement getState() {

        return state;
    }

    public WebElement getCity() {

        return city;
    }

    public WebElement getZipcode() {

        return zipcode;
    }

    public WebElement getMobileNumber() {

        return mobileNumber;
    }

    public WebElement getCreateAccountButton() {

        return createAccountButton;
    }


    public boolean isEmailAlreadyExistErrDisplayed() {

        return verifyElementVisibility(emailAlreadyExistError);
    }

    public boolean isAccountInfoHeaderDisplayed() {

        return verifyElementVisibility(accountInfoHeader);
    }

    public String getAccountInfoHeaderText() {

        return accountInfoHeader.getText();
    }

    public SignUpPage chooseMaleGender() {
        click(genderMale);

        return new SignUpPage(getDriver());
    }

    public SignUpPage chooseFemaleGender() {
        click(genderFemale);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputPassword(String password) {
        input(password, passwordField);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputPassword() {
        input(new Credentials().getPassword(), passwordField);

        return new SignUpPage(getDriver());
    }

    public SignUpPage selectDayOfBirth(String day) {
        Select dayOfBirth = new Select(dayOfBirthDropDown);
        dayOfBirth.selectByValue(day);

        return new SignUpPage(getDriver());
    }

    public SignUpPage selectDayOfBirth() {
        Select dayOfBirth = new Select(dayOfBirthDropDown);
        dayOfBirth.selectByValue(new Credentials().getDayOfBirth());

        return new SignUpPage(getDriver());
    }

    public SignUpPage selectMonthOfBirth(String month) {
        Select monthOfBirth = new Select(monthOfBirthDropDown);
        monthOfBirth.selectByValue(month);

        return new SignUpPage(getDriver());
    }

    public SignUpPage selectMonthOfBirth() {
        Select monthOfBirth = new Select(monthOfBirthDropDown);
        monthOfBirth.selectByValue(new Credentials().getMonthOfBirth());

        return new SignUpPage(getDriver());
    }

    public SignUpPage selectYearOfBirth(String year) {
        Select yearOfBirth = new Select(yearsOfBirthDropDown);
        yearOfBirth.selectByValue(year);

        return new SignUpPage(getDriver());
    }

    public SignUpPage selectYearOfBirth() {
        Select yearOfBirth = new Select(yearsOfBirthDropDown);
        yearOfBirth.selectByValue(new Credentials().getYearOfBirth());

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputDateOfBirth(String day, String month, String year) {

        return selectDayOfBirth(day)
                .selectMonthOfBirth(month)
                .selectYearOfBirth(year);
    }

    public SignUpPage inputDateOfBirth() {
        return selectDayOfBirth()
                .selectMonthOfBirth()
                .selectYearOfBirth();
    }

    public SignUpPage selectNewsletterCheckBox() {
        click(newsletterCheckBox);

        return new SignUpPage(getDriver());
    }

    public SignUpPage selectSpecialOffersCheckBox() {
        click(specialOffersCheckBox);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputFirstName(String firstName) {
        input(firstName, this.firstName);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputFirstName() {
        input(new Credentials().getFirstName(), firstName);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputLastName(String lastName) {
        input(lastName, this.lastName);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputLastName() {
        input(new Credentials().getLastName(), lastName);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputCompany(String company) {
        input(company, companyName);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputCompany() {
        input(new Credentials().getCompany(), companyName);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputAddress(String address) {
        input(address, this.address);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputAddress() {
        input(new Credentials().getAddress(), this.address);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputAddress2(String address2) {
        input(address2, this.address2);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputAddress2() {
        input(new Credentials().getAddress2(), address2);

        return new SignUpPage(getDriver());
    }

    public SignUpPage selectCountry(String countryName) {
        Select selectCountry = new Select(countyDropDown);
        selectCountry.selectByValue(countryName);

        return new SignUpPage(getDriver());
    }

    public SignUpPage selectCountry() {
        Select selectCountry = new Select(countyDropDown);
        selectCountry.selectByValue(new Credentials().getCountry());

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputState(String state) {
        input(state, this.state);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputState() {
        input(new Credentials().getState(), state);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputCity(String city) {
        input(city, this.city);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputCity() {
        input(new Credentials().getCity(), city);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputZipcode(String zipcode) {
        input(zipcode, this.zipcode);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputZipcode() {
        input(new Credentials().getZipcode(), zipcode);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputMobileNumber(String mobileNumber) {
        input(mobileNumber, this.mobileNumber);

        return new SignUpPage(getDriver());
    }

    public SignUpPage inputMobileNumber() {
        input(new Credentials().getMobileNumber(), mobileNumber);

        return new SignUpPage(getDriver());
    }

    public SignUpPage fillSignUpPageSignUpForm() {
        chooseMaleGender()
                .inputPassword()
                .inputDateOfBirth()
                .selectNewsletterCheckBox()
                .selectSpecialOffersCheckBox()
                .inputFirstName()
                .inputLastName()
                .inputCompany()
                .inputAddress()
                .inputAddress2()
                .selectCountry()
                .inputState()
                .inputCity()
                .inputZipcode()
                .inputMobileNumber();

        return new SignUpPage(getDriver());
    }

    public AccountCreatedPage clickCreateAccount() {
        click(createAccountButton);

        return new AccountCreatedPage(getDriver());
    }
}
