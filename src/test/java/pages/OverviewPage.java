package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;



public class OverviewPage {
    private Page driver;
    private Locator finishButton;

    public OverviewPage(Page driver){
        this.driver = driver;
        this.finishButton = driver.locator("id=finish");
    }

    public void clickOnFinishButton(){
        finishButton.click();
    }
}
