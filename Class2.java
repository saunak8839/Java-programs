package selenium_tutorial;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseurl="https://web.whatsapp.com";
		driver.get(baseurl);
		Thread.sleep(15000);
		WebElement search=driver.findElement(By.xpath("//html/body/div[3]/div/div/div[3]/div/div[1]/div/button"));
		search.click();
		search.sendKeys("Rishika");
		WebElement name=driver.findElement(By.xpath("//html/body/div[3]/div/div/div[3]/div/div[2]/div[1]/div/div/div[15]/div/div/div[2]/div[1]/div[1]/span/span"));
		name.click();
		
		WebElement send_Button=driver.findElement(By.xpath("//html/body/div[3]/div/div/div[4]/div/footer/div[1]/div[3]/button"));
		WebElement textbox=driver.findElement(By.xpath("//html/body/div[3]/div/div/div[4]/div/footer/div[1]/div[2]/div/div[2]"));
		for(int i=1;i<=100;i++)
		{
			textbox.click();
			textbox.sendKeys("This is a test message sent by a script");
			send_Button.click();
			
		}
	}

}
