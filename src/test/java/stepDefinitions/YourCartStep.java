package stepDefinitions;


import io.cucumber.java.en.And;
import pages.YourCartPage;
import utilities.DriverManager;

public class YourCartStep {
    YourCartPage yourCartPage = new YourCartPage(DriverManager.getInstance().getDriver());
    @And("I click on checkout button")
    public void clickOnCheckoutButton(){
        yourCartPage.clickOnCheckoutButton();
    }
}
