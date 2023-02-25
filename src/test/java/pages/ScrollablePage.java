package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.elementHelper;

public class ScrollablePage {
    private WebDriver driver;
    private elementHelper elementHelper;

    // By Locators
    private By tab = By.id("android:id/title");
    private By information = By.xpath("//*[@resource-id=\"android:id/tabcontent\"]/android.widget.TextView");

    // Constructor
    public ScrollablePage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new elementHelper(driver);
    }

    // Page Actions
    public String checkLastTab() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/tabs\")).setAsHorizontalList().scrollToEnd(10)"));
        return elementHelper.getElementsLastText(tab);
    }

    public void clickLastTab() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/tabs\")).setAsHorizontalList().scrollToEnd(10)"));
        elementHelper.clickElementsLast(tab);
    }

    public String getInformation() {
        return elementHelper.getText(information);
    }

}
