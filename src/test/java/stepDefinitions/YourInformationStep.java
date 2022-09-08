package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import pages.YourInformationPage;
import utilities.DriverManager;
import java.util.List;
public class YourInformationStep {
    YourInformationPage yourInformationPage = new YourInformationPage(DriverManager.getInstance().getDriver());
    @And("I fill the customer data with")
    public void fillCustomerInformation(DataTable customerData){
        List<String> data = customerData.transpose().asList(String.class);
        yourInformationPage.setNameTextBox(data.get(0));
        yourInformationPage.setLastNameTextBox(data.get(1));
        yourInformationPage.setZipCodeTextBox(data.get(2));
    }

    @And("I click on continue button")
    public void clickOnContinueButton(){
        yourInformationPage.clickOnContinueButton();
    }
}