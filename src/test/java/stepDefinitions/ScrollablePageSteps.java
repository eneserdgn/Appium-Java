package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.ScrollablePage;
import util.driverFactory;

public class ScrollablePageSteps {

    private ScrollablePage scrollablePage = new ScrollablePage(driverFactory.getDriver());
    private CategoriesPage categoriesPage = new CategoriesPage(driverFactory.getDriver());

    @Given("user is on the Scrollable Page")
    public void userIsOnTheScrollablePage() {
        categoriesPage.clickTab("Views");
        categoriesPage.clickTab("Tabs");
        categoriesPage.clickTab("5. Scrollable");
    }

    @Then("should see Last Tab {string} on Scrollable Page")
    public void shouldSeeLastTabOnScrollablePage(String expectedTab) {
        Assert.assertEquals(scrollablePage.checkLastTab(),expectedTab);
    }

    @When("taps last Tab on Scrollable Page")
    public void tapsLastTabOnScrollablePage() {
        scrollablePage.clickLastTab();
    }

    @Then("should see Information {string} on Scrollable Page")
    public void shouldSeeInformationOnScrollablePage(String expectedInformation) {
        Assert.assertEquals(scrollablePage.getInformation(),expectedInformation);
    }
}
