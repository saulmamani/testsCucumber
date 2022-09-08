package utilities;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DriverManager {
    private Page driver;

    private DriverManager(){
        Playwright playwright = Playwright.create();
        Page page = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(30)).newPage();
        page.setViewportSize(1520, 750);
        this.driver=page;
    }

    private static DriverManager instance=null;
    public static  DriverManager getInstance(){
        if(instance==null){
            instance = new DriverManager();
        }
        return instance;
    }

    public Page getDriver(){
        return driver;
    }
}
