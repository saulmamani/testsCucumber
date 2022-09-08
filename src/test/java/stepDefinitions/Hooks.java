package stepDefinitions;

import io.cucumber.java.Before;
import utilities.DriverManager;

public class Hooks {
    @Before
    public void beforeHook(){
        DriverManager.getInstance().getDriver().navigate("https://www.saucedemo.com/");
    }
}
