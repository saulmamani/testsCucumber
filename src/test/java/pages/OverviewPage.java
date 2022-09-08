package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;


public class OverviewPage {
    private Page driver;
    private Locator finishButton;

    private Locator listPrices;
    private Locator totalPagina;

    public OverviewPage(Page driver){
        this.driver = driver;
        this.finishButton = driver.locator("id=finish");
        this.listPrices = driver.locator(".inventory_item_price");
        this.totalPagina = driver.locator(".summary_subtotal_label");
    }

    public void clickOnFinishButton(){
        finishButton.click();
    }

    public void verifyCorrectSum(){
        var precios = this.listPrices.allInnerTexts();

        double total = 0.0;
        for(String p:precios){
            float precioProducto = Float.parseFloat(p.substring(1));
            total += precioProducto;
        }
        total = (double) Math.round(total * 100) / 100;
        System.out.println(total);

        //cantidad total generado por la pagina
        double totalPagina = (double)Math.round(Float.parseFloat(this.totalPagina.innerText().substring(13)) * 100) / 100;
        System.out.println(totalPagina);

        boolean result = totalPagina == total;
        Assert.assertTrue(result);
    }

}
