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

public class FavAllPolicyDetails extends login {
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
		//Thread.sleep(1000);
		
		/*try
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
			
		}*/
		
		/*vascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)", "");*/
		
		// scroll to payment tab
			try {
			WebElement  tapback=driver.findElement(By.xpath("//*[@id=\"policyDetailsBtn\"]"));
			JavascriptExecutor jsScroll=  (JavascriptExecutor)driver;
			jsScroll.executeScript("arguments[0].scrollIntoView(true);", tapback);
		        }

		catch(Exception e)
		  {
			e.printStackTrace();
		  }
			WebElement cusdetails = driver.findElement(By.xpath("//*[@id=\"policyDetailsBtn\"]"));
			cusdetails.click();
  	
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
	  		// Clicks Property Details Tab
driver.findElement(By.xpath("//button[@id='riskId']")).click();
	  		
WebElement close = driver.findElement(By.xpath("//*[@id=\"top\"]/div[17]/div[1]/a/span"));
close.click();


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


			s.assertAll();


	
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}