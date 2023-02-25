package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CategoriesPage;
import util.driverFactory;

public class CategoriesPageSteps {

    private CategoriesPage categoriesPage = new CategoriesPage(driverFactory.getDriver());

    @When("taps {string} on Categories")
    public void tapsOnCategories(String tab) {
        categoriesPage.clickTab(tab);
    }

    @Given("user is on the Home Page")
    public void userIsOnTheHomePage() {
        categoriesPage.checkHomePage();
    }
}
