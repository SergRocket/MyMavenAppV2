package FirstMavenV2;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void validLog(){
        LoginPage loginPage = new LoginPage(driver);
        String username = BasePage.TestData.USERNAME;
        String password = BasePage.TestData.PASSWORD;
        loginPage.login(username, password);
        wait.until(ExpectedConditions.urlContains("#/patients"));
    }
}
