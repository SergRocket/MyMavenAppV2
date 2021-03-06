package FirstMavenV2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class BaseTest {
   WebDriver driver;
   WebDriverWait wait;

   @BeforeMethod
    public void beforeLogin(){
      WebDriverManager.chromedriver().setup();
      driver= new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
      wait = new WebDriverWait(driver, Duration.ofSeconds(BasePage.TestData.TIMEOUT));
      driver.get(BasePage.TestData.DEVLINK);
   }
    @AfterMethod
    public void shuttingDown() {
        driver.close();
        if (driver != null) {
            driver.quit();
        }
   }
}
