package settings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login {
	
	
	
	public static WebDriver driver;
	
	
	public void login() {
		 
		 driver=this.driver;
		 
	 }
	
		
	@BeforeClass
	public void openbrowser(){
		
		/*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");		 
		// Initialize browser
		driver=new ChromeDriver();			
		
		driver.get("https://dev.offshoresoftwaresolutions.net/protect/");		 
		// Maximize browser		 
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("UserName")).sendKeys("Ranit");
		
		driver.findElement(By.id("Password")).sendKeys("George123#"); 

	driver.findElement(By.xpath("//*[@id=\"frmuserlogin\"]/input[3]")).click();*/
		 String browser="chrome";
		   
		 if(browser.equalsIgnoreCase("chrome"))
			
			{
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");		 
				// Initialize browser
				driver=new ChromeDriver();
				
			}
			
		 else if(browser.equalsIgnoreCase("ff"))
			{
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Driver//geckodriver.exe");		 
				// Initialize browser
				driver=new FirefoxDriver();
				
			}
			
		 else if(browser.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Driver//IEDriverServer.exe");		 
				// Initialize browser
				driver=new InternetExplorerDriver();
				
			}
		 
		 
		 driver.get("https://dev.offshoresoftwaresolutions.net/protect/");		 
			// Maximize browser		 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			 driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
			
			 driver.findElement(By.xpath("//input[@id='UserName']")).click();
			 driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Ranit");
			
			 driver.findElement(By.xpath("//input[@id='Password']")).click();
			 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("George123#"); 

		     driver.findElement(By.xpath("//*[@id=\"frmuserlogin\"]/input[3]")).click();
		 
		     
		 
		 
		 
		 
		 
		 
		
	}
	
	@AfterClass
	public void closebrowser() {

	 //driver.quit();
	}	

	  
	public WebDriver getdriver()
	
	{
		return driver;
		
	}
  
  
  
}
