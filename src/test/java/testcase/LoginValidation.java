package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginValidation {
	
public WebDriver driver;

String passExpect="Please enter Password";
String userExpect="Please enter User Name";
By uname=By.xpath("//*[@id=\"frmuserlogin\"]/label[1]");
By pwd=By.xpath("//*[@id=\"frmuserlogin\"]/label[2]");
By submit=By.xpath("//*[@id=\"frmuserlogin\"]/input[3]");
	
@Test
	public void login() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");		 
	// Initialize browser
	driver=new ChromeDriver();		
	driver.get("https://dev.offshoresoftwaresolutions.net/IAM/index/login/un/ranit.ray#no-back-button");		 
	// Maximize browser		 
	driver.manage().window().maximize();

	blansubmitAlert();
	Thread.sleep(2000);
	PassAlert();
	Thread.sleep(2000);
	UserAlert();
	Thread.sleep(2000);
	
	
	}	
	

public void fillup(String uname, String pwd) {
	
	driver.findElement(By.id("UserName")).clear();
	driver.findElement(By.id("UserName")).sendKeys(uname);
	driver.findElement(By.id("Password")).clear();
	driver.findElement(By.id("Password")).sendKeys(pwd);
	driver.findElement(submit).click();
	
	
}



public void blansubmitAlert()
{
	
	fillup("","");
	
String userActual_msg = driver.findElement(uname).getText();	
String passActual_msg = driver.findElement(pwd).getText();
Assert.assertEquals(passActual_msg, passExpect);
Assert.assertEquals(userActual_msg, userExpect);
System.out.println(passActual_msg);
System.out.println(userActual_msg);


 }	



public void PassAlert()
    {
	fillup("Ranit","");
	String passActual_msg = driver.findElement(pwd).getText();
/*String passExpect="Please enter Password";*/
Assert.assertEquals(passActual_msg, passExpect);
System.out.println(passActual_msg);
     }	

public void UserAlert() 
     {
	
	fillup("","sadasdasd");
	String userActual_msg = driver.findElement(uname).getText();
/*String userExpect="Please enter User Name";*/
Assert.assertEquals(userActual_msg, userExpect);
System.out.println(userActual_msg);
    }



@AfterTest
public void closebrowser() {

 driver.quit();
}

}
