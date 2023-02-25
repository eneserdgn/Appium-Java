package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ActionBarTabsPage;
import util.driverFactory;

public class ActionBarTabsPageSteps {

    private ActionBarTabsPage actionBarTabsPage = new ActionBarTabsPage(driverFactory.getDriver());

    @Then("should see Toogle Tab Passive on Action Bar Tabs Page")
    public void shouldSeeToogleTabPassiveOnActionBarTabsPage() {
        actionBarTabsPage.checkToggleTabPassive();
    }

    @When("taps Add New Tab button on Action Bar Tabs Page")
    public void tapsAddNewTabButtonOnActionBarTabsPage() {
    }

    @Then("should see added Tab on Action Bar Tabs Page")
    public void shouldSeeAddedTabOnActionBarTabsPage() {
    }

    @When("taps Remove Last Tab button on Action Bar Tabs Page")
    public void tapsRemoveLastTabButtonOnActionBarTabsPage() {
    }

    @Then("should see deleted Tab on Action Bar Tabs Page")
    public void shouldSeeDeletedTabOnActionBarTabsPage() {
    }

    @When("taps Remove All Tab button on Action Bar Tabs Page")
    public void tapsRemoveAllTabButtonOnActionBarTabsPage() {
    }

    @Then("should see deleted All Tabs on Action Bar Tabs Page")
    public void shouldSeeDeletedAllTabsOnActionBarTabsPage() {
    }
}
