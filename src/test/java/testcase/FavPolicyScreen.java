package testcase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import settings.TestUtil;
import settings.login;

public class FavPolicyScreen extends login {
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
	@Test(dataProvider="gettestdata",priority=2)
public void test(String currency,String broker,String brokeruser,String startdt,String type,String selection,
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

	    // Now click Policy Record button
  	
		WebElement porecbutton = driver.findElement(By.xpath("//div['page-sidebar navbar-collapse collapse']/ul/li[6]/a"));
		porecbutton.click();	
		
		
		// Now send policy number in search textbox
		
		WebElement policysearch = driver.findElement(By.xpath("//*[@id=\"gs_policy_number\"]"));
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
			s.assertEquals(s2,pno);
			
	    }
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)", "");
  		Thread.sleep(1000);
		
		try
		{
		WebElement brokerpath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[1]/div/div[3]/div/span"));
		String broker1= brokerpath.getText();
		
		if(broker!=null)	
		{
		if(broker1.equalsIgnoreCase(broker))
			{
			System.out.println("Broker name matches with Excel Sheet name :Test Pass");
			Reporter.log("Broker name matches with Excel Sheet name :Test Pass");
			
			}
		else
		    {
			s.assertEquals(broker1, broker);
		System.out.println("Broker name does not matches with Excel Sheet name :Test Failed");
		Reporter.log("Broker name does not matches with Excel Sheet name :Test Failed");
		    }
		
		}
		
		else
		{
			if(broker1.equalsIgnoreCase("Not Available"))
			{
			System.out.println("Broker name Not Available in the policy: Test Pass");
			Reporter.log("Broker name Not Available in the policy: Test Pass");
			}
		else
		    {
			s.assertEquals(broker1, broker);
		System.out.println("Error in Broker name field :Test Failed");
		Reporter.log("Error in Broker name field :Test Failed");
		    }
		
		

		}
		
		   }
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
		try
		{
		WebElement brokeruserpath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[1]/div/div[4]/div/span"));
		String brokeruser1= brokeruserpath.getText();
		if(brokeruser!=null)	
		{
		if(brokeruser1.equalsIgnoreCase(brokeruser))
			{
			System.out.println("BrokerUser name matches with Excel Sheet name :Test Pass");
			Reporter.log("BrokerUser name matches with Excel Sheet name :Test Pass");
			
			}
		else
		    {
			s.assertEquals(brokeruser1, brokeruser);
		System.out.println("BrokerUser name does not matches with Excel Sheet name :Test Failed");
		Reporter.log("BrokerUser name does not matches with Excel Sheet name :Test Failed");
		    }
		
		}
		
		else
		{
			if(brokeruser1.equalsIgnoreCase("Protect  Underwriting"))
			{
			System.out.println("BrokerUser name Not Available in the policy: Test Pass");
			Reporter.log("BrokerUser name Not Available in the policy: Test Pass");
			}
		else
		    {
			s.assertEquals(brokeruser1, brokeruser);
		System.out.println("Error in BrokerUser name field :Test Failed");
		Reporter.log("Error in BrokerUser name field :Test Failed");
		    }
		
		

		}
		
		   }
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
		try
		{
		WebElement introducerpath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[1]/div/div[5]/div/span"));
		String selection1= introducerpath.getText();
		if(selection!=null)	
		{
		if(selection1.equalsIgnoreCase(selection))
			{
			System.out.println("Introducer name matches with Excel Sheet name :Test Pass");
			Reporter.log("Introducer name matches with Excel Sheet name :Test Pass");
			
			}
		else
		    {
			s.assertEquals(selection1,selection);
		System.out.println("Introducer name does not matches with Excel Sheet name :Test Failed");
		Reporter.log("Introducer name does not matches with Excel Sheet name :Test Failed");
		    }
		
		}
		
		else
		{
			if(selection1.equalsIgnoreCase("Not Available"))
			{
			System.out.println("Introducer name Not Available in the policy: Test Pass");
			Reporter.log("Introducer name Not Available in the policy: Test Pass");
			}
		else
		    {
			s.assertEquals(selection1,selection);
		System.out.println("Error in Introducer name field :Test Failed");
		Reporter.log("Error in Introducer name field :Test Failed");
		    }
		
		

		}
		
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
		
		if(fullname!=null)	
		{
		if(fullname1.equalsIgnoreCase(fullname))
			{
			System.out.println("Insurer name matches with Excel Sheet name :Test Pass");
			Reporter.log("Insurer name matches with Excel Sheet name :Test Pass");
			
			}
		else
		    {
			s.assertEquals(fullname1,fullname);
		System.out.println("Insurer name does not matches with Excel Sheet name :Test Failed");
		Reporter.log("Insurer name does not matches with Excel Sheet name :Test Failed");
		    }
		
		}
		
		else
		{
			if(fullname1.equalsIgnoreCase("Not Available"))
			{
			System.out.println("Insurer name Not Available in the policy: Test Pass");
			Reporter.log("Insurer name Not Available in the policy: Test Pass");
			}
		else
		    {
			s.assertEquals(fullname1,fullname);
		System.out.println("Error in Insurer full name field :Test Failed");
		Reporter.log("Error in Insurer full name field :Test Failed");
		    }
		
		

		}
		
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
		if(mobile!=null)	
		{
		if(mobile1.equalsIgnoreCase(mobile))
			{
			System.out.println("Mobile Number matches with Excel Sheet name :Test Pass");
			Reporter.log("Mobile Number matches with Excel Sheet name :Test Pass");
			
			}
		else
		    {
			s.assertEquals(mobile1,mobile);
		System.out.println("Mobile Number does not matches with Excel Sheet name :Test Failed");
		Reporter.log("Mobile Number does not matches with Excel Sheet name :Test Failed");
		    }
		
		}
		
		else
		{
			if(mobile1.equalsIgnoreCase("Not Available"))
			{
			System.out.println("Mobile Number Not Available in the policy: Test Pass");
			Reporter.log("Mobile Number Not Available in the policy: Test Pass");
			}
		else
		    {
			s.assertEquals(mobile1,mobile);
		System.out.println("Error in Mobile Number field :Test Failed");
		Reporter.log("Error in Mobile Number field :Test Failed");
		    }
		
		

		}
		
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
		if(email!=null)	
		{
		if(email1.equalsIgnoreCase(email))
			{
			System.out.println("email matches with Excel Sheet name :Test Pass");
			Reporter.log("email matches with Excel Sheet name :Test Pass");
			
			}
		else
		    {
			s.assertEquals(email1,email);
		System.out.println("email does not matches with Excel Sheet name :Test Failed");
		Reporter.log("email does not matches with Excel Sheet name :Test Failed");
		    }
		
		}
		
		else
		{
			if(email1.equalsIgnoreCase("Not Available"))
			{
			System.out.println("email Not Available in the policy: Test Pass");
			Reporter.log("email Not Available in the policy: Test Pass");
			}
		else
		    {
			s.assertEquals(email1,email);
		System.out.println("Error in email field :Test Failed");
		Reporter.log("Error in email field :Test Failed");
		    }
		
		

		}
		
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
				if(gender!=null)	
				{
				if(gender1.equalsIgnoreCase(gender))
					{
					System.out.println("gender matches with Excel Sheet name :Test Pass");
					Reporter.log("gender matches with Excel Sheet name :Test Pass");
					
					}
				else
				    {
					s.assertEquals(gender1,gender);
				System.out.println("gender does not matches with Excel Sheet name :Test Failed");
				Reporter.log("gender does not matches with Excel Sheet name :Test Failed");
				    }
				
				}
				
				else
				{
					if(gender1.equalsIgnoreCase("Not Available"))
					{
					System.out.println("gender Not Available in the policy: Test Pass");
					Reporter.log("gender Not Available in the policy: Test Pass");
					}
				else
				    {
					s.assertEquals(gender1,gender);
				System.out.println("Error in gender :Test Failed");
				Reporter.log("Error in gender :Test Failed");
				    }
				
				

				}
				
				   }
				catch(Exception e)
				{
					e.printStackTrace();
					
				}
				
				jse.executeScript("window.scrollBy(0,100)", "");
		  		//Thread.sleep(1000);
		
		                                                 	// Matching Marital Status
				
				try
				{
				WebElement marritalpath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[2]/div/div[6]/div/span"));
				String marritals1= marritalpath.getText();
				if(marritals!=null)	
				{
				if(marritals1.equalsIgnoreCase(marritals))
					{
					System.out.println("Marital Status matches with Excel Sheet name :Test Pass");
					Reporter.log("Marital Status matches with Excel Sheet name :Test Pass");
					
					}
				else
				    {
					s.assertEquals(marritals1,marritals);
				System.out.println("Marital Status does not matches with Excel Sheet name :Test Failed");
				Reporter.log("Marital Status does not matches with Excel Sheet name :Test Failed");
				    }
				
				}
				
				
				else if(marritals1.equalsIgnoreCase("Not Available"))
					{
					System.out.println("Marital Status Not Available in the policy: Test Pass");
					Reporter.log("Marital Status Not Available in the policy: Test Pass");
					}
				
				}
				catch(Exception e)
				{
					e.printStackTrace();
					
				}
		
				                                                // Matching Date of Birth
				
				try
				{
				WebElement dobpath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[2]/div/div[7]/div/span"));
				String s1= dobpath.getText().trim();
				String dob1=s1.replaceAll("-", "/"); 
				if(dob!=null)	
				{
				if(dob1.equalsIgnoreCase(dob))
					{
					System.out.println("Date of Birth matches with Excel Sheet :Test Pass");
					Reporter.log("Date of Birth matches with Excel Sheet :Test Pass");
					
					}
				else
				    {
					s.assertEquals(dob1,dob);
				System.out.println("Date of Birth does not matches with Excel Sheet :Test Failed");
				Reporter.log("Date of Birth does not matches with Excel Sheet :Test Failed");
				    }
				
				}
				
				else
				{
					if(dob1.equalsIgnoreCase("Not Available"))
					{
					System.out.println("Date of Birth Not Available in the policy: Test Pass");
					Reporter.log("Date of Birth Not Available in the policy: Test Pass");
					}
				else
				    {
					s.assertEquals(dob1,dob);
				System.out.println("Error in Date of Birth :Test Failed");
				Reporter.log("Error in Date of Birth :Test Failed");
				    }
				
				

				}
				
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
				
				if(emplstatus!=null)	
				{
				if(emplstatus1.equalsIgnoreCase(emplstatus))
					{
					System.out.println("Employment status matches with Excel Sheet :Test Pass");
					Reporter.log("Employment status matches with Excel Sheet :Test Pass");
					
					}
				else
				    {
					s.assertEquals(emplstatus1,emplstatus);
				System.out.println("Employment status does not matches with Excel Sheet :Test Failed");
				Reporter.log("Employment status does not matches with Excel Sheet :Test Failed");
				    }
				
				}
				
				else
				{
					if(emplstatus1.equalsIgnoreCase("Not Available"))
					{
					System.out.println("Employment status Not Available in the policy: Test Pass");
					Reporter.log("Employment status Not Available in the policy: Test Pass");
					}
				else
				    {
					s.assertEquals(emplstatus1,emplstatus);
				System.out.println("Error in Employment status :Test Failed");
				Reporter.log("Error in Employment status :Test Failed");
				    }
				
				

				}
				
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
				
				if(emplstatus!=null)	
				{
				if(Currentinsurer1.equalsIgnoreCase(Currentinsurer))
					{
					System.out.println("Current insurer matches with Excel Sheet :Test Pass");
					Reporter.log("Current insurer matches with Excel Sheet :Test Pass");
					
					}
				else
				    {
					s.assertEquals(Currentinsurer1,Currentinsurer);
				System.out.println("Current insurer does not matches with Excel Sheet :Test Failed");
				Reporter.log("Current insurer does not matches with Excel Sheet :Test Failed");
				    }
				
				}
				
				else
				{
					if(Currentinsurer1.equalsIgnoreCase("Not Available"))
					{
					System.out.println("Current insurer Not Available in the policy: Test Pass");
					Reporter.log("Current insurer Not Available in the policy: Test Pass");
					}
				else
				    {
					s.assertEquals(Currentinsurer1,Currentinsurer);
				System.out.println("Error in Current insurer :Test Failed");
				Reporter.log("Error in Current insurer :Test Failed");
				    }
				
				

				}
				
				   }
				catch(Exception e)
				{
					e.printStackTrace();
					
				}
				
                                                      // Matching Expiring premium
				
				try
				{
				WebElement Expiringprempath = driver.findElement(By.xpath("//*[@id=\"policyDetailsId\"]/fieldset[8]/div/div[3]/div/span"));
				String Expiringprem1= Expiringprempath.getText();
				String Expiringpremtext=commaremover(Expiringprem1);
				int p=Expiringprem.indexOf(".");
				//System.out.println(p);
				if(p<0)
				{
					String Expiringpremexcel= decimal(Expiringprem);
					
					if(Expiringpremexcel!=null)	
					{
					if(Expiringpremtext.equalsIgnoreCase(Expiringpremexcel))
						{
						System.out.println("Expiring premium matches with Excel Sheet :Test Pass");
						Reporter.log("Expiring premium matches with Excel Sheet :Test Pass");
						
						}
					else
					    {
						s.assertEquals(Expiringpremtext,Expiringpremexcel);
					System.out.println("Expiring premium does not matches with Excel Sheet :Test Failed");
					Reporter.log("Expiring premium does not matches with Excel Sheet :Test Failed");
					    }
					
					}
					
					else
					{
						if(Expiringpremtext.equalsIgnoreCase("0.00"))
						{
						System.out.println("Expiring premium Not Available in the policy: Test Pass");
						Reporter.log("Expiring premium Not Available in the policy: Test Pass");
						}
					else
					    {
						s.assertEquals(Expiringpremtext,Expiringpremexcel);
					System.out.println("Error in Expiring premium :Test Failed");
					Reporter.log("Error in Expiring premium :Test Failed");
					    }
					
					

					}
					
					
					
					
				}
				
				else
				{
					
				
				if(Expiringprem!=null)	
				{
				if(Expiringpremtext.equals(Expiringprem))
					{
					System.out.println("Expiring premium amount for building matches with Excel Sheet :Test Pass");
					Reporter.log("Expiring premium amount for building matches with Excel Sheet :Test Pass");
					
					}
				else
				    {
					s.assertEquals(Expiringpremtext,Expiringprem);
				System.out.println("Expiring premium amount for building does not matches with Excel Sheet :Test Failed");
				Reporter.log("Expiring premium amount for building does not matches with Excel Sheet :Test Failed");
				    }
				
				}
				
				else
				{
					if(Expiringpremtext.equalsIgnoreCase("0.00"))
					{
					System.out.println("Expiring premium amount for building Not Available in the policy: Test Pass");
					Reporter.log("Expiring premium for building Not Available in the policy: Test Pass");
					}
				else
				    {
					s.assertEquals(Expiringpremtext,Expiringprem);
				System.out.println("Error in Expiring premium amount for building :Test Failed");
				Reporter.log("Error in Expiring premium amount for building :Test Failed");
				    }
				
				

				}
				
				}
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
				//System.out.println(p);
				if(p<0)
				{
					String Targetpremiumexcel= decimal(Targetpremium);
					
					if(Targetpremiumexcel!=null)	
					{
					if(Targetpremiumtext.equalsIgnoreCase(Targetpremiumexcel))
						{
						System.out.println("Target premium matches with Excel Sheet :Test Pass");
						Reporter.log("Target premium matches with Excel Sheet :Test Pass");
						
						}
					else
					    {
						s.assertEquals(Targetpremiumtext,Targetpremiumexcel);
					System.out.println("Target premium does not matches with Excel Sheet :Test Failed");
					Reporter.log("Target premium does not matches with Excel Sheet :Test Failed");
					    }
					
					}
					
					else
					{
						if(Targetpremiumtext.equalsIgnoreCase("0.00"))
						{
						System.out.println("Target premium Not Available in the policy: Test Pass");
						Reporter.log("Target premium Not Available in the policy: Test Pass");
						}
					else
					    {
						s.assertEquals(Targetpremiumtext,Targetpremiumexcel);
					System.out.println("Error in Target premium :Test Failed");
					Reporter.log("Error in Target premium :Test Failed");
					    }
					
					

					}
					
					
					
					
				}
				
				else
				{
					
				
				if(Targetpremium!=null)	
				{
				if(Targetpremiumtext.equals(Targetpremium))
					{
					System.out.println("Target premium amount for building matches with Excel Sheet :Test Pass");
					Reporter.log("Target premium amount for building matches with Excel Sheet :Test Pass");
					
					}
				else
				    {
					s.assertEquals(Targetpremiumtext,Targetpremium);
				System.out.println("Target premium amount for building does not matches with Excel Sheet :Test Failed");
				Reporter.log("Target premium amount for building does not matches with Excel Sheet :Test Failed");
				    }
				
				}
				
				else
				{
					if(Targetpremiumtext.equalsIgnoreCase("0.00"))
					{
					System.out.println("Target premium amount for building Not Available in the policy: Test Pass");
					Reporter.log("Target premium amount for building Not Available in the policy: Test Pass");
					}
				else
				    {
					s.assertEquals(Targetpremiumtext,Targetpremium);
				System.out.println("Error in Target premium amount for building :Test Failed");
				Reporter.log("Error in Target premium amount for building :Test Failed");
				    }
				
				

				}
				
				}
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
				
				if(Targetinsurer!=null)	
				{
				if(Targetinsurer1.equalsIgnoreCase(Targetinsurer))
					{
					System.out.println("Target insurer matches with Excel Sheet :Test Pass");
					Reporter.log("Target insurer matches with Excel Sheet :Test Pass");
					
					}
				else
				    {
					s.assertEquals(Targetinsurer1,Targetinsurer);
				System.out.println("Target insurer does not matches with Excel Sheet :Test Failed");
				Reporter.log("Target insurer does not matches with Excel Sheet :Test Failed");
				    }
				
				}
				
				else
				{
					if(Targetinsurer1.equalsIgnoreCase("Not Available"))
					{
					System.out.println("Target insurer Not Available in the policy: Test Pass");
					Reporter.log("Target insurer Not Available in the policy: Test Pass");
					}
				else
				    {
					s.assertEquals(Targetinsurer1,Targetinsurer);
				System.out.println("Error in Target insurer :Test Failed");
				Reporter.log("Error in Target insurer :Test Failed");
				    }
				
				

				}
				
				   }
				catch(Exception e)
				{
					e.printStackTrace();
					
				}
		
		
				JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		  		jse3.executeScript("window.scrollBy(0,-800)", "");
		  		// Clicks Property Details Tab
	driver.findElement(By.xpath("//button[@id='propId__0__1' and text()=' Property 1 Details']")).click();
		  		
		
	                               /*  // Matching Address
	
		try
		{
		WebElement dropdownpath = driver.findElement(By.xpath("//*[@id=\"propInfoId0\"]/fieldset[1]/div[3]/div/span"));
		String dropdown1= dropdownpath.getText();
		
		if(dropdown!=null)	
		{
		if(dropdown1.contains(dropdown))
			{
			System.out.println("Address matches with Excel Sheet :Test Pass");
			Reporter.log("Address matches with Excel Sheet :Test Pass");
			
			}
		else
		    {
			
		System.out.println("Address does not matches with Excel Sheet :Test Failed");
		Reporter.log("Address does not matches with Excel Sheet :Test Failed");
		    }
		
		}
		
		else
		{
			if(dropdown1.equalsIgnoreCase("Not Available"))
			{
			System.out.println("Address Not Available in the policy: Test Pass");
			Reporter.log("Address Not Available in the policy: Test Pass");
			}
		else
		    {
			
		System.out.println("Error in Address :Test Failed");
		Reporter.log("Error in Address :Test Failed");
		    }
		
		

		}
		
		   }
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
	*/
	
	
	
	                                   // Matching Property Type
	
	try
	{
	WebElement propertyTypepath = driver.findElement(By.xpath("//*[@id=\"propInfoId0\"]/fieldset[1]/div[5]/div/span"));
	String propertyType1= propertyTypepath.getText();
	
	if(propertyType!=null)	
	{
	if(propertyType1.equalsIgnoreCase(propertyType))
		{
		System.out.println("Property Type matches with Excel Sheet :Test Pass");
		Reporter.log("Property Type matches with Excel Sheet :Test Pass");
		
		}
	else
	    {
		s.assertEquals(propertyType1,propertyType);
	System.out.println("Property Type does not matches with Excel Sheet :Test Failed");
	Reporter.log("Property Type does not matches with Excel Sheet :Test Failed");
	    }
	
	}
	
	else
	{
		if(propertyType1.equalsIgnoreCase("Not Available"))
		{
		System.out.println("Property Type Not Available in the policy: Test Pass");
		Reporter.log("Property Type Not Available in the policy: Test Pass");
		}
	else
	    {
		s.assertEquals(propertyType1,propertyType);
	System.out.println("Error in Property Type :Test Failed");
	Reporter.log("Error in Property Type :Test Failed");
	    }
	
	

	}
	
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
		
		if(mainresidence!=null)	
		{
		if(mainresidence1.equalsIgnoreCase(mainresidence))
			{
			System.out.println("Main residence matches with Excel Sheet :Test Pass");
			Reporter.log("Main residence matches with Excel Sheet :Test Pass");
			
			}
		else
		    {
			s.assertEquals(mainresidence1,mainresidence);
		System.out.println("Main residence does not matches with Excel Sheet :Test Failed");
		Reporter.log("Main residence does not matches with Excel Sheet :Test Failed");
		    }
		
		}
		
		else
		{
			if(mainresidence1.equalsIgnoreCase("Not Available"))
			{
			System.out.println("Main residence Not Available in the policy: Test Pass");
			Reporter.log("Main residence Not Available in the policy: Test Pass");
			}
		else
		    {
			s.assertEquals(mainresidence1,mainresidence);
		System.out.println("Error in Main residence :Test Failed");
		Reporter.log("Error in Main residence :Test Failed");
		    }
		
		

		}
		
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
				
				if(outbuildings!=null)	
				{
				if(outbuildings1.equalsIgnoreCase(outbuildings))
					{
					System.out.println("Family occupied matches with Excel Sheet :Test Pass");
					Reporter.log("Family occupied matches with Excel Sheet :Test Pass");
					
					}
				else
				    {
					s.assertEquals(outbuildings1,outbuildings);
				System.out.println("Family occupied does not matches with Excel Sheet :Test Failed");
				Reporter.log("Family occupied does not matches with Excel Sheet :Test Failed");
				    }
				
				}
				
				else
				{
					if(outbuildings1.equalsIgnoreCase("Not Available"))
					{
					System.out.println("Family occupied Not Available in the policy: Test Pass");
					Reporter.log("Family occupied Not Available in the policy: Test Pass");
					}
				else
				    {
					s.assertEquals(outbuildings1,outbuildings);
				System.out.println("Error in Family occupied :Test Failed");
				Reporter.log("Error in Family occupied :Test Failed");
				    }
				
				

				}
				
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
				
				if(purposes!=null)	
				{
				if(purposes1.equalsIgnoreCase(purposes))
					{
					System.out.println("Business use matches with Excel Sheet :Test Pass");
					Reporter.log("Business use matches with Excel Sheet :Test Pass");
					
					}
				else
				    {
					s.assertEquals(purposes1,purposes);
				System.out.println("Business use does not matches with Excel Sheet :Test Failed");
				Reporter.log("Business use does not matches with Excel Sheet :Test Failed");
				    }
				
				}
				
				else
				{
					if(purposes1.equalsIgnoreCase("Not Available"))
					{
					System.out.println("Business use Not Available in the policy: Test Pass");
					Reporter.log("Business use Not Available in the policy: Test Pass");
					}
				else
				    {
					s.assertEquals(purposes1,purposes);
				System.out.println("Error in Business use :Test Failed");
				Reporter.log("Error in Business use :Test Failed");
				    }
				
				

				}
				
				   }
				catch(Exception e)
				{
					e.printStackTrace();
					
				}
	
				JavascriptExecutor jse5 = (JavascriptExecutor)driver;
		  		jse5.executeScript("window.scrollBy(0,-800)", "");
		  		// Clicks Property Details Tab
	driver.findElement(By.xpath("//button[@id='riskId']")).click();
		  		
	
	
	
	                                                  // Maximun Sum insured
	
	
				try
				{
				WebElement Buildingspath = driver.findElement(By.xpath("//*[@id=\"riskDetailsId\"]/fieldset/div/div[1]/div/div/span"));
				String Buildings12= Buildingspath.getText();
				String Buildtext=commaremover(Buildings12);
				int p=Buildings1.indexOf(".");
				//System.out.println(p);
				if(p<0)
				{
					String Buildexcel= decimal(Buildings1);
					
					if(Buildexcel!=null)	
					{
					if(Buildtext.equalsIgnoreCase(Buildexcel))
						{
						System.out.println("Maximun Sum insured matches with Excel Sheet :Test Pass");
						Reporter.log("Maximun Sum insured matches with Excel Sheet :Test Pass");
						
						}
					else
					    {
						s.assertEquals(Buildtext,Buildexcel);
					System.out.println("Maximun Sum insured does not matches with Excel Sheet :Test Failed");
					Reporter.log("Maximun Sum insured does not matches with Excel Sheet :Test Failed");
					    }
					
					}
					
					else
					{
						if(Buildtext.equalsIgnoreCase("0.00"))
						{
						System.out.println("Maximun Sum insured Not Available in the policy: Test Pass");
						Reporter.log("Maximun Sum insured Not Available in the policy: Test Pass");
						}
					else
					    {
						s.assertEquals(Buildtext,Buildexcel);
					System.out.println("Error in Maximun Sum insured :Test Failed");
					Reporter.log("Error in Maximun Sum insured :Test Failed");
					    }
					
					

					}
					
					
					
					
				}
				
				else
				{
					
				
				if(Buildings1!=null)	
				{
				if(Buildtext.equals(Buildings1))
					{
					System.out.println("2.Maximun Sum insured amount for building matches with Excel Sheet :Test Pass");
					Reporter.log("2.Maximun Sum insured amount for building matches with Excel Sheet :Test Pass");
					
					}
				else
				    {
					s.assertEquals(Buildtext,Buildings1);
				System.out.println("2.Maximun Sum insured amount for building does not matches with Excel Sheet :Test Failed");
				Reporter.log("2.Maximun Sum insured amount for building does not matches with Excel Sheet :Test Failed");
				    }
				
				}
				
				else
				{
					if(Buildtext.equalsIgnoreCase("Not Available"))
					{
					System.out.println("2.Maximun Sum insured amount for building Not Available in the policy: Test Pass");
					Reporter.log("Maximun Sum insured amount for building Not Available in the policy: Test Pass");
					}
				else
				    {
					s.assertEquals(Buildtext,Buildings1);
				System.out.println("2.Error in Maximun Sum insured amount for building :Test Failed");
				Reporter.log("Error in Maximun Sum insured amount for building :Test Failed");
				    }
				
				

				}
				
				}
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
				//System.out.println(p);
				if(p<0)
				{
					String transitexcel= decimal(transit);
					
					if(transitexcel!=null)	
					{
					if(transittext.equalsIgnoreCase(transitexcel))
						{
						System.out.println("Transit amount matches with Excel Sheet :Test Pass");
						Reporter.log("Transit amount insured matches with Excel Sheet :Test Pass");
						
						}
					else
					    {
						s.assertEquals(transittext,transitexcel);
					System.out.println("Transit amount insured does not matches with Excel Sheet :Test Failed");
					Reporter.log("Transit amount insured does not matches with Excel Sheet :Test Failed");
					    }
					
					}
					
					else
					{
						if(transittext.equalsIgnoreCase("Not Available"))
						{
						System.out.println("Transit amount insured Not Available in the policy: Test Pass");
						Reporter.log("Transit amount insured Not Available in the policy: Test Pass");
						}
					else
					    {
						s.assertEquals(transittext,transitexcel);
					System.out.println("Error in Transit amount insured :Test Failed");
					Reporter.log("Error in Transit amount insured :Test Failed");
					    }
					
					

					}
					
					
					
					
				}
				
				else
				{
					
				
				if(transit!=null)	
				{
				if(transittext.equals(transit))
					{
					System.out.println("2.Transit amount insured amount for building matches with Excel Sheet :Test Pass");
					Reporter.log("2.Transit amount insured amount for building matches with Excel Sheet :Test Pass");
					
					}
				else
				    {
					s.assertEquals(transittext,transit);
				System.out.println("2.Transit amount insured amount for building does not matches with Excel Sheet :Test Failed");
				Reporter.log("2.Transit amount insured amount for building does not matches with Excel Sheet :Test Failed");
				    }
				
				}
				
				else
				{
					if(transittext.equalsIgnoreCase("Not Available"))
					{
					System.out.println("2.Transit amount insured amount for building Not Available in the policy: Test Pass");
					Reporter.log("2.Transit amount insured amount for building Not Available in the policy: Test Pass");
					}
				else
				    {
					s.assertEquals(transittext,transit);
				System.out.println("2.Error in Transit amount insured amount for building :Test Failed");
				Reporter.log("2.Error in Transit amount insured amount for building :Test Failed");
				    }
				
				

				}
				
				}
				   }
				catch(Exception e)
				{
					e.printStackTrace();
					
				}
	
	
	
		
		
		
		
		
				s.assertAll();
			
				
		

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


}
