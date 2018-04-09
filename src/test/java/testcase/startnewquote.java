package testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import settings.login;

public class startnewquote extends login {
	
	
	public WebDriver driver;
	
    @BeforeClass    
    public void login() {
    
	  driver=getdriver();
	
    }

   
    
    
  @Test(priority=1)
  public void testprivateclient() throws InterruptedException
  
  {
	  
	    WebElement a = driver.findElement(By.linkText("Protect"));
		a.click();
		
		
		// Now click Start New Quote button
	
		WebElement b = driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[2]/div/ul/li[3]/a"));
		b.click();	
		
		// Now click private button
		
		WebElement private1 = driver.findElement(By.xpath("//*[@id=\"quoteBuySubMenu\"]/li[1]/a"));
		private1.click();
		
		//  choose currency
		
		Select currency= new Select(driver.findElement(By.id("currency")));
		currency.selectByVisibleText("USD ($)");
		
		// choose broker
		
		Select broker= new Select(driver.findElement(By.id("broker")));
		broker.selectByVisibleText("Protect Direct");
		
		//choose policy start date
		
		driver.findElement(By.xpath("//*[@id=\"generalInformationFrm\"]/div[6]/div/div/a")).click();
		driver.switchTo().frame(0);
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@id='outerTable']//td"));
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("28"))
			{
				ele.click();
				break;
			}
			
		}
		
		driver.switchTo().defaultContent();
		List<WebElement> radiocount=driver.findElements(By.name("policyholderType"));
		
		for(WebElement ele2:radiocount)
		{
			
			String date2=ele2.getAttribute("value");
			System.out.println(date2);
			
			if(date2.equalsIgnoreCase("s"))
			{
				ele2.click();
				break;
			}
			
		}
	  
	  
		//select a introducer
		Select introducer1= new Select(driver.findElement(By.xpath("//*[@id=\"introducer_list\"]")));
		introducer1.selectByVisibleText("TLC Estate Agents");
		
		// click on div
		driver.findElement(By.xpath("//*[@id=\"firstToggle\"]")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		
		//*[@id="title"]
		
		Select title= new Select(driver.findElement(By.xpath("//*[@id=\"title\"]")));
		title.selectByVisibleText("Mr");
		
		
		// send forename
		driver.findElement(By.xpath("//*[@id=\"forename\"]")).sendKeys("Swarnendu");
		 // send surname
		driver.findElement(By.xpath("//*[@id=\"surname\"]")).sendKeys("Ray");
		//click sanctin check button
		driver.findElement(By.xpath("//*[@id=\"firstToggle\"]")).click();
		
		/*WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("//*[@id=\\\"mobile\\\"]")));
		*/
		Thread.sleep(3000);
		
	driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("1234567890");
		
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sourav@yopmail.com");
	jse.executeScript("window.scrollBy(0,300)", "");
	Select gender= new Select(driver.findElement(By.xpath("//*[@id=\"gender\"]")));
	gender.selectByVisibleText("Male");	
		// select country
	Select country= new Select(driver.findElement(By.xpath("//*[@id=\"country_id\"]")));
	country.selectByVisibleText("UNITED KINGDOM");		
	Thread.sleep(2000);
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"post_code\"]")));
	
	//send zipcode
	driver.findElement(By.xpath("//*[@id=\"post_code\"]")).sendKeys("ST74PH");
	driver.findElement(By.xpath("//*[@id=\"post_codeP\"]")).click();
	Thread.sleep(1500);
	
	Select address= new Select(driver.findElement(By.xpath("//*[@id=\"drpAddress\"]")));
	address.selectByVisibleText("5 Derwent Crescent, Kidsgrove, Stoke-On-Trent");
	Thread.sleep(1000);
	// select marrital status
	Select marrital= new Select(driver.findElement(By.xpath("//*[@id=\"marital_status\"]")));
	marrital.selectByVisibleText("Married");
	// send Date of Birth
	driver.findElement(By.xpath("//*[@id=\"date_of_birth\"]")).sendKeys("15/08/1990");
	// select employment status
	Select empstatus= new Select(driver.findElement(By.xpath("//*[@id=\"employment_status\"]")));
	empstatus.selectByVisibleText("Employed");
	jse.executeScript("window.scrollBy(0,300)", "");
	/*Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"firstToggle\"]")).click();
	*/
	      // click Next Button
	driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();
	
	                                   // 2nd page begins
	Thread.sleep(1000);
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"curinsurer\"]")));
	Select currentinsurer= new Select(driver.findElement(By.xpath("//*[@id=\"curinsurer\"]")));
	currentinsurer.selectByVisibleText("Aviva");
	
	// send Expiring Premium
		driver.findElement(By.xpath("//*[@id=\"expiringPremium\"]")).sendKeys("10000");
	
   // send Target Premium
		driver.findElement(By.xpath("//*[@id=\"targetPremium\"]")).sendKeys("8000");
	// Select Target insurer
		Select targetinsurer= new Select(driver.findElement(By.xpath("//*[@id=\"targetInsurer\"]")));
		targetinsurer.selectByVisibleText("AIG");
	
		// click Next Button
		driver.findElement(By.xpath("//*[@id=\"btnExistPolicy\"]")).click();
		
		
		                                        //3rd page 
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\'quoteType2\\']")));
/*List<WebElement> radiocount1=driver.findElements(By.className("input-group"));
		
		for(WebElement ele3:radiocount1)
		{
			
			String date3=ele3.getAttribute("value");
			System.out.println(date3);
			
			if(date3.equalsIgnoreCase("B"))
			{
				ele3.click();
				break;
			}
			
		}
		*/
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'quoteType2\']")).click();
		// Select property type
		Select propertytype= new Select(driver.findElement(By.xpath("//*[@id=\"propertyTypes\"]")));
		propertytype.selectByVisibleText("Bungalow - semi-detached");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"subsidence1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"subsidenceFreetext\"]")).sendKeys("Home never suffered any damage");
		
		//jse.executeScript("window.scrollBy(0,200)", "");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\'propertyInformationFrm\']/fieldset[2]/legend")).click();
		// select client residence 
		Select residence= new Select(driver.findElement(By.xpath("//*[@id=\"mainResidence\"]")));
		residence.selectByVisibleText("Main UK residence");
		Thread.sleep(1000);
		// select home outbuilings 
				Select outbuilding= new Select(driver.findElement(By.xpath("//*[@id=\"familyOccupied\"]")));
				outbuilding.selectByVisibleText("Family and domestic employees");
				// select professional purpose
				Select purpose= new Select(driver.findElement(By.xpath("//*[@id=\"businessUse\"]")));
				purpose.selectByVisibleText("Admin only, no visitors");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"propertyInformationFrm\"]/fieldset[3]/legend")).click();
		
				// select intruder alarm
				Select alarm= new Select(driver.findElement(By.xpath("//*[@id=\"intruderAlarm\"]")));
				alarm.selectByVisibleText("Remote monitoring (ARC)");
				Thread.sleep(1000);
				// select fire alarm
				Select alarm2= new Select(driver.findElement(By.xpath("//*[@id=\"fireAlarm\"]")));
				alarm2.selectByVisibleText("Integrated with intruder alarm");
		       //Does your property have a safe?
				driver.findElement(By.xpath("//*[@id=\"haveSafe2\"]")).click();
				//click on building sum insured tab
				driver.findElement(By.xpath("//*[@id=\"offBuildingOnlyDiv\"]/fieldset/legend")).click();
		        // send Buildings data
				driver.findElement(By.xpath("//*[@id=\"mainhouse\"]")).sendKeys("100000");
				Thread.sleep(1000);
				// send Outbuildings data
				driver.findElement(By.xpath("//*[@id=\"outbuildings\"]")).sendKeys("200000");
				
				//click on Fine Art tab
				driver.findElement(By.xpath("//*[@id=\"fineArtOnlyDiv\"]/fieldset/legend")).click();
				// send Fine art - unspecified data
				driver.findElement(By.xpath("//*[@id=\"unspecified_FAUS\"]")).sendKeys("300000");
				Thread.sleep(1000);
				//click on Add Item tab
				driver.findElement(By.xpath("//*[@id=\"fineArtOnlyDiv\"]/fieldset/div/div[2]/label/a")).click();
				//send the name of item 1
				driver.findElement(By.xpath("//*[@id=\"descriptionFAUS_100\"]")).sendKeys("Item1");
				Thread.sleep(1000);
				// send the price of item
				driver.findElement(By.xpath("//*[@id=\"amountFAUS_100\"]")).sendKeys("300000");
				// click the Next button
				driver.findElement(By.xpath("//*[@id=\"btnPropInfo\"]")).click();
				                       // 4th page select the property 
				
				Thread.sleep(6000);
				//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[starts-with(@name,'propertySelect_')]")));
				driver.findElement(By.xpath("//input[starts-with(@name,'propertySelect_')]")).click();
				
				// scroll to payment tab
				WebElement  tapback=driver.findElement(By.xpath("//*[@id=\'submitBtn\']"));
				JavascriptExecutor jsScroll=  (JavascriptExecutor)driver;
				jsScroll.executeScript("arguments[0].scrollIntoView(true);", tapback);
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\'submitBtn\']")).click();
				
				//paymentSelection page
				
				// select a payment method
				
				Thread.sleep(8000);
				//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\'Annually_payMethod_1\\']")));
				driver.findElement(By.xpath("//*[@id=\'Annually_payMethod_1\']")).click();
				// click confirm payment type
				driver.findElement(By.xpath("//*[@id=\'Bind\']")).click();
				Thread.sleep(8000);
				// send mail id \
				driver.findElement(By.xpath("//*[@id=\'toMailId\']")).clear();
				driver.findElement(By.xpath("//*[@id=\'toMailId\']")).sendKeys("ranit.ray@indusnet.co.in");
				// Click Bind and Send policy Schedule
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\'sendPolicyMailBtn\']")).click();
				
				
				//*[@id="Propertytabs"]/ul/li/a/input
				
				
				
				
				
				
	  
  }

  
  
  
  
  
  
  
  
  
  
}
