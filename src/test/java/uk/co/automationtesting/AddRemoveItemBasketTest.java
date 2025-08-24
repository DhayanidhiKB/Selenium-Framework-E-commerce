package uk.co.automationtesting;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Hooks;
import pageObjects.Homepage;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomepage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;

@Listeners(resources.Listeners.class)

public class AddRemoveItemBasketTest extends Hooks {

    public AddRemoveItemBasketTest()  {
        super();
    }

    @Test
    public void addRemoveItem()  {
        Homepage home = new Homepage();

        try {
            WebDriver driver = getDriver();
            JavascriptExecutor jse = (JavascriptExecutor) driver;

            jse.executeScript("arguments[0].scrollIntoView()", home.getTestStoreLink());
            home.getTestStoreLink().click();

            ShopHomepage shopHome = new ShopHomepage();
            shopHome.getProdOne().click();

            ShopProductPage shopProd = new ShopProductPage();
            Select option = new Select(shopProd.getSizeOption());
            option.selectByVisibleText("M");
            shopProd.getQuantIncrease().click();
            shopProd.getAddToCartBtn().click();

            ShopContentPanel cPanel = new ShopContentPanel();
            cPanel.getContinueShopBtn().click();
            shopProd.getHomepageLink().click();
            shopHome.getProdTwo().click();
            shopProd.getAddToCartBtn().click();
            cPanel.getCheckoutBtn().click();

            System.out.println("Execution is success");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}