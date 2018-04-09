package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class IndusNetLoginTest {
	WebDriver driver;
	public void browserinvocation() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://104.37.186.158:9800/");	

		driver.findElement(By.xpath("//a[@class='loginArea']")).click();
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@class='md-input iconPassword']")).sendKeys("Pass@123");;
		driver.findElement(By.xpath("//input[@class='md-input iconUser ']")).sendKeys("155395");
		
		driver.findElement(By.xpath("//input[@value=\'Login\']")).click();
		
	}


}
