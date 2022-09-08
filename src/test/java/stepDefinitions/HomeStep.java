package stepDefinitions;

import io.cucumber.datatable.DataTable;
import pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utilities.DriverManager;
import java.util.List;

public class HomeStep {
    private final HomePage homePage = new HomePage(DriverManager.getInstance().getDriver());

    @Then("I am in the home page")
    @Then("I should be in the home page")
    public void i_should_be_in_the_home_page() {
        homePage.verifyHomePageHeaderIsDisplayed();
    }

    @Then("I verify that {string} is displayed")
    public void verifyProductInHomePage(String product) {
        homePage.verifyProductInHomePage(product);
    }

    @Then("I add sauce labs back pack product to the cart")
    public void addSauceLabsBackPackToCart() {
        homePage.clickOnAddSauceLabsBackPack();
    }

    @And("I click on the cart icon")
    public void clickOnCartIcon() {
        homePage.clickOnCartIcon();
    }

    @And("I click on the some products buttons")
    public void addProductToCart(DataTable data) {
        List<String> productIds = data.transpose().asList(String.class);
        homePage.clickItemProductButton(productIds.get(0));
        homePage.clickItemProductButton(productIds.get(1));
        homePage.clickItemProductButton(productIds.get(2));
        homePage.clickItemProductButton(productIds.get(3));
        homePage.clickItemProductButton(productIds.get(4));
    }

    @And("I click select price dropdown with {string}")
    public void clickInSelectOrder(String option) {
        homePage.clickInSelectOrder(option);
    }

    @Then("I verify correct order")
    public void verifyOrderProducts() {
        homePage.verifyOrderProducts();
    }
}
