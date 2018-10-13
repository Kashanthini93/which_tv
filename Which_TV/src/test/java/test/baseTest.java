package test;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class baseTest {
	public static WebDriver driver;
    
    @BeforeClass
    public static void setup() {
    	driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.which.co.uk/reviews/televisions");
    }
    
    @AfterClass  
  public static void quit() {
  		driver.close();
	}
  
 


}
