package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTest {

	public static void main(String[] args) {
		
      System.setProperty("webdriver.Edge.driver","C://browserDriver/msedgedriver.exe");
      WebDriver driver = new EdgeDriver();
      driver.get("https://www.google.com/");
	}

}