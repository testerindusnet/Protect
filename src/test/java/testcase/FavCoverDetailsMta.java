package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class FavCoverDetailsMta {
	ExtentReports report;
	ExtentTest logger;

	public String policyno;
	SoftAssert s = new SoftAssert();
	void coverDetails(String currency,String broker,String brokeruser,String startdt,String type,String selection,
	 		  String introducer,String fname,String lname,
	 		  String mobile,String email,String gender,String country,String postcode,String dropdown,String marritals,String dob,
	 		  String emplstatus,String Currentinsurer,String Policyexpiry ,String Expiringprem,
	 		  String Targetpremium,String Targetinsurer,
	 		  String propertyType,String mainresidence,String outbuildings,
	 		  String purposes,String Buildings1,String transit,String limit,
	 		  String Contenspecified,String Description1,String amount1,String Valuablesunspecified,String Description2,
	 		  String amount2,String Fineartunspecified,String locrate,String transitrate,String contentrate,
	 		String fineartrate,String valuablesrate,String To,String pno,WebDriver driver) throws InterruptedException
	
	{
		report= new ExtentReports("E:\\Workspace\\Protect\\report\\report.html");
		logger=report.startTest("Cancellation of policy report");
	 		
		
		
	                          //  choose currency
		if(!currency.equals(""))
	          {
   		try {
   		//	WebElement currencypath=driver.findElement(By.xpath("//*[@id=\"quoteBuySubMenu\"]/li[1]/a"));
   			Thread.sleep(1000);
   		Select currency1= new Select(driver.findElement(By.id("currency")));
   		currency1.selectByVisibleText(currency);
   		//String currency2= currencypath.getText();
   		System.out.println("Currency type sent from Excel is " +currency);
   		logger.log(LogStatus.PASS,"Currency type sent from Excel is " +currency);
   	 }
 		catch(Exception e)
 		    {
 			e.printStackTrace();
 		    }
	          }
   		                           // choose broker
   		if(!broker.equals(""))
	          {
   		try {
   	//		WebElement brokerpath = driver.findElement(By.id("broker"));
   		Select broker1= new Select(driver.findElement(By.id("broker")));
   		broker1.selectByVisibleText(broker);
   		//String broker2= brokerpath.getText();
   		System.out.println("Broker sent from Excel is "+broker);
   		//Reporter.log("Broker sent from Excel is "+broker);
   		logger.log(LogStatus.PASS,"Broker sent from Excel is "+broker);
   		
   		
}
catch(Exception e)
 {
	e.printStackTrace();
 }
 }
   	// select brokeruser
   		          if(!brokeruser.equals(""))
   		          {	  
   		        	  
   		try {
   		//	WebElement brokeruserpath2 =driver.findElement(By.id("broker_user"));
   		Select brokeruserpath= new Select(driver.findElement(By.id("broker_user")));
   		brokeruserpath.selectByVisibleText(brokeruser);
   		//String brokeruser2= brokeruserpath2.getText();
   		System.out.println("Broker User sent from Excel is  "+brokeruser);
   		//Reporter.log("Broker User sent from Excel is  "+brokeruser);
   		logger.log(LogStatus.PASS,"Broker User sent from Excel is  "+brokeruser);
   	 }
		catch(Exception e)
		    {
			e.printStackTrace();
		    }
   		
   		          }
   	                                         
   		       if(!startdt.equals(""))
		          {
   		//WebElement datepath1 =driver.findElement(By.xpath("//*[@id=\"policy_start_date\"]"));
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
   	 if(!selection.equals(""))
     {
   		try {
   			//WebElement introducerpath =driver.findElement(By.xpath("//*[@id=\"policy_start_date\"]"));
   		Select introducer1= new Select(driver.findElement(By.xpath("//*[@id=\"introducer_list\"]")));
   		introducer1.selectByVisibleText(selection);
   		//String introducerpath1= introducerpath.getText();
   		System.out.println("Introducer name sent from Excel is  "+selection);
   		//Reporter.log("Introducer name sent from Excel is  "+selection);
   		logger.log(LogStatus.PASS,"Introducer name sent from Excel is  "+selection);
   		    }
   		catch(Exception e)
   		    {
   			e.printStackTrace();
   		    }
   		
     }
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
   	   	if(!fname.equals(""))
        {
   	   		try {
   	   		driver.findElement(By.xpath("//*[@id=\"forename\"]")).clear();
   	   		driver.findElement(By.xpath("//*[@id=\"forename\"]")).sendKeys(fname);
   	   		System.out.println("PloicyHolder name sent from Excel is  "+fname);
   	   		//Reporter.log("PloicyHolder name sent from Excel is  "+fname);
   	   	logger.log(LogStatus.PASS,"PloicyHolder name sent from Excel is  "+fname);
   	   		    }
   	   		
   	   		catch(Exception e)
   			    {
   				e.printStackTrace();
   			    }
        }
   	   		 // send surname
   	 if(!lname.equals(""))
     { driver.findElement(By.xpath("//*[@id=\"surname\"]")).clear();
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
     }
   	   		/*try {
   	   		driver.findElement(By.xpath("//*[@id=\"firstToggle\"]")).click();
   	   		    }
   	   		
   	   		catch(Exception e)
   			    {
   				e.printStackTrace();
   			    }*/
   	   	
   	   		try {
   	   		WebDriverWait wait=new WebDriverWait(driver,30);
   	   	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='mobile']")));
   	   		    }  
   	   		
   	   	catch(Exception e)
   		    {
   			e.printStackTrace();
   		    }
   	   		Thread.sleep(5000);
   	   	if(!mobile.equals(""))
   	    {	
   	   	 
   	   		try {
   	   		driver.findElement(By.xpath("//input[@id='mobile']")).clear();
   	   driver.findElement(By.xpath("//input[@id='mobile']")).click();		
   	   WebDriverWait wait21=new WebDriverWait(driver,300);
   	   wait21.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@id='processingMsg']//parent::div"))));		
   	  	driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(mobile);
   	   	System.out.println("PloicyHolder mobile number sent from Excel is  "+mobile);
   	   	//Reporter.log("PloicyHolder mobile number sent from Excel is  "+mobile);
   	 logger.log(LogStatus.PASS,"PloicyHolder mobile number sent from Excel is  "+mobile);
   	   		    }
   	   		catch(Exception e)
   			    {
   				e.printStackTrace();
   			    }
   	 }
   	 if(!email.equals(""))
     {	
    	 
   	   		try {
   	   		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
   	   	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
   	   	System.out.println("PloicyHolder email id sent from Excel is  "+email);
   	   	//Reporter.log("PloicyHolder email id sent from Excel is  "+email);
   	 logger.log(LogStatus.PASS,"PloicyHolder email id sent from Excel is  "+email);
   	   	        }
   	   		catch(Exception e)
   			    {
   				e.printStackTrace();
   			    }
     }
   	   	if(!gender.equals(""))
   	    {	
   	   	 
   	   	try {
   	   	Select genderpath= new Select(driver.findElement(By.xpath("//select[@id='gender']")));
   	   	genderpath.selectByVisibleText(gender);
   	   	System.out.println("PloicyHolder gender sent from Excel is  "+gender);
   	   	//Reporter.log("PloicyHolder gender sent from Excel is  "+gender);
   	 logger.log(LogStatus.PASS,"PloicyHolder gender sent from Excel is  "+gender);
   	   	     }
   	   	catch(Exception e)
   		    {
   			e.printStackTrace();
   		    }
   	    }
   	   		// select country
   	 if(!country.equals(""))
     {	
    	 
   	   	try {
   	   	Select countrypath= new Select(driver.findElement(By.xpath("//select[@id='country_id']")));
   	   	countrypath.selectByVisibleText(country);
   	   	System.out.println("PloicyHolder country sent from Excel is  "+country);
   	   //	Reporter.log("PloicyHolder country sent from Excel is  "+country);
   	 logger.log(LogStatus.PASS,"PloicyHolder country sent from Excel is  "+country);
   	   	    }
   	   	catch(Exception e)
   		    {
   			e.printStackTrace();
   		    }
     }
   	   	Thread.sleep(2000);
   	   	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"post_code\"]")));
   	   	
   	   	//send zipcode
   	 if(!postcode.equals(""))
     {	
    	 
   	   	try {
   	   	driver.findElement(By.xpath("//input[@id='post_code']")).clear();
   	   	driver.findElement(By.xpath("//input[@id='post_code']")).sendKeys(postcode);
   	   	System.out.println("PloicyHolder postcode sent from Excel is  "+postcode);
   	   //	Reporter.log("PloicyHolder postcode sent from Excel is  "+postcode);
   	 logger.log(LogStatus.PASS,"PloicyHolder postcode sent from Excel is  "+postcode);
   	   	    }
   	   	catch(Exception e)
   		    {
   			e.printStackTrace();
   		    }
     }
   		 
   	   	try {
   	   	driver.findElement(By.xpath("//*[@id=\"post_codeP\"]")).click();
   	   	    }
   	   	catch(Exception e)
   		    {
   			e.printStackTrace();
   		    }
     
   	   	Thread.sleep(1500);
   	 if(!dropdown.equals(""))
     {	
    	 
   	   	try {
   	   	Select address= new Select(driver.findElement(By.xpath("//*[@id=\"drpAddress\"]")));
   	   	address.selectByVisibleText(dropdown);
   	   	System.out.println("PloicyHolder address sent from Excel is  "+dropdown);
   	   //	Reporter.log("PloicyHolder address sent from Excel is  "+dropdown);
   	 logger.log(LogStatus.PASS,"PloicyHolder address sent from Excel is  "+dropdown);
   	   	    }
   	   	catch(Exception e)
   		    {
   			e.printStackTrace();
   		    }
     }
   	   	Thread.sleep(1000);
   	   	// select marrital status
   	 if(!marritals.equals(""))
     {	
    	 
   	   	try {
   	   	Select marrital= new Select(driver.findElement(By.xpath("//*[@id=\"marital_status\"]")));
   	   	marrital.selectByVisibleText(marritals);
   	   	System.out.println("PloicyHolder marrital status sent from Excel is  "+marritals);
   	  // 	Reporter.log("PloicyHolder marrital status  sent from Excel is  "+marritals);
   	 logger.log(LogStatus.PASS,"PloicyHolder marrital status  sent from Excel is  "+marritals);
   	   	    }
   	   	catch(Exception e)
   		    {
   			e.printStackTrace();
   		    }
     }
   	   	// send Date of Birth
   	if(!dob.equals(""))
    {	
   	 
   	   	try {
   	   	driver.findElement(By.xpath("//*[@id=\"date_of_birth\"]")).clear();
   	   	driver.findElement(By.xpath("//*[@id=\"date_of_birth\"]")).sendKeys(dob);
   	   	System.out.println("PloicyHolder Date of Birth sent from Excel is  "+dob);
   	   //	Reporter.log("PloicyHolder Date of Birth sent from Excel is  "+dob);
   	 logger.log(LogStatus.PASS,"PloicyHolder Date of Birth sent from Excel is  "+dob);
   	   	    }
   	   	catch(Exception e)
   		    {
   			e.printStackTrace();
   		    }
    }
   	   	// select employment status
   	if(!emplstatus.equals(""))
    {	
   	 
   	   	try {
   	   	Select empstatus= new Select(driver.findElement(By.xpath("//*[@id=\"employment_status\"]")));
   	   	empstatus.selectByVisibleText(emplstatus);
   	   	System.out.println("PloicyHolder Employment Status sent from Excel is  "+emplstatus);
   	   //	Reporter.log("PloicyHolder Employment Status sent from Excel is  "+emplstatus);
   	 logger.log(LogStatus.PASS,"PloicyHolder Employment Status sent from Excel is  "+emplstatus);
   	   	    }
   	   	catch(Exception e)
   		    {
   			e.printStackTrace();
   		    }
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
   	 if(!Currentinsurer.equals(""))
     {	
    	 
   	   	try {
   	   	Select currentinsurerpath= new Select(driver.findElement(By.xpath("//*[@id=\"curinsurer\"]")));
   	   	currentinsurerpath.selectByVisibleText(Currentinsurer);
   	   	System.out.println("PloicyHolder Current insurer name sent from Excel is  "+Currentinsurer);
   	   	//Reporter.log("PloicyHolder Current insurer name sent from Excel is  "+Currentinsurer);
   	 logger.log(LogStatus.PASS,"PloicyHolder Current insurer name sent from Excel is  "+Currentinsurer);
   	   	    }
   	   	catch(Exception e)
   		    {
   			e.printStackTrace();
   		    }
     }
   	   	// send Expiring Premium
   	if(!Expiringprem.equals(""))
    {	
   	 
   	   	try {
   	   	driver.findElement(By.xpath("//*[@id=\"expiringPremium\"]")).clear();
   	   		driver.findElement(By.xpath("//*[@id=\"expiringPremium\"]")).sendKeys(Expiringprem);
   	   		System.out.println("PloicyHolder's Expiring Premium sent from Excel is  "+Expiringprem);
   	   		//Reporter.log("PloicyHolder's Expiring Premium sent from Excel is  "+Expiringprem);
   	   	logger.log(LogStatus.PASS,"PloicyHolder's Expiring Premium sent from Excel is  "+Expiringprem);
   	   	    }
   	   	catch(Exception e)
   		    {
   			e.printStackTrace();
   		    }
    }
   	      // send Target Premium
   	if(!Targetpremium.equals(""))
    {	
   	 
   	   	try {
   	   	driver.findElement(By.xpath("//*[@id=\"targetPremium\"]")).clear();
   	   		driver.findElement(By.xpath("//*[@id=\"targetPremium\"]")).sendKeys(Targetpremium);
   	   		System.out.println("PloicyHolder's Target Premium sent from Excel is  "+Targetpremium);
   	   		//Reporter.log("PloicyHolder's Target Premium sent from Excel is  "+Targetpremium);
   	   	logger.log(LogStatus.PASS,"PloicyHolder's Target Premium sent from Excel is  "+Targetpremium);
   	   	    }
   	   	catch(Exception e)
   		    {
   			e.printStackTrace();
   		    }
    }
   	   	// Select Target insurer
   	if(!Targetinsurer.equals(""))
    {	
   	 
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
    }
   	   		// click Next Button
   	   	try {
   	   		driver.findElement(By.xpath("//*[@id=\"btnExistPolicy\"]")).click();
   	   	    }
   	   		
   	   	catch(Exception e)
   		    {
   			e.printStackTrace();
   		    }
   						
   	 addproperty(propertyType,mainresidence,outbuildings,purposes,driver);
   	 int propertyno=2;
   	 for(int i=0;i<propertyno;i++)
   	 {
   		driver.findElement(By.xpath("//input[@id='more_property1']")).click();
   	 }				
   						
   						//------------------------------------------Maximum Sum Insured-------------------------------------------------
   						Thread.sleep(5000);
   						
   						WebElement txtlocation=driver.findElement(By.xpath("//input[@class='small pound numaricField requiredNumaric calSameLocAmount']"));
   						/*if(!Buildings1.equals(""))
   					    {	
   					   	 
   						try {
   							txtlocation.clear();
   						txtlocation.sendKeys(Buildings1);
   						System.out.println("Maximum sum insured amount sent from Excel is  "+Buildings1);
   				   		Reporter.log("Maximum sum insured amount sent from Excel is  "+Buildings1);
   				   		
   	 	 }
   			catch(Exception e)
   			{
   				e.printStackTrace();
   			}
   					    }*/
   						
   						String building1price= ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",txtlocation).toString();
   						System.out.println(" Amount for Building is: "+building1price);
   						logger.log(LogStatus.PASS," Amount for Building is: "+building1price);
   						WebElement intransit =driver.findElement(By.xpath("//input[@id='in_transit']"));
   						/*if(!transit.equals(""))
   					    {	
   					   	 
   						try {
   						Thread.sleep(1000);
   						intransit.clear();
   						intransit.sendKeys(transit);
   						System.out.println("Transit amount sent from Excel is  "+transit);
   				   		Reporter.log("Transit amount sent from Excel is  "+transit);
   				   		
   	 	                   }
   			catch(Exception e)
   			{
   				e.printStackTrace();
   			}
   					    }*/
   						
   						String transitprice= ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",intransit).toString();
   						System.out.println(" Amount for Building is: "+transitprice);
   						logger.log(LogStatus.PASS," Amount for Building is: "+transitprice);
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
   						
   						try  {
   						WebElement btnPropInfo = driver.findElement(By.xpath("//*[@id='btnPropInfo']"));
   						btnPropInfo.click();
   	 	                     }
   			            catch(Exception e)
   			           {
   				        e.printStackTrace();
   			           }
   						
   						
   						
   						
   						
   						
   						
   							
	}
	                    //------------------------------------Select Quote ---------------------------------
	
	void maxSumInsured(String locrate,String transitrate,WebDriver driver)
		{
		if(!locrate.equals(""))
	    {	
	   	 
		try {
	
		WebElement location = driver.findElement(By.xpath("//*[@id='Propertytab0']/div/table/tbody/tr[3]/td[4]/input"));
		location.clear();
		location.sendKeys(locrate);
		System.out.println("Rate of Location 1 sent from Excel is  "+locrate);
  		Reporter.log("Rate of Location 1 sent from Excel is  "+locrate);
  		logger.log(LogStatus.PASS,"Rate of Location 1 sent from Excel is  "+locrate);
            }
catch(Exception e)
{
e.printStackTrace();
}
	    }
		if(!transitrate.equals(""))
	    {	
	   	 
		try {
		WebElement intransit3 = driver.findElement(By.xpath("//*[@id='Propertytab0']/div/table/tbody/tr[4]/td[4]/input"));
		intransit3.clear();
		intransit3.sendKeys(transitrate);
		System.out.println("Rate of Transit  sent from Excel is  "+transitrate);
  		Reporter.log("Rate of Transit  sent from Excel is  "+transitrate);
  		logger.log(LogStatus.PASS,"Rate of Transit  sent from Excel is  "+transitrate);
            }
catch(Exception e)
{
e.printStackTrace();
}
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
	

		}
        
	void homePremium(WebDriver driver)
	{
		StringOperation obj3=new StringOperation();
		WebElement tnp = driver.findElement(By.xpath("//*[@id='totPrem']"));
	    String tnpvalue= tnp.getText();
	    double tnpamount=obj3.signstripper(tnpvalue);
	    System.out.println("Total net premium of the policy after Mta is  "+tnpamount);
	    logger.log(LogStatus.PASS,"Total net premium of the policy after Mta is  "+tnpamount);
	    
	    WebElement totComm = driver.findElement(By.xpath("//table[@id='selectedPremiums']/tbody/tr[3]/td[3]/div"));
	    String totCommvalue= totComm.getText();
	    double totCommamount=obj3.signstripper(totCommvalue);
	    System.out.println("Total commission of the policy after Mta is  "+totCommamount);
	    logger.log(LogStatus.PASS,"Total commission of the policy after Mta is  "+totCommamount);
			
	    WebElement gross = driver.findElement(By.xpath("//table[@id='selectedPremiums']/tbody/tr[4]/td[3]/div"));
	    String grossvalue= gross.getText();
	    double grossamount=obj3.signstripper(grossvalue);
	    System.out.println("Gross premium of the policy after Mta is  "+grossamount);
	    logger.log(LogStatus.PASS,"Gross premium of the policy after Mta is  "+grossamount);
			
		double grossamount2=tnpamount+totCommamount;
		
		if(grossamount!=grossamount2)
		{
			s.assertEquals(grossamount,grossamount2);
			
		}
	
		String APamount=driver.findElement(By.xpath("//input[@id='balancePremiumSave']")).getAttribute("value");
		if(APamount.equals("0.00"))
		{
			System.out.println("Additional premium of the policy is  "+APamount+" Test Failed");
			logger.log(LogStatus.PASS,"Additional premium of the policy is  "+APamount+" Test Failed");
			
		}
		else
		{
			System.out.println("Additional premium of the policy is "+APamount);
			logger.log(LogStatus.PASS,"Additional premium of the policy is "+APamount);
		}
		
		report.endTest(logger);
		report.flush(); 
	}
	
	
	void addproperty(String propertyType,String mainresidence,String outbuildings,String purposes,WebDriver driver) throws InterruptedException
	{
		
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
			if(!propertyType.equals(""))
		    {	
		   	 
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
			if(!mainresidence.equals(""))
		    {	
		   	 
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
		    }
			if(!outbuildings.equals(""))
		    {	
		   	 
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
		    }
			if(!purposes.equals(""))
		    {	
		   	 
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
		
		
		
		
	}
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	


