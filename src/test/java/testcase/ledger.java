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

public class ledger extends login {
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
		
		 // Now click policy ledger 
		try
		{
			WebElement ledger = driver.findElement(By.xpath("//div[@id='tabs']/ul/li[5]/a"));
			ledger.click();	
			
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
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
		
		
		
		try
		{
			WebElement debitpath = driver.findElement(By.xpath("//div[@class='filter-table']/fieldset/table/tbody/tr/td[5]/a"));
			String debitamount= debitpath.getText();
			System.out.println("Debit amount for policy is : "+debitamount);
				Reporter.log("Debit amount for policy is : "+debitamount);	
			
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}	
		
		
		
		
}