package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormDelivery extends BasePage {

    private WebDriver driver;

    // Constructor with exception handling
    public OrderFormDelivery() {
        try {
            this.driver = getDriver();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Driver initialization failed in OrderFormDelivery", e);
        }
    }

    // Centralized finder method
    private WebElement find(By locator) {
        return driver.findElement(locator);
    }

    By firstNameField = By.cssSelector("input[name='firstname']");
    By lastNameField = By.cssSelector("input[name='lastname']");
    By emailIDField = By.xpath("(//input[@id='field-email'])[1]");
    By companyNameField = By.cssSelector("input[name='company']");
    By addressField = By.cssSelector("input[name='address1']");
    By addressComplementField = By.cssSelector("input[name='address2']");
    By cityField = By.cssSelector("input[name='city']");
    By stateDropdown = By.cssSelector("select[name='id_state']");
    By postcodeField = By.cssSelector("input[name='postcode']");
    By countryDropdown = By.cssSelector("select[name='id_country']");
    By phoneField = By.cssSelector("input[name='phone']");
    By invoiceSameAddCheckbox = By.cssSelector("input#use_same_address");
    By continueBtn = By.cssSelector("button[name='confirm-addresses']");

    public WebElement getFirstNameField() {
        return find(firstNameField);
    }

    public WebElement getLastnameField() {
        return find(lastNameField);
    }

    public WebElement getEmailField() {
        return find(emailIDField);
    }

    public WebElement getCompanyField() {
        return find(companyNameField);
    }

    public WebElement getAddressField() {
        return find(addressField);
    }

    public WebElement getAddressCompField() {
        return find(addressComplementField);
    }

    public WebElement getCityField() {
        return find(cityField);
    }

    public WebElement getStateDropdown() {
        return find(stateDropdown);
    }

    public WebElement getPostcodeField() {
        return find(postcodeField);
    }

    public WebElement getCountryDropdown() {
        return find(countryDropdown);
    }

    public WebElement getPhoneField() {
        return find(phoneField);
    }

    public WebElement getInvoiceSameAddCheckbox() {
        return find(invoiceSameAddCheckbox);
    }

    public WebElement getContinueBtn() {
        return find(continueBtn);
    }
}
