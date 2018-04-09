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
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import settings.TestUtil;
import settings.login;

public class FavFullPolicyScreenReview extends login {
	
public WebDriver driver;
SoftAssert s = new SoftAssert();
public String policyno;
public String totalpremium;;
	
	
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
     
 	{
 		
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
   		Reporter.log("Currency type sent from Excel is " +currency);
   	
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
   		Reporter.log("Broker sent from Excel is "+broker);
   		
   		
   		
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
   		Reporter.log("Broker User sent from Excel is  "+brokeruser);
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
   		Reporter.log("Introducer name sent from Excel is  "+selection);
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
   		Reporter.log("PloicyHolder name sent from Excel is  "+fname);
   		    }
   		
   		catch(Exception e)
		    {
			e.printStackTrace();
		    }
   		 // send surname
   		try {
   		driver.findElement(By.xpath("//*[@id=\"surname\"]")).sendKeys(lname);
   		System.out.println("PloicyHolder Surname sent from Excel is  "+lname);
   		Reporter.log("PloicyHolder Surname sent from Excel is  "+lname);
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
   	Reporter.log("PloicyHolder mobile number sent from Excel is  "+mobile);
   		    }
   		catch(Exception e)
		    {
			e.printStackTrace();
		    }
   		
   		try {
   	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
   	System.out.println("PloicyHolder email id sent from Excel is  "+email);
   	Reporter.log("PloicyHolder email id sent from Excel is  "+email);
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
   	Reporter.log("PloicyHolder gender sent from Excel is  "+gender);
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
   	Reporter.log("PloicyHolder country sent from Excel is  "+country);
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
   	Reporter.log("PloicyHolder postcode sent from Excel is  "+postcode);
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
   	Reporter.log("PloicyHolder address sent from Excel is  "+dropdown);
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
   	Reporter.log("PloicyHolder marrital status  sent from Excel is  "+marritals);
   	    }
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
   	// send Date of Birth
   	try {
   	driver.findElement(By.xpath("//*[@id=\"date_of_birth\"]")).sendKeys(dob);
   	System.out.println("PloicyHolder Date of Birth sent from Excel is  "+dob);
   	Reporter.log("PloicyHolder Date of Birth sent from Excel is  "+dob);
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
   	Reporter.log("PloicyHolder Employment Status sent from Excel is  "+emplstatus);
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
   	Reporter.log("PloicyHolder Current insurer name sent from Excel is  "+Currentinsurer);
   	    }
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
   	// send Expiring Premium
   	try {
   		driver.findElement(By.xpath("//*[@id=\"expiringPremium\"]")).sendKeys(Expiringprem);
   		System.out.println("PloicyHolder's Expiring Premium sent from Excel is  "+Expiringprem);
   		Reporter.log("PloicyHolder's Expiring Premium sent from Excel is  "+Expiringprem);
   	    }
   	catch(Exception e)
	    {
		e.printStackTrace();
	    }
      // send Target Premium
   	try {
   		driver.findElement(By.xpath("//*[@id=\"targetPremium\"]")).sendKeys(Targetpremium);
   		System.out.println("PloicyHolder's Target Premium sent from Excel is  "+Targetpremium);
   		Reporter.log("PloicyHolder's Target Premium sent from Excel is  "+Targetpremium);
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
   		Reporter.log("PloicyHolder's Target Insurer sent from Excel is  "+Targetinsurer);
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
			   		Reporter.log("PloicyHolder's Target Insurer sent from Excel is  "+propertyType);
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
			   		Reporter.log("Is the home the client’s main residence ? "+mainresidence);
 	 }
		catch(Exception e)
		{
			e.printStackTrace();
		}				
					try {
					Select familyOccupied= new Select(driver.findElement(By.name("familyOccupied")));
					familyOccupied.selectByVisibleText(outbuildings);
					System.out.println("Who occupies the home and its outbuildings ? "+mainresidence);
			   		Reporter.log("Who occupies the home and its outbuildings ? "+mainresidence);
 	 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
					try {
					Select businessUse= new Select(driver.findElement(By.name("businessUse")));
					businessUse.selectByVisibleText(purposes);
					System.out.println("Are the home or any outbuildings used for business or professional purposes ?  "+purposes);
			   		Reporter.log("Are the home or any outbuildings used for business or professional purposes ? "+purposes);
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
			   		Reporter.log("Maximum sum insured amount sent from Excel is  "+Buildings1);
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
			   		Reporter.log("Transit amount sent from Excel is  "+transit);
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
			   		Reporter.log("Rate of Location 1 sent from Excel is  "+locrate);
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
			   		Reporter.log("Rate of Transit  sent from Excel is  "+transitrate);
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
						Reporter.log("Policy number of the quote is"+policyno);	
						
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
						Reporter.log("Broker commission percentage is:"+brocomm);	
						
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
						Reporter.log("Introducer commission percentage is:"+introcomm);	
						
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
						Reporter.log("Total net premium of the policy is:"+totalnetpremium);	
						
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
						Reporter.log("Total commission of the policy is:"+totalcommission);	
						
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
						Reporter.log("Total commission of the policy is:"+totalpremium);	
						
				    }
					catch(Exception e)
					{
						e.printStackTrace();
					}	
					
					
					
					WebElement chaseQuote = driver.findElement(By.xpath("//*[@id='chaseQuote']"));
					chaseQuote.click();
					Thread.sleep(8000);
					//click view customer details
					try {
						WebElement  viewcusdetails=driver.findElement(By.xpath("//*[@id=\"policyDetailsBtn\"]"));
						JavascriptExecutor jsScroll=  (JavascriptExecutor)driver;
						jsScroll.executeScript("arguments[0].scrollIntoView(true);", viewcusdetails);
					        }

					catch(Exception e)
					  {
						e.printStackTrace();
					  }
					try {
						WebElement cusdetails = driver.findElement(By.xpath("//*[@id=\"policyDetailsBtn\"]"));
						cusdetails.click();
					}

					catch(Exception e)
					  {
						e.printStackTrace();
					  }
					
					//check customer details popup
					CheckCustomerDetails(currency,broker,brokeruser,startdt,type,selection,introducer,fname,lname,mobile,email,gender,country,postcode,dropdown,marritals,
			        		dob,emplstatus,Currentinsurer,Policyexpiry,Expiringprem,Targetpremium,Targetinsurer,propertyType,
			        		mainresidence,outbuildings,purposes,Buildings1,transit,limit,Contenspecified,Description1,amount1,Valuablesunspecified,
			        		Description2,amount2,Fineartunspecified,locrate,transitrate,contentrate,fineartrate,valuablesrate,To,policyno2);
					
					// close the popup
					//*[@id="top"]/div[17]/div[1]/a
					try {
						WebElement  closeBtn=driver.findElement(By.xpath("//div[@style='display: block; z-index: 1002; outline: 0px; height: auto; width: 943px; top: 1619px; left: 200px;']/div/a"));
						JavascriptExecutor jsScroll33=  (JavascriptExecutor)driver;
						jsScroll33.executeScript("arguments[0].scrollIntoView(true);", closeBtn);
						closeBtn.click();
					}
					                                                         
					catch(Exception e)
					  {
						e.printStackTrace();
					  }
					
					Thread.sleep(1000);
					
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
					
					//check customer details popup
					CheckCustomerDetails(currency,broker,brokeruser,startdt,type,selection,introducer,fname,lname,mobile,email,gender,country,postcode,dropdown,marritals,
			        		dob,emplstatus,Currentinsurer,Policyexpiry,Expiringprem,Targetpremium,Targetinsurer,propertyType,
			        		mainresidence,outbuildings,purposes,Buildings1,transit,limit,Contenspecified,Description1,amount1,Valuablesunspecified,
			        		Description2,amount2,Fineartunspecified,locrate,transitrate,contentrate,fineartrate,valuablesrate,To,policyno2);
					
					
					//check ledger
					
					demoledger(policyno2,totalpremium);
					s.assertAll();
					/*WebDriverWait waitclickable2=new WebDriverWait(driver,360);
					waitclickable2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"top\"]/div[1]/div[2]/div/ul/li[3]/a/span[1]")));
					*/
					
}
	
	public void CheckCustomerDetails(String currency,String broker,String brokeruser,String startdt,String type,String selection,
	   		  String introducer,String fname,String lname,
	   		  String mobile,String email,String gender,String country,String postcode,String dropdown,String marritals,String dob,
	   		  String emplstatus,String Currentinsurer,String Policyexpiry ,String Expiringprem,
	   		  String Targetpremium,String Targetinsurer,
	   		  String propertyType,String mainresidence,String outbuildings,
	   		  String purposes,String Buildings1,String transit,String limit,
	   		  String Contenspecified,String Description1,String amount1,String Valuablesunspecified,String Description2,
	   		  String amount2,String Fineartunspecified,String locrate,String transitrate,String contentrate,
	   		String fineartrate,String valuablesrate,String To,String policyno2)
	 
	{
		try
		{
		WebElement brokerpath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[1]/div/div[3]/div/span"));
		String broker1= brokerpath.getText();
		String brokertitle= driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[1]/div/div[3]/label")).getText();
		allmethod(broker,broker1,brokertitle);
		
		}		
		
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		try
		{
		WebElement brokeruserpath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[1]/div/div[4]/div/span"));
		String brokeruser1= brokeruserpath.getText();
		String brokerusertitle= driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[1]/div/div[4]/label")).getText();
		allmethod(brokeruser,brokeruser1,brokerusertitle);
		}
	
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	
		try
		{
		WebElement introducerpath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[1]/div/div[5]/div/span"));
		String selection1= introducerpath.getText();
		String introducertitle= driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[1]/div/div[5]/label")).getText();
		allmethod(selection,selection1,introducertitle);
		}
	
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	
		//click First Policyholder Tab
				try
				{
				WebElement tab1= driver.findElement(By.xpath("//div[@id='policyDetailsId']/fieldset[2]/legend[@class='toggle' and text()=' First Policyholder']"));
				tab1.click();

				}
				catch(Exception e)
				{
					e.printStackTrace();
					
				}
				
				
				
				                               //Matching Full Name
				String fname1=fname;
				String space1=" ";
				String lname1=lname;
				String fullname=fname1.concat(space1).concat(lname1);
				
				try
				{
				WebElement fullnamepath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[2]/div/div[1]/div/span"));
				String fullname1= fullnamepath.getText().trim();
				String fullnametitle= driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[2]/div/div[1]/label")).getText();
				allmethod(fullname,fullname1,fullnametitle);
				}
			
				catch(Exception e)
				{
					e.printStackTrace();
					
				}
	
				                                  // Matching Mobile number
				
				try
				{
				WebElement mobilepath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[2]/div/div[2]/div/span"));
				String mobile1= mobilepath.getText();
				String mobiletitle= driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[2]/div/div[2]/label")).getText();
				allmethod(mobile,mobile1,mobiletitle);
				}
			
				catch(Exception e)
				{
					e.printStackTrace();
					
				}
	
				                                     // Matching Email id
				
				try
				{
				WebElement emailpath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[2]/div/div[3]/div/span"));
				String email1= emailpath.getText();
				String emailtitle= driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[2]/div/div[3]/label")).getText();
				allmethod(email,email1,emailtitle);
				}
			
				catch(Exception e)
				{
					e.printStackTrace();
					
				}
	
				                                     // Matching Gender
				
				try
				{
				WebElement genderpath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[2]/div/div[4]/div/span"));
				String gender1= genderpath.getText();
				String gendertitle= driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[2]/div/div[4]/label")).getText();
				allmethod(gender,gender1,gendertitle);
				}
			
				catch(Exception e)
				{
					e.printStackTrace();
					
				}
				

             	                                  // Matching Marital Status

try
{
WebElement marritalpath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[2]/div/div[6]/div/span"));
String marritals1= marritalpath.getText();                          
String marritaltitle= driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[2]/div/div[6]/label")).getText();
allmethod(marritals,marritals1,marritaltitle);
}

catch(Exception e)
{
	e.printStackTrace();
	
}		
				
                                        //Matching Date of Birth

try
{
WebElement dobpath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[2]/div/div[7]/div/span"));
String s1= dobpath.getText().trim();
String dob1=s1.replaceAll("-", "/"); 
String dobtitle= driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[2]/div/div[7]/label")).getText();
allmethod(dob,dob1,dobtitle);
}

catch(Exception e)
{
	e.printStackTrace();
	
}						
                                     // Matching Employment status

try
{
WebElement empstatpath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[2]/div/div[8]/div/span"));
String emplstatus1= empstatpath.getText();
				
String emplstatustitle= driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[2]/div/div[8]/label")).getText();
allmethod(emplstatus,emplstatus1,emplstatustitle);
}

catch(Exception e)
{
	e.printStackTrace();
	
}						
				
            JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	     jse2.executeScript("window.scrollBy(0,300)", "");
                              //click existing policy details tab
	
	driver.findElement(By.xpath("//div[@id='policyDetailsId']/fieldset[8]/legend")).click();


                                     // Matching Current insurer

try
{
WebElement Currentinsurerpath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[8]/div/div[1]/div/span"));
String Currentinsurer1= Currentinsurerpath.getText();			
String Currentinsurertitle= driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[8]/div/div[1]/label")).getText();
allmethod(Currentinsurer,Currentinsurer1,Currentinsurertitle);
}

catch(Exception e)
{
	e.printStackTrace();
	
}						
				
//Matching Expiring premium

try
{
WebElement Expiringprempath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[8]/div/div[3]/div/span"));
String Expiringprem1= Expiringprempath.getText();
String Expiringpremtext=commaremover(Expiringprem1);
int p=Expiringprem.indexOf(".");
				
String Expiringpremtitle= driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[8]/div/div[3]/label")).getText();
allmethod2(Expiringprem,Expiringpremtext,Expiringpremtitle,p);
}

catch(Exception e)
{
	e.printStackTrace();
	
}						
				
				
                                      // Matching Target premium

try
{
WebElement Targetpremiumpath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[8]/div/div[4]/div/span"));
String Targetpremium1= Targetpremiumpath.getText();
String Targetpremiumtext=commaremover(Targetpremium1);
int p=Targetpremium.indexOf(".");			
String Targetpremiumtitle= driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[8]/div/div[4]/label")).getText();
allmethod2(Targetpremium,Targetpremiumtext,Targetpremiumtitle,p);
}

catch(Exception e)
{
	e.printStackTrace();
	
}				
				
                               // Matching Target insurer

try
{
WebElement Targetinsurerpath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[8]/div/div[5]/div/span"));
String Targetinsurer1= Targetinsurerpath.getText();		
String Targetinsurertitle= driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[8]/div/div[5]/label")).getText();
allmethod(Targetinsurer,Targetinsurer1,Targetinsurertitle);
}

catch(Exception e)
{
	e.printStackTrace();
	
}		
        JavascriptExecutor jse3 = (JavascriptExecutor)driver;
	    jse3.executeScript("window.scrollBy(0,-800)", "");
	                            // Clicks Property Details Tab
      driver.findElement(By.xpath("//button[@id='propId__0__1' and text()=' Property 1 Details']")).click();
	
                                  /*   // Matching Address
  	
  		try
  		{
  		WebElement dropdownpath = driver.findElement(By.xpath("//*[@id=\"propInfoId0\"]/fieldset[1]/div[3]/div/span"));
  		String dropdown1= dropdownpath.getText(); 
  		System.out.println(dropdown1+"Address");
  		String dropdowntitle= driver.findElement(By.xpath("//*[@id=\"propInfoId0\"]/fieldset[1]/div[3]/label")).getText();
  		allmethod(dropdown,dropdown1,dropdowntitle);
  		}

  		catch(Exception e)
  		{
  			e.printStackTrace();
  			
  		}	*/
      
                                  //Matching Property Type

	try
	{
	WebElement propertyTypepath = driver.findElement(By.xpath("//*[@id=\"propInfoId0\"]/fieldset[1]/div[5]/div/span"));
	String propertyType1= propertyTypepath.getText();	
	String propertyTypetitle= driver.findElement(By.xpath("//*[@id=\"propInfoId0\"]/fieldset[1]/div[5]/label")).getText();
	allmethod(propertyType,propertyType1,propertyTypetitle);
	}

	catch(Exception e)
	{
		e.printStackTrace();
		
	}	

	                                // Scroll down
		JavascriptExecutor jse4 = (JavascriptExecutor)driver;
			jse4.executeScript("window.scrollBy(0,200)", "");
			// Clicks Use of Property Tab

			driver.findElement(By.xpath("//div[@id='propInfoId0']/fieldset[2]/legend")).click();
			
		
			                         // Matching Main residence
			
			try
			{
			WebElement mainresidencepath = driver.findElement(By.xpath("//*[@id=\"propInfoId0\"]/fieldset[2]/div/div[1]/div/span"));
			String mainresidence1= mainresidencepath.getText();
			String mainresidencetitle= driver.findElement(By.xpath("//*[@id=\"propInfoId0\"]/fieldset[2]/div/div[1]/label")).getText();
			allmethod(mainresidence,mainresidence1,mainresidencetitle);
			}

			catch(Exception e)
			{
				e.printStackTrace();
				
			}	

			                      // Matching Family occupied
			
			try
			{
			WebElement outbuildingspath = driver.findElement(By.xpath("//*[@id=\"propInfoId0\"]/fieldset[2]/div/div[2]/div/span"));
			String outbuildings1= outbuildingspath.getText();
			String outbuildingstitle= driver.findElement(By.xpath("//*[@id=\"propInfoId0\"]/fieldset[2]/div/div[2]/label")).getText();
			allmethod(outbuildings,outbuildings1,outbuildingstitle);
			}

			catch(Exception e)
			{
				e.printStackTrace();
				
			}	

			// Matching Business use
			
			try
			{
			WebElement purposespath = driver.findElement(By.xpath("//*[@id=\"propInfoId0\"]/fieldset[2]/div/div[3]/div/span"));
			String purposes1= purposespath.getText();
			String purposestitle= driver.findElement(By.xpath("//*[@id=\"propInfoId0\"]/fieldset[2]/div/div[3]/label")).getText();
			allmethod(purposes,purposes1,purposestitle);
			}

			catch(Exception e)
			{
				e.printStackTrace();
				
			}	

			JavascriptExecutor jse5 = (JavascriptExecutor)driver;
	  		jse5.executeScript("window.scrollBy(0,-800)", "");
	  		// Clicks Risk Details Tab
driver.findElement(By.xpath("//button[@id='riskId']")).click();
	  		



                                                  // Maximun Sum insured


			try
			{
			WebElement Buildingspath = driver.findElement(By.xpath("//*[@id=\"riskDetailsId\"]/fieldset/div/div[1]/div/div/span"));
			String Buildings12= Buildingspath.getText();
			String Buildtext=commaremover(Buildings12);
			
			int p=Buildings1.indexOf(".");
			String Buildings1title= driver.findElement(By.xpath("//*[@id=\"riskDetailsId\"]/fieldset/div/div[1]/label")).getText();
			allmethod2(Buildings1,Buildtext,Buildings1title,p);
			}

			catch(Exception e)
			{
				e.printStackTrace();
				
			}	
			
			                         // In Transit
			
			
			try
			{
			WebElement transitpath = driver.findElement(By.xpath("//*[@id=\"riskDetailsId\"]/fieldset/div/div[2]/div/div/span"));
			String transit12= transitpath.getText();
			String transittext=commaremover(transit12);
			int p=transit.indexOf(".");
			String transittitle= driver.findElement(By.xpath("//*[@id=\"riskDetailsId\"]/fieldset/div/div[2]/label")).getText();
			allmethod2(transit,transittext,transittitle,p);
			}

			catch(Exception e)
			{
				e.printStackTrace();
				
			}


			
			

	
	}
	
public void allmethod(String excel,String text,String title)
	
	{
		
	
	
		if(!excel.isEmpty())	
		{
		if(excel.equalsIgnoreCase(text))
			{
			System.out.println(title+" matches with Excel Sheet :Test Pass");
			Reporter.log(title+" matches with Excel Sheet :Test Pass");
			
			}
		else
		    {
			s.assertEquals(text, excel);
		System.out.println(title+"does not matches with Excel Sheet name :Test Failed");
		Reporter.log(title+"does not matches with Excel Sheet name :Test Failed");
		    }
		
		}
		
		else
		{
			if(text.equalsIgnoreCase("Not Available"))
			{
			System.out.println(title+" Not Available in the policy: Test Pass");
			Reporter.log(title+" Not Available in the policy: Test Pass");
			}
		else
		    {
			
		System.out.println(title+": "+text);
		Reporter.log(title+": "+text);
		    }
		
		

		}
		
		
		   }
		
	
public void allmethod2(String Expiringprem,String Expiringpremtext,String Expiringpremtitle,int p2)

{
	
	if(p2<0)
	{
		String Expiringpremexcel= decimal(Expiringprem);
		
		if(!Expiringpremexcel.isEmpty())	
		{
		if(Expiringpremtext.equalsIgnoreCase(Expiringpremexcel))
			{
			System.out.println(Expiringpremtitle+" matches with Excel Sheet :Test Pass");
			Reporter.log(Expiringpremtitle+" Expiring premium matches with Excel Sheet :Test Pass");
			
			}
		else
		    {
			s.assertEquals(Expiringpremtext,Expiringpremexcel);
		System.out.println(Expiringpremtitle+" does not matches with Excel Sheet :Test Failed");
		Reporter.log(Expiringpremtitle+" does not matches with Excel Sheet :Test Failed");
		    }
		
		}
		
		else
		{
			if(Expiringpremtext.equalsIgnoreCase("0.00"))
			{
			System.out.println(Expiringpremtitle+" Not Available in the policy: Test Pass");
			Reporter.log(Expiringpremtitle+" Not Available in the policy: Test Pass");
			}
		else
		    {
			s.assertEquals(Expiringpremtext,Expiringpremexcel);
		System.out.println("Error in "+Expiringpremtitle+":Test Failed");
		Reporter.log("Error in "+Expiringpremtitle+":Test Failed");
		    }
		
		

		}
		
		
		
		
	}
	
	else
	{
		
	
	if(Expiringprem!=null)	
	{
	if(Expiringpremtext.equals(Expiringprem))
		{
		System.out.println(Expiringpremtitle+" matches with Excel Sheet :Test Pass");
		Reporter.log(Expiringpremtitle+" matches with Excel Sheet :Test Pass");
		
		}
	else
	    {
		s.assertEquals(Expiringpremtext,Expiringprem);
	System.out.println(Expiringpremtitle+" does not matches with Excel Sheet :Test Failed");
	Reporter.log(Expiringpremtitle+" does not matches with Excel Sheet :Test Failed");
	    }
	
	}
	
	else
	{
		if(Expiringpremtext.equalsIgnoreCase("0.00"))
		{
		System.out.println(Expiringpremtitle+" Not Available in the policy: Test Pass");
		Reporter.log(Expiringpremtitle+" Not Available in the policy: Test Pass");
		}
	else
	    {
		s.assertEquals(Expiringpremtext,Expiringprem);
	System.out.println("Error in"+Expiringpremtitle+ ":Test Failed");
	Reporter.log("Error in"+Expiringpremtitle+ ":Test Failed");
	    }
	
	

	}
	
	}
	
	
	
}


public String decimal(String Buildings1)

{	
	String Buildingdecimal=Buildings1+"."+"00";
	
	return Buildingdecimal;

	
}	
	
	
public String commaremover(String Buildings12)
	
{
	
	String s=Buildings12;
	String s1=s.replace("£","");
	String s2=s1.replaceAll(",","");
	return s2;
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
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)", "");
  		Thread.sleep(1000);
		
		
		
		
		
	}
	
	
	
	
	
	
	 public void demoledger(String policyno2,String totalpremium) throws InterruptedException
	 {
		 String actualtotalpremium=totalpremium;
		 
		 /*String s1=policyno;  
		 int s2=s1.indexOf("P");
			int s3= s1.indexOf(")");
			String s4= s1.substring(s2,s3-1);
			System.out.println(s4);*/
			
			
			String s11=actualtotalpremium;  
			int s12=s11.indexOf("£");
			int s13=s12+1;
			String s14= s11.substring(s13);
			System.out.println(s14);
		 
			/*WebElement porecbutton = driver.findElement(By.xpath("//div['page-sidebar navbar-collapse collapse']/ul/li[6]/a"));
			porecbutton.click();	
			
			
			// Now send policy number in search textbox
			
			WebElement policysearch = driver.findElement(By.xpath("//*[@id=\"gs_policy_number\"]"));
			policysearch.sendKeys(policyno2);
			Thread.sleep(3000);
			String polno2=policysearch.getText();
			System.out.println("This value is going into searchbox:"+polno2);
			policysearch.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			
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
			*/
			
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
				String verifypolicyno= policynopath.getText();
				/*System.out.println(verifypolicyno);
					Reporter.log(verifypolicyno);	*/
				
		    }
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			
			try
			{
				WebElement debitpath = driver.findElement(By.xpath("//div[@class='filter-table']/fieldset/table/tbody/tr/td[5]/a"));
				String debitamount= debitpath.getText();
				if(debitamount.equalsIgnoreCase(s14))
				{
				System.out.println("Debit amount in Ledger match with total premium in Policy purchase screen ");
				Reporter.log("Debit amount in Ledger match with total premium in Policy purchase screen ");	
				System.out.println("  ");
				Reporter.log(" ");
				}
				else
				{
					System.out.println("Debit amount in Ledger does not match with total premium in Policy purchase screen: ");
					Reporter.log("Debit amount in Ledger does not match with total premium in Policy purchase screen: ");		
					
					System.out.println("  ");
					Reporter.log(" ");
				}
				
		    }
			catch(Exception e)
			{
				e.printStackTrace();
			}
		 
		 
		 
		 
		 
		 
	 }
	 
	 
	 
	 
}