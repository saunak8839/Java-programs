package selenium_tutorial;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseurl="https://web.whatsapp.com";
		driver.get(baseurl);
		Thread.sleep(15000);
		WebElement search=driver.findElement(By.cssSelector("button[class=_1XCAr]"));
		search.click();
		search.sendKeys("Debdutta");
		WebElement name=driver.findElement(By.cssSelector("span[title=\"The Legacy\"]"));
		name.click();
		WebElement textbox=driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div[2]/div/div[2]"));
		textbox.click();
		textbox.sendKeys("Get ready");
		Thread.sleep(5000);
		WebElement send_Button=driver.findElement(By.cssSelector("button[class=_3M-N-]"));
		send_Button.click();
		
		
		for(int i=1;i<=100;i++)
		{
			textbox.click();
			textbox.sendKeys("you are a faggot");
			WebElement send_Button1=driver.findElement(By.cssSelector("button[class=_3M-N-"));
			send_Button1.click();
			
		}
	}

}

