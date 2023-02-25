package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.elementHelper;

public class IncomingMessagePage {
    private WebDriver driver;
    private elementHelper elementHelper;

    // By Locators
    private By showNotification = By.id("com.hmh.api:id/notify");
    private By notifications = By.id("android:id/app_name_text");
    private By notificationDetail = By.xpath("//*[@resource-id=\"android:id/app_name_text\" and @text=\"API Demos\"]/../../..//*[@resource-id=\"android:id/text\"]");
    private By detail = By.id("com.hmh.api:id/message");






    // Constructor
    public IncomingMessagePage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new elementHelper(driver);
    }

    // Page Actions
    public void clickShowNotificationButton() {
        elementHelper.click(showNotification);
    }

    public void checkNotification() {
        ((AndroidDriver) driver).openNotifications();
        elementHelper.checkElementsText(notifications,"API Demos");
    }

    public String getNotificationDetail() {
        return elementHelper.getText(notificationDetail);
    }

    public void clickNotification() {
        elementHelper.click(notificationDetail);
    }

    public void checkNotificationDetailPage() {
        elementHelper.checkElementPresence(detail);
    }

    public String getNotificationDetailOnDetail() {
        return elementHelper.getText(detail).substring(40);
    }
}
