package testcase;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import settings.login;

public class Lm extends login {
	
	
	public WebDriver driver;
	
    @BeforeClass    
    public void login() {
    
	  driver=getdriver();
	
    }

   
    
    
  @Test(priority=1)
  public void LondonQuote() throws InterruptedException, IOException
  
  {
	  
	    WebElement a = driver.findElement(By.linkText("Protect"));
		a.click();
		
		
		// Now click Start New Quote button
	
		WebElement b = driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[2]/div/ul/li[3]/a"));
		b.click();	
		//*[@id="quoteBuySubMenu"]/li[3]/a
		// Now click London Market
		WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"quoteBuySubMenu\"]/li[3]/a")));
		WebElement lm = driver.findElement(By.xpath("//*[@id=\"quoteBuySubMenu\"]/li[3]/a"));
		lm.click();
		
		String binder,insured1;
		FileInputStream fis = new FileInputStream("E:\\protectfolder\\lmsheet.xlsx");
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	   
	    XSSFSheet ws = wb.getSheet("data");
	    
	    for( int count=1;count<=ws.getLastRowNum();count++){
	    	
	    	
	    	XSSFRow row=ws.getRow(count);
	    	System.out.println("TEST DATA" +row.getCell(0).toString());
	    	
	    	
	    		if(row.getCell(0)!=null){
	    			binder =row.getCell(0).toString();
	    		}
	    		
	    		else{
	    			binder=null;
	    			
	    		}
	    		if(row.getCell(1)!=null){
	    			insured1 =row.getCell(1).toString();
	    		}
	    		
	    		else{
	    			
	    			insured1=null;
	    		}
	    		
	    		quote(binder,insured1);
	    		
	    }
		
		
    }
		
	public void quote(String binder,String insured1) throws InterruptedException	
 
	{
		int x,y;
		System.out.println( "this is" +binder);
		Select address= new Select(driver.findElement(By.xpath("//*[@id=\"bindersection\"]")));
		address.selectByVisibleText(binder);
		
		driver.findElement(By.xpath("//*[@id=\"insuredone\"]")).sendKeys(insured1);
		
		//......................................................................................
		
		driver.findElement(By.xpath("//*[@id=\"policyinfoFrm\"]/div[1]/div[7]/div/div/a/img")).click();
		driver.switchTo().frame("gToday:normal:agenda.js");
		Select month=new Select(driver.findElement(By.xpath("//*[@id=\"MonSelect\"]")));
		month.selectByVisibleText("Mar");

		Select year=new Select(driver.findElement(By.xpath("//*[@id=\"YearSelect\"]")));
		year.selectByVisibleText("2020");

		List<WebElement>allday= driver.findElements(By.xpath("//*[@id=\"innerDiv\"]/table/tbody/tr['x']/td['y']/div/a"));
		System.out.println(allday.size());

		for(WebElement day:allday)
		{

		String day1=day.getText();

		if(day1.equalsIgnoreCase("22"))
		{
		day.click();
		break;
		}

		}
		
		
		
		
		
		
	}






}	



/*if(row.getCell(0)!=null){
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
	Al1 =row.getCell(19).toString();
}
else{
	
	Al1=null;
}

if(row.getCell(20)!=null){
	Al2=row.getCell(20).toString();
}
else{
	
	Al2=null;
}






if(row.getCell(21)!=null){
	Al3 =row.getCell(21).toString();
}

else{
	Al3=null;
	
}
if(row.getCell(22)!=null){
	Al4 =row.getCell(22).toString();
}

else{
	
	Al4=null;
}


if(row.getCell(23)!=null){
	Al5 =row.getCell(23).toString();
}
else{
	
	Al5=null;
}

if(row.getCell(24)!=null){
	Al6=row.getCell(24).toString();
}
else{
	
	Al6=null;
}

if(row.getCell(25)!=null){
	Al7 =row.getCell(25).toString();
}

else{
	Al7=null;
	
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
Valuables =row.getCell(85).toString();
}

else{

Valuables=null;
}


if(row.getCell(86)!=null){
specified =row.getCell(86).toString();
}
else{

specified=null;
}

if(row.getCell(87)!=null){
Description3=row.getCell(87).toString();
}
else{

Description3=null;
}



if(row.getCell(88)!=null){
amount3 =row.getCell(88).toString();
}

else{
amount3=null;

}
if(row.getCell(89)!=null){
homesafespecified =row.getCell(89).toString();
}

else{

homesafespecified=null;
}


if(row.getCell(90)!=null){
Description4 =row.getCell(90).toString();
}
else{

Description4=null;
}

if(row.getCell(91)!=null){
amount4=row.getCell(91).toString();
}
else{

amount4=null;
}



if(row.getCell(92)!=null){
bankspecified =row.getCell(92).toString();
}

else{
bankspecified=null;

}
if(row.getCell(93)!=null){
Description5 =row.getCell(93).toString();
}

else{

Description5=null;
}


if(row.getCell(94)!=null){
amount5 =row.getCell(94).toString();
}
else{

amount5=null;
}

if(row.getCell(95)!=null){
Fineartunspecified=row.getCell(95).toString();
}
else{

Fineartunspecified=null;
}


if(row.getCell(96)!=null){
Description6 =row.getCell(96).toString();
}

else{
Description6=null;

}
if(row.getCell(97)!=null){
amount6 =row.getCell(97).toString();
}

else{

amount6=null;
}


if(row.getCell(98)!=null){
Fineartspecified =row.getCell(98).toString();
}
else{

Fineartspecified=null;
}

if(row.getCell(99)!=null){
Description7=row.getCell(99).toString();
}
else{

Description7=null;
}

if(row.getCell(100)!=null){
amount7 =row.getCell(100).toString();
}

else{
amount7=null;

}


if(row.getCell(101)!=null){
	introcomm =row.getCell(101).toString();
}

else{
	
	introcomm=null;
}


if(row.getCell(102)!=null){
	endorsement =row.getCell(102).toString();
}
else{
	
	endorsement=null;
}

if(row.getCell(103)!=null){
	Property=row.getCell(103).toString();
}
else{
	
	Property=null;
}


if(row.getCell(104)!=null){
	Title =row.getCell(104).toString();
}

else{
	Title=null;
	
}
if(row.getCell(105)!=null){
	To =row.getCell(105).toString();
}

else{
	
	To=null;
}













*/