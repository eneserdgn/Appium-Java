package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.elementHelper;

public class AlertDialogPage {
    private WebDriver driver;
    private elementHelper elementHelper;

    // By Locators
    private By listDialog = By.id("com.hmh.api:id/select_button");

    // Constructor
    public AlertDialogPage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new elementHelper(driver);
    }

    // Page Actions
    public void clickListDialog() {
        elementHelper.click(listDialog);
    }


}
