package FirstMavenV2;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {
    @Test
    public  void logout(){
        LoginPage loginPage = new LoginPage(driver);
        String username = BasePage.TestData.USERNAME;
        String password = BasePage.TestData.PASSWORD;
        loginPage.login(username, password);
        loginPage.logout();
        wait.until(ExpectedConditions.urlContains("#/login"));
    }
}
