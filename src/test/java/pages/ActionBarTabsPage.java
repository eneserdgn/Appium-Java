package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import util.elementHelper;

public class ActionBarTabsPage {
    private WebDriver driver;
    private elementHelper elementHelper;

    // By Locators
    private By title = By.id("android:id/action_bar");

    // Constructor
    public ActionBarTabsPage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new elementHelper(driver);
    }

    // Page Actions
    public void checkToggleTabPassive() {
        elementHelper.checkElementPresence(title);
    }

}
