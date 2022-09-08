package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.CheckoutCompletePage;
import utilities.DriverManager;

public class CheckoutCompleteStep {
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(DriverManager.getInstance().getDriver());
    @Then("I should see a message that says {string}")
    public void verifyThankYouMessage(String message){
        checkoutCompletePage.verifyThankYouMessage(message);
    }
}
