package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGDemo {
   public void verifyPageTitle()
   {
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.google.com/");
	   
	   
   }
}
