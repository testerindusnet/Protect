package testcase;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import settings.TestUtil;
import settings.login;

public class Pdftesting extends login {
public WebDriver driver;
SoftAssert s = new SoftAssert();

@BeforeClass    
public void login()
{

  driver=getdriver();

}

@DataProvider(name="gettestdata")
public Iterator<Object[]> gettestdata(){
	
	ArrayList<Object[]> testdata=TestUtil.getdatafromexcel2();
	return testdata.iterator();
                                      }
	@Test(dataProvider="gettestdata",priority=1)
public void test(String currency,String broker,String brokeruser,String startdt,String type,String selection,
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

		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

	    		                // Now click Quote Record button
		WebElement quoterecbutton = driver.findElement(By.xpath("//div[@class='page-sidebar navbar-collapse collapse']/ul/li[5]/a"));
		quoterecbutton.click();
		//Thread.sleep(3000);
		WebElement Favlink=driver.findElement(By.xpath("//ul[@id='quoteMenu' and @style='overflow: hidden; display: block;']//child::li//child::a[text()=' FAV (Consumer)']"));
		Favlink.click();
		// Now send policy number in search textbox   
		
		//WebElement policysearch = driver.findElement(By.xpath("//*[@id=\"gs_policy_number\"]"));
		
		WebElement policysearch = driver.findElement(By.xpath("//*[@id=\"gs_ref_no\"]"));
		policysearch.clear();
		policysearch.sendKeys(pno);
		Thread.sleep(1000);
		policysearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String policyname= ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",policysearch).toString();
		System.out.println(" Policy number sent in Policy Searchbox is: "+policyname);
		// Now click policy 
		try
		{
			WebElement policyclick = driver.findElement(By.xpath("//*[@id=\"1206\"]/td[5]"));
			policyclick.click();	
			
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		WebElement  rate=driver.findElement(By.xpath("//*[@id=\"Propertytab0\"]/div/table/tbody/tr[3]/td[4]/input"));
		rate.clear();
		rate.sendKeys("5");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"reCalculateBtn\"]")).click();
		Thread.sleep(5000);
		
		// scroll to quote doc tab
			try {
			WebElement  tapback=driver.findElement(By.xpath("//*[@id=\"saveQtBtn\"]"));
			JavascriptExecutor jsScroll=  (JavascriptExecutor)driver;
			jsScroll.executeScript("arguments[0].scrollIntoView(true);", tapback);
		        }

		catch(Exception e)
		  {
			e.printStackTrace();
		  }
			WebElement QuoteDoc = driver.findElement(By.xpath("//*[@id=\"saveQtBtn\"]"));
			QuoteDoc.click();
			Thread.sleep(2000);
			// send receiver mail id in textbox
						WebElement receiver1 = driver.findElement(By.xpath("//*[@id=\"toMailId\"]"));
						receiver1.clear();
						receiver1.sendKeys(To);
						
			driver.findElement(By.xpath("//*[@id=\"viewQuotationDetails\"]/table/tbody/tr[7]/td/a[2]/u")).click();
			//Thread.sleep(7000);
			Readpdf(currency,broker,brokeruser,startdt,type,selection,introducer,fname,lname,mobile,email,gender,country,postcode,dropdown,marritals,
	        		dob,emplstatus,Currentinsurer,Policyexpiry,Expiringprem,Targetpremium,Targetinsurer,propertyType,
	        		mainresidence,outbuildings,purposes,Buildings1,transit,limit,Contenspecified,Description1,amount1,Valuablesunspecified,
	        		Description2,amount2,Fineartunspecified,locrate,transitrate,contentrate,fineartrate,valuablesrate,To,pno);
			WebDriverWait wait=new WebDriverWait(driver,30);
		   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sendQuotationMail\"]")));
			
		 
			// click Send Mail Tab
						try {
						WebElement  sendmailbutton1=driver.findElement(By.xpath("//*[@id=\"sendQuotationMail\"]"));
						JavascriptExecutor jsScroll=  (JavascriptExecutor)driver;
						jsScroll.executeScript("arguments[0].scrollIntoView(true);", sendmailbutton1);
						sendmailbutton1.click();
					        }

					catch(Exception e)
					  {
						e.printStackTrace();
					  }
						
						// scroll to payment tab
						try {
						WebElement  payment=driver.findElement(By.name("submitBtn"));
						JavascriptExecutor jsScroll=  (JavascriptExecutor)driver;
						jsScroll.executeScript("arguments[0].scrollIntoView(true);", payment);
						payment.click();
					        }

					catch(Exception e)
					  {
						e.printStackTrace();
					  }
			
						
}
	
	
	public void Readpdf(String currency,String broker,String brokeruser,String startdt,String type,String selection,
	   		  String introducer,String fname,String lname,
	   		  String mobile,String email,String gender,String country,String postcode,String dropdown,String marritals,String dob,
	   		  String emplstatus,String Currentinsurer,String Policyexpiry ,String Expiringprem,
	   		  String Targetpremium,String Targetinsurer,
	   		  String propertyType,String mainresidence,String outbuildings,
	   		  String purposes,String Buildings1,String transit,String limit,
	   		  String Contenspecified,String Description1,String amount1,String Valuablesunspecified,String Description2,
	   		  String amount2,String Fineartunspecified,String locrate,String transitrate,String contentrate,
	   		String fineartrate,String valuablesrate,String To,String pno) throws IOException
	
	{
	
		ArrayList<String> w=new ArrayList(driver.getWindowHandles());
		System.out.println("Total number of tabs is "+w.size());
		driver.switchTo().window((w.get(1)));
		System.out.println(driver.getCurrentUrl());
		URL url = new URL(driver.getCurrentUrl());
        InputStream is = url.openStream();
        BufferedInputStream fileToParse = new BufferedInputStream(is);
        PDDocument document = null;
        String output;
        try {
            document = PDDocument.load(fileToParse);
            output = new PDFTextStripper().getText(document);
        } 
        finally {
        	
            if (document != null) {
                document.close();
            }
            fileToParse.close();
            is.close();
        }
        
       if( output.contains(fname))
       {
    	   
    	   System.out.println("Customer name in pdf matches with Excel - Test Passed");
       }
       else {
    	   
    	   System.out.println("Customer name in pdf does not matches with Excel - Test Failed");
       }
       
       if( output.contains(broker))
       {
    	   
    	   System.out.println("Broker name in pdf matches with Excel - Test Passed");
       }
       else {
    	   
    	   System.out.println("Broker name in pdf does not matches with Excel - Test Failed");
       }
       
       if( output.contains(dropdown))
       {
    	   
    	   System.out.println("Address in pdf matches with Excel - Test Passed");
    	   
       }
       else {
    	   
    	   System.out.println("Address in pdf does not matches with Excel - Test Failed");
    	   
       }
       
       if( output.contains(postcode))
       {
    	   
    	   System.out.println("Postcode in pdf matches with Excel - Test Passed");
    	   
       }
       else {
    	   
    	   System.out.println("Postcode in pdf does not matches with Excel - Test Failed");
    	   
       }
       
       if( output.contains(currency))
       {
    	   
    	   System.out.println("Currency in pdf matches with Excel - Test Passed");
    	   
       }
       else {
    	   
    	   System.out.println("Currency in pdf does not matches with Excel - Test Failed");
    	   
       }
       
       if( output.contains(Buildings1))
       {
    	   
    	   System.out.println("Building Amount in pdf matches with Excel - Test Passed");
    	   
       }
       else {
    	   
    	   System.out.println("Building Amount in pdf does not matches with Excel - Test Failed");
    	   
       }
       
       if( output.contains(transit))
       {
    	   
    	   System.out.println("In Transit Amount in pdf matches with Excel - Test Passed");
    	   
       }
       else {
    	   
    	   System.out.println("In Transit Amount in pdf does not matches with Excel - Test Failed");
    	   
       }
       
       if( output.contains("Protect Underwriting LLP issues this cover 100% under authority granted by certain Underwriters at Lloyd’s, being NAV 1221\r\n" + 
       		"25%; ASP 4711 14.01274%; APOLLO 9975 11.21019%; CHN 2015 8.75796%; AUW 609 7.00637%; MKL 3000 7.00637%;\r\n" + 
       		"PEM 4000 20%; TSS 1884 7.00637%. Lloyd’s unique market reference B1182PUL2017001."))
       {
    	   
    	   System.out.println("Protect Underwriting LLP  in pdf Matched - Test Passed");
    	   
       }
       else {
    	   
    	   System.out.println("Protect Underwriting LLP  in pdf does not matches - Test Failed");
    	   
       }
       
       if( output.contains("Your intermediary has told us of the facts below. This cover is provided to you on the basis of the facts below, the sums\r\n" + 
       		"insured shown, together with any supplementary questionnaire and additional information that you have provided to us at any\r\n" + 
       		"time in the past. These are the facts which we rely upon in deciding whether to provide you with insurance, and if so, for what\r\n" + 
       		"premium and what terms"))
       {
    	   
    	   System.out.println("intermediary text in pdf matches with Excel - Test Passed");
    	   
       }
       else {
    	   
    	   System.out.println("intermediary text in pdf does not matches with Excel - Test Failed");
    	   
       }
       
       if( output.contains("Valuables includes jewellery, gemstones, precious metals, watches, furs, guns, collectibles, wine, precious metals, cameras\r\n" + 
       		"and musical instruments."))
       {
    	   
    	   System.out.println("Valuables text in pdf matches with Excel - Test Passed");
    	   
       }
       else {
    	   
    	   System.out.println("Valuables text in pdf does not matches with Excel - Test Failed");
    	   
       }
       
       if( output.contains("Fine Art includes furniture, paintings, drawings, etchings, prints, photographs, tapestries, rugs, manuscripts, porcelain and\r\n" + 
       		"sculpture, stamps or coins forming part of a collection, gold, silver, gold and silver plated items, clocks and barometers."))
	       {
	    	   
	    	   System.out.println("Fine Art text in pdf matches with Excel - Test Passed");
	    	   
	       }
	       else {
	    	   
	    	   System.out.println("Fine Art text in pdf does not matches with Excel - Test Failed");
	    	   
	       }
       
       if( output.contains("The amount that you have agreed to pay for in the event of a claim unless a special excess may apply as per the clauses\r\n" + 
       		"section:"))
		       {
		    	   
		    	   System.out.println("The amount text in pdf matches with Excel - Test Passed");
		    	   
		       }
		       else {
		    	   
		    	   System.out.println("The amount text in pdf does not matches with Excel - Test Failed");
		    	   
		       }
       
       
       if( output.contains("If the facts are not all completely true and accurate, it is essential that you tell agent/ intermediary immediately. Failure to do\r\n" + 
       		"so could entitle us to avoid insurance or refuse to pay all or part of a claim. We reserve the right to alter the terms stated or\r\n" + 
       		"decline cover if you disclose revised information or the amended facts do not meet our acceptance criteria"))
			       {
			    	   
			    	   System.out.println("If the facts text in pdf matches with Excel - Test Passed");
			    	   
			       }
			       else {
			    	   
			    	   System.out.println("If the facts text in pdf does not matches with Excel - Test Failed");
			    	   
			       }
       
       if( output.contains("This quote is intended to provide broad and comprehensive insurance coverage for higher value Fine Art and Valuables. "))
				       {
				    	   
				    	   System.out.println("Demands and needs text in pdf matches with Excel - Test Passed");
				    	   
				       }
				       else {
				    	   
				    	   System.out.println("Demands and needs text in pdf does not matches with Excel - Test Failed");
				    	   
				       }
       if( output.contains("Please ensure that the sums insured stated in your quote schedule are adequate. If you feel your sums insured need to be\r\n" + 
       		"revised then please notify your agent/ intermediary immediately."))
       {
    	   
    	   System.out.println("Please ensure that the sums text in pdf matches with Excel - Test Passed");
    	   
       }
       else {
    	   
    	   System.out.println("Please ensure that the sums insured text in pdf does not matches with Excel - Test Failed");
    	   
       }     
       
       if( output.contains("You must notify your agent/ intermediary, of any changes which may affect this insurance. We reserve the right to\r\n" + 
       		"retrospectively amend any of the term and conditions of this insurance should you fail to notify us within 7 days of the change in\r\n" + 
       		"circumstance."))
	       {
	    	   
	    	   System.out.println("You must notify text in pdf matches with Excel - Test Passed");
	    	   
	       }
	       else {
	    	   
	    	   System.out.println("You must notify text in pdf does not matches with Excel - Test Failed");
	    	   
	       }  
       
       if( output.contains(pno))
       {
    	   
    	   System.out.println("Policy Number in pdf matches with excel - Test Passed");
       }
       else {
    	   
    	   System.out.println("Policy Number in pdf does not matches with Excel - Test Failed");
       }
       
       
       
//driver.close();
driver.switchTo().window(w.get(0));
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}