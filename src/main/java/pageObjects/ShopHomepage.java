package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopHomepage extends BasePage {
    private WebDriver driver;

    private final By productOne = By.linkText("Hummingbird Printed T-Shirt");
    private final By productTwo = By.linkText("Hummingbird Printed Sweater");
    private final By productThree = By.linkText("The Best Is Yet To Come'...");
    private final By productFour = By.linkText("The Adventure Begins Framed...");
    private final By productFive = By.linkText("Today Is A Good Day Framed...");
    private final By productSix = By.linkText("Mug The Best Is Yet To Come");
    private final By productSeven = By.linkText("Mug The Adventure Begins");
    private final By productEight = By.linkText("Mug Today Is A Good Day");

    public ShopHomepage() {
        try {
            this.driver = getDriver();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize driver in ShopHomepage", e);
        }
    }

    private WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public WebElement getProdOne() {
        return find(productOne);
    }

    public WebElement getProdTwo() {
        return find(productTwo);
    }

    public WebElement getProdThree() {
        return find(productThree);
    }

    public WebElement getProdFour() {
        return find(productFour);
    }

    public WebElement getProdFive() {
        return find(productFive);
    }

    public WebElement getProdSix() {
        return find(productSix);
    }

    public WebElement getProdSeven() {
        return find(productSeven);
    }

    public WebElement getProdEight() {
        return find(productEight);
    }
}
