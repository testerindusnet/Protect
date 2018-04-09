package testcase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import settings.TestUtil;
import settings.login;

public class CancelPolicy extends login {
	
public WebDriver driver;
SoftAssert s = new SoftAssert();
public String policyno;
public String totalpremium;
ExtentReports report;
ExtentTest logger;

	
	@BeforeClass    
    public void login() {
    
	  driver=getdriver();
	  
	
    }
	
	@DataProvider(name="gettestdata")
	public Iterator<Object[]> gettestdata(){
		
		ArrayList<Object[]> testdata=TestUtil.getdatafromexcel2();
		return testdata.iterator();
		// Now click Start New Quote button
		
	
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
   		String fineartrate,String valuablesrate,String To,String pno) throws InterruptedException	
     
 	{  report= new ExtentReports("E:\\Workspace\\Protect\\report\\report.html");
	logger=report.startTest("Cancellation of policy report");
 		
		/*driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);*/
	
		WebElement b = driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[2]/div/ul/li[3]/a"));
 		b.click();
		
   		Thread.sleep(1000);
   		// Now click private button
   		
   		WebElement private1 = driver.findElement(By.xpath("//*[@id=\"quoteBuySubMenu\"]/li[2]/a"));
   		private1.click();
   		
   		//  choose currency
   		try {
   			WebElement currencypath=driver.findElement(By.xpath("//*[@id=\"quoteBuySubMenu\"]/li[1]/a"));
   		Select currency1= new Select(driver.findElement(By.id("currency")));
   		currency1.selectByVisibleText(currency);
   		String currency2= currencypath.getText();
   		System.out.println("Currency type sent from Excel is " +currency);
   		//Reporter.log("Currency type sent from Excel is " +currency);
   		logger.log(LogStatus.PASS,"Currency type sent from Excel is " +currency);
   	 }
 		catch(Exception e)
 		    {
 			e.printStackTrace();
 		    }
   		// choose broker
   		try {
   			WebElement brokerpath = driver.findElement(By.id("broker"));
   		Select broker1= new Select(driver.findElement(By.id("broker")));
   		broker1.selectByVisibleText(broker);
   		String broker2= brokerpath.getText();
   		System.out.println("Broker sent from Excel is "+broker);
   		//Reporter.log("Broker sent from Excel is "+broker);
   		logger.log(LogStatus.PASS,"Broker sent from Excel is "+broker);
   		
   		
}
catch(Exception e)
 {
	e.printStackTrace();
 }
   	// select brokeruser
   		try {
   			WebElement brokeruserpath2 =driver.findElement(By.id("broker_user"));
   		Select brokeruserpath= new Select(driver.findElement(By.id("broker_user")));
   		brokeruserpath.selectByVisibleText(brokeruser);
   		String brokeruser2= brokeruserpath2.getText();
   		System.out.println("Broker User sent from Excel is  "+brokeruser);
   		//Reporter.log("Broker User sent from Excel is  "+brokeruser);
   		logger.log(LogStatus.PASS,"Broker User sent from Excel is  "+brokeruser);
   		}
		catch(Exception e)
		    {
			e.printStackTrace();
		    }
   		
   	//*[@id="policy_start_date"]
   		
   		WebElement datepath1 =driver.findElement(By.xpath("//*[@id=\"policy_start_date\"]"));
   		//choose policy start date
   		System.out.println("Policy start date is " +startdt);
   		driver.findElement(By.xpath("//*[@id=\"generalInformationFrm\"]/div[6]/div/div/a")).click();
   		driver.switchTo().frame(0);
   		List<WebElement> allDates=driver.findElements(By.xpath("//table[@id='outerTable']//td"));
   		
   		for(WebElement ele:allDates)
   		{
   			
   			String date=ele.getText();
   			//date=String.valueOf(startdt);
   			
   			if(date.equalsIgnoreCase(startdt))
   			{
   				ele.click();
   				break;
   			}
   			
   		}
   		
   		
   		
   		driver.switchTo().defaultContent();
   		try {
   		List<WebElement> radiocount=driver.findElements(By.name("policyholderType"));
   		
   		for(WebElement ele2:radiocount)
   		{
   			
   			String date2=ele2.getAttribute("value");
   			System.out.println("Type of policy is "+date2);
   			
   			if(date2.equalsIgnoreCase(type))
   			{
   				ele2.click();
   				break;
   			}
   			
   		}
   	 }
		catch(Exception e)
		    {
			e.printStackTrace();
		    }
   	  
   		//select a introducer
   		try {
   			WebElement introducerpath =driver.findElement(By.xpath("//*[@id=\"policy_start_date\"]"));
   		Select introducer1= new Select(driver.findElement(By.xpath("//*[@id=\"introducer_list\"]")));
   		introducer1.selectByVisibleText(selection);
   		String introducerpath1= introducerpath.getText();
   		System.out.println("Introducer name sent from Excel is  "+selection);
   		//Reporter.log("Introducer name sent from Excel is  "+selection);
   		logger.log(LogStatus.PASS,"Introducer name sent from Excel is  "+selection);  
   		}
   		catch(Exception e)
   		    {
   			e.printStackTrace();
   		    }
   		
   		// click on div
   		try {
   		driver.findElement(By.xpath("//*[@id=\"firstToggle\"]")).click();
   		    }
   		catch(Exception e)
		    {
			e.printStackTrace();
		    }
   		
   		
   		JavascriptExecutor jse = (JavascriptExecutor)driver;
   		jse.executeScript("window.scrollBy(0,300)", "");
   		   
   		//*[@id="title"]
   		
   		/*try {
   		Select titlepath= new Select(driver.findElement(By.xpath("//*[@id=\"title\"]")));
   		titlepath.selectByVisibleText(title);
   		System.out.println("Title sent from Excel is  "+title);
   		Reporter.log("Title sent from Excel is  "+title);
   		    }
   		
   		catch(Exception e)
		    {
			e.printStackTrace();
		    }*/
   		// send forename
   		try {
   		driver.findElement(By.xpath("//*[@id=\"forename\"]")).sendKeys(fname);
   		System.out.println("PloicyHolder name sent from Excel is  "+fname);
   		//Reporter.log("PloicyHolder name sent from Excel is  "+fname);
   		logger.log(LogStatus.PASS,"PloicyHolder name sent from Excel is  "+fname);
   		    }
   		
   		catch(Exception e)
		    {
			e.printStackTrace();
		    }
   		 // send surname
   		try {
   		driver.findElement(By.xpath("//*[@id=\"surname\"]")).sendKeys(lname);
   		System.out.println("PloicyHolder Surname sent from Excel is  "+lname);
   		//Reporter.log("PloicyHolder Surname sent from Excel is  "+lname);
   		logger.log(LogStatus.PASS,"PloicyHolder Surname sent from Excel is  "+lname);
   		    }
   		
   		
   		catch(Exception e)
		    {
			e.printStackTrace();
		    }
   		
   		try {
   		driver.findElement(By.xpath("//*[@id=\"firstToggle\"]")).click();
   		    }
   		
   		catch(Exception e)
		    {
			e.printStackTrace();
		    }
   	
   		try {
   		WebDriverWait wait=new WebDriverWait(driver,30);
   	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mobile\"]")));
   		    }  
   		
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
   		Thread.sleep(3000);
   		try {
   	driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys(mobile);
   	System.out.println("PloicyHolder mobile number sent from Excel is  "+mobile);
   //	Reporter.log("PloicyHolder mobile number sent from Excel is  "+mobile);
   	logger.log(LogStatus.PASS,"PloicyHolder mobile number sent from Excel is  "+mobile);
   		    }
   		catch(Exception e)
		    {
			e.printStackTrace();
		    }
   		
   		try {
   	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
   	System.out.println("PloicyHolder email id sent from Excel is  "+email);
   //	Reporter.log("PloicyHolder email id sent from Excel is  "+email);
   	logger.log(LogStatus.PASS,"PloicyHolder email id sent from Excel is  "+email);
   	        }
   		catch(Exception e)
		    {
			e.printStackTrace();
		    }
   	jse.executeScript("window.scrollBy(0,300)", "");
   	try {
   	Select genderpath= new Select(driver.findElement(By.xpath("//*[@id=\"gender\"]")));
   	genderpath.selectByVisibleText(gender);
   	System.out.println("PloicyHolder gender sent from Excel is  "+gender);
   	//Reporter.log("PloicyHolder gender sent from Excel is  "+gender);
   	logger.log(LogStatus.PASS,"PloicyHolder gender sent from Excel is  "+gender);
   	     }
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
   		// select country
   	try {
   	Select countrypath= new Select(driver.findElement(By.xpath("//*[@id=\"country_id\"]")));
   	countrypath.selectByVisibleText(country);
   	System.out.println("PloicyHolder country sent from Excel is  "+country);
   	//Reporter.log("PloicyHolder country sent from Excel is  "+country);
   	logger.log(LogStatus.PASS,"PloicyHolder country sent from Excel is  "+country);
   	    }
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
   	Thread.sleep(2000);
   	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"post_code\"]")));
   	
   	//send zipcode
   	try {
   	driver.findElement(By.xpath("//*[@id=\"post_code\"]")).sendKeys(postcode);
   	System.out.println("PloicyHolder postcode sent from Excel is  "+postcode);
   //	Reporter.log("PloicyHolder postcode sent from Excel is  "+postcode);
   	logger.log(LogStatus.PASS,"PloicyHolder postcode sent from Excel is  "+postcode);
   	    }
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
   	try {
   	driver.findElement(By.xpath("//*[@id=\"post_codeP\"]")).click();
   	    }
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
   	
   	Thread.sleep(1500);
   	
   	try {
   	Select address= new Select(driver.findElement(By.xpath("//*[@id=\"drpAddress\"]")));
   	address.selectByVisibleText(dropdown);
   	System.out.println("PloicyHolder address sent from Excel is  "+dropdown);
   	//Reporter.log("PloicyHolder address sent from Excel is  "+dropdown);
   	logger.log(LogStatus.PASS,"PloicyHolder address sent from Excel is  "+dropdown);
   	    }
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
   	Thread.sleep(1000);
   	// select marrital status
   	try {
   	Select marrital= new Select(driver.findElement(By.xpath("//*[@id=\"marital_status\"]")));
   	marrital.selectByVisibleText(marritals);
   	System.out.println("PloicyHolder marrital status sent from Excel is  "+marritals);
   //Reporter.log("PloicyHolder marrital status  sent from Excel is  "+marritals);
   	logger.log(LogStatus.PASS,"PloicyHolder marrital status  sent from Excel is  "+marritals);
   	    }
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
   	// send Date of Birth
   	try {
   	driver.findElement(By.xpath("//*[@id=\"date_of_birth\"]")).sendKeys(dob);
   	System.out.println("PloicyHolder Date of Birth sent from Excel is  "+dob);
   	//Reporter.log("PloicyHolder Date of Birth sent from Excel is  "+dob);
   	logger.log(LogStatus.PASS,"PloicyHolder Date of Birth sent from Excel is  "+dob);
   	    }
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
   	// select employment status
   	try {
   	Select empstatus= new Select(driver.findElement(By.xpath("//*[@id=\"employment_status\"]")));
   	empstatus.selectByVisibleText(emplstatus);
   	System.out.println("PloicyHolder Employment Status sent from Excel is  "+emplstatus);
   	//Reporter.log("PloicyHolder Employment Status sent from Excel is  "+emplstatus);
   	logger.log(LogStatus.PASS,"PloicyHolder Employment Status sent from Excel is  "+emplstatus);
   	    }
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
   	jse.executeScript("window.scrollBy(0,300)", "");
   	Thread.sleep(1000);
   	//driver.findElement(By.xpath("//legend[@class='toggle active' and text()= ' Previous History']")).click();
   	
   	      // click Next Button
   	try {
   	driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();
   	    }
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }      
                                             	// 2nd page begins
   	Thread.sleep(1000);
   	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"curinsurer\"]")));
   	try {
   	Select currentinsurerpath= new Select(driver.findElement(By.xpath("//*[@id=\"curinsurer\"]")));
   	currentinsurerpath.selectByVisibleText(Currentinsurer);
   	System.out.println("PloicyHolder Current insurer name sent from Excel is  "+Currentinsurer);
   //	Reporter.log("PloicyHolder Current insurer name sent from Excel is  "+Currentinsurer);
   	logger.log(LogStatus.PASS,"PloicyHolder Current insurer name sent from Excel is  "+Currentinsurer);
   	    }
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
   	// send Expiring Premium
   	try {
   		driver.findElement(By.xpath("//*[@id=\"expiringPremium\"]")).sendKeys(Expiringprem);
   		System.out.println("PloicyHolder's Expiring Premium sent from Excel is  "+Expiringprem);
   		//Reporter.log("PloicyHolder's Expiring Premium sent from Excel is  "+Expiringprem);
   		logger.log(LogStatus.PASS,"PloicyHolder's Expiring Premium sent from Excel is  "+Expiringprem);
   	    }
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
      // send Target Premium
   	try {
   		driver.findElement(By.xpath("//*[@id=\"targetPremium\"]")).sendKeys(Targetpremium);
   		System.out.println("PloicyHolder's Target Premium sent from Excel is  "+Targetpremium);
   		//Reporter.log("PloicyHolder's Target Premium sent from Excel is  "+Targetpremium);
   		logger.log(LogStatus.PASS,"PloicyHolder's Target Premium sent from Excel is  "+Targetpremium);
   	    }
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
   	// Select Target insurer
   	try {
   		Select targetinsurerpath= new Select(driver.findElement(By.xpath("//*[@id=\"targetInsurer\"]")));
   		targetinsurerpath.selectByVisibleText(Targetinsurer);
   		System.out.println("PloicyHolder's Target Insurer sent from Excel is  "+Targetinsurer);
   		//Reporter.log("PloicyHolder's Target Insurer sent from Excel is  "+Targetinsurer);
   		logger.log(LogStatus.PASS,"PloicyHolder's Target Insurer sent from Excel is  "+Targetinsurer);
   	    }
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
   		// click Next Button
   	try {
   		driver.findElement(By.xpath("//*[@id=\"btnExistPolicy\"]")).click();
   	    }
   		
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
					
					// 3rd Page Property information
					
					//Thread.sleep(2000);
					//driver.findElement(By.xpath("//*[@id='quoteType2']")).click();
					// Select property type
					
					Thread.sleep(3000);
					
					/*WebElement firstaddress =driver.findElement(By.xpath("//input[@value='1']"));
					firstaddress.click();
					Thread.sleep(2000);	
					
					Select dateBuilt= new Select(driver.findElement(By.name("dateBuilt")));
					dateBuilt.selectByVisibleText("1400 - 1599");*/
					try {
					
					Select propertytype= new Select(driver.findElement(By.name("propertyTypes")));
					propertytype.selectByVisibleText(propertyType);
					System.out.println("PolicyHolder's property Type is "+propertyType);
			   		//Reporter.log("PloicyHolder's Target Insurer sent from Excel is  "+propertyType);
					logger.log(LogStatus.PASS,"PloicyHolder's Target Insurer sent from Excel is  "+propertyType);
 	 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
					/*Select propertyGrade= new Select(driver.findElement(By.name("propertyGrade")));
					propertyGrade.selectByVisibleText("Grade I");
					
					Select roofConstruction= new Select(driver.findElement(By.name("roofConstruction")));
					roofConstruction.selectByVisibleText("Asphalt or Felt");
					
					Select wallConstruction= new Select(driver.findElement(By.name("wallConstruction")));
					wallConstruction.selectByVisibleText("Timber Frame with wattle & daub infill");
					
					
					WebElement repair = driver.findElement(By.xpath("//input[@id='goodState1']"));
					repair.click();
											
					WebElement movement = driver.findElement(By.xpath("//input[@id='subsidence2']"));
					movement.click();
					
					WebElement grounds = driver.findElement(By.xpath("//input[@id='flooding2']"));
					grounds.click();
					
					WebElement srepair = driver.findElement(By.xpath("//input[@id='structuralRepair2']"));
					srepair.click();
					*/
					// Use Property Section
					
					Thread.sleep(2000);
					WebElement sproperty = driver.findElement(By.xpath("//legend[@class='toggle' and text()=' Use of property']"));
					sproperty.click();
					try {
					Select mainResidence= new Select(driver.findElement(By.name("mainResidence")));
					mainResidence.selectByVisibleText(mainresidence);
					System.out.println("Is the home the client’s main residence ? "+mainresidence);
			   		//Reporter.log("Is the home the client’s main residence ? "+mainresidence);
					logger.log(LogStatus.PASS,"Is the home the client’s main residence ? "+mainresidence);
 	 }
		catch(Exception e)
		{
			e.printStackTrace();
		}				
					try {
					Select familyOccupied= new Select(driver.findElement(By.name("familyOccupied")));
					familyOccupied.selectByVisibleText(outbuildings);
					System.out.println("Who occupies the home and its outbuildings ? "+mainresidence);
			   		//Reporter.log("Who occupies the home and its outbuildings ? "+mainresidence);
					logger.log(LogStatus.PASS,"Who occupies the home and its outbuildings ? "+mainresidence);
 	 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
					try {
					Select businessUse= new Select(driver.findElement(By.name("businessUse")));
					businessUse.selectByVisibleText(purposes);
					System.out.println("Are the home or any outbuildings used for business or professional purposes ?  "+purposes);
			   		//Reporter.log("Are the home or any outbuildings used for business or professional purposes ? "+purposes);
					logger.log(LogStatus.PASS,"Are the home or any outbuildings used for business or professional purposes ? "+purposes);
 	 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
					/*WebElement occupancy =driver.findElement(By.xpath("//input[@id='occupancy2']"));
					occupancy.click();
					//---------------------------------- FIRE AND SECURITY -----------------------------------------------------------//
					WebElement fireandsecurity = driver.findElement(By.xpath("//legend[@class='toggle' and text()=' Fire and security']"));
					fireandsecurity.click();
					Thread.sleep(2000);
							
					WebElement multipointsystem =driver.findElement(By.xpath("//input[@id='deadLocks1']"));
					multipointsystem.click();
					
					Select intruderalarm= new Select(driver.findElement(By.name("intruderAlarm")));
					intruderalarm.selectByVisibleText("Remote monitoring (ARC)");
					
					WebElement maintenancecontract =driver.findElement(By.xpath("//input[@id='maintenanceContract1']"));
					maintenancecontract.click();
					
					Select fireAlarm= new Select(driver.findElement(By.name("fireAlarm")));
					fireAlarm.selectByVisibleText("Integrated with intruder alarm");
					
					WebElement havesafe =driver.findElement(By.xpath("//input[@id='haveSafe1']"));
					havesafe.click();
					
					Select safeyes= new Select(driver.findElement(By.name("SafeYes")));
					safeyes.selectByVisibleText("Underfloor safe");*/
										
					WebElement moreproperty =driver.findElement(By.xpath("//input[@id='more_property2']"));
					moreproperty.click();
					
								
					Thread.sleep(3000);
					WebElement nextbtn = driver.findElement(By.xpath("//*[@id='btnPropInfo']"));
					nextbtn.click();
					
					
					//------------------------------------------Maximum Sum Insured-------------------------------------------------
					Thread.sleep(5000);
					try {
					WebElement txtlocation=driver.findElement(By.xpath("//input[@class='small pound numaricField requiredNumaric calSameLocAmount']"));
					txtlocation.sendKeys(Buildings1);
					System.out.println("Maximum sum insured amount sent from Excel is  "+Buildings1);
			   		//Reporter.log("Maximum sum insured amount sent from Excel is  "+Buildings1);
					logger.log(LogStatus.PASS,"Maximum sum insured amount sent from Excel is  "+Buildings1);
 	 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
					try {
					Thread.sleep(1000);
					WebElement intransit =driver.findElement(By.xpath("//input[@id='in_transit']"));
					intransit.sendKeys(transit);
					System.out.println("Transit amount sent from Excel is  "+transit);
			   		//Reporter.log("Transit amount sent from Excel is  "+transit);
					logger.log(LogStatus.PASS,"Transit amount sent from Excel is  "+transit);
 	                   }
		catch(Exception e)
		{
			e.printStackTrace();
		}
					
					Thread.sleep(1000);
					/*WebElement contentsvaluables = driver.findElement(By.xpath("//legend[@id='firstToggle' and text()='  Contents excluding valuables']"));
					contentsvaluables.click();*/
										
					//*[@id="firstToggle"]
					
					/*Thread.sleep(7000);
					WebElement contentsvaluables = driver.findElement(By.xpath("//*[@id='firstToggle'and text()=' Contents excluding valuables']"));
					contentsvaluables.click();
					
					
					
					
					//------------------------------------------- Content excluding valuables------------
					
					WebElement conunspecified = driver.findElement(By.xpath("//input[@id='gencontents']"));
					conunspecified.sendKeys("10000");
					
					WebElement conspecified = driver.findElement(By.xpath("//input[@id='specified_CS']"));
					conspecified.sendKeys("5000");
					
					WebElement additem = driver.findElement(By.xpath("//*[@id='propertyInformationFrm']/fieldset[2]/div/div[3]/label/a"));
					additem.click();
					Thread.sleep(7000);
					
					WebElement additem1 = driver.findElement(By.xpath("//input[@id='descriptionCS_1']"));
					additem1.sendKeys("Chair");
					
					WebElement additem2 = driver.findElement(By.xpath("//input[@id='amountCS_1']"));
					additem2.sendKeys("5000");
					
					WebElement additem3 = driver.findElement(By.xpath("//input[@id='valuationCS_1']"));
					additem3.click();
					
					WebElement additem4 = driver.findElement(By.xpath("//input[@id='photosCS_1']"));
					additem4.click();
					
					WebElement additem5 = driver.findElement(By.xpath("//input[@id='smartWaterCS_1']"));
					additem5.click();
					
				//------------------------------------------------- Valuables----------------------------------------
										
					WebElement valuables = driver.findElement(By.xpath("//legend[@id='firstToggle'and text()=' Valuables']"));
					valuables.click();
					Thread.sleep(5000);
					WebElement unspecifiedvus = driver.findElement(By.xpath("//*[@id='unspecified_VUS']"));
					unspecifiedvus.sendKeys("0");
					
					WebElement specified = driver.findElement(By.xpath("//*[@id='specified_VWS']"));
					specified.sendKeys("0");
					
					WebElement specifiedvhs = driver.findElement(By.xpath("//*[@id='specified_VHS']"));
					specifiedvhs.sendKeys("0");
					
					WebElement specifiedvbs = driver.findElement(By.xpath("//*[@id='specified_VBS']"));
					specifiedvbs.sendKeys("0");			
					
					
				//-------------------------------------------------------FineArt----------------------------------------
					Thread.sleep(5000);
					WebElement fineart = driver.findElement(By.xpath("//legend[@id='firstToggle' and text()=' Fine art']"));
					fineart.click();
					
					WebElement unspecifiedfaus = driver.findElement(By.xpath("//input[@id='unspecified_FAUS']"));
					unspecifiedfaus.sendKeys("1000");
					
					WebElement specifiedfas = driver.findElement(By.xpath("//input[@id='specified_FAS']"));
					specifiedfas.sendKeys("1000");
					
					WebElement additem6 = driver.findElement(By.xpath("//*[@id='propertyInformationFrm']/fieldset[4]/div/div[5]/label/a"));
					additem6.click();
					
					WebElement descriptionfas = driver.findElement(By.xpath("//input[@id='descriptionFAS_2']"));
					descriptionfas.sendKeys("Painting");
					
					WebElement amountfas = driver.findElement(By.xpath("//input[@id='amountFAS_2']"));
					amountfas.sendKeys("1000");
					
					WebElement valuationfas = driver.findElement(By.xpath("//input[@id='valuationFAS_2']"));
					valuationfas.click();
					
					WebElement photosfas = driver.findElement(By.xpath("//input[@id='photosFAS_2']"));
					photosfas.click();
					
					WebElement smartWaterfas = driver.findElement(By.xpath("//input[@id='smartWaterFAS_2']"));
					smartWaterfas.click();
					*/
					
					try {
					
					WebElement btnPropInfo = driver.findElement(By.xpath("//*[@id='btnPropInfo']"));
					btnPropInfo.click();
 	                     }
		            catch(Exception e)
		           {
			        e.printStackTrace();
		           }
					
					
					
					
					//------------------------------------Select Quote ---------------------------------
					
					try {
				
					WebElement location = driver.findElement(By.xpath("//*[@id='Propertytab0']/div/table/tbody/tr[3]/td[4]/input"));
					location.clear();
					location.sendKeys(locrate);
					System.out.println("Rate of Location 1 sent from Excel is  "+locrate);
			   		//Reporter.log("Rate of Location 1 sent from Excel is  "+locrate);
					logger.log(LogStatus.PASS,"Rate of Location 1 sent from Excel is  "+locrate);
 	 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
					try {
					WebElement intransit3 = driver.findElement(By.xpath("//*[@id='Propertytab0']/div/table/tbody/tr[4]/td[4]/input"));
					intransit3.clear();
					intransit3.sendKeys(transitrate);
					System.out.println("Rate of Transit  sent from Excel is  "+transitrate);
			   		//Reporter.log("Rate of Transit  sent from Excel is  "+transitrate);
					logger.log(LogStatus.PASS,"Rate of Transit  sent from Excel is  "+transitrate);
 	 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
					/*WebElement contentsum2 = driver.findElement(By.xpath("//*[@id='Propertytab0']/div/table/tbody/tr[6]/td[4]/input"));
					contentsum2.clear();
					contentsum2.sendKeys("2");
					
					WebElement fineartspecified = driver.findElement(By.xpath("//*[@id='Propertytab0']/div/table/tbody/tr[8]/td[4]/input"));
					fineartspecified.clear();
					fineartspecified.sendKeys("3");
					
					WebElement fineartunspecified = driver.findElement(By.xpath("//*[@id='Propertytab0']/div/table/tbody/tr[9]/td[4]/input"));
					fineartunspecified.clear();
					fineartunspecified.sendKeys("3");
					
					
					WebElement valuablesspecified = driver.findElement(By.xpath("//*[@id='Propertytab0']/div/table/tbody/tr[11]/td[4]/input"));
					valuablesspecified.clear();
					valuablesspecified.sendKeys("3");
					
					
					WebElement valuablesunspecified = driver.findElement(By.xpath("//*[@id='Propertytab0']/div/table/tbody/tr[12]/td[4]/input"));
					valuablesunspecified.clear();
					valuablesunspecified.sendKeys("6");
					
					WebElement valuablesspecifiedsafe = driver.findElement(By.xpath("//*[@id='Propertytab0']/div/table/tbody/tr[13]/td[4]/input"));
					valuablesspecifiedsafe.clear();
					valuablesspecifiedsafe.sendKeys("10");
					
					WebElement valuablesbank = driver.findElement(By.xpath("//*[@id='Propertytab0']/div/table/tbody/tr[14]/td[4]/input"));
					valuablesbank.clear();
					valuablesbank.sendKeys("10");
	

					WebElement taxes2 = driver.findElement(By.xpath("//*[@id='perFixedValue0']"));
					taxes2.clear();
					taxes2.sendKeys("10");*/
					
					Thread.sleep(5000);
					WebElement reCalculateBtn = driver.findElement(By.xpath("//*[@id='reCalICBtn']"));
					reCalculateBtn.click();
					Thread.sleep(8000);
					
					
					try
					{
						WebElement policynopath = driver.findElement(By.xpath("//div[@class='table']/div/div"));
						policyno= policynopath.getText();
						System.out.println("Policy number of the quote is"+policyno);
						//Reporter.log("Policy number of the quote is"+policyno);	
						logger.log(LogStatus.PASS,"Policy number of the quote is"+policyno);
						
				    }
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
					// Get actual policy Number
					 
					  String s1=policyno;  
					 int s2=s1.indexOf("P");
						int s3= s1.indexOf(")");
						String policyno2= s1.substring(s2,s3-1);
						System.out.println(policyno2);
					try
					{
						WebElement brocommpath = driver.findElement(By.xpath("//input[@id='overrideCommision']"));
						String brocomm= brocommpath.getAttribute("value");
						System.out.println("Broker commission percentage is:"+brocomm);
						//Reporter.log("Broker commission percentage is:"+brocomm);	
						logger.log(LogStatus.PASS,"Broker commission percentage is:"+brocomm);
						
				    }
					catch(Exception e)
					{
						e.printStackTrace();
					}	
					Thread.sleep(1000);
					try
					{
						WebElement introcommpath = driver.findElement(By.xpath("//input[@id='introducerCommision']"));
						String introcomm= introcommpath.getAttribute("value");
						System.out.println("Introducer commission percentage is:"+introcomm);
						//Reporter.log("Introducer commission percentage is:"+introcomm);	
						logger.log(LogStatus.PASS,"Introducer commission percentage is:"+introcomm);
				    }
					catch(Exception e)
					{
						e.printStackTrace();
					}	
					
					try
					{
						WebElement tnp = driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr[2]/td[3]/div"));
						String totalnetpremium= tnp.getText();
						System.out.println("Total net premium of the policy is:"+totalnetpremium);
						//Reporter.log("Total net premium of the policy is:"+totalnetpremium);	
						logger.log(LogStatus.PASS,"Total net premium of the policy is:"+totalnetpremium);
				    }
					catch(Exception e)
					{
						e.printStackTrace();
					}	
					
					
					//*[@id="totComm"]
					try
					{
						WebElement tc = driver.findElement(By.xpath("//*[@id=\"totComm\"]"));
						String totalcommission= tc.getText();
						System.out.println("Total commission of the policy is:"+totalcommission);
						//Reporter.log("Total commission of the policy is:"+totalcommission);	
						logger.log(LogStatus.PASS,"Total commission of the policy is:"+totalcommission);
				    }
					catch(Exception e)
					{
						e.printStackTrace();
					}	
					//*[@id="totGross"]
				
					try
					{
						WebElement tp = driver.findElement(By.xpath("//*[@id=\"totGross\"]"));
						totalpremium= tp.getText();
						System.out.println("Total Premium of the policy is:"+totalpremium);
						//Reporter.log("Total commission of the policy is:"+totalpremium);	
						logger.log(LogStatus.PASS,"Total commission of the policy is:"+totalpremium);
				    }
					catch(Exception e)
					{
						e.printStackTrace();
					}	
					
					
					
					WebElement chaseQuote = driver.findElement(By.xpath("//*[@id='chaseQuote']"));
					chaseQuote.click();
					Thread.sleep(8000);
					
					//click submit button
					try {
						WebElement  submitBtn=driver.findElement(By.xpath("//*[@id='submitBtn']"));
						JavascriptExecutor jsScroll2=  (JavascriptExecutor)driver;
						jsScroll2.executeScript("arguments[0].scrollIntoView(true);", submitBtn);
						submitBtn.click();
					}

					catch(Exception e)
					  {
						e.printStackTrace();
					  }
					
					WebDriverWait wait4=new WebDriverWait(driver,30);
      	          	wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Annually_payMethod_1']")));
      	          	
					WebElement AnnuallypayMethod1 = driver.findElement(By.xpath("//*[@id='Annually_payMethod_1']"));
					AnnuallypayMethod1.click();
					WebDriverWait wait5=new WebDriverWait(driver,30);
      	          	wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Bind']")));
					
					
					WebElement bind = driver.findElement(By.xpath("//*[@id='Bind']"));
					bind.click();
					
					WebDriverWait wait1=new WebDriverWait(driver,30);
      	          	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='toMailId']")));
      	          	
      	          	// send mail id 	
      	          WebElement mail =driver.findElement(By.xpath("//input[@id='toMailId']"));
    				mail.clear();
    				WebElement Topath =driver.findElement(By.xpath("//input[@id='toMailId']"));
    				Topath.sendKeys(To);
    				   				
    				// Click Bind and Send policy Schedule
					
					WebElement sendPolicyMailBtn = driver.findElement(By.xpath("//button[@id='sendPolicyMailBtn']"));
					sendPolicyMailBtn.click();
					WebDriverWait waitclickable=new WebDriverWait(driver,360);
					waitclickable.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"quoteBuySubMenu\"]/li[2]/a")));
					
					// policy search in policy records
					
					PolicySearchPolicyRecords(policyno2);
					Thread.sleep(3000);
					cancelpolicy(To);
					
					
					
					
					
					
 	}
					
					
					
public void PolicySearchPolicyRecords(String policyno2) throws InterruptedException
	
	{
		
		WebElement porecbutton = driver.findElement(By.xpath("//div['page-sidebar navbar-collapse collapse']/ul/li[6]/a"));
		porecbutton.click();
			
		
		// Now send policy number in search textbox
		
		WebElement policysearch = driver.findElement(By.xpath("//*[@id=\"gs_policy_number\"]"));
		
		
		policysearch.clear();
		policysearch.sendKeys(policyno2);
		Thread.sleep(1000);
		policysearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String policyname= ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",policysearch).toString();
		System.out.println(" Policy number sent in Policy Searchbox is: "+policyname);
		logger.log(LogStatus.PASS," Policy number sent in Policy Searchbox is: "+policyname);
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
			int i1=policyno.indexOf(":"); 
			int i2=policyno.length();
            String s2=policyno.substring(i1+2, i2);
			s.assertEquals(s2,policyno2);
			
	    }
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
		
		
		
		
	}				
					
					
			public void cancelpolicy(String To) throws InterruptedException		
					
			{
			
				WebDriverWait wait=new WebDriverWait(driver,360);
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
				logger.log(LogStatus.PASS," Start date of the policy is: "+startdate2);
				       //cancel date
				
				WebElement canceldate = driver.findElement(By.xpath("//*[@id='policy_calcel_date']"));
				String canceldate2= ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",canceldate).toString();
				System.out.println(" Cancel date of the policy is: "+canceldate2);
				logger.log(LogStatus.PASS," Cancel date of the policy is: "+canceldate2);
				      // Current annual premium
				
				WebElement premium = driver.findElement(By.xpath("//table[@class='data-table ']/tbody/tr[8]/td[2]/div"));
				String premium2=premium.getText() ;
				System.out.println("Current Annual Premium of the policy is: "+premium2);
				logger.log(LogStatus.PASS,"Current Annual Premium of the policy is: "+premium2);
				                 // Total Premium
				
				WebElement totalpremium = driver.findElement(By.xpath("//table[@id='selectedPremiums']/tbody/tr[6]/td[2]/input"));
				String totalpremium2= ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",totalpremium).toString();
				System.out.println("Total Premium of the policy is: "+totalpremium2);
				logger.log(LogStatus.PASS,"Total Premium of the policy is: "+totalpremium2);
				                 // Total Refund Amount
				
				WebElement refund = driver.findElement(By.xpath("//*[@id='totalAmt']"));
				String refund2= refund.getText();
				System.out.println("Total Refund Amount of the policy is: "+refund2);
				logger.log(LogStatus.PASS,"Total Refund Amount of the policy is: "+refund2);
				               //select cancellation reason
				
				Select reason= new Select(driver.findElement(By.id("cancellationReason")));
				reason.selectByVisibleText("Product unsuitable / misunderstood");
				driver.findElement(By.id("cancelBtn")).click();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='toMailId']")));
				
				WebElement To2= driver.findElement(By.id("toMailId"));
				To2.clear();
				To2.sendKeys(To);
				Thread.sleep(4000);
			//click Send button
				
				
				WebElement  tapback=driver.findElement(By.xpath("//*[@id=\"sendCancelMail\"]"));
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
				String creditamount=driver.findElement(By.xpath("//td[text()='CANC']//following-sibling::td[last()]")).getText();
				System.out.println("Credit Amount in Ledger is :" +creditamount);
				logger.log(LogStatus.PASS,"Credit Amount in Ledger is :" +creditamount);
				Assert.assertEquals(creditamount,refund2);
				report.endTest(logger);
				report.flush(); 
			}
					
					
					
					
					
					
					
					
					
					
					
					
					
}