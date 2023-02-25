package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.ContextMenuPage;
import util.driverFactory;

public class ContextMenuPageSteps {

    private ContextMenuPage contextMenuPage = new ContextMenuPage(driverFactory.getDriver());
    private CategoriesPage categoriesPage = new CategoriesPage(driverFactory.getDriver());

    @Given("user is on the Context Menu Page")
    public void userIsOnTheContextMenuPage() {
        categoriesPage.clickTab("App");
        categoriesPage.clickTab("Fragment");
        categoriesPage.clickTab("Context Menu");
    }

    @When("long press Button on Context Menu Page")
    public void longPressButtonOnContextMenuPage() {
        contextMenuPage.longPressButton();
    }

    @Then("should see Menu {string} on Context Menu Page")
    public void shouldSeeMenuOnContextMenuPage(String expectedMenu) {
        contextMenuPage.checkMenu(expectedMenu);
    }
}
