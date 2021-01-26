package FirstMavenV2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Hello world!
 *
 */
public class BasePage {
   protected WebDriver driver;
   protected WebDriverWait wait;

   public BasePage (WebDriver driver){
       this.driver=driver;
       this.wait=new WebDriverWait(driver, Duration.ofSeconds(TestData.TIMEOUT));
       PageFactory.initElements(driver, this);
   }
   protected void waitForElementToBeVisible (WebElement element){
       wait.until(ExpectedConditions.visibilityOf(element));
   }
    public class TestData {
        // Constants
        public static final String DEVLINK = "http://demo.hospitalrun.io/#/login";
        public static final String USERNAME = "hr.doctor@hospitalrun.io";
        public static final String PASSWORD = "HRt3st12";
        public static final String SEARCHFOR = "Test Patient";
        public static final String MEDICATION = "Pramoxine";
        public static final String PRESCRIPTION = "Testing prescription";
        public static final String INVALIDPASSWORD = "HR312";
        public static final String INVALIDUSERNAME = "hr.doctor@hospn.io";

        // Project configuration
        public static final int TIMEOUT = 9;
    }
}
