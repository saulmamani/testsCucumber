package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class LoginPage {
    private Page driver;
    private Locator userNameTextBox;
    private Locator passwordTextBox;
    private Locator loginButton;
    private Locator errorMessage;

    public LoginPage(Page driver){
        this.driver = driver;
        this.userNameTextBox = driver.locator("id=user-name");
        this.passwordTextBox = driver.locator("id=password");
        this.loginButton = driver.locator("id=login-button");
        this.errorMessage = driver.locator("//h3[@data-test='error']");
    }

    public void setUserNameTextBox(String userName){
        userNameTextBox.type(userName);
    }

    public void setPasswordTextBox(String password){
        passwordTextBox.type(password);
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

    public void verifyErrorMessageText(String errorText){
        Assert.assertEquals(errorText, errorMessage.textContent());
    }
}
