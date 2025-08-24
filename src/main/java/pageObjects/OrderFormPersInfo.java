package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormPersInfo extends BasePage {

    private WebDriver driver;

    // Safe constructor
    public OrderFormPersInfo() {
        try {
            this.driver = getDriver();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Driver initialization failed in OrderFormPersInfo", e);
        }
    }

    // Reusable element finder
    private WebElement find(By locator) {
        return driver.findElement(locator);
    }

    // Locators
    private final By genderMr = By.cssSelector("label:nth-of-type(1) > .custom-radio > input[name='id_gender']");
    private final By genderMrs = By.cssSelector("label:nth-of-type(2) > .custom-radio > input[name='id_gender']");
    private final By firstNameField = By.cssSelector("input[name='firstname']");
    private final By lastNameField = By.cssSelector("input[name='lastname']");
    private final By emailField = By.xpath("(//input[@id='field-email'])[1]");
    private final By passwordField = By.cssSelector("form#customer-form > section input[name='password']");
    private final By birthDateField = By.cssSelector("input[name='birthday']");
    private final By receiveOffersCheckbox = By.cssSelector("div:nth-of-type(7)  span > label > span");
    private final By newsletterCheckbox = By.cssSelector("div:nth-of-type(8)  span > label > span");
    private final By termsConditionsCheckbox = By.cssSelector("input[name='psgdpr']");
    private final By continueBtn = By.cssSelector("form#customer-form  button[name='continue']");

    // Getter methods
    public WebElement getGenderMr() {
        return find(genderMr);
    }

    public WebElement getGenderMrs() {
        return find(genderMrs);
    }

    public WebElement getFirstNameField() {
        return find(firstNameField);
    }

    public WebElement getLastnameField() {
        return find(lastNameField);
    }

    public WebElement getEmailField() {
        return find(emailField);
    }

    public WebElement getPasswordField() {
        return find(passwordField);
    }

    public WebElement getBirthDateField() {
        return find(birthDateField);
    }

    public WebElement getRecOfferCheckbox() {
        return find(receiveOffersCheckbox);
    }

    public WebElement getNewsletterCheckbox() {
        return find(newsletterCheckbox);
    }

    public WebElement getTermsConditionsCheckbox() {
        return find(termsConditionsCheckbox);
    }

    public WebElement getContinueBtn() {
        return find(continueBtn);
    }
}
