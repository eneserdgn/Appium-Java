package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import util.elementHelper;

public class CategoriesPage {
    private WebDriver driver;
    private elementHelper elementHelper;

    // By Locators
    private By parent = By.id("android:id/decor_content_parent");
    private By tabs = By.id("android:id/text1");
    private By deviceAdminTabs = By.id("android:id/title");


    // Constructor
    public CategoriesPage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new elementHelper(driver);
    }

    // Page Actions
    public void checkHomePage() {
        elementHelper.checkElementPresence(parent);
    }

    public void clickTab(String tab) {
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\""+tab+"\"))")).click();
    }


    public void clickDeviceAdminTab(String tab) {
        elementHelper.clickEquals(deviceAdminTabs, tab);
    }


}
