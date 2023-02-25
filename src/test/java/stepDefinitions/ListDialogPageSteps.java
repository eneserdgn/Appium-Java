package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ListDialogPage;
import util.driverFactory;

public class ListDialogPageSteps {

    private ListDialogPage listDialogPage = new ListDialogPage(driverFactory.getDriver());

    @When("taps List Element {string} on List Dialog Page")
    public void tapsListElementOnListDialogPage(String element) {
        listDialogPage.tapsListElement(element);
    }

    @Then("should see Alert Order {string} on List Dialog Page")
    public void shouldSeeAlertOrderOnListDialogPage(String expectedOrder) {
        Assert.assertEquals(listDialogPage.checkAlertOrder(), expectedOrder);
    }

    @Then("should see Alert Name {string} on List Dialog Page")
    public void shouldSeeAlertNameOnListDialogPage(String expectedName) {
        Assert.assertEquals(listDialogPage.checkAlertName(), expectedName);
    }
}
