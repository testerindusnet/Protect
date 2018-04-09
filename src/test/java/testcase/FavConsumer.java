package testcase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

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
import org.testng.annotations.Test;

import settings.login;

public class FavConsumer extends login {
	
public WebDriver driver;
public String policyno;
public String totalpremium;;
	
	
	@BeforeClass    
    public void login() {
    
	  driver=getdriver();
	
    }
	
	
	
	@Test(priority=1)
	  public void FavConsumer() throws InterruptedException, IOException
	  
	  {
		 Thread.sleep(1000);
	   		
		String currency,broker,brokeruser,startdt,type,selection,introducer,fname,lname,mobile,email,gender,country,postcode,dropdown,marritals,
		dob,emplstatus,Currentinsurer,Policyexpiry,Expiringprem,Targetpremium,Targetinsurer,propertyType,
		mainresidence,outbuildings,purposes,Buildings1,transit,limit,Contenspecified,Description1,amount1,Valuablesunspecified,Description2,
		amount2,Fineartunspecified,locrate,transitrate,contentrate,fineartrate,valuablesrate,To;	
		
		//int startdt = 0;
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Datafile\\Protectcsv.xlsx");
	    HSSFWorkbook wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = wb.getSheet("Fav");
	    
	    for( int count=1;count<=ws.getLastRowNum();count++){
	    	
	    	
	    	HSSFRow row=ws.getRow(count);
	    	//System.out.println("TEST DATA" +row.getCell(0).toString());
		

	    	if(row.getCell(0)!=null){
	    		currency =row.getCell(0).toString();
	    	}

	    	else{
	    		currency=null;
	    		
	    	}
	    	if(row.getCell(1)!=null){
	    		broker =row.getCell(1).toString();
	    	}

	    	else{
	    		
	    		broker=null;
	    	}

	    	if(row.getCell(2)!=null){
	    		brokeruser =row.getCell(2).toString();
	    	}
	    	else{
	    		
	    		brokeruser=null;
	    	}



	    	if(row.getCell(3)!=null){
	    		startdt =row.getCell(3).toString();
	    		
	    		
	    	}
	    	else{
	    		
	    		startdt=null;
	    	}

	    	if(row.getCell(4)!=null){
	    		type=row.getCell(4).toString();
	    	}
	    	else{
	    		
	    		type=null;
	    	}


	    	if(row.getCell(5)!=null){
	    		selection =row.getCell(5).toString();
	    	}

	    	else{
	    		selection=null;
	    		
	    	}
	    	if(row.getCell(6)!=null){
	    		introducer =row.getCell(6).toString();
	    	}

	    	else{
	    		
	    		introducer=null;
	    	}


	    	

	    	if(row.getCell(7)!=null){
	    		fname =row.getCell(7).toString();
	    	}
	    	else{
	    		
	    		fname=null;
	    	}

	    	if(row.getCell(8)!=null)
	    	{
	    		lname=row.getCell(8).toString();
	    		
	    	}
	    	else{
	    		
	    		lname=null;
	    	}

	    	if(row.getCell(9)!=null){
	    		mobile =row.getCell(9).toString();
	    		
	    	}

	    	else{
	    		mobile=null;
	    		
	    	}
	    	if(row.getCell(10)!=null){
	    		email =row.getCell(10).toString();
	    	}

	    	else{
	    		
	    		email=null;
	    	}


	    	if(row.getCell(11)!=null){
	    		gender =row.getCell(11).toString();
	    	}
	    	else{
	    		
	    		gender=null;
	    	}

	    	if(row.getCell(12)!=null){
	    		country=row.getCell(12).toString();
	    	}
	    	else{
	    		
	    		country=null;
	    	}


	    	if(row.getCell(13)!=null){
	    		postcode =row.getCell(13).toString();
	    	}

	    	else{
	    		postcode=null;
	    		
	    	}
	    	if(row.getCell(14)!=null){
	    		dropdown =row.getCell(14).toString();
	    	}

	    	else{
	    		
	    		dropdown=null;
	    	}


	    	


	    	if(row.getCell(15)!=null){
	    		marritals =row.getCell(15).toString();
	    	}
	    	else{
	    		
	    		marritals=null;
	    	}

	    	if(row.getCell(16)!=null){
	    		dob=row.getCell(16).toString();
	    	}
	    	else{
	    		
	    		dob=null;
	    	}


	    	if(row.getCell(17)!=null){
	    		emplstatus =row.getCell(17).toString();
	    	}

	    	else{
	    		emplstatus=null;
	    		
	    	}
	    	

	    	if(row.getCell(18)!=null){
	    		Currentinsurer =row.getCell(18).toString();
	    	}

	    	else{
	    		Currentinsurer=null;
	    		
	    	}
	    	if(row.getCell(19)!=null){
	    		Policyexpiry =row.getCell(19).toString();
	    	}

	    	else{
	    		
	    		Policyexpiry=null;
	    	}


	    	if(row.getCell(20)!=null){
	    		Expiringprem =row.getCell(20).toString();
	    	}
	    	else{
	    		
	    		Expiringprem=null;
	    	}

	    	if(row.getCell(21)!=null){
	    		Targetpremium=row.getCell(21).toString();
	    	}
	    	else{
	    		
	    		Targetpremium=null;
	    	}



	    	if(row.getCell(22)!=null){
	    		Targetinsurer =row.getCell(22).toString();
	    	}

	    	else{
	    		Targetinsurer=null;
	    		
	    	}
	    	
	    	if(row.getCell(23)!=null){
	    		propertyType =row.getCell(23).toString();
	    	}

	    	else{
	    		
	    		propertyType=null;
	    	}


	    	

	    	if(row.getCell(24)!=null){
	    	mainresidence=row.getCell(24).toString();
	    	}
	    	else{

	    	mainresidence=null;
	    	}


	    	if(row.getCell(25)!=null){
	    	outbuildings =row.getCell(25).toString();
	    	}

	    	else{
	    	outbuildings=null;

	    	}
	    	if(row.getCell(26)!=null){
	    	purposes =row.getCell(26).toString();
	    	}

	    	else{

	    	purposes=null;
	    	}


	    	if(row.getCell(27)!=null){
	    	Buildings1 =row.getCell(27).toString();
	    	}
	    	else{

	    		Buildings1=null;
	    	}

	    	if(row.getCell(28)!=null){
	    	transit=row.getCell(28).toString();
	    	}
	    	else{

	    	transit=null;
	    	}

	    	if(row.getCell(29)!=null){
	    	limit =row.getCell(29).toString();
	    	}

	    	else{
	    	limit=null;

	    	}
	    	
	        if(row.getCell(30)!=null){
	    	Contenspecified =row.getCell(30).toString();
	    	}
	    	else{

	    	Contenspecified=null;
	    	}

	    	if(row.getCell(31)!=null){
	    	Description1=row.getCell(31).toString();
	    	}
	    	else{

	    	Description1=null;
	    	}

	    	if(row.getCell(32)!=null){
	    	amount1 =row.getCell(32).toString();
	    	}

	    	else{

	    	amount1=null;
	    	}


	    	if(row.getCell(33)!=null){
	    	Valuablesunspecified =row.getCell(33).toString();
	    	}
	    	else{

	    	Valuablesunspecified=null;
	    	}

	    	if(row.getCell(34)!=null){
	    	Description2=row.getCell(34).toString();
	    	}
	    	else{

	    	Description2=null;
	    	}


	    	if(row.getCell(35)!=null){
	    	amount2 =row.getCell(35).toString();
	    	}

	    	else{
	    	amount2=null;

	    	}
	    	if(row.getCell(36)!=null){
	    		Fineartunspecified =row.getCell(36).toString();
	    	}

	    	else{

	    		Fineartunspecified=null;
	    	}


	    	if(row.getCell(37)!=null){
	    		locrate=row.getCell(37).toString();
	    	}
	    	else{

	    		locrate=null;
	    	}

	    	if(row.getCell(38)!=null){
	    		transitrate=row.getCell(38).toString();
		    	}
		    	else{

		    		transitrate=null;
		    	}

		    	if(row.getCell(39)!=null){
		    		contentrate =row.getCell(39).toString();
		    	}

		    	else{

		    		contentrate=null;
		    	}


		    	if(row.getCell(40)!=null){
		    		fineartrate =row.getCell(40).toString();
		    	}
		    	else{

		    		fineartrate=null;
		    	}

		    	if(row.getCell(41)!=null){
		    		valuablesrate=row.getCell(41).toString();
		    	}
		    	else{

		    		valuablesrate=null;
		    	}


		    	if(row.getCell(42)!=null){
		    	To =row.getCell(42).toString();
		    	}

		    	else{
		    	To=null;

		    	}
		    	
	    	wb.close();
	        single(currency,broker,brokeruser,startdt,type,selection,introducer,fname,lname,mobile,email,gender,country,postcode,dropdown,marritals,
	        		dob,emplstatus,Currentinsurer,Policyexpiry,Expiringprem,Targetpremium,Targetinsurer,propertyType,
	        		mainresidence,outbuildings,purposes,Buildings1,transit,limit,Contenspecified,Description1,amount1,Valuablesunspecified,
	        		Description2,amount2,Fineartunspecified,locrate,transitrate,contentrate,fineartrate,valuablesrate,To);

	      }
	      
	      
	      }
		
		
		
		
		
		
	 public void single(String currency,String broker,String brokeruser,String startdt,String type,String selection,
   		  String introducer,String fname,String lname,
   		  String mobile,String email,String gender,String country,String postcode,String dropdown,String marritals,String dob,
   		  String emplstatus,String Currentinsurer,String Policyexpiry ,String Expiringprem,
   		  String Targetpremium,String Targetinsurer,
   		  String propertyType,String mainresidence,String outbuildings,
   		  String purposes,String Buildings1,String transit,String limit,
   		  String Contenspecified,String Description1,String amount1,String Valuablesunspecified,String Description2,
   		  String amount2,String Fineartunspecified,String locrate,String transitrate,String contentrate,
   		String fineartrate,String valuablesrate,String To) throws InterruptedException	
     
 	{
 		
		
	
		
		
		 // WebElement a = driver.findElement(By.linkText("Protect"));
		     
			//a.click();
		// Now click Start New Quote button
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
					
					//table[@class='data-table']/tbody/tr/td[2]/input
					
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
					
					WebElement submitBtn = driver.findElement(By.xpath("//*[@id='submitBtn']"));
					submitBtn.click();
					Thread.sleep(8000);
					
				
					
					WebElement AnnuallypayMethod1 = driver.findElement(By.xpath("//*[@id='Annually_payMethod_1']"));
					AnnuallypayMethod1.click();
					Thread.sleep(8000);
					
					
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
					waitclickable.until(ExpectedConditions.elementToBeClickable(By.xpath("//div['page-sidebar navbar-collapse collapse']/ul/li[6]/a")));
					
					demoledger(policyno,totalpremium);
					
					WebDriverWait waitclickable2=new WebDriverWait(driver,360);
					waitclickable2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"top\"]/div[1]/div[2]/div/ul/li[3]/a/span[1]")));
					
					
}
	 
	
	 
	 public void demoledger(String policyno,String totalpremium) throws InterruptedException
	 {
		 String actualtotalpremium=totalpremium;
		 String s1=policyno;  
		 int s2=s1.indexOf("P");
			int s3= s1.indexOf(")");
			String s4= s1.substring(s2,s3-1);
			System.out.println(s4);
			
			
			String s11=actualtotalpremium;  
			int s12=s11.indexOf("£");
			int s13=s12+1;
			String s14= s11.substring(s13);
			System.out.println(s14);
		 
			WebElement porecbutton = driver.findElement(By.xpath("//div['page-sidebar navbar-collapse collapse']/ul/li[6]/a"));
			porecbutton.click();	
			
			
			// Now send policy number in search textbox
			
			WebElement policysearch = driver.findElement(By.xpath("//*[@id=\"gs_policy_number\"]"));
			policysearch.sendKeys(s4);
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