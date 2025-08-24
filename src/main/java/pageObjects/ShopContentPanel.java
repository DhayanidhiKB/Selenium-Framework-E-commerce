package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopContentPanel extends BasePage {

    private WebDriver driver;

    // Safe constructor
    public ShopContentPanel() {
        try {
            this.driver = getDriver();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize driver in ShopContentPanel", e);
        }
    }

    // Reusable method to find elements
    private WebElement find(By locator) {
        return driver.findElement(locator);
    }

    // Locators
    private final By continueShoppingBtn = By.xpath("//button[contains(text(),'Continue shopping')]");
    private final By checkoutBtn = By.xpath("//a[contains(text(),'Proceed to checkout')]");

    // Getter methods
    public WebElement getContinueShopBtn() {
        return find(continueShoppingBtn);
    }

    public WebElement getCheckoutBtn() {
        return find(checkoutBtn);
    }
}
