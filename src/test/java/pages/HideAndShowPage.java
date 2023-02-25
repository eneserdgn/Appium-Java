package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.elementHelper;

public class HideAndShowPage {
    private WebDriver driver;
    private elementHelper elementHelper;

    // By Locators
    private By firstButton = By.id("com.hmh.api:id/frag1hide");
    private By firstText = By.id("com.hmh.api:id/saved");
    private By secondButton = By.id("com.hmh.api:id/frag2hide");
    private By secondText = By.xpath("//*[@resource-id=\"com.hmh.api:id/fragment2\"]/android.widget.EditText");

    // Constructor
    public HideAndShowPage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new elementHelper(driver);
    }

    // Page Actions
    public void checkFirstButton() {
        elementHelper.checkElementPresence(firstButton);
    }

    public String getFirstText() {
        return elementHelper.getText(firstText);
    }

    public void checkSecondButton() {
        elementHelper.checkElementPresence(secondButton);
    }

    public String getSecondText() {
        return elementHelper.getText(secondText);
    }

    public void clickSecondButton() {
        elementHelper.click(secondButton);
    }

    public String getSecondButtonText() {
        return elementHelper.getText(secondButton);
    }

    public void checkSecondTextUnvisible() {
        elementHelper.checkElementNotPresence(secondText);
    }

}
