package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class CheckoutCompletePage {
    private Page driver;
    private Locator thankYouLabel;

    public CheckoutCompletePage(Page driver){
        this.driver = driver;
        this.thankYouLabel = driver.locator("h2.complete-header");
    }

    public void verifyThankYouMessage(String message){
        Assert.assertEquals(message, thankYouLabel.textContent());
    }
}
