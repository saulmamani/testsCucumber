package stepDefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.YourCartPage;
import utilities.DriverManager;

import java.util.List;

public class YourCartStep {
    YourCartPage yourCartPage = new YourCartPage(DriverManager.getInstance().getDriver());
    @And("I click on checkout button")
    public void clickOnCheckoutButton(){
        yourCartPage.clickOnCheckoutButton();
    }

    @Then("I should have {string} products in the cart")
    public void verifyQuantiyProductsCart(String cantidad) {
        yourCartPage.verifyQuantiyProductsCart(cantidad);
    }

    @When("I click on two remove products buttons")
    public void clickOnRemoveProduct(DataTable data) {
        List<String> productIds = data.transpose().asList(String.class);
        yourCartPage.clickRemoveProductButton(productIds.get(0));
        yourCartPage.clickRemoveProductButton(productIds.get(1));
    }
}
