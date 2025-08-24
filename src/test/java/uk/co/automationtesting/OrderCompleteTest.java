package uk.co.automationtesting;

import java.io.IOException;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Hooks;
import pageObjects.Homepage;
import pageObjects.OrderFormDelivery;
import pageObjects.OrderFormPayment;
import pageObjects.OrderFormPersInfo;
import pageObjects.OrderFormShippingMethod;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomepage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;

@Listeners(resources.Listeners.class)
public class OrderCompleteTest extends Hooks {

    public OrderCompleteTest(){
        super();
    }

    @Test
    public void endToEndTest() throws InterruptedException {
        Faker faker = new Faker();

        // Open homepage and handle cookie prompt
        Homepage home = new Homepage();
        home.getCookie().click();
        home.getTestStoreLink().click();

        // Navigate to test store homepage and select first product
        ShopHomepage shopHome = new ShopHomepage();
        shopHome.getProdOne().click();

        // On product page, select size, increase quantity, and add to cart
        ShopProductPage shopProd = new ShopProductPage();
        Select option = new Select(shopProd.getSizeOption());
        option.selectByVisibleText("M");
        shopProd.getQuantIncrease().click();
        shopProd.getAddToCartBtn().click();

        // Proceed to checkout from content panel
        ShopContentPanel cPanel = new ShopContentPanel();
        cPanel.getCheckoutBtn().click();

        // Apply promo code and proceed to checkout
        ShoppingCart cart = new ShoppingCart();
        cart.getHavePromo().click();
        cart.getPromoTextbox().sendKeys("20OFF");
        cart.getPromoAddBtn().click();

        // You might want to add a wait here to wait for promo to apply before proceeding
        Thread.sleep(3000);  // Not recommended, replace with explicit wait if possible

        cart.getProceedCheckoutBtn().click();

        // Fill personal information
        OrderFormPersInfo pInfo = new OrderFormPersInfo();
        pInfo.getGenderMr().click();
        pInfo.getFirstNameField().sendKeys(faker.name().firstName().toLowerCase());
        pInfo.getLastnameField().sendKeys(faker.name().lastName().toLowerCase());
        pInfo.getEmailField().sendKeys(faker.internet().emailAddress().toLowerCase());  // better random email
        pInfo.getTermsConditionsCheckbox().click();
        pInfo.getContinueBtn().click();

        // Fill delivery address details
        OrderFormDelivery orderDelivery = new OrderFormDelivery();
        orderDelivery.getAddressField().sendKeys("123 Main Street");
        orderDelivery.getCityField().sendKeys("Houston");
        Select state = new Select(orderDelivery.getStateDropdown());
        state.selectByVisibleText("Texas");
        orderDelivery.getPostcodeField().sendKeys("77021");
        orderDelivery.getContinueBtn().click();

        // Add shipping method and continue
        OrderFormShippingMethod shipMethod = new OrderFormShippingMethod();
        shipMethod.getDeliveryMsgTextbox().sendKeys("If I am not in, please leave my delivery on my porch.");
        shipMethod.getContinueBtn().click();

        // Select payment option, agree to terms and place order
        OrderFormPayment orderPay = new OrderFormPayment();
        orderPay.getPayByCheckRadioBtn().click();
        orderPay.getTermsConditionsCheckbox().click();
        orderPay.getOrderBtn().click();
    }
}
