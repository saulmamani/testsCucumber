package stepDefinitions;

import io.cucumber.java.en.And;
import pages.OverviewPage;
import utilities.DriverManager;

public class OverviewStep {
    OverviewPage overviewPage = new OverviewPage(DriverManager.getInstance().getDriver());
    @And("I click on finish button")
    public void clickOnFinishButton(){
        overviewPage.clickOnFinishButton();
    }
}

