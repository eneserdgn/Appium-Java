package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.elementHelper;

public class ContextMenuPage {
    private WebDriver driver;
    private elementHelper elementHelper;

    // By Locators
    private By button = By.id("com.hmh.api:id/long_press");
    private By menu = By.id("android:id/title");

    // Constructor
    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new elementHelper(driver);
    }

    // Page Actions
    public void longPressButton() {
        elementHelper.longPress(button);
    }

    public void checkMenu(String expectedMenu) {
        elementHelper.checkElementsText(menu,expectedMenu);
    }

}
