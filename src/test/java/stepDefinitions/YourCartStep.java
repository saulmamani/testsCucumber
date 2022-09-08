package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.YourCartPage;
import utilities.DriverManager;

public class YourCartStep {
    YourCartPage yourCartPage = new YourCartPage(DriverManager.getInstance().getDriver());
    @And("I click on checkout button")
    public void clickOnCheckoutButton(){
        yourCartPage.clickOnCheckoutButton();
    }

    @Then("I should be four products in the cart")
    public void verifyFourProductsCart() {
        yourCartPage.verifyFourProductsCart();
    }
}
