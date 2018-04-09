package testcase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import settings.TestUtil;
import settings.login;

public class ModifiedPrivateClientNewPolicy extends login {
	
	
public WebDriver driver;
	
    @BeforeClass    
    public void login()
    {
    
	  driver=getdriver();
	
    }
   
    @DataProvider(name="gettestdata")
	public Iterator<Object[]> gettestdata(){
		
		ArrayList<Object[]> testdata=TestUtil.getdatafromexcel4();
		return testdata.iterator();
	                                       }
	
	
	@Test(dataProvider="gettestdata",priority=1)
	 public void testClient(String currency,String broker,String brokeruser,String startdt,String type,String introducer,String title,
			 String fname,String lname,String mobile,String email,String gender,String country,
			 String postcode,String dropdown,String marritals,String dob,String emplstatus,String Currentinsurer,
			 String Policyexpiry,String Expiringprem,String Targetpremium,String Targetinsurer,String propertyType,
     		String mainresidence,String outbuildings,String purposes,String alarm,String Firealarm,String Buildings1,
     		String transit,String Tenant,String Contentunspecified,String Contenspecified,
     		String Description1,String amount1,String Valuablesunspecified,
     		String Description2,String amount2,String Fineartunspecified,String Description6,String amount6,String introcomm,String brokercomm,
     		String To,String pno) throws InterruptedException
    
    {
	
	
	
    
    
  
          	
            	 /* WebElement a = driver.findElement(By.linkText("Protect"));
          		a.click();*/
          		
          		
          		// Now click Start New Quote button
          	
          		WebElement b = driver.findElement(By.xpath("//*[@id='top']/div[1]/div[2]/div/ul/li[3]/a"));
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
          		if(!introducer.equals(""))
          		{
          		try {
          			WebElement introducerpath =driver.findElement(By.xpath("//*[@id=\"policy_start_date\"]"));
          		Select introducer1= new Select(driver.findElement(By.xpath("//*[@id=\"introducer_list\"]")));
          		introducer1.selectByVisibleText(introducer);
          		String introducerpath1= introducerpath.getText();
          		System.out.println("Introducer name sent from Excel is  "+introducer);
          		Reporter.log("Introducer name sent from Excel is  "+introducer);
          		    }
          		catch(Exception e)
          		    {
          			e.printStackTrace();
          		    }
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
          		           if(!title.equals(""))
          		           { 	   
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
          		
          		           }
          		// send forename
          		         if(!fname.equals(""))
        		           {
          		try {
          		driver.findElement(By.xpath("//*[@id=\"forename\"]")).sendKeys(fname);
          		System.out.println("PloicyHolder name sent from Excel is  "+fname);
          		Reporter.log("PloicyHolder name sent from Excel is  "+fname);
          		    }
          		
          		catch(Exception e)
      		    {
      			e.printStackTrace();
      		    }
        		           }
          		 // send surname
          		       if(!lname.equals(""))
      		           {
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
          		Thread.sleep(1000);
          		if(!mobile.equals(""))
		         {
          		try {
          	driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys(mobile);
          	System.out.println("PloicyHolder mobile number sent from Excel is  "+mobile);
          	Reporter.log("PloicyHolder mobile number sent from Excel is  "+mobile);
          		    }
          		catch(Exception e)
      		    {
      			e.printStackTrace();
      		    }
		         }
          		if(!email.equals(""))
		          {
          		try {
          	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
          	System.out.println("PloicyHolder email id sent from Excel is  "+email);
          	Reporter.log("PloicyHolder email id sent from Excel is  "+email);
          	        }
          		catch(Exception e)
      		    {
      			e.printStackTrace();
      		    }
		          }
          	jse.executeScript("window.scrollBy(0,300)", "");
          	if(!gender.equals(""))
	           {
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
          	
          	Thread.sleep(100);
          	if(!dropdown.equals(""))
	           {
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
	           }
          	Thread.sleep(1000);
          	// select marrital status
          	if(!marritals.equals(""))
	           {
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
	           }
          	// send Date of Birth
          	if(!dob.equals(""))
	           {
          	try {
          	driver.findElement(By.xpath("//*[@id=\"date_of_birth\"]")).sendKeys(dob);
          	System.out.println("PloicyHolder Date of Birth sent from Excel is  "+dob);
          	Reporter.log("PloicyHolder Date of Birth sent from Excel is  "+dob);
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
          	Reporter.log("PloicyHolder Employment Status sent from Excel is  "+emplstatus);
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
          	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"curinsurer\"]")));
          	if(!Currentinsurer.equals(""))
	           {
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
	           }
          	// send Expiring Premium
          	if(!Expiringprem.equals(""))
	           {
          	try {
          		driver.findElement(By.xpath("//*[@id='expiringPremium']")).sendKeys(Expiringprem);
          		System.out.println("PloicyHolder's Expiring Premium sent from Excel is  "+Expiringprem);
          		Reporter.log("PloicyHolder's Expiring Premium sent from Excel is  "+Expiringprem);
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
          		driver.findElement(By.xpath("//*[@id=\"targetPremium\"]")).sendKeys(Targetpremium);
          		System.out.println("PloicyHolder's Target Premium sent from Excel is  "+Targetpremium);
          		Reporter.log("PloicyHolder's Target Premium sent from Excel is  "+Targetpremium);
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
          		Reporter.log("PloicyHolder's Target Insurer sent from Excel is  "+Targetinsurer);
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
          		if(!Targetinsurer.equals(""))
 	           {
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
 	           }
          		Thread.sleep(1000);
          		try {
          		driver.findElement(By.xpath("//*[@id=\"subsidence1\"]")).click();
          	}

          	catch(Exception e)
          	  {
          		e.printStackTrace();
          	  }
          		/*try {
          		driver.findElement(By.xpath("//*[@id=\"subsidenceFreetext\"]")).sendKeys(landslip);
          		System.out.println("Has the home previously suffered any damage as a result of subsidence, landslip, heave, structural movement?  "+landslip);
          		Reporter.log("Has the home previously suffered any damage as a result of subsidence, landslip, heave, structural movement?  "+landslip);
          		}

          	catch(Exception e)
          	  {
          		e.printStackTrace();
          	  }*/
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
          				if(!Buildings1.equals(""))
         	           {
          				try {
          				driver.findElement(By.xpath("//*[@id=\"mainhouse\"]")).sendKeys(Buildings1);
          				System.out.println("Buildings Sum Assured amount    "+Buildings1);
          				Reporter.log("Buildings Sum Assured amount    "+Buildings1);
          			        }

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
         	           }
          				Thread.sleep(1000);
          				// send Outbuildings data
          				if(!transit.equals(""))
         	           {
          				try {
          				driver.findElement(By.xpath("//*[@id=\"outbuildings\"]")).sendKeys(transit);
          				System.out.println("Outbuildings Sum Assured amount     "+transit);
          				Reporter.log("Outbuildings Sum Assured amount     "+transit);
          			        }

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
         	           }
          			//click on Fine Art tab
          				
          				
          				
          				//click on Fine Art tab
          				try {
          				driver.findElement(By.xpath("//*[@id=\"fineArtOnlyDiv\"]/fieldset/legend")).click();
          			}

          			catch(Exception e)
          			  {
          				e.printStackTrace();
          			  }
          				// send Fine art - unspecified data
          				if(!Fineartunspecified.equals(""))
         	           {
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
         	           }
          				//click on Add Item tab
          				try {
          				driver.findElement(By.xpath("//*[@id=\"fineArtOnlyDiv\"]/fieldset/div/div[2]/label/a")).click();
                          	}

    			catch(Exception e)
    			  {
    				e.printStackTrace();
    			  }
          				//send the name of item 1
          				if(!Description6.equals(""))
         	           {
          				try {
          				driver.findElement(By.xpath("//*[@id=\"descriptionFAUS_100\"]")).sendKeys(Description6);
                            }

						catch(Exception e)
						  {
							e.printStackTrace();
						  }
         	           }
					          				Thread.sleep(1000);
          				// send the price of item
					          				if(!amount6.equals(""))
					         	           {
          				try {
          				driver.findElement(By.xpath("//*[@id=\"amountFAUS_100\"]")).sendKeys(amount6);
          			        }

	          			catch(Exception e)
	          			  {
	          				e.printStackTrace();
	          			  }
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
