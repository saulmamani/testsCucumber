package stepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import utilities.DriverManager;

public class HomeSteps {
    private final HomePage homePage = new HomePage(DriverManager.getInstance().getDriver());

//    @Then("I am in the home page")
    @Then("I should be in the home page")
    public void i_should_be_in_the_home_page(){
        homePage.verifyHomePageHeaderIsDisplayed();
    }

//    @Then("I verify that {string} is displayed")
//    public void verifyProductInHomePage(String product){
//        homePage.verifyProductInHomePage(product);
//    }
//
//    @Then("I add sauce labs back pack product to the cart")
//    public void addSauceLabsBackPackToCart(){
//        homePage.clickOnAddSauceLabsBackPack();
//    }
//
//    @And("I click on the cart icon")
//    public void clickOnCartIcon(){
//        homePage.clickOnCartIcon();
//    }
}
