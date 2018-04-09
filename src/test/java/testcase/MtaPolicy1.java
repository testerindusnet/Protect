package testcase;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import settings.TestUtil;
import settings.login;

public class MtaPolicy1 extends login {
	public WebDriver driver;
	public String policyno;
	public String totalpremium;
	SoftAssert s = new SoftAssert();	
	@BeforeClass    
    public void login() {
    
	  driver=getdriver();
	  
	
    }
	
	@DataProvider(name="gettestdata")
	public Iterator<Object[]> gettestdata(){
		
		ArrayList<Object[]> testdata=TestUtil.getdatafromexcel3();
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
			Support obj1=new Support();
			obj1.PolicySearch(pno,driver);
	// click Mta Tab 
	WebElement mtatab= driver.findElement(By.xpath("//a[@href='#tabs-7' and text()='MTA']"));
	mtatab.click();
	
	driver.findElement(By.xpath("//button[@id='newMtaBtn']")).click();
	
	FavCoverDetailsMta obj2= new FavCoverDetailsMta();
	obj2.coverDetails(currency,broker,brokeruser,startdt,type,selection,introducer,fname,lname,mobile,email,gender,country,postcode,dropdown,marritals,
    		dob,emplstatus,Currentinsurer,Policyexpiry,Expiringprem,Targetpremium,Targetinsurer,propertyType,
    		mainresidence,outbuildings,purposes,Buildings1,transit,limit,Contenspecified,Description1,amount1,Valuablesunspecified,
    		Description2,amount2,Fineartunspecified,locrate,transitrate,contentrate,fineartrate,valuablesrate,To,pno,driver);
	
	StringOperation obj3= new StringOperation();
	
	WebElement tnp = driver.findElement(By.xpath("//*[@id='totPrem']"));
    String tnpvalue= tnp.getText();
    double tnpamount=obj3.signstripper(tnpvalue);
    System.out.println("Total net premium of the policy is  "+tnpamount);
    
    WebElement totComm = driver.findElement(By.xpath("//table[@id='selectedPremiums']/tbody/tr[3]/td[3]/div"));
    String totCommvalue= totComm.getText();
    double totCommamount=obj3.signstripper(totCommvalue);
    System.out.println("Total commission of the policy is  "+totCommamount);
		
    WebElement gross = driver.findElement(By.xpath("//table[@id='selectedPremiums']/tbody/tr[4]/td[3]/div"));
    String grossvalue= gross.getText();
    double grossamount=obj3.signstripper(grossvalue);
    System.out.println("Gross premium of the policy is  "+grossamount);
		
	double grossamount2=tnpamount+totCommamount;
	
	if(grossamount!=grossamount2)
	{
		s.assertEquals(grossamount,grossamount2);
		
	}
	
	String APamount=driver.findElement(By.xpath("//input[@id='balancePremiumSave']")).getAttribute("value");
	if(APamount.equals("0.00"))
	{
		System.out.println("Additional premium of the policy is  "+APamount+" Test Pass");
		
	}
	else
	{
		s.assertEquals(APamount, "0.00");
		System.out.println("Additional premium of the policy is "+APamount+"i.e not Zero.Error Exists in the policy ");
	}
	
	obj2.maxSumInsured(locrate,transitrate,driver);
	
	//click Recalculate button
	
	driver.findElement(By.xpath("//input[@name='reCalculateCom']")).click();
	Thread.sleep(3000);
	obj2.homePremium(driver);
	
	WebElement payments=driver.findElement(By.xpath("//button[@id='submitBtn']"));
	payments.click();
	PaymentsSection payobj1=new PaymentsSection();
	payobj1.pay(driver,To);
	WebElement sendPolicyMailBtn = driver.findElement(By.xpath("//button[@id='sendPolicyMailBtn']"));
	WebElement mailbox=driver.findElement(By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-resizable']"));

	sendPolicyMailBtn.click();
	
		//WebDriverWait waitclickable=new WebDriverWait(driver,600);
	
	//waitclickable.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='top']/div/div[2]/div/ul/li[6]/a/span")));
//	waitclickable.until(ExpectedConditions.invisibilityOf(mailbox));
	//driver.findElement(By.xpath("//a/span[text()='Policy Records ']")).click();
	
	String text=driver.findElement(By.xpath("//div[@class='form-section']/fieldset/div")).getText();
	
			System.out.println("text");

	
	}
}