package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.CustomTitlePage;
import util.driverFactory;

public class CustomTitlePageSteps {

    private CustomTitlePage customTitlePage = new CustomTitlePage(driverFactory.getDriver());
    private CategoriesPage categoriesPage = new CategoriesPage(driverFactory.getDriver());

    @Given("user is on the Custom Title Page")
    public void userIsOnTheCustomTitlePage() {
        categoriesPage.clickTab("App");
        categoriesPage.clickTab("Activity");
        categoriesPage.clickTab("Custom Title");
    }

    @Then("should see TextBox {string} on Custom Title Page")
    public void shouldSeeTextBoxOnCustomTitlePage(String expectedText) {
        Assert.assertEquals(customTitlePage.checkTextboxText(),expectedText);
    }

    @Then("should see NavigationBar {string} on Custom Title Page")
    public void shouldSeeNavigationBarOnCustomTitlePage(String expectedText) {
        Assert.assertEquals(customTitlePage.checkNavigationBarText(),expectedText);
    }

    @When("sendkey Textbox {string} on Custom Title Page")
    public void sendkeyTextboxOnCustomTitlePage(String text) {
        customTitlePage.sendKeyTextbox(text);
    }

    @When("taps Change Left button on Custom Title Page")
    public void tapsChangeLeftButtonOnCustomTitlePage() {
        customTitlePage.clickLeftButton();
    }

    @When("sendkey NavigationBar {string} on Custom Title Page")
    public void sendkeyNavigationBarOnCustomTitlePage(String text) {
        customTitlePage.sendKeyNavigationBar(text);
    }

    @When("taps Change Right button on Custom Title Page")
    public void tapsChangeRightButtonOnCustomTitlePage() {
        customTitlePage.clickRightButton();
    }
}
