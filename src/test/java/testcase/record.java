package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import settings.login;

public class record extends login {
public WebDriver driver;

@BeforeClass    
public void login()
{

  driver=getdriver();

}
	

@Test(priority=1)
public void test() throws Exception

{

	    // Now click Policy Record button
  	
		WebElement porecbutton = driver.findElement(By.xpath("//div['page-sidebar navbar-collapse collapse']/ul/li[6]/a"));
		porecbutton.click();	
		
		
		// Now send policy number in search textbox
		
		WebElement policysearch = driver.findElement(By.xpath("//*[@id=\"gs_policy_number\"]"));
		policysearch.sendKeys("PRO17/PC001/000996");
		policysearch.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
        // Now click policy 
		try
		{
			WebElement policyclick = driver.findElement(By.xpath("//table[@id='hnwTableList']/tbody/tr[2]"));
			policyclick.click();	
			
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}

		Thread.sleep(3000);
		try
		{
			WebElement policynopath = driver.findElement(By.xpath("//div[@class='form-section']/fieldset/table/tbody/tr[1]/td[1]"));
			String policyno= policynopath.getText();
			System.out.println(policyno);
				Reporter.log("policyno");	
			
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//*[@id='policyDetailsId']/fieldset/legend[@class='toggle active' and text()=' First Policyholder']

		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
  		jse.executeScript("window.scrollBy(0,1200)", "");
  		Thread.sleep(2000);
		WebElement toggle = driver.findElement(By.xpath("//*[@id='policyDetailsId']/fieldset[3]/legend"));
		toggle.click();
		//*[@id='policyDetailsId']/fieldset[3]/div/div/div/span
		
		
		WebElement insupath = driver.findElement(By.xpath("//*[@id='policyDetailsId']/fieldset[3]/div/div/div/span"));
		String insurername= insupath.getText();
		System.out.println(insurername);
		Reporter.log("insurername");
		
		if("Aviva"!=null)	
		{
		if(insurername.equalsIgnoreCase("Aviva"))
			{
			System.out.println("It is ok");
			Reporter.log("It is ok");
			}
		else
		    {
		System.out.println("Error 1");
		Reporter.log("Error 1");
		    }
		
		}
		
		else
		{
			if(insurername.equalsIgnoreCase("Not Available"))
			{
			System.out.println("It is ok");
			Reporter.log("It is ok");
			}
		else
		    {
		System.out.println("Error 2");
		Reporter.log("Error 2");
		    }*/
		
		WebElement toggle = driver.findElement(By.xpath("//*[@id='policyDetailsId']/fieldset[1]/legend"));
		toggle.click();
		try
		{
			WebElement fullname = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[1]/div/div[1]/div/span"));
			String s1= fullname.getText();
			System.out.println(s1);
				Reporter.log(s1);	
			
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}

		}

}





