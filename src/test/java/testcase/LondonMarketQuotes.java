package testcase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import settings.TestUtil;
import settings.login;

public class LondonMarketQuotes extends login
{
	public WebDriver driver;
	@BeforeClass 
	
	public void login()
	{
		driver=getdriver();
		
		
	}
	
	
	@DataProvider(name="gettestdata")
	public Iterator<Object[]> gettestdata(){
		
		ArrayList<Object[]> testdata=TestUtil.getdatafromexcel();
		return testdata.iterator();
	}
	
	
	
	
	
	@Test(dataProvider="gettestdata",priority=1)
	
	public void testLondonMarket(String binderxl,String addBinderxl,String insuredonexl,String datexl,String brokerxl,String PrimeryCedantxl,String umrxl,String clientclaasificxl,String domicilexl,String insuredzipxl,String insuredaddlineonexl,String insuredaddlinetwoxl,String insuredaddlinethreexl,String insuredtertryxl,String redomicile1xl,String reinsuredzipxl,String reinsuredaddlineone1xl,String reinsuredaddlinetwo1xl,String reinsuredtertry1xl,String brokeruserxl,String producingbrokerxl,String producbrokraddressxl,String producingbrokercountryxl,String producingbrokerzipxl,String lloydsbrokrnumberxl,String brokerstatexl,String introducerxl,String introducercommxl,String allocatetoxl,String surplusbrokrlicensexl,String leaderonexl,String leadertwoxl,String interestxl,String methodacceptxl,String tercountryxl,String territoryxl,String limitbasisxl,String threeyearlossratioxl,String cotractbasisxl,String ustradingxl,String fillingstatexl,String usclassificationxl,String cedantnaiccodexl,String limitcurrencyxl,String excesscurrencyxl,String paymentcurrencyxl,String settlementcurrencyxl,String writtenorderxl,String writtenlinexl,String writtenlineOptionxl,String estimatedsingingxl,String signedorderxl,String llsignedLinexl,String signedlineOptionxl,String profitcommissionxl,String date2xl,String policylimitOrgxl,String sumInsuredOrgxl,String shipmentOrgxl,String acquisitionOrgxl,String deductibleOrgxl,String excessOrgxl,String gpilimtOrgxl,String turnoverOrgxl,String permwtyxl,String termoftradexl,String date3xl,String permfromxl,String premsrcsplit12xl,String premsrcsplit9xl,String premsrcsplit4xl,String premsrcsplit3xl,String type1xl,String lcxl,String limitxl,String excurrxl,String Hundredxl,String suminsuxl,String Hunsuminsuxl,String techxl,String discxl,String paycurrxl,String roepcxl,String settcurrxl,String roepsxl,String taxcountryxl,String taxterritoryxl,String taxtypexl,String taxpaybyxl,String taxadminxl,String taxratexl,String taxamountxl) 
	 throws InterruptedException
	{
		
		// Click  Strart new Quote 
		Thread.sleep(4000);
		WebElement b = driver.findElement(By.xpath("//*[@id='top']/div[1]/div[2]/div/ul/li[3]/a"));
		b.click();	
		Thread.sleep(2000);
		
		// Click LondonMarket
		WebElement londonmarkert = driver.findElement(By.xpath("//*[@id='quoteBuySubMenu']/li[3]/a"));
		londonmarkert.click();
		
		// Policy Information 
		try
		{
		Select binder = new Select(driver.findElement(By.id("bindersection")));
		binder.selectByVisibleText(binderxl);
		System.out.println("Binder selected for policy is:"+binderxl);
		Reporter.log("Binder selected for policy is:"+binderxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		
		// Additional Binder Information
		try
		{
		Select addBinder = new Select(driver.findElement(By.id("addbindersection")));		
		addBinder.selectByVisibleText(addBinderxl);
		System.out.println("Additional Binder selected for policy is:"+addBinderxl);
		Reporter.log("Additional Binder selected for policy is:"+addBinderxl);
}
catch(Exception e)
{
	e.printStackTrace();
	
}
		// Insure 1
		try
		{
		WebElement Insure1 = driver.findElement(By.id("insuredone"));
		Insure1.sendKeys(insuredonexl);
		System.out.println("Insured name selected for policy is:"+insuredonexl);
		Reporter.log("Insured name selected for policy is:"+insuredonexl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		// policy reference number
		String policyno=driver.findElement(By.id("riskref")).getAttribute("value");
		System.out.println("Policy reference number of the selected policy is:"+policyno);
		Reporter.log("Policy reference number of the selected policy is:"+policyno);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		
		// Policy Inception  Date
		try
		{
		WebElement date = driver.findElement(By.xpath("//*[@id='policyinfoFrm']/div[1]/div[7]/div/div/a/img"));
		date.click();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		driver.switchTo().frame(0);
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@id='outerTable']//td"));
		
		for(WebElement ele:allDates)
		{
			
			String date1=ele.getText();
			
			if(date1.equalsIgnoreCase(datexl))
			{
				ele.click();
				break;
			}
			
		}
		
		driver.switchTo().defaultContent();
		
		// Select Broker
		try
		{
		Select broker = new Select(driver.findElement(By.id("broker")));		
		broker.selectByVisibleText(brokerxl);
		System.out.println("Broker selected for policy is:"+brokerxl);
		Reporter.log("Broker selected for policy is:"+brokerxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		// Primary Cedant
		try
		{
		WebElement PrimeryCedant = driver.findElement(By.id("reinsuredP"));
		PrimeryCedant.sendKeys(PrimeryCedantxl);
		System.out.println("Primary Cedant selected for policy is:"+PrimeryCedantxl);
		Reporter.log("Primary Cedant selected for policy is:"+PrimeryCedantxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		WebElement umr = driver.findElement(By.id("umr"));
		umr.sendKeys(umrxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		WebElement btnNext = driver.findElement(By.id("policyinfoSubmitBtn"));
		btnNext.click();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		// Insured
		Select clientClassification = new Select(driver.findElement(By.id("clientclaasific")));
		clientClassification.selectByVisibleText(clientclaasificxl);
		System.out.println("Insured selected for policy is:"+clientclaasificxl);
		Reporter.log("Insured selected for policy is:"+clientclaasificxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Insured Domicile
		Select domicile = new Select(driver.findElement(By.id("domicile")));
		domicile.selectByVisibleText(domicilexl);
		System.out.println("Insured Domicile selected for policy is:"+domicilexl);
		Reporter.log("Insured Domicile selected for policy is:"+domicilexl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Insured Zip Code
		WebElement insuredzip = driver.findElement(By.id("insuredzip"));
		insuredzip.sendKeys(insuredzipxl);
		System.out.println("Insured Zip Code selected for policy is:"+insuredzipxl);
		Reporter.log("Insured Zip Code selected for policy is:"+insuredzipxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Address Line 1
		WebElement insuredaddlineone = driver.findElement(By.id("insuredaddlineone"));
		insuredaddlineone.sendKeys(insuredaddlineonexl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Address Line 2
		WebElement insuredaddlinetwo = driver.findElement(By.id("insuredaddlinetwo"));
		insuredaddlinetwo.sendKeys(insuredaddlinetwoxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Address Line 3
		WebElement insuredaddlinethree = driver.findElement(By.id("insuredaddlinethree"));
		insuredaddlinethree.sendKeys(insuredaddlinethreexl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Insured Territory
		Select insuredtertry = new Select(driver.findElement(By.id("insuredtertry")));
		insuredtertry.selectByVisibleText(insuredtertryxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
	{
		// Button  Next
		WebElement btninsuredSubmitBtn = driver.findElement(By.id("insuredSubmitBtn"));
		btninsuredSubmitBtn.click();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		// Cedant 
		try
		{
		// Cedant Domicile
		Select redomicile1 = new Select(driver.findElement(By.id("redomicile_1")));
		redomicile1.selectByVisibleText(redomicile1xl);
		System.out.println("Cedant Domicile selected for policy is:"+redomicile1xl);
		Reporter.log("Cedant Domicile selected for policy is:"+redomicile1xl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Cedant Zip Code
		WebElement reinsuredzip = driver.findElement(By.id("reinsuredzip_1"));
		reinsuredzip.sendKeys(reinsuredzipxl);
		System.out.println("Cedant Zip Code selected for policy is:"+reinsuredzipxl);
		Reporter.log("Cedant Zip Code selected for policy is:"+reinsuredzipxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Address Line 1
		WebElement reinsuredaddlineone1 = driver.findElement(By.id("reinsuredaddlineone_1"));
		reinsuredaddlineone1.sendKeys(reinsuredaddlineone1xl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Address Line 2
		WebElement reinsuredaddlinetwo1 = driver.findElement(By.id("reinsuredaddlinetwo_1"));
		reinsuredaddlinetwo1.sendKeys(reinsuredaddlinetwo1xl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Cedant Territory
		Select reinsuredtertry1 = new Select(driver.findElement(By.id("reinsuredtertry_1")));
		reinsuredtertry1.selectByVisibleText(reinsuredtertry1xl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
				
		//Button  Next Cedant  Section
		WebElement btnreinsuredSubmitBtn = driver.findElement(By.id("reinsuredSubmitBtn"));
		btnreinsuredSubmitBtn.click();
				
		
		//  Associates
		try
		{
		//Choose Broker User
		Select brokeruser = new Select(driver.findElement(By.xpath("//*[@id=\"brokeruser\"]")));
		brokeruser.selectByVisibleText(brokeruserxl);
		System.out.println("Broker User selected for policy is:"+brokeruserxl);
		Reporter.log("Broker User selected for policy is:"+brokeruserxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		// Producing Broker
		WebElement producingbroker = driver.findElement(By.name("producingbroker"));
		producingbroker.sendKeys(producingbrokerxl);
		System.out.println("Producing Broker selected for policy is:"+producingbrokerxl);
		Reporter.log("Producing Broker selected for policy is:"+producingbrokerxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
			// Producing broker address
		WebElement producbrokraddress = driver.findElement(By.name("producbrokraddress"));
		producbrokraddress.sendKeys(producbrokraddressxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Producing broker country
		Select producingbrokercountry = new Select(driver.findElement(By.xpath("//select[@id='producingbrokercountry']")));
		producingbrokercountry.selectByVisibleText(producingbrokercountryxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Producing broker ZipCode
		WebElement producingbrokerzip = driver.findElement(By.id("producingbrokerzip"));
		producingbrokerzip.sendKeys(producingbrokerzipxl);
	    }
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//LLoyd's broker number
		WebElement lloydsbrokrnumber = driver.findElement(By.id("lloydsbrokrnumber"));
		lloydsbrokrnumber.sendKeys(lloydsbrokrnumberxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//State of broker		
		Select brokerstate = new Select(driver.findElement(By.id("brokerstate")));
		brokerstate.selectByVisibleText(brokerstatexl);
		System.out.println("Broker state selected for policy is:"+brokerstatexl);
		Reporter.log("Broker state selected for policy is:"+brokerstatexl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Introducer 
		Select introducer = new Select(driver.findElement(By.id("introducer")));
		introducer.selectByVisibleText(introducerxl);
		System.out.println("Introducer selected for policy is:"+introducerxl);
		Reporter.log("Introducer selected for policy is:"+introducerxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Introducer's commission
		WebElement introducercomm = driver.findElement(By.id("introducercomm"));
		introducercomm.clear();
		introducercomm.sendKeys(introducercommxl);
		System.out.println("Introducer's commission selected for policy is:"+introducercommxl);
		Reporter.log("Introducer's commission selected for policy is:"+introducercommxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Allocate to
		Select allocateto = new Select(driver.findElement(By.id("allocateto")));
		allocateto.selectByVisibleText(allocatetoxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//surplusbrokrlicense
		WebElement surplusbrokrlicense = driver.findElement(By.id("surplusbrokrlicense"));
		surplusbrokrlicense.sendKeys(surplusbrokrlicensexl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Leader 1
		WebElement leaderone = driver.findElement(By.id("leaderone"));
		leaderone.sendKeys(leaderonexl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		// Leader 2
		WebElement leadertwo = driver.findElement(By.id("leadertwo"));
		leadertwo.sendKeys(leadertwoxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Button  Next Cedant  Section
		WebElement associatesSubmitBtn = driver.findElement(By.id("associatesSubmitBtn"));
		associatesSubmitBtn.click();
		
		//Contact
		//Interest
		Select interest = new Select(driver.findElement(By.id("interest")));
		interest.selectByVisibleText(interestxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Method of Acceptance
		Select methodaccept = new Select(driver.findElement(By.name("methodaccept")));
		methodaccept.selectByVisibleText(methodacceptxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Country
		Select tercountry = new Select(driver.findElement(By.name("tercountry")));
		tercountry.selectByVisibleText(tercountryxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}	
		try
		{
		//Territory
		Select territory = new Select(driver.findElement(By.name("territory")));
		territory.selectByVisibleText(territoryxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}	
		try
		{
		//Limit Basis
		Select limitbasis = new Select(driver.findElement(By.name("limitbasis")));
		limitbasis.selectByVisibleText(limitbasisxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//3 year loss ratio %
		WebElement threeyearlossratio = driver.findElement(By.name("threeyearlossratio"));
		threeyearlossratio.clear();
		threeyearlossratio.sendKeys(threeyearlossratioxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//Contract Basis
		Select cotractbasis = new Select(driver.findElement(By.name("cotractbasis")));
		cotractbasis.selectByVisibleText(cotractbasisxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{
		//US $ business
		Select ustrading = new Select(driver.findElement(By.name("ustrading")));
		ustrading.selectByVisibleText(ustradingxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{	//Filing state
		Select fillingstate = new Select(driver.findElement(By.name("fillingstate")));
		fillingstate.selectByVisibleText(fillingstatexl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}	
		try
		{      //US Classification
		Select usclassification = new Select(driver.findElement(By.name("usclassification")));
		usclassification.selectByVisibleText(usclassificationxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}try
	{
		//Cedant NAIC code
		WebElement cedantnaiccode = driver.findElement(By.name("cedantnaiccode"));
		cedantnaiccode.clear();
		cedantnaiccode.sendKeys(cedantnaiccodexl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}try
	{
		//Limit Currency
		Select limitcurrency = new Select(driver.findElement(By.name("limitcurrency")));
		limitcurrency.selectByVisibleText(limitcurrencyxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}try
	{
		//Excess Currency
		Select excesscurrency = new Select(driver.findElement(By.name("excesscurrency")));
		excesscurrency.selectByVisibleText(excesscurrencyxl);
}
catch(Exception e)
{
	e.printStackTrace();
	
}try
{
		//Payment Currency
		Select paymentcurrency = new Select(driver.findElement(By.name("paymentcurrency")));
		paymentcurrency.selectByVisibleText(paymentcurrencyxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}try
	{
		//Settlement Currency
		Select settlementcurrency = new Select(driver.findElement(By.name("settlementcurrency")));
		settlementcurrency.selectByVisibleText(settlementcurrencyxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		//Button  Next Cedant  Section
		WebElement btncontractSubmit = driver.findElement(By.id("contractSubmitBtn"));
		btncontractSubmit.click();
		try
		{	
		// Line & Limit
		WebElement writtenorder = driver.findElement(By.name("writtenorder"));
		writtenorder.clear();
		writtenorder.sendKeys(writtenorderxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}	
		try
		{	
		//Written Line %
		WebElement writtenline = driver.findElement(By.name("writtenline"));
		writtenline.clear();
		writtenline.sendKeys(writtenlinexl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{//Of 
		Select writtenlineOption = new Select(driver.findElement(By.name("writtenlineOption")));
		writtenlineOption.selectByVisibleText(writtenlineOptionxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		try
		{	//Estimated Signing %
		WebElement estimatedsinging = driver.findElement(By.name("estimatedsinging"));
		estimatedsinging.clear();
		estimatedsinging.sendKeys(estimatedsingingxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}try
	{
		//Signed Order %
		WebElement signedorder = driver.findElement(By.name("signedorder"));
		signedorder.clear();
		signedorder.sendKeys(signedorderxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}try
	{
		//Signed Line %
		WebElement llsignedLine = driver.findElement(By.name("llsignedLine"));
		llsignedLine.clear();
		llsignedLine.sendKeys(llsignedLinexl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	try
	{	//Of 
		Select signedlineOption = new Select(driver.findElement(By.name("signedlineOption")));
		signedlineOption.selectByVisibleText(signedlineOptionxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	try
	{//Profit commission on contract?
		Select profitcommission = new Select(driver.findElement(By.name("profitcommission")));
		profitcommission.selectByVisibleText(profitcommissionxl);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		
		//First calculation date
		// Date2 
	try
	{
				WebElement date2 = driver.findElement(By.xpath("//*[@id='lineandlimitFrm']/div[2]/div[4]/div/div/a/img"));
				date2.click();
				driver.switchTo().frame(0);
				List<WebElement> allDates2=driver.findElements(By.xpath("//table[@id='outerTable']//td"));
				
				for(WebElement ele:allDates2)
				{
					
					String date1=ele.getText();
					
					if(date1.equalsIgnoreCase(date2xl))
					{
						ele.click();
						break;
					}
					
				}
				
				driver.switchTo().defaultContent();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
		
				//Button  Next Cedant  Section
				
				WebElement btnlineandlimitSubmit = driver.findElement(By.id("lineandlimitSubmitBtn"));
				btnlineandlimitSubmit.click();
				
				Actions builder = new Actions(driver);
				//Risk Summary
				try
				{			
				//Policy limit
				Thread.sleep(2000);
				WebElement policylimitOrg = driver.findElement(By.name("policylimitOrg"));
				
                builder.moveToElement(policylimitOrg).doubleClick().sendKeys(policylimitOrgxl).build().perform();
            }
        	catch(Exception e)
        	{
        		e.printStackTrace();
        		
        	}
				try
				{          	
				//Sum insured
				WebElement sumInsuredOrg = driver.findElement(By.name("sumInsuredOrg"));
				builder.moveToElement(sumInsuredOrg).doubleClick().sendKeys(sumInsuredOrgxl).build().perform();
				//sumInsuredOrg.clear();
				//sumInsuredOrg.sendKeys(sumInsuredOrgxl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{		
				//Shipment any one location limit
				WebElement shipmentOrg = driver.findElement(By.name("shipmentOrg"));
				shipmentOrg.clear();
				shipmentOrg.sendKeys(shipmentOrgxl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{		//Acquisition clause limit
				WebElement acquisitionOrg = driver.findElement(By.name("acquisitionOrg"));
				acquisitionOrg.clear();
				builder.moveToElement(acquisitionOrg).doubleClick().sendKeys(acquisitionOrgxl).build().perform();
				//acquisitionOrg.sendKeys(acquisitionOrgxl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{		//Deductible
				WebElement deductibleOrg = driver.findElement(By.name("deductibleOrg"));
				deductibleOrg.clear();
				deductibleOrg.sendKeys(deductibleOrgxl);
			    }
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{		//Excess
				WebElement excessOrg = driver.findElement(By.name("excessOrg"));
				excessOrg.clear();
				excessOrg.sendKeys(excessOrgxl);
		     	}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{			//GPI Limit
				WebElement gpilimtOrg = driver.findElement(By.name("gpilimtOrg"));
				gpilimtOrg.clear();
				gpilimtOrg.sendKeys(gpilimtOrgxl);
		     	}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{			//Turnover
				WebElement turnoverOrg = driver.findElement(By.name("turnoverOrg"));
				turnoverOrg.clear();
				turnoverOrg.sendKeys(turnoverOrgxl);
			    }
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{			// Written Exposure (including order factor)
				String wexp=driver.findElement(By.id("writtenexposure")).getAttribute("value");
				System.out.println("Written Exposure of the policy is:"+wexp);
				Reporter.log("Written Exposure of the policy is:"+wexp);
		    	}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{		// Signed Exposure
				String sexp=driver.findElement(By.id("signedexposure")).getAttribute("value");
				System.out.println("Signed Exposure of the policy is:"+sexp);
				Reporter.log("Signed Exposure of the policy is:"+sexp);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				
				try
				{			//Add Location
				
				WebElement btnaddLocation = driver.findElement(By.id("addLocationBtn"));
				btnaddLocation.click();
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{		
				WebElement btnriskLocationSave = driver.findElement(By.xpath("//*[@id='riskLocationSaveBtn']"));
				btnriskLocationSave.click();
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}	try
			{		
				WebElement btnaddtype = driver.findElement(By.xpath("//button[text()='Add Type']"));
				btnaddtype.click();
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,800)", "");
				try
				{	
				//Type 1
				Select type12 = new Select(driver.findElement(By.xpath("//select[starts-with(@name,'marineRsLocType_')]")));
				type12.selectByVisibleText(type1xl);
				System.out.println("Property Type selected for policy is:"+type1xl);
				Reporter.log("Property Type selected for policy is:"+type1xl);
			    }
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				
				try
				{		//Limit currency
				Select currency = new Select(driver.findElement(By.xpath("//select[starts-with(@name,'marineRsLimtCurncy_')]")));
				currency.selectByVisibleText(lcxl);
				System.out.println("Limit currency selected for policy is:"+lcxl);
				Reporter.log("Limit currency selected for policy is:"+lcxl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{	//100% limit
				WebElement limit = driver.findElement(By.xpath("//input[starts-with(@name, 'marineRsHdPrLimit_')]"));
				limit.clear();
				limit.sendKeys(limitxl);
				System.out.println("100% limit selected for policy is:"+limitxl);
				Reporter.log("100% limit selected for policy is:"+limitxl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{		//Excess currency
				Select currency2 = new Select(driver.findElement(By.xpath("//select[starts-with(@name,'marineRsExcsCurncy_')]")));
				currency2.selectByVisibleText(excurrxl);
				System.out.println("Excess currency selected for policy is:"+excurrxl);
				Reporter.log("Excess currency selected for policy is:"+excurrxl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{		//100% Excess
				WebElement excess = driver.findElement(By.xpath("//input[starts-with(@name, 'marineRsHdPrExcess_')]"));
				excess.clear();
				excess.sendKeys(Hundredxl);
		      	}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{		Select currency3 = new Select(driver.findElement(By.xpath("//select[starts-with(@name,'marineRsSiCurncy_')]")));
				currency3.selectByVisibleText(suminsuxl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{		WebElement amount = driver.findElement(By.xpath("//input[starts-with(@name,'marineRsHpSumInsrd_')]"));
				amount.clear();
				amount.sendKeys(Hunsuminsuxl);
				Thread.sleep(1000);
				JavascriptExecutor jse2 = (JavascriptExecutor)driver;
				jse2.executeScript("window.scrollBy(300,0)");
				System.out.println("100% sum insured selected for policy is:"+Hunsuminsuxl);
				Reporter.log("100% sum insured selected for policy is:"+Hunsuminsuxl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{			WebElement techrate = driver.findElement(By.xpath("//input[starts-with(@name,'marineRsTechRate_')]"));
				techrate.clear();
				techrate.sendKeys(techxl);
				System.out.println("Technical rate selected for policy is:"+techxl);
				Reporter.log("Technical rate selected for policy is:"+techxl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{		WebElement discount = driver.findElement(By.xpath("//input[starts-with(@name,'marineRsDisApp_')]"));
				discount.clear();
				discount.sendKeys(discxl);
				System.out.println("Discount applied  selected for policy is:"+discxl);
				Reporter.log("Discount applied  selected for policy is:"+discxl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{			//Select payment currency
				Select paycurr = new Select(driver.findElement(By.xpath("//select[starts-with(@name,'marineRsPymntCurncy_')]")));
				paycurr.selectByVisibleText(paycurrxl);
				System.out.println("payment currency selected for policy is:"+paycurrxl);
				Reporter.log("payment currency selected for policy is:"+paycurrxl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{		//Roe (sum insured to payment currency)
				WebElement roepc = driver.findElement(By.xpath("//input[starts-with(@name,'marineRsRoeSitopc')]"));
				roepc.clear();
				roepc.sendKeys(roepcxl);
				System.out.println("Roe (sum insured to payment currency) selected for policy is:"+roepcxl);
				Reporter.log("Roe (sum insured to payment currency) selected for policy is:"+roepcxl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				// Gross premium 100% Payable by insured
				try
				{		
				WebElement grosspaybyinsuredpath = driver.findElement(By.xpath("//input[starts-with(@name,'marineRsGrossPremPbi_')]"));
String grosspaybyinsured= ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",grosspaybyinsuredpath).toString();
			System.out.println("Gross premium 100% Payable by insured of the policy is:"+grosspaybyinsured);
				Reporter.log("Gross premium 100% Payable by insured of the policy is:"+grosspaybyinsured);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{			// select settlement currency
				Select settlecurr = new Select(driver.findElement(By.xpath("//select[starts-with(@name,'marineRsStlmntShowCurncy_')]")));
				settlecurr.selectByVisibleText(settcurrxl);		
				System.out.println("settlement currency selected for policy is:"+settcurrxl);
				Reporter.log("settlement currency selected for policy is:"+settcurrxl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{		//Roe (Roe (payment to settlement currency))
				WebElement roeps = driver.findElement(By.xpath("//input[starts-with(@name,'marineRsRoePtosc_')]"));
				roeps.clear();
				roeps.sendKeys(roepsxl);
				System.out.println("Roe (payment to settlement currency)) selected for policy is:"+roepsxl);
				Reporter.log("Roe (payment to settlement currency)) selected for policy is:"+roepsxl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				// Gross Premium 100% in settlement currency
				try
				{		
				WebElement grosspremiumpath = driver.findElement(By.xpath("//input[starts-with(@name,'marineRsGrossPremHpisc_')]"));
				String grosspremium= ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",grosspremiumpath).toString();
			System.out.println("Gross Premium 100% in settlement currency is:"+grosspremium);
			Reporter.log("Gross Premium 100% in settlement currency is:"+grosspremium);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
				// protect share 
				try
				{		
			WebElement protectsharepath = driver.findElement(By.xpath("//input[starts-with(@name,'marineRsProtShre_')]"));
			String protectshare= ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",protectsharepath).toString();
		System.out.println("Protect Share of the policy is:"+protectshare);
		Reporter.log("Protect Share of the policy is:"+protectshare);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	// Gross premium Protect share		
				try
				{			
		WebElement grossprotectsharepath = driver.findElement(By.xpath("//input[starts-with(@name,'marineRsGpProtShre_')]"));
		String grossprotectshare= ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",grossprotectsharepath).toString();
	System.out.println("Gross premium Protect Share of the policy is:"+grossprotectshare);
	Reporter.log("Gross premium Protect Share of the policy is:"+grossprotectshare);			
}
catch(Exception e)
{
	e.printStackTrace();
	
}	
				try
				{				//Select Tax country
	Select taxcountry = new Select(driver.findElement(By.xpath("//select[starts-with(@name,'marineRsTaxCountry_')]")));
	taxcountry.selectByVisibleText(taxcountryxl);	
   WebElement taxcountrytext1=taxcountry.getFirstSelectedOption();
   String taxcountrytext= taxcountrytext1.getText();
		System.out.println("Tax country of the policy is:"+taxcountrytext);
		Reporter.log("Tax country of the policy is:"+taxcountrytext);			
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}		
				try
				{		//Select Tax territory
		Select taxterritory = new Select(driver.findElement(By.xpath("//select[starts-with(@name,'marineRsTaxTerritory_')]")));
		taxterritory.selectByVisibleText(taxterritoryxl);
		WebElement taxterritorytext1=taxterritory.getFirstSelectedOption();
		String taxterritorytext= taxterritorytext1.getText();
			System.out.println("Tax country of the policy is:"+taxterritorytext);
			Reporter.log("Tax country of the policy is:"+taxterritorytext);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
				try
				{		//Select Tax type
			Select taxtypepath = new Select(driver.findElement(By.xpath("//select[starts-with(@name,'marineRsTaxType_')]")));
			taxtypepath.selectByVisibleText(taxtypexl);	
			WebElement taxtypetext1=taxtypepath.getFirstSelectedOption();
			String taxtypetext= taxtypetext1.getText();
				System.out.println("Tax type of the policy is:"+taxtypetext);
				Reporter.log("Tax type of the policy is:"+taxtypetext);	
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}		
				try
				{		//Select Tax payable by
				Select taxpaybypath = new Select(driver.findElement(By.xpath("//select[starts-with(@name,'marineRsTaxBasis_')]")));
				taxpaybypath.selectByVisibleText(taxpaybyxl);	
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}	
					/*System.out.println("Tax payable by:"+taxpayby);
			Reporter.log("Tax payable by:"+taxpayby);	*/
				try
				{			
					//Select Tax Administered by
					Select taxadminpath = new Select(driver.findElement(By.xpath("//select[starts-with(@name,'marineRsTaxAdminBy_')]")));
					taxadminpath.selectByVisibleText(taxadminxl);	
						//String taxadmin= driver.findElement(By.xpath("//select[starts-with(@name,'marineRsTaxAdminBy_')]")).getAttribute("value");	
						System.out.println("Tax Administered by:"+taxadminxl);
						Reporter.log("Tax Administered by:"+taxadminxl);			
					}
					catch(Exception e)
					{
						e.printStackTrace();
						
					}	
						// Tax rate 
				try
				{			
						WebElement taxratepath = driver.findElement(By.xpath("//input[starts-with(@name,'marineRsTaxRate_')]"));
						taxratepath.clear();
						taxratepath.sendKeys(taxratexl);
					System.out.println("Tax rate of the policy is:"+taxratexl);
					Reporter.log("Tax rate of the policy is:"+taxratexl);
				}
				catch(Exception e)
				{
					e.printStackTrace();
					
				}				
				try
				{	//Additional fixed tax amount
					WebElement taxamountpath = driver.findElement(By.xpath("//input[starts-with(@name,'marineRsAddiFixdTaxAmount_')]"));
					
					Actions builder2 = new Actions(driver);
	                builder2.moveToElement(taxamountpath).doubleClick().sendKeys(taxamountxl).build().perform();
	                
					System.out.println("Additional fixed tax amount:"+taxamountxl);
					Reporter.log("Additional fixed tax amount:"+taxamountxl);
				}
				catch(Exception e)
				{
					e.printStackTrace();
					
				}			
					//Total Tax Amount	
				try
				{			
WebElement totaltaxpath = driver.findElement(By.xpath("//input[starts-with(@name,'marineRsTaxAmount_')]"));
String totaltax= ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",totaltaxpath).toString();
System.out.println("Total Tax Amount of the policy is:"+totaltax);
Reporter.log("Total Tax Amount of the policy is:"+totaltax);
}
catch(Exception e)
{
	e.printStackTrace();
	
}				
				/*Select currency = new Select(driver.findElement(By.className("medium valid")));
				currency.selectByVisibleText("Euro");
				
				//100 % Limit
				WebElement limit1 = driver.findElement(By.xpath("//*[@id='marineRsHdPrLimit_208_313']"));
				limit1.sendKeys("80");
				
				//Excess currency
				
				Select ecurrency = new Select(driver.findElement(By.name("marineRsExcsCurncy_208_313")));
				ecurrency.selectByVisibleText("US Dollar ");
				*/
				//100% Excess
				
				
				try
				{		
		
				//Button  Next Cedant  Section
				WebElement btnrisksummarySubmit = driver.findElement(By.id("risksummarySubmitBtn"));
				btnrisksummarySubmit.click();
				Thread.sleep(3000);
				//Premiums
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}	
				try
				{		//Premium Wty
				Select permwty = new Select(driver.findElement(By.name("permwty")));
				permwty.selectByVisibleText(permwtyxl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{		//Terms of trade
				WebElement termoftrade = driver.findElement(By.name("termoftrade"));
				termoftrade.clear();
				termoftrade.sendKeys(termoftradexl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				//Premium warranty date
				/*
				//Date 3 Excel
				WebElement date3 = driver.findElement(By.xpath("//*[@id='premiumsFrm']/div[2]/div[1]/div/div/a/img"));
				date3.click();
				driver.switchTo().frame(0);
				List<WebElement> allDates3=driver.findElements(By.xpath("//table[@id='outerTable']//td"));
				
				for(WebElement ele:allDates3)
				{
					
					String date4=ele.getText();
					
					if(date4.equalsIgnoreCase(date3xl))
					{
						ele.click();
						break;
					}
					
				}
				
				driver.switchTo().defaultContent();
				*/
				
				// From
				try
				{
				Select permfrom = new Select(driver.findElement(By.name("permfrom")));
				permfrom.selectByVisibleText(permfromxl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				//Risk Code Split
				try
				{	
				WebElement premsrcsplit12 = driver.findElement(By.name("premsrcsplit12"));
				premsrcsplit12.clear();
				premsrcsplit12.sendKeys(premsrcsplit12xl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{
				// V
				WebElement premsrcsplit9 = driver.findElement(By.name("premsrcsplit9"));
				premsrcsplit9.clear();
				premsrcsplit9.sendKeys(premsrcsplit9xl);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				// General Specie
				//8T
				try
				{
				WebElement premsrcsplit4 = driver.findElement(By.name("premsrcsplit4"));
				premsrcsplit4.clear();
				premsrcsplit4.sendKeys(premsrcsplit4xl);
		 	    }
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				//GS
				try
				{
				WebElement premsrcsplit3 = driver.findElement(By.name("premsrcsplit3"));
				premsrcsplit3.clear();
				premsrcsplit3.sendKeys(premsrcsplit3xl);
			    }
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				try
				{//Premiums section Next Button
				WebElement btnpremiumsSubmit = driver.findElement(By.id("premiumsSubmitBtn"));
				btnpremiumsSubmit.click();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
				
				//Premiums Summery section  Next Button
				WebElement btnpremsummSubmit = driver.findElement(By.id("premsummSubmitBtn"));
				btnpremsummSubmit.click();
				Thread.sleep(7000);
				
				// Bind Button Click
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;
				jse1.executeScript("window.scrollBy(0,-800)", "");
				
				Thread.sleep(5000);
				WebElement btnbind = driver.findElement(By.xpath("//*[@id='bindBtn']"));
				btnbind.click();
				
				// Click Signin Button for Bind The Policy.
				Thread.sleep(6000);
				WebElement btnsign = driver.findElement(By.xpath("//button[@id='signBtn']"));
				btnsign.click();
								
				
	}
	
	
	
}


