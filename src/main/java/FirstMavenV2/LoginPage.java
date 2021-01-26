package FirstMavenV2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){super(driver);}

    @FindBy(css = "#identification")
    private WebElement usernameInput;
    @FindBy(css = "#password")
    private WebElement passwordInput;
    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;
    @FindBy(css = "div[role='alert']")
    private WebElement errorMassage;
    @FindBy(css ="#ember412 > nav > header > a.settings-trigger")
    private WebElement cogWheel;
    @FindBy(css = "#ember412 > nav > header > nav > a.logout")
    private WebElement logoutButton;

    public void login(String username, String password){
        waitForElementToBeVisible(usernameInput);
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void logout(){
        waitForElementToBeVisible(cogWheel);
        cogWheel.click();
        logoutButton.click();
    }
}
