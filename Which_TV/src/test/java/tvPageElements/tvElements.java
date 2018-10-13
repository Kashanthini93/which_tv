package tvPageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.baseTest;

public class tvElements extends baseTest {
	
	public WebElement screen_size() {
		return driver.findElement(By.id("screen_size_39_45"));
		}
	
	public WebElement maximum_size() {
		return driver.findElement(By.id("to"));
		}
	
	public boolean results() {
		return driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/div/main/div[2]/div/div/ul/li[1]/div/a")) != null;
		}
	
	public WebElement tv_one() {
		return driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/div/main/div[2]/div/div/ul/li[1]/div/div/div/button"));
		}
	
	public WebElement tv_two() {
		return driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/div/main/div[2]/div/div/ul/li[2]/div/div/div/button"));
		}
	
	public WebElement compare_button() {
		return driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/a"));
		}
	
	public WebElement best_buy_tab() {
		return driver.findElement(By.xpath("/html/body/div[3]/div/header/div[2]/ul/li[2]/a")); 
		}
	
}
