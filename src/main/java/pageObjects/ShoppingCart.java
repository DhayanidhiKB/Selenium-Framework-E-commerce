package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShoppingCart extends BasePage {

    private WebDriver driver;

    private final By havePromo = By.cssSelector(".promo-code-button .collapse-button");
    private final By promoTextbox = By.cssSelector("input[name='discount_name']");
    private final By promoAddBtn = By.cssSelector("form[method='post']  span");
    private final By proceedToCheckoutBtn = By.cssSelector(".cart-detailed-actions .btn-primary");
    private final By deleteItemOne = By.cssSelector(".cart-items .cart-item:nth-of-type(1) .float-xs-left");
    private final By deleteItemTwo = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
    private final By totalValue = By.cssSelector(".cart-total .value");

    public ShoppingCart() {
        try {
            this.driver = getDriver();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize driver in ShoppingCart", e);
        }
    }

    private WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public WebElement getHavePromo() {
        return find(havePromo);
    }

    public WebElement getPromoTextbox() {
        return find(promoTextbox);
    }

    public WebElement getPromoAddBtn() {
        return find(promoAddBtn);
    }

    public WebElement getProceedCheckoutBtn() {
        return find(proceedToCheckoutBtn);
    }

    public WebElement getDeleteItemOne() {
        return find(deleteItemOne);
    }

    public WebElement getDeleteItemTwo() {
        return find(deleteItemTwo);
    }

    public WebElement getTotalAmount() {
        return find(totalValue);
    }
}
