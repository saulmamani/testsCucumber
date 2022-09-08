package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class YourCartPage {
    private Page driver;
    private Locator checkoutButton;
    public YourCartPage(Page driver){
        this.driver = driver;
        this.checkoutButton = driver.locator("id=checkout");
    }

    public void clickOnCheckoutButton(){
        checkoutButton.click();
    }
}
