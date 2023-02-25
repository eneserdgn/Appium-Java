package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.EnableAdminPage;
import util.driverFactory;

public class EnableAdminPageSteps {

    private EnableAdminPage enableAdminPage = new EnableAdminPage(driverFactory.getDriver());
    private CategoriesPage categoriesPage = new CategoriesPage(driverFactory.getDriver());

    @Given("user is on the Enable Admin Page")
    public void userIsOnTheEnableAdminPage() {
        categoriesPage.clickTab("App");
        categoriesPage.clickTab("Device Admin");
        categoriesPage.clickDeviceAdminTab("General");
    }

    @When("taps Enable Admin Checkbox on Enable Admin Page")
    public void tapsEnableAdminCheckboxOnEnableAdminPage() {
        enableAdminPage.clickEnableAdmin();
    }

    @When("taps Activate Button on Enable Admin Page")
    public void tapsActivateButtonOnEnableAdminPage() {
        enableAdminPage.clickActiveButton();
    }

    @When("taps Risk Checkbox on Enable Admin Page")
    public void tapsRiskCheckboxOnEnableAdminPage() {
        enableAdminPage.clickRiskCheckbox();
    }

    @When("taps Okay button on Enable Admin Page")
    public void tapsOkayButtonOnEnableAdminPage() {
        enableAdminPage.clickOkayButton();
    }

    @Then("should see title {string} on Enable Admin Page")
    public void shouldSeeTitleOnEnableAdminPage(String expectedTitle) {
        Assert.assertEquals(enableAdminPage.checkTitle(),expectedTitle);
    }

    @Then("should see checked Enabled Admin Checkbox on Enable Admin Page")
    public void shouldSeeCheckedEnabledAdminCheckboxOnEnableAdminPage() {
        Assert.assertEquals(enableAdminPage.checkEnableAdminChecked(),"true");
    }
}
