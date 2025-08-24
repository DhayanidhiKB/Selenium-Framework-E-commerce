package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopProductPage extends BasePage {

    private WebDriver driver;

    private final By sizeOption = By.cssSelector("[data-product-attribute='1']");
    private final By quantityIncrease = By.cssSelector(".touchspin-up");
    private final By quantityDecrease = By.cssSelector(".touchspin-down");
    private final By addToCartBtn = By.cssSelector(".add-to-cart.btn.btn-primary");
    private final By homepageLink = By.xpath("//span[.='Home']");

    public ShopProductPage() {
        try {
            this.driver = getDriver();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize driver in ShopProductPage", e);
        }
    }

    private WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public WebElement getSizeOption() {
        return find(sizeOption);
    }

    public WebElement getQuantIncrease() {
        return find(quantityIncrease);
    }

    public WebElement getQuantDecrease() {
        return find(quantityDecrease);
    }

    public WebElement getAddToCartBtn() {
        return find(addToCartBtn);
    }

    public WebElement getHomepageLink() {
        return find(homepageLink);
    }
}
