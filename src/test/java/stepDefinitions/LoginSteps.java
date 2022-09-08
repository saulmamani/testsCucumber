package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.LoginPage;
import utilities.DriverManager;

public class LoginSteps {
    private final LoginPage loginPage = new LoginPage(DriverManager.getInstance().getDriver());

//    @When("I set the user name text box with {string}")
    public void setUserName(String userName){
        loginPage.setUserNameTextBox(userName);
    }

    @When("I set the password text box with {string}")
    public void setPassword(String password){
        loginPage.setPasswordTextBox(password);
    }

    @When("I click on the login button")
    public void clickOnLoginButton(){
        loginPage.clickOnLoginButton();
    }

    @Then("I verify that a error message that says {string} is displayed")
    public void verifyErrorMessageText(String errorText){
        loginPage.verifyErrorMessageText(errorText);
    }

    @When("I set the user name text box with {string}")
    public void iSetTheUserNameTextBoxWith(String userName) {
        loginPage.setUserNameTextBox(userName);
    }
}
