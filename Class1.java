package selenium_tutorial;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String baseUrl = "https://www.facebook.com/";
		driver.get(baseUrl);
		WebElement email=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		email.click();
		email.sendKeys("sounak8839@gmail.com");
		password.click();
		password.sendKeys("vatlocus//@@9091148839");
		driver.findElement(By.id("loginbutton")).click();
		System.exit(0);
		
		

	}

}
