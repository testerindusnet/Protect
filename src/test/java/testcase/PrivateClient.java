package testcase;

import java.io.FileInputStream;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import settings.login;

public class PrivateClient extends login {
	
	
public WebDriver driver;
	
    @BeforeClass    
    public void login()
    {
    
	  driver=getdriver();
	
    }
		
	
    @Test(priority=1)
    public void testClient() throws Exception
    
    {
	
	
	String currency,broker,brokeruser,startdt,type,selection,introducer,entity,companyname,businesstype,title,fname,lname,mobile,email,gender,country,postcode,dropdown,AL1,AL2,AL3,AL4,AL5,AL6,AL7,
	territory,marritals,dob,emplstatus,occujob,occubusi,occucomp,householdclaims,convictions,specialterms,bankrupt,Currentinsurer,
	Policyexpiry,Expiringprem,Targetpremium,Targetinsurer,TypeOfquote,riskaddress,country2,postcode2,al11,al12,al13,al14,al15,al16,
	territory2,datebuilt,propertyType,grade,roof,wall,repair,landslip,flooding,structurarepair,buildingwork,Interestedparty,
	mainresidence,outbuildings,purposes,unoccupied,locks,alarm,Maintenance,Firealarm,safe,property,CashRating,Buildings,Outbuildings,
	Tenant,Contentunspecified,Contenspecified,Description1,amount1,Valuablesunspecified,Description2,amount2,Valuablesspecified,Description3,amount3,homesafespecified,Description4,amount4,bankspecified,Description5,amount5,Fineartunspecified,
	Description6,amount6,Fineartspecified,Description7,amount7,brokercomm,introcomm,endorsement,Property,Title2,To;	
	
	//int startdt = 0;
	
	FileInputStream fis = new FileInputStream("E:\\protectfolder\\protect.xls");
    HSSFWorkbook wb = new HSSFWorkbook(fis);
   
    HSSFSheet ws = wb.getSheet("datasheet1");
    
    for( int count=1;count<=ws.getLastRowNum();count++){
    	
    	
    	HSSFRow row=ws.getRow(count);
    	System.out.println("TEST DATA" +row.getCell(0).toString());
	

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
    		int data2= (int)wb.getSheetAt(0).getRow(1).getCell(3).getNumericCellValue();
    		System.out.println("Date from Excel is >>> "+data2);
    		startdt=Integer.toString(data2);
    		
    		
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
    		entity =row.getCell(7).toString();
    	}
    	else{
    		
    		entity=null;
    	}

    	if(row.getCell(8)!=null){
    		companyname=row.getCell(8).toString();
    	}
    	else{
    		
    		companyname=null;
    	}

    	if(row.getCell(9)!=null){
    		businesstype =row.getCell(9).toString();
    	}

    	else{
    		businesstype=null;
    		
    	}
    	if(row.getCell(10)!=null){
    		title =row.getCell(10).toString();
    	}

    	else{
    		
    		title=null;
    	}


    	if(row.getCell(11)!=null){
    		fname =row.getCell(11).toString();
    	}
    	else{
    		
    		fname=null;
    	}

    	if(row.getCell(12)!=null){
    		lname=row.getCell(12).toString();
    		/*long data1= (long)wb.getSheetAt(0).getRow(1).getCell(12).getNumericCellValue();
    		System.out.println("Data from Excel is >>> "+data1);*/
    	//	lname=String.valueOf(data1);
    		System.out.println(lname);
    	}
    	else{
    		
    		lname=null;
    	}

    	if(row.getCell(13)!=null){
    		mobile =row.getCell(13).toString();
    		
    	}

    	else{
    		mobile=null;
    		
    	}
    	if(row.getCell(14)!=null){
    		email =row.getCell(14).toString();
    	}

    	else{
    		
    		email=null;
    	}


    	if(row.getCell(15)!=null){
    		gender =row.getCell(15).toString();
    	}
    	else{
    		
    		gender=null;
    	}

    	if(row.getCell(16)!=null){
    		country=row.getCell(16).toString();
    	}
    	else{
    		
    		country=null;
    	}


    	if(row.getCell(17)!=null){
    		postcode =row.getCell(17).toString();
    	}

    	else{
    		postcode=null;
    		
    	}
    	if(row.getCell(18)!=null){
    		dropdown =row.getCell(18).toString();
    	}

    	else{
    		
    		dropdown=null;
    	}


    	if(row.getCell(19)!=null){
    		AL1 =row.getCell(19).toString();
    	}
    	else{
    		
    		AL1=null;
    	}

    	if(row.getCell(20)!=null){
    		AL2=row.getCell(20).toString();
    	}
    	else{
    		
    		AL2=null;
    	}

    	if(row.getCell(21)!=null){
    		AL3 =row.getCell(21).toString();
    	}

    	else{
    		AL3=null;
    		
    	}
    	if(row.getCell(22)!=null){
    		AL4 =row.getCell(22).toString();
    	}

    	else{
    		
    		AL4=null;
    	}


    	if(row.getCell(23)!=null){
    		AL5 =row.getCell(23).toString();
    	}
    	else{
    		
    		AL5=null;
    	}

    	if(row.getCell(24)!=null){
    		AL6=row.getCell(24).toString();
    	}
    	else{
    		
    		AL6=null;
    	}

    	if(row.getCell(25)!=null){
    		AL7 =row.getCell(25).toString();
    	}

    	else{
    		AL7=null;
    		
    	}
    	if(row.getCell(26)!=null){
    		territory =row.getCell(26).toString();
    	}

    	else{
    		
    		territory=null;
    	}


    	if(row.getCell(27)!=null){
    		marritals =row.getCell(27).toString();
    	}
    	else{
    		
    		marritals=null;
    	}

    	if(row.getCell(28)!=null){
    		dob=row.getCell(28).toString();
    	}
    	else{
    		
    		dob=null;
    	}


    	if(row.getCell(29)!=null){
    		emplstatus =row.getCell(29).toString();
    	}

    	else{
    		emplstatus=null;
    		
    	}
    	if(row.getCell(30)!=null){
    		occujob =row.getCell(30).toString();
    	}

    	else{
    		
    		occujob=null;
    	}


    	if(row.getCell(31)!=null){
    		occubusi =row.getCell(31).toString();
    	}
    	else{
    		
    		occubusi=null;
    	}

    	if(row.getCell(32)!=null){
    		occucomp=row.getCell(32).toString();
    	}
    	else{
    		
    		occucomp=null;
    	}




    	if(row.getCell(33)!=null){
    		householdclaims =row.getCell(33).toString();
    	}

    	else{
    		householdclaims=null;
    		
    	}
    	if(row.getCell(34)!=null){
    		convictions =row.getCell(34).toString();
    	}

    	else{
    		
    		convictions=null;
    	}


    	if(row.getCell(35)!=null){
    		specialterms =row.getCell(35).toString();
    	}
    	else{
    		
    		specialterms=null;
    	}

    	if(row.getCell(36)!=null){
    		bankrupt=row.getCell(36).toString();
    	}
    	else{
    		
    		bankrupt=null;
    	}

    	if(row.getCell(37)!=null){
    		Currentinsurer =row.getCell(37).toString();
    	}

    	else{
    		Currentinsurer=null;
    		
    	}
    	if(row.getCell(38)!=null){
    		Policyexpiry =row.getCell(38).toString();
    	}

    	else{
    		
    		Policyexpiry=null;
    	}


    	if(row.getCell(39)!=null){
    		Expiringprem =row.getCell(39).toString();
    	}
    	else{
    		
    		Expiringprem=null;
    	}

    	if(row.getCell(40)!=null){
    		Targetpremium=row.getCell(40).toString();
    	}
    	else{
    		
    		Targetpremium=null;
    	}



    	if(row.getCell(41)!=null){
    		Targetinsurer =row.getCell(41).toString();
    	}

    	else{
    		Targetinsurer=null;
    		
    	}
    	if(row.getCell(42)!=null){
    		TypeOfquote =row.getCell(42).toString();
    	}

    	else{
    		
    		TypeOfquote=null;
    	}


    	if(row.getCell(43)!=null){
    		riskaddress =row.getCell(43).toString();
    	}
    	else{
    		
    		riskaddress=null;
    	}

    	if(row.getCell(44)!=null){
    		country2=row.getCell(44).toString();
    	}
    	else{
    		
    		country2=null;
    	}




    	if(row.getCell(45)!=null){
    		postcode2 =row.getCell(45).toString();
    	}

    	else{
    		postcode2=null;
    		
    	}
    	if(row.getCell(46)!=null){
    		al11 =row.getCell(46).toString();
    	}

    	else{
    		
    		al11=null;
    	}


    	if(row.getCell(47)!=null){
    		al12 =row.getCell(47).toString();
    	}
    	else{
    		
    		al12=null;
    	}

    	if(row.getCell(48)!=null){
    		al13=row.getCell(48).toString();
    	}
    	else{
    		
    		al13=null;
    	}


    	if(row.getCell(49)!=null){
    		al14 =row.getCell(49).toString();
    	}

    	else{
    		al14=null;
    		
    	}

    	if(row.getCell(50)!=null){
    		al15 =row.getCell(50).toString();
    	}

    	else{
    		
    		al15=null;
    	}


    	if(row.getCell(51)!=null){
    		al16 =row.getCell(51).toString();
    	}
    	else{
    		
    		al16=null;
    	}

    	if(row.getCell(52)!=null){
    		territory2=row.getCell(52).toString();
    	}
    	else{
    		
    		territory2=null;
    	}


    	if(row.getCell(53)!=null){
    		datebuilt =row.getCell(53).toString();
    	}

    	else{
    		datebuilt=null;
    		
    	}
    	if(row.getCell(54)!=null){
    		propertyType =row.getCell(54).toString();
    	}

    	else{
    		
    		propertyType=null;
    	}


    	if(row.getCell(55)!=null){
    		grade =row.getCell(55).toString();
    	}
    	else{
    		
    		grade=null;
    	}

    	if(row.getCell(56)!=null){
    		roof=row.getCell(56).toString();
    	}
    	else{
    		
    		roof=null;
    	}



    	if(row.getCell(57)!=null){
    		wall =row.getCell(57).toString();
    	}

    	else{
    		wall=null;
    		
    	}
    	if(row.getCell(58)!=null){
    		repair =row.getCell(58).toString();
    	}

    	else{
    		
    		repair=null;
    	}


    	if(row.getCell(59)!=null){
    		landslip =row.getCell(59).toString();
    	}
    	else{
    		
    		landslip=null;
    	}

    	if(row.getCell(60)!=null){
    		flooding=row.getCell(60).toString();
    	}
    	else{
    		
    		flooding=null;
    	}

    	if(row.getCell(61)!=null){
    	structurarepair =row.getCell(61).toString();
    	}

    	else{
    	structurarepair=null;

    	}
    	if(row.getCell(62)!=null){
    	buildingwork =row.getCell(62).toString();
    	}

    	else{

    	buildingwork=null;
    	}


    	if(row.getCell(63)!=null){
    	Interestedparty =row.getCell(63).toString();
    	}
    	else{

    	Interestedparty=null;
    	}

    	if(row.getCell(64)!=null){
    	mainresidence=row.getCell(64).toString();
    	}
    	else{

    	mainresidence=null;
    	}


    	if(row.getCell(65)!=null){
    	outbuildings =row.getCell(65).toString();
    	}

    	else{
    	outbuildings=null;

    	}
    	if(row.getCell(66)!=null){
    	purposes =row.getCell(66).toString();
    	}

    	else{

    	purposes=null;
    	}


    	if(row.getCell(67)!=null){
    	unoccupied =row.getCell(67).toString();
    	}
    	else{

    	unoccupied=null;
    	}

    	if(row.getCell(68)!=null){
    	locks=row.getCell(68).toString();
    	}
    	else{

    	locks=null;
    	}

    	if(row.getCell(69)!=null){
    	alarm =row.getCell(69).toString();
    	}

    	else{
    	alarm=null;

    	}
    	if(row.getCell(70)!=null){
    	Maintenance =row.getCell(70).toString();
    	}

    	else{

    	Maintenance=null;
    	}


    	if(row.getCell(71)!=null){
    	Firealarm =row.getCell(71).toString();
    	}
    	else{

    	Firealarm=null;
    	}

    	if(row.getCell(72)!=null){
    	safe=row.getCell(72).toString();
    	}
    	else{

    	safe=null;
    	}


    	if(row.getCell(73)!=null){
    	property =row.getCell(73).toString();
    	}

    	else{
    	property=null;

    	}
    	if(row.getCell(74)!=null){
    	CashRating =row.getCell(74).toString();
    	}

    	else{

    	CashRating=null;
    	}


    	if(row.getCell(75)!=null){
    	Buildings =row.getCell(75).toString();
    	}
    	else{

    	Buildings=null;
    	}

    	if(row.getCell(76)!=null){
    	Outbuildings=row.getCell(76).toString();
    	}
    	else{

    	Outbuildings=null;
    	}


    	if(row.getCell(77)!=null){
    	Tenant =row.getCell(77).toString();
    	}

    	else{
    	Tenant=null;

    	}
    	if(row.getCell(78)!=null){
    	Contentunspecified =row.getCell(78).toString();
    	}

    	else{

    	Contentunspecified=null;
    	}


    	if(row.getCell(79)!=null){
    	Contenspecified =row.getCell(79).toString();
    	}
    	else{

    	Contenspecified=null;
    	}

    	if(row.getCell(80)!=null){
    	Description1=row.getCell(80).toString();
    	}
    	else{

    	Description1=null;
    	}

    	if(row.getCell(81)!=null){
    	amount1 =row.getCell(81).toString();
    	}

    	else{

    	amount1=null;
    	}


    	if(row.getCell(82)!=null){
    	Valuablesunspecified =row.getCell(82).toString();
    	}
    	else{

    	Valuablesunspecified=null;
    	}

    	if(row.getCell(83)!=null){
    	Description2=row.getCell(83).toString();
    	}
    	else{

    	Description2=null;
    	}


    	if(row.getCell(84)!=null){
    	amount2 =row.getCell(84).toString();
    	}

    	else{
    	amount2=null;

    	}
    	if(row.getCell(85)!=null){
    	Valuablesspecified =row.getCell(85).toString();
    	}

    	else{

    	Valuablesspecified=null;
    	}


    	if(row.getCell(86)!=null){
    	Description3=row.getCell(86).toString();
    	}
    	else{

    	Description3=null;
    	}



    	if(row.getCell(87)!=null){
    	amount3 =row.getCell(87).toString();
    	}

    	else{
    	amount3=null;

    	}
    	if(row.getCell(88)!=null){
    	homesafespecified =row.getCell(88).toString();
    	}

    	else{

    	homesafespecified=null;
    	}


    	if(row.getCell(89)!=null){
    	Description4 =row.getCell(89).toString();
    	}
    	else{

    	Description4=null;
    	}

    	if(row.getCell(90)!=null){
    	amount4=row.getCell(90).toString();
    	}
    	else{

    	amount4=null;
    	}



    	if(row.getCell(91)!=null){
    	bankspecified =row.getCell(91).toString();
    	}

    	else{
    	bankspecified=null;

    	}
    	if(row.getCell(92)!=null){
    	Description5 =row.getCell(92).toString();
    	}

    	else{

    	Description5=null;
    	}


    	if(row.getCell(93)!=null){
    	amount5 =row.getCell(93).toString();
    	}
    	else{

    	amount5=null;
    	}

    	if(row.getCell(94)!=null){
    	Fineartunspecified=row.getCell(94).toString();
    	}
    	else{

    	Fineartunspecified=null;
    	}


    	if(row.getCell(95)!=null){
    	Description6 =row.getCell(95).toString();
    	}

    	else{
    	Description6=null;

    	}
    	if(row.getCell(96)!=null){
    	amount6 =row.getCell(96).toString();
    	}

    	else{

    	amount6=null;
    	}


    	if(row.getCell(97)!=null){
    	Fineartspecified =row.getCell(97).toString();
    	}
    	else{

    	Fineartspecified=null;
    	}

    	if(row.getCell(98)!=null){
    	Description7=row.getCell(98).toString();
    	}
    	else{

    	Description7=null;
    	}

    	if(row.getCell(99)!=null){
    	amount7 =row.getCell(99).toString();
    	}

    	else{
    	amount7=null;

    	}


    	if(row.getCell(100)!=null){
    		brokercomm =row.getCell(100).toString();
    	}

    	else{
    		
    		brokercomm=null;
    	}


    	if(row.getCell(101)!=null){
    		introcomm =row.getCell(101).toString();
    	}
    	else{
    		
    		introcomm=null;
    	}

    	if(row.getCell(102)!=null){
    		endorsement=row.getCell(102).toString();
    	}
    	else{
    		
    		endorsement=null;
    	}


    	if(row.getCell(103)!=null){
    		Property =row.getCell(103).toString();
    	}

    	else{
    		Property=null;
    		
    	}
    	if(row.getCell(104)!=null){
    		Title2 =row.getCell(104).toString();
    	}

    	else{
    		
    		Title2=null;
    	}

    	if(row.getCell(105)!=null){
    		To =row.getCell(105).toString();
    	}

    	else{
    		
    		To=null;
    	}

    	wb.close();
      single(currency,broker,brokeruser,startdt,type,selection,introducer,entity,companyname,businesstype,title,fname,lname,
     mobile,email,gender,country,postcode,dropdown,AL1,AL2,AL3,AL4,AL5,AL6,AL7,
	territory,marritals,dob,emplstatus,occujob,occubusi,occucomp,householdclaims,convictions,specialterms,bankrupt,Currentinsurer,
	Policyexpiry,Expiringprem,Targetpremium,Targetinsurer,TypeOfquote,riskaddress,country2,postcode2,al11,al12,al13,al14,al15,al16,
	territory2,datebuilt,propertyType,grade,roof,wall,repair,landslip,flooding,structurarepair,buildingwork,Interestedparty,
	mainresidence,outbuildings,purposes,unoccupied,locks,alarm,Maintenance,Firealarm,safe,property,CashRating,Buildings,Outbuildings,
	Tenant,Contentunspecified,Contenspecified,Description1,amount1,Valuablesunspecified,Description2,amount2,Valuablesspecified,Description3,amount3,homesafespecified,Description4,amount4,bankspecified,Description5,amount5,Fineartunspecified,
	Description6,amount6,Fineartspecified,Description7,amount7,brokercomm,introcomm,endorsement,Property,Title2,To);

    }
    
    
    }

              public void single(String currency,String broker,String brokeruser,String startdt,String type,String selection,
            		  String introducer,String entity,String companyname,String businesstype,String title,String fname,String lname,
            		  String mobile,String email,String gender,String country,String postcode,String dropdown,String AL1,String AL2,
            		  String AL3,String AL4,String AL5,String AL6,String AL7,String territory,String marritals,String dob,
            		  String emplstatus,String occujob,String occubusi,String occucomp,String householdclaims,String convictions,
            		  String specialterms,String bankrupt,String Currentinsurer,String Policyexpiry ,String Expiringprem,
            		  String Targetpremium,String Targetinsurer,String TypeOfquote,String riskaddress,String country2,String postcode2,
            		  String al11,String al12,String al13,String al14,String al15,String al16,String territory2,String datebuilt,
            		  String propertyType,String grade,String roof,String wall,String repair,String landslip,String flooding,
            		  String structurarepair,String buildingwork,String Interestedparty,String mainresidence,String outbuildings,
            		  String purposes,String unoccupied,String locks,String alarm,String Maintenance,String Firealarm,String safe,
            		  String property,String CashRating,String Buildings,String Outbuildings,String Tenant,String Contentunspecified,
            		  String Contenspecified,String Description1,String amount1,String Valuablesunspecified,String Description2,
            		  String amount2,String Valuablespecified,String Description3,String amount3,String homesafespecified,
            		  String Description4,String amount4,String bankspecified,String Description5,String amount5,
            		  String Fineartunspecified,String Description6,String amount6,String Fineartspecified,String Description7,
            		  String amount7,String brokercomm,String introcomm,String endorsement,String Property,String Title2,
            		  String To) throws InterruptedException	
              
          	{
          	
            	 /* WebElement a = driver.findElement(By.linkText("Protect"));
          		a.click();*/
          		
          		
          		// Now click Start New Quote button
          	
          		WebElement b = driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[2]/div/ul/li[3]/a"));
          		b.click();	
          		
          		
          		// Now click private button
          		
          		WebElement private1 = driver.findElement(By.xpath("//*[@id=\"quoteBuySubMenu\"]/li[1]/a"));
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
          		System.out.println("The date is" +startdt);
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
          		
          		try {
          		Select titlepath= new Select(driver.findElement(By.xpath("//*[@id=\"title\"]")));
          		titlepath.selectByVisibleText(title);
          		System.out.println("Title sent from Excel is  "+title);
          		Reporter.log("Title sent from Excel is  "+title);
          		    }
          		
          		catch(Exception e)
      		    {
      			e.printStackTrace();
      		    }
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
          		//click sanctin check button
          		
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
          		driver.findElement(By.xpath("//*[@id=\"expiringPremium\"]")).sendKeys(Targetpremium);
          		System.out.println("PloicyHolder's Expiring Premium sent from Excel is  "+Targetpremium);
          		Reporter.log("PloicyHolder's Expiring Premium sent from Excel is  "+Targetpremium);
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
          		                                        //3rd page 
          		Thread.sleep(3000);
          		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\'quoteType2\\']")));
          /*List<WebElement> radiocount1=driver.findElements(By.xpath("//div[@class='chk full']"));
          		
          		for(WebElement ele3:radiocount1)
          		{ 
          		
          			String date3=ele3.getAttribute("value");
          			System.out.println(date3);
          			
          			if(date3.equalsIgnoreCase(TypeOfquote))
          			{
          				ele3.click();
          				break;
          			}
          			
          		}*/
          		
          				
          		Thread.sleep(2000);
          		try {
          		driver.findElement(By.xpath("//*[@id=\'quoteType2\']")).click();
          	}
              catch(Exception e)
    		    {
    			e.printStackTrace();
    		    }
          		// Select property type
          		try {
          		Select propertytypepath= new Select(driver.findElement(By.xpath("//*[@id=\"propertyTypes\"]")));
          		propertytypepath.selectByVisibleText(propertyType);
          		System.out.println("PloicyHolder's Property Type sent from Excel is  "+propertyType);
          		Reporter.log("PloicyHolder's Property Type sent from Excel is  "+propertyType);
                }

catch(Exception e)
  {
	e.printStackTrace();
  }
          		Thread.sleep(1000);
          		try {
          		driver.findElement(By.xpath("//*[@id=\"subsidence1\"]")).click();
          	}

          	catch(Exception e)
          	  {
          		e.printStackTrace();
          	  }
          		try {
          		driver.findElement(By.xpath("//*[@id=\"subsidenceFreetext\"]")).sendKeys(landslip);
          		System.out.println("Has the home previously suffered any damage as a result of subsidence, landslip, heave, structural movement?  "+landslip);
          		Reporter.log("Has the home previously suffered any damage as a result of subsidence, landslip, heave, structural movement?  "+landslip);
          		}

          	catch(Exception e)
          	  {
          		e.printStackTrace();
          	  }
          		//jse.executeScript("window.scrollBy(0,200)", "");
          		
          		Thread.sleep(1000);
          		try {
          		driver.findElement(By.xpath("//*[@id=\'propertyInformationFrm\']/fieldset[2]/legend")).click();
          	}

          	catch(Exception e)
          	  {
          		e.printStackTrace();
          	  }
          		// select client residence 
          		try {
          		Select residence= new Select(driver.findElement(By.xpath("//*[@id=\"mainResidence\"]")));
          		residence.selectByVisibleText(mainresidence);
          		System.out.println("Is the home the client’s main residence ?  "+mainresidence);
          		Reporter.log("Is the home the client’s main residence ?  "+mainresidence);
          	}

          	catch(Exception e)
          	  {
          		e.printStackTrace();
          	  }
          		Thread.sleep(1000);
          		// select home outbuilings 
          		try {
          				Select outbuildingpath= new Select(driver.findElement(By.xpath("//*[@id=\"familyOccupied\"]")));
          				outbuildingpath.selectByVisibleText(outbuildings);
          				System.out.println("Who occupies the home and its outbuildings ?  "+outbuildings);
          				Reporter.log("Who occupies the home and its outbuildings ?  "+outbuildings);
          			}

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          				// select professional purpose
          		try {
          				Select purposepath= new Select(driver.findElement(By.xpath("//*[@id=\"businessUse\"]")));
          				purposepath.selectByVisibleText(purposes);
          				System.out.println("Are the home or any outbuildings used for business or professional purposes ?   "+purposes);
          				Reporter.log("Are the home or any outbuildings used for business or professional purposes ?   "+purposes);
          			}

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          				Thread.sleep(1000);
          				try {
          				driver.findElement(By.xpath("//*[@id=\"propertyInformationFrm\"]/fieldset[3]/legend")).click();
          			}

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          				// select intruder alarm
          				try {
          				Select alarmpath= new Select(driver.findElement(By.xpath("//*[@id=\"intruderAlarm\"]")));
          				alarmpath.selectByVisibleText(alarm);
          				System.out.println("Intruder alarm    "+alarm);
          				Reporter.log("Intruder alarm    "+alarm);
          			}

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          				Thread.sleep(1000);
          				// select fire alarm
          				try {
          				Select alarm2= new Select(driver.findElement(By.xpath("//*[@id=\"fireAlarm\"]")));
          				alarm2.selectByVisibleText(Firealarm);
          				System.out.println("Fire alarm    "+Firealarm);
          				Reporter.log("Fire alarm    "+Firealarm);
          			       }

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          		       //Does your property have a safe?
          				try {
          				driver.findElement(By.xpath("//*[@id=\"haveSafe2\"]")).click();
          			}

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          				//click on building sum insured tab
          				try {
          				driver.findElement(By.xpath("//*[@id=\"offBuildingOnlyDiv\"]/fieldset/legend")).click();
          			}

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          		        // send Buildings data
          				try {
          				driver.findElement(By.xpath("//*[@id=\"mainhouse\"]")).sendKeys(Buildings);
          				System.out.println("Buildings Sum Assured amount    "+Buildings);
          				Reporter.log("Buildings Sum Assured amount    "+Buildings);
          			}

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          				Thread.sleep(1000);
          				// send Outbuildings data
          				try {
          				driver.findElement(By.xpath("//*[@id=\"outbuildings\"]")).sendKeys(Outbuildings);
          				System.out.println("Outbuildings Sum Assured amount     "+Outbuildings);
          				Reporter.log("Outbuildings Sum Assured amount     "+Outbuildings);
          			}

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          				//click on Fine Art tab
          				try {
          				driver.findElement(By.xpath("//*[@id=\"fineArtOnlyDiv\"]/fieldset/legend")).click();
          			}

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          				// send Fine art - unspecified data
          				try {
          				driver.findElement(By.xpath("//*[@id=\"unspecified_FAUS\"]")).sendKeys(Fineartunspecified);
          				System.out.println("Fineart unspecified amount     "+Fineartunspecified);
          				Reporter.log("Fineart unspecified amount     "+Fineartunspecified);
          			}

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          				Thread.sleep(1000);
          				//click on Add Item tab
          				try {
          				driver.findElement(By.xpath("//*[@id=\"fineArtOnlyDiv\"]/fieldset/div/div[2]/label/a")).click();
          	}

    			catch(Exception e)
    			  {
    				e.printStackTrace();
    			  }
          				//send the name of item 1
          				try {
          				driver.findElement(By.xpath("//*[@id=\"descriptionFAUS_100\"]")).sendKeys(Description6);
}

	catch(Exception e)
	  {
		e.printStackTrace();
	  }
          				Thread.sleep(1000);
          				// send the price of item
          				try {
          				driver.findElement(By.xpath("//*[@id=\"amountFAUS_100\"]")).sendKeys(amount6);
          			}

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          				// click the Next button
          				try {
          				driver.findElement(By.xpath("//*[@id=\"btnPropInfo\"]")).click();
          			}

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          				                       // 4th page select the property 
          				
          				Thread.sleep(6000);
          				try {
          				//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[starts-with(@name,'propertySelect_')]")));
          				driver.findElement(By.xpath("//input[starts-with(@name,'propertySelect_')]")).click();
          			}

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          				
          				// scroll to payment tab
          				try {
          				WebElement  tapback=driver.findElement(By.xpath("//*[@id=\'submitBtn\']"));
          				JavascriptExecutor jsScroll=  (JavascriptExecutor)driver;
          				jsScroll.executeScript("arguments[0].scrollIntoView(true);", tapback);
          			}

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          				
          				Thread.sleep(4000);
          				try {
          				driver.findElement(By.xpath("//*[@id=\'submitBtn\']")).click();
          			}

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          				
          				//paymentSelection page
          				
          				// select a payment method
          				
          				Thread.sleep(8000);
          				//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\'Annually_payMethod_1\\']")));
          				driver.findElement(By.xpath("//*[@id=\'Annually_payMethod_1\']")).click();
          				// click confirm payment type
          				driver.findElement(By.xpath("//*[@id=\'Bind\']")).click();
          				Thread.sleep(12000);
          				WebDriverWait wait1=new WebDriverWait(driver,30);
          	          	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='toMailId']")));
          				
          				// send mail id \
          				WebElement mail =driver.findElement(By.xpath("//input[@id='toMailId']"));
          				mail.clear();
          				WebElement Topath =driver.findElement(By.xpath("//input[@id='toMailId']"));
          				Topath.sendKeys(To);
          				// Click Bind and Send policy Schedule
          				Thread.sleep(8000);
          				WebElement sendbutton=driver.findElement(By.xpath("//button[@id='sendPolicyMailBtn']"));
          				JavascriptExecutor jsScroll10=  (JavascriptExecutor)driver;
          				jsScroll10.executeScript("arguments[0].scrollIntoView(true);", sendbutton);
          				Thread.sleep(2000);
          				jsScroll10.executeScript("arguments[0].click();", sendbutton);
          				
          				
          				WebDriverWait wait2=new WebDriverWait(driver,360);
          	          	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"quoteBuySubMenu\"]/li[1]/a")));
          				
          				
          				//*[@id="Propertytabs"]/ul/li/a/input
          				
          				
          				
          				






          	}
              
              
              
              


}
