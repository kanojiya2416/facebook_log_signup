package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationoperation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.Chrome.driver","C://browserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/");
		driver.findElement(By.linkText("Job Support")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();

		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		Thread.sleep(5000);

		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);

		System.out.println(driver.getPageSource());
		Thread.sleep(5000);

		System.out.println(driver.getTitle());


	}

}
