package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.elementHelper;

public class EnableAdminPage {
    private WebDriver driver;
    private elementHelper elementHelper;

    // By Locators
    private By title = By.xpath("//*[@resource-id=\"android:id/action_bar\"]/android.widget.TextView");
    private By enableAdmin = By.id("android:id/checkbox");
    private By active = By.id("com.android.settings:id/action_button");
    private By risk = By.id("com.miui.securitycenter:id/check_box");
    private By okay = By.id("com.miui.securitycenter:id/intercept_warn_allow");

    // Constructor
    public EnableAdminPage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new elementHelper(driver);
    }

    // Page Actions
    public void clickEnableAdmin() {
        elementHelper.click(enableAdmin);
    }

    public void clickActiveButton() {
        elementHelper.click(active);
    }

    public void clickRiskCheckbox() {
        elementHelper.click(risk);
    }

    public void clickOkayButton() {
        elementHelper.waitAttribute(okay, "enabled", "true");
        elementHelper.click(okay);
    }

    public String checkTitle() {
        return elementHelper.getText(title);
    }

    public String checkEnableAdminChecked() {
        return elementHelper.getAttribute(enableAdmin, "checked");
    }


}
