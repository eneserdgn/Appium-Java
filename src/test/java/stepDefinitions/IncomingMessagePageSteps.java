package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.IncomingMessagePage;
import util.driverFactory;

public class IncomingMessagePageSteps {

    private IncomingMessagePage incomingMessagePage = new IncomingMessagePage(driverFactory.getDriver());
    private CategoriesPage categoriesPage = new CategoriesPage(driverFactory.getDriver());

    String notificationDetail = "";
    @Given("user is on the Incoming Message Page")
    public void userIsOnTheIncomingMessagePage() {
        categoriesPage.clickTab("App");
        categoriesPage.clickTab("Notification");
        categoriesPage.clickTab("IncomingMessage");
    }

    @When("taps Show Notification button on Incoming Message Page")
    public void tapsShowNotificationButtonOnIncomingMessagePage() {
        incomingMessagePage.clickShowNotificationButton();
    }

    @Then("should see the Notification")
    public void shouldSeeTheNotification() {
        incomingMessagePage.checkNotification();
        notificationDetail= incomingMessagePage.getNotificationDetail();
    }

    @When("taps Notification")
    public void tapsNotification() {
        incomingMessagePage.clickNotification();
    }

    @Then("should see Notification Detail Page")
    public void shouldSeeNotificationDetailPage() {
        incomingMessagePage.checkNotificationDetailPage();
    }

    @Then("should see Notification Detail Same on Notification Detail Page")
    public void shouldSeeNotificationDetailOnNotificationDetailPage() {
        Assert.assertEquals(incomingMessagePage.getNotificationDetailOnDetail(),notificationDetail);
    }
}
