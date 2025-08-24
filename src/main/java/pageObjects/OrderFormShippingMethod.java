package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormShippingMethod extends BasePage {

    private WebDriver driver;

    // Constructor with safe driver initialization
    public OrderFormShippingMethod() {
        try {
            this.driver = getDriver();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize WebDriver in OrderFormShippingMethod", e);
        }
    }

    // Common find method to reduce repetition
    private WebElement find(By locator) {
        return driver.findElement(locator);
    }

    // Locators
    private final By deliveryMsgTextbox = By.cssSelector("textarea#delivery_message");
    private final By continueBtn = By.cssSelector("[name='confirmDeliveryOption']");

    // Getter methods
    public WebElement getDeliveryMsgTextbox() {
        return find(deliveryMsgTextbox);
    }

    public WebElement getContinueBtn() {
        return find(continueBtn);
    }
}
