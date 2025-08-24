package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormPayment extends BasePage {

    private WebDriver driver;

    // Safe constructor
    public OrderFormPayment() {
        try {
            this.driver = getDriver();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize driver in OrderFormPayment", e);
        }
    }

    // DRY utility method to find elements
    private WebElement find(By locator) {
        return driver.findElement(locator);
    }

    // Locators
    private final By payByCheck = By.xpath("//span[.='Pay by Check']");
    private final By payByWire = By.xpath("//span[.='Pay by bank wire']");
    private final By termsAndConditions = By.xpath("//input[@id='conditions_to_approve[terms-and-conditions]']");
    private final By orderBtn = By.xpath("//div[@id='payment-confirmation']//button[@type='submit']");

    // Getter methods
    public WebElement getPayByCheckRadioBtn() {
        return find(payByCheck);
    }

    public WebElement getPayByWireRadioBtn() {
        return find(payByWire);
    }

    public WebElement getTermsConditionsCheckbox() {
        return find(termsAndConditions);
    }

    public WebElement getOrderBtn() {
        return find(orderBtn);
    }
}
