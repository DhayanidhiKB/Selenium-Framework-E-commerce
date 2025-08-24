package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Homepage extends BasePage {

    private WebDriver driver;

    // Clean constructor, no exception
    public Homepage() {
        try {
            this.driver = getDriver();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Driver initialization failed in Homepage", e);
        }
    }

    private WebElement find(By locator) {
        return driver.findElement(locator);
    }

    By toggle = By.cssSelector(".toggle");
    By homeLink = By.linkText("HOMEPAGE");
    By accordionLink = By.linkText("ACCORDION");
    By browserTabLink = By.linkText("BROWSER TABS");
    By buttonsLink = By.linkText("BUTTONS");
    By calcLink = By.linkText("CALCULATOR (JS)");
    By contactUsLink = By.linkText("CONTACT US FORM TEST");
    By datePickerLink = By.linkText("DATE PICKER");
    By dropdownLink = By.linkText("DROPDOWN CHECKBOX & RADIO");
    By fileUpload = By.linkText("FILE UPLOAD");
    By hiddenElementsLink = By.linkText("HIDDEN ELEMENTS");
    By iFrameLink = By.linkText("IFRAME");
    By loaderLink = By.linkText("LOADER");
    By loginPortalLink = By.linkText("LOGIN PORTAL TEST");
    By mouseLink = By.linkText("MOUSE MOVEMENT");
    By popupLink = By.linkText("POP UPS & ALERTS");
    By predictiveLink = By.linkText("PREDICTIVE SEARCH");
    By tablesLink = By.linkText("TABLES");
    By testStoreLink = By.linkText("TEST STORE");
    By aboutMeLink = By.linkText("ABOUT ME");
    By cookie = By.cssSelector(".close-cookie-warning > span");

    public WebElement getToggle() {
        return find(toggle);
    }

    public WebElement getHomepageLink() {
        return find(homeLink);
    }

    public WebElement getAccordionLink() {
        return find(accordionLink);
    }

    public WebElement getBrowserTabLink() {
        return find(browserTabLink);
    }

    public WebElement getButtonLink() {
        return find(buttonsLink);
    }

    public WebElement getCalcLink() {
        return find(calcLink);
    }

    public WebElement getContactUsLink() {
        return find(contactUsLink);
    }

    public WebElement getDatePickerLink() {
        return find(datePickerLink);
    }

    public WebElement getDropdownLink() {
        return find(dropdownLink);
    }

    public WebElement getFileUploadLink() {
        return find(fileUpload);
    }

    public WebElement getHiddenElementsLink() {
        return find(hiddenElementsLink);
    }

    public WebElement getIframeLink() {
        return find(iFrameLink);
    }

    public WebElement getLoaderLink() {
        return find(loaderLink);
    }

    public WebElement getLoginPortalLink() {
        return find(loginPortalLink);
    }

    public WebElement getMouseLink() {
        return find(mouseLink);
    }

    public WebElement getPopupLink() {
        return find(popupLink);
    }

    public WebElement getPredictiveLink() {
        return find(predictiveLink);
    }

    public WebElement getTablesLink() {
        return find(tablesLink);
    }

    public WebElement getTestStoreLink() {
        return find(testStoreLink);
    }

    public WebElement getAboutMeLink() {
        return find(aboutMeLink);
    }

    public WebElement getCookie() {
        return find(cookie);
    }
}
