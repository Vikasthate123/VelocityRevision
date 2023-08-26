package e_Commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void FlipkartTest() {
	  
	  Reporter.log("Flipkart opening in Browser", true);
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ueer\\Documents\\Selenium Start\\chromedriver_win32 (109)\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.quit();
	  
  }
}
