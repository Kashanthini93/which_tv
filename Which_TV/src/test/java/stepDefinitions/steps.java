package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import test.baseTest;
import tvPageElements.tvElements;

public class steps extends tvElements {

	//public static WebDriver driver;
	
		// TODO Auto-generated constructor stub

	@Given("^user is on television page$")
    public void user_is_on_television_page() throws Throwable {   

		baseTest.setup();
    }
    
    @When("^user select screen size$")
    public void user_select_screen_size() throws Throwable {  
    	
//    	WebElement element = driver.findElement(By.id("screen_size_39_45"));
//
//    	Actions actions = new Actions(driver);
//
//    	actions.moveToElement(element).click().perform();
     	Actions actions = new Actions(driver);

     	actions.moveToElement(screen_size()).click().perform();
	
    
    }
    
    @And("^user selects the maximum price$")
    public void user_selects_the_maximum_size() throws Throwable {  
//    	
//    	Select maxDropdown = new Select(driver.findElement(By.id("to")));
//    	maxDropdown.selectByIndex(8);
//    	
    	Select maxDropdown = new Select(maximum_size());
    	maxDropdown.selectByIndex(8);
    
    
    }
    
    @Then ("^result is displayed$")
    public void result_is_displayed() {  
    	
//    	WebElement results = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/div/main/div[2]/div/div/ul/li[1]/div/a"));
//    	
//    	Assert.assertTrue(results == results);
      	
    	Assert.assertTrue(results() == results());
    	
    }
    
    
    
    @When("^user select a TV to compare$")
    public void when_user_select_a_tv_to_compare() throws Throwable {  
    	
    	//WebElement button_one = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/div/main/div[2]/div/div/ul/li[1]/div/div/div/button"));

    	//button_one.click();
    
    	tv_one().click();
    	
    }
    
    
    @And("^user selects another TV to compare$")
    public void user_selects_another_TV_to_compare() throws Throwable {  
    	
    	
    	JavascriptExecutor scrolldown = (JavascriptExecutor)driver;
    	scrolldown.executeScript("window.scrollBy(0,250)", "");
//    	WebElement button_two = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/div/main/div[2]/div/div/ul/li[2]/div/div/div/button"));
//    	button_two.click();
    	tv_two().click();
    	
    
    }
    
    @And("^user selects the compare button$")
    public void user_selects_the_compare_button() throws Throwable {  
    	
    	//WebElement compare_button = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/a"));
    	compare_button().click();
    
    }
    
    @Then("^compare page is displayed$")
    public boolean compare_page_is_displayed() throws Throwable {  
    	
	 String actualTitle = driver.getTitle();
	 String expectedTitle = "Compare Televisions";
	 
	 // verify the title 
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			return true;
		 
		}
		else {
			return false;
		    
		}
   
    }
   	
    @When("^user select Best Buy Page$")
    public void user_select_Best_Buy_Page() throws Throwable {  
    	
    	//WebElement best_buy_tab = driver.findElement(By.xpath("/html/body/div[3]/div/header/div[2]/ul/li[2]/a")); 
    	best_buy_tab().click();
    	
    
    }
    
    @Then("^Best Buy Page is displayed$")
    public boolean best_buy_page_is_displayed() throws Throwable {  
    	
	 String actualTitle = driver.getTitle();
	 String expectedTitle = "Which? Best Buy televisions";
	 		
	// verify the title 
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			return true;
		 
		}
		else {
			return false;
		    
		}
    
    
    }

@After
   public static void close_browser() {
    	baseTest.quit();
	}
    
   
    
   	
}
