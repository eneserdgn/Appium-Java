package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AlertDialogPage;
import pages.CategoriesPage;
import util.driverFactory;

public class AlertDialogPageSteps {

    private AlertDialogPage alertDialogPage = new AlertDialogPage(driverFactory.getDriver());
    private CategoriesPage categoriesPage = new CategoriesPage(driverFactory.getDriver());

    @Given("user is on the Alert Dialog Page")
    public void userIsOnTheAlertDialogPage() {
        categoriesPage.clickTab("App");
        categoriesPage.clickTab("Alert Dialogs");
    }

    @When("taps List Dialog on Alert Dialog Page")
    public void tapsDialogOnListDialogPage() {
        alertDialogPage.clickListDialog();
    }
}
