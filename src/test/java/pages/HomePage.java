//https://www.how2shout.com/linux/oracle-java-ubuntu-22-04/
package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Iterator;

public class HomePage {
    private Page driver;
    private Locator header;
    private Locator sauceLabsBackPackAddButton;
    private Locator cartIcon;

    private Locator listPriceProducts;

    public HomePage(Page driver) {
        this.driver = driver;
        this.header = driver.locator("div.header_label");
        this.sauceLabsBackPackAddButton = driver.locator("id=add-to-cart-sauce-labs-backpack");

        this.cartIcon = driver.locator("a.shopping_cart_link");
        this.listPriceProducts = driver.locator(".inventory_item_price");
    }

    public void verifyHomePageHeaderIsDisplayed() {
        Assert.assertTrue(header.isVisible());
    }

    public void verifyProductInHomePage(String product) {
        Assert.assertTrue(driver.isVisible("//div[text()='" + product + "']"));
    }

    public void clickOnAddSauceLabsBackPack() {
        sauceLabsBackPackAddButton.click();
    }

    public void clickOnCartIcon() {
        cartIcon.click();
    }


    public void clickItemProductButton(String product_id) {
        driver.click("#" + product_id);
    }

    public void clickInSelectOrder() {
        this.driver.selectOption("select.product_sort_container", "lohi");
    }

    public void verifyOrderProducts() {
        var lista = this.listPriceProducts.allInnerTexts();

        ArrayList<Double> precios = new ArrayList<Double>();
        for (String p : lista) {
            double precioProducto = Double.parseDouble(p.substring(1));
            precios.add(precioProducto);
        }

        boolean isOrder = isSorted(precios);

        Assert.assertTrue(isOrder);
    }

    private static <T extends Comparable<? super T>>
    boolean isSorted(Iterable<T> iterable) {
        Iterator<T> iter = iterable.iterator();
        if (!iter.hasNext()) {
            return true;
        }
        T t = iter.next();
        while (iter.hasNext()) {
            T t2 = iter.next();
            if (t.compareTo(t2) > 0) {
                return false;
            }
            t = t2;
        }
        return true;
    }
}
