package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.elementHelper;

public class ListDialogPage {
    private WebDriver driver;
    private elementHelper elementHelper;

    // By Locators
    private By elements = By.id("android:id/text1");
    private By alert = By.id("android:id/message");

    // Constructor
    public ListDialogPage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new elementHelper(driver);
    }

    // Page Actions
    public void tapsListElement(String element) {
        elementHelper.clickEquals(elements, element);
    }

    public String checkAlertName() {
        return elementHelper.getText(alert).substring(18);
    }

    public String checkAlertOrder() {
        return String.valueOf(elementHelper.getText(alert).charAt(14));
    }

}
