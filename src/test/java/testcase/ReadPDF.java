package testcase;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import org.testng.logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import settings.TestUtil;
import settings.login;

public class ReadPDF extends login {
public WebDriver driver;
ExtentReports report;
ExtentTest logger;
SoftAssert s = new SoftAssert();

@BeforeClass    
public void login()
{

  driver=getdriver();

}

//E:\Workspace\Protect\report
@DataProvider(name="gettestdata")
public Iterator<Object[]> gettestdata(){
	
	ArrayList<Object[]> testdata=TestUtil.getdatafromexcel2();
	return testdata.iterator();
                                      }
	@Test(dataProvider="gettestdata",priority=1)
	 public void single(String currency,String broker,String brokeruser,String startdt,String type,String selection,
	   		  String introducer,String fname,String lname,
	   		  String mobile,String email,String gender,String country,String postcode,String dropdown,String marritals,String dob,
	   		  String emplstatus,String Currentinsurer,String Policyexpiry ,String Expiringprem,
	   		  String Targetpremium,String Targetinsurer,
	   		  String propertyType,String mainresidence,String outbuildings,
	   		  String purposes,String Buildings1,String transit,String limit,
	   		  String Contenspecified,String Description1,String amount1,String Valuablesunspecified,String Description2,
	   		  String amount2,String Fineartunspecified,String locrate,String transitrate,String contentrate,
	   		String fineartrate,String valuablesrate,String To,String pno) throws InterruptedException, IOException
{

		report= new ExtentReports("E:\\Workspace\\Protect\\report\\report.html");
		logger=report.startTest("Cancellation of policy report");
		/*driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
*/
	    		                // Now click Quote Record button
		WebElement quotepolicyrecbutton = driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[2]/div/ul/li[6]/a/span"));
		quotepolicyrecbutton.click();
		//Thread.sleep(3000);
		/*WebElement Favlink=driver.findElement(By.xpath("//ul[@id='quoteMenu' and @style='overflow: hidden; display: block;']//child::li//child::a[text()=' FAV (Consumer)']"));
		Favlink.click();*/
		// Now send policy number in search textbox   
		
		//WebElement policysearch = driver.findElement(By.xpath("//*[@id=\"gs_policy_number\"]"));
		
		WebElement policysearch = driver.findElement(By.xpath("//*[@id=\"gs_policy_number\"]"));
		policysearch.clear();
		policysearch.sendKeys(pno);
		Thread.sleep(1000);
		policysearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String policyname= ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",policysearch).toString();
		System.out.println(" Policy number sent in Policy Searchbox is: "+policyname);
		logger.log(LogStatus.INFO,"Error in Mobile Number field :Test Failed");
		// Now click policy 
		try
		{ //*[@id="1233"]/td[5]
			WebElement policyclick = driver.findElement(By.xpath("//table[@id='hnwTableList']/tbody/tr[2]"));
			policyclick.click();	
			
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//*[@id="tabs"]/ul/li[3]/a
		
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tabs\"]/ul/li[8]/a")));
		try {
			WebElement  button1=driver.findElement(By.xpath("//*[@id=\"tabs\"]/ul/li[8]/a"));
			
			button1.click();
		    }
		
		catch(Exception e)
		  {
			e.printStackTrace();
		  }	
		
		       // start date
		WebElement startdate = driver.findElement(By.xpath("//table[@class='data-table ']/tbody/tr[6]/td[2]/div"));
		//String startdate2= ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",startdate).toString();
		//String startdate2 = ((JavascriptExecutor) driver).executeScript("return arguments[0].innerHTML;", driver.findElement(By.xpath("//table[@class='data-table ']/tbody/tr[6]/td[2]/div"))).toString().trim();
		
		String startdate2=startdate.getText();
		System.out.println(" Start date of the policy is: "+startdate2);
		
		       //cancel date
		
		WebElement canceldate = driver.findElement(By.xpath("//*[@id='policy_calcel_date']"));
		String canceldate2= ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",canceldate).toString();
		System.out.println(" Cancel date of the policy is: "+canceldate2);
   		
		      // Current annual premium
		
		WebElement premium = driver.findElement(By.xpath("//table[@class='data-table ']/tbody/tr[8]/td[2]/div"));
		String premium2=premium.getText() ;
		System.out.println("Current Annual Premium of the policy is: "+premium2);
		
		                 // Total Premium
		
		WebElement totalpremium = driver.findElement(By.xpath("//table[@id='selectedPremiums']/tbody/tr[6]/td[2]/input"));
		String totalpremium2= ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",totalpremium).toString();
		System.out.println("Total Premium of the policy is: "+totalpremium2);
		
		                 // Total Refund Amount
		
		WebElement refund = driver.findElement(By.xpath("//*[@id='totalAmt']"));
		String refund2= refund.getText();
		System.out.println("Total Refund Amount of the policy is: "+refund2);
		
		               //select cancellation reason
		
		Select reason= new Select(driver.findElement(By.id("cancellationReason")));
		reason.selectByVisibleText("Product unsuitable / misunderstood");
		driver.findElement(By.id("cancelBtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='toMailId']")));
		WebElement To2= driver.findElement(By.id("toMailId"));
		To2.clear();
		Thread.sleep(1000);
		To2.sendKeys(To);
		Thread.sleep(4000);
	//click Send button
		
		WebElement  tapback=driver.findElement(By.xpath("//button[@id='sendCancelMail']"));
		JavascriptExecutor jsScroll=  (JavascriptExecutor)driver;
		jsScroll.executeScript("arguments[0].scrollIntoView(true);", tapback);
		tapback.click();
		
		WebDriverWait wait5=new WebDriverWait(driver,600);
		//wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tabs']/ul/li[5]/a")));
		wait5.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all' ][5]"))));
		
		Thread.sleep(5000);
		//a[text()='Ledger']
		
		WebElement status= driver.findElement(By.xpath("//*[@id='tabs']/div[1]/fieldset/table/tbody/tr[1]/td[2]"));
		String statustext = status.getText();
		if(statustext.contains("Cancelled"))
		{
		System.out.println("Status of the policy is Showing Cancelled in Ledger Tab");
	  logger.log(LogStatus.PASS,"Status of the policy is Showing Cancelled in Ledger Tab");
		}	
		else
		{	
			System.out.println("Status of the policy is not Showing Cancelled in Ledger Tab");
			logger.log(LogStatus.FAIL,"Status of the policy is not Showing Cancelled in Ledger Tab");
		}	
		WebElement reason2= driver.findElement(By.xpath("//*[@id='canResLink']"));
		String cancelreasontext=reason2.getText();
		if(cancelreasontext.equalsIgnoreCase("Product unsuitable / misunderstood"))
		{
			System.out.println("Cancellation reason of the policy is Matched in Ledger Tab");
			  logger.log(LogStatus.PASS,"Cancellation reason of the policy is Matched in Ledger Tab");
		}
		
		else
		{	
			System.out.println("Cancellation reason of the policy is not Matched in Ledger Tab");
			logger.log(LogStatus.FAIL,"Cancellation reason of the policy is not Matched in Ledger Tab");
		}
		WebElement ledgertab=driver.findElement(By.xpath("//*[@id='tabs']/ul/li[5]/a"));
		try {
			JavascriptExecutor jsScroll10=  (JavascriptExecutor)driver;
			jsScroll10.executeScript("arguments[0].scrollIntoView(true);", ledgertab);
			Thread.sleep(2000);
			jsScroll10.executeScript("arguments[0].click();", ledgertab);
			//ledgertab.click();
		    }

		catch(Exception e)
		  {
			e.printStackTrace();
			
		  }

		Thread.sleep(5000);
		/*int x=1;
		List<WebElement> transacttype=driver.findElements(By.xpath("//div[@id='tabs-5']/div/fieldset/table/tbody/tr['x']/td[3]"));
		//System.out.println(allfacility);
		for(WebElement searchrow:transacttype)
		{
		   
		   
		String transacttypetext=searchrow.getText();
		//System.out.println(facilitytext);

		if(transacttypetext.equalsIgnoreCase("CANC"))
		{

		 String creditamount= driver.findElement(By.xpath("//div[@id='tabs-5']/div/fieldset/table/tbody/tr['x']/td[6]")).getText();
		  if(creditamount.contains(refund2))
		  {
			  System.out.println("Refund amount of the policy in Ledger Tab is"+ creditamount+ "and it Matched with the amount shown before Cancellation");
			  logger.log(LogStatus.PASS,"Refund amount of the policy in Ledger Tab is"+ creditamount+ "and it Matched with the amount shown before Cancellation");
		  }
		  }
		  break;
		}
			x++;
		report.endTest(logger);
		report.flush();  */
		
		//td[text()='CANC']//following-sibling::td[last()]
		
		String creditamount=driver.findElement(By.xpath("//td[text()='CANC']//following-sibling::td[last()]")).getText();
		System.out.println("Credit Amount :" +creditamount);
		Assert.assertEquals(creditamount,refund2);
		
			
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}