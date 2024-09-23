package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.Chrome.driver","C://browserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("nitesh.kanojiya@yahoo.com1");
		driver.findElement(By.name("pass")).sendKeys("Nitart@1324161807751");
		// css selector by class Name
		driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();

		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Create new ")).click();

		// css selector by Name
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("arthu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kanojiya");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("athar9595@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("athar9595@gmail.com");
		// css selector by ID
		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("nitesh#1234");

		WebElement day =  driver.findElement(By.id("day"));
		Select d=new Select(day);
		d.selectByIndex(3);

		WebElement month = driver.findElement(By.name("birthday_month"));
		Select m=new Select(month);
		m.selectByValue("2");

		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select y= new Select(year);
		y.selectByVisibleText("1992");

		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.name("websubmit")).click();

		
	}

}
