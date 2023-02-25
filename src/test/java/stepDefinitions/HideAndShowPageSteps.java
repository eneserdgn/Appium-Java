package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.HideAndShowPage;
import util.driverFactory;

public class HideAndShowPageSteps {

    private HideAndShowPage hideAndShowPage = new HideAndShowPage(driverFactory.getDriver());
    private CategoriesPage categoriesPage = new CategoriesPage(driverFactory.getDriver());

    @Given("user is on the Hide and Show Page")
    public void userIsOnTheHideAndShowPage() {
        categoriesPage.clickTab("App");
        categoriesPage.clickTab("Fragment");
        categoriesPage.clickTab("Hide and Show");
    }
    @Then("should see First Button on Hide and Show Page")
    public void shouldSeeFirstButtonOnHideAndShowPage() {
        hideAndShowPage.checkFirstButton();
    }

    @Then("should see First Hide TextBox {string} on Hide and Show Page")
    public void shouldSeeFirstHideTextBoxOnHideAndShowPage(String expectedText) {
       Assert.assertEquals(hideAndShowPage.getFirstText(),expectedText);
    }

    @Then("should see Second Button on Hide and Show Page")
    public void shouldSeeSecondButtonOnHideAndShowPage() {
        hideAndShowPage.checkSecondButton();
    }

    @Then("should see Second Hide TextBox {string} on Hide and Show Page")
    public void shouldSeeSecondHideTextBoxOnHideAndShowPage(String expectedText) {
        Assert.assertEquals(hideAndShowPage.getSecondText(),expectedText);
    }

    @When("taps Second Button on Hide and Show Page")
    public void tapsSecondButtonOnHideAndShowPage() {
        hideAndShowPage.clickSecondButton();
    }

    @Then("should see Second Button {string} on Hide and Show Page")
    public void shouldSeeSecondButtonOnHideAndShowPage(String expectedText) {
        Assert.assertEquals(hideAndShowPage.getSecondButtonText(),expectedText);
    }

    @Then("shouldnt see Second Hide Textbox on Hide and Show Page")
    public void shouldntSeeSecondHideTextboxOnHideAndShowPage() {
        hideAndShowPage.checkSecondTextUnvisible();
    }
}
