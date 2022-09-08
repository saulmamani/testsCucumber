package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class HomePage {
    private Page driver;
    private Locator header;
    private Locator sauceLabsBackPackAddButton;
    private Locator cartIcon;

    public HomePage(Page driver){
        this.driver = driver;
        this.header = driver.locator("div.header_label");
        this.sauceLabsBackPackAddButton = driver.locator("id=add-to-cart-sauce-labs-backpack");
        cartIcon = driver.locator("a.shopping_cart_link");
    }

    public void verifyHomePageHeaderIsDisplayed(){
        Assert.assertTrue(header.isVisible());
    }

    public void verifyProductInHomePage(String product){
        Assert.assertTrue(driver.isVisible("//div[text()='"+product+"']"));
    }

    public void clickOnAddSauceLabsBackPack(){
        sauceLabsBackPackAddButton.click();
    }

    public void clickOnCartIcon(){
        cartIcon.click();
    }
}
