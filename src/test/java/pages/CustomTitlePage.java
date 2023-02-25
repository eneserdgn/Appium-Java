package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.elementHelper;

public class CustomTitlePage {
    private WebDriver driver;
    private elementHelper elementHelper;

    // By Locators
    private By textBox = By.id("com.hmh.api:id/left_text_edit");
    private By navigationBar = By.id("com.hmh.api:id/right_text_edit");
    private By leftButton = By.id("com.hmh.api:id/left_text_button");
    private By rightButton = By.id("com.hmh.api:id/right_text_button");

    // Constructor
    public CustomTitlePage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new elementHelper(driver);
    }

    // Page Actions
    public String checkTextboxText() {
        return elementHelper.getText(textBox);
    }
    public String checkNavigationBarText() {
        return elementHelper.getText(navigationBar);
    }
    public void sendKeyTextbox(String text) {
        elementHelper.sendKey(textBox,text);
    }
    public void sendKeyNavigationBar(String text) {
        elementHelper.sendKey(navigationBar,text);
    }
    public void clickLeftButton() {
        elementHelper.click(leftButton);
    }
    public void clickRightButton() {
        elementHelper.click(rightButton);
    }

}
