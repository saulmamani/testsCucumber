package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class YourCartPage {
    private Page driver;
    private Locator checkoutButton;

    private Locator listPrices;
    public YourCartPage(Page driver){
        this.driver = driver;
        this.checkoutButton = driver.locator("id=checkout");
        this.listPrices = driver.locator(".inventory_item_price");
    }

    public void clickOnCheckoutButton(){
        checkoutButton.click();
    }

    public void verifyFourProductsCart(){
        int cantProducts = 4;
        int cantInCart = this.listPrices.count();
        System.out.println(cantInCart);
        Assert.assertEquals(cantInCart, cantProducts);
    }
}
