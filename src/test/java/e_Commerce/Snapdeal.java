package e_Commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Snapdeal {
  @Test
  public void SnapdealTest() {
	  
	  Reporter.log("Snapdeal opening in Browser", true);
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ueer\\Documents\\Selenium Start\\chromedriver_win32 (109)\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.snapdeal.com/");
	  driver.quit();	  
	  
  }
}
