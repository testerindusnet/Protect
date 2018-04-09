package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentsSection {
	
	void pay(WebDriver driver,String To)
	{
		WebDriverWait wait1=new WebDriverWait(driver,30);
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Annually_payMethod_1']")));
        	
	WebElement AnnuallypayMethod1 = driver.findElement(By.xpath("//*[@id='Annually_payMethod_1']"));
	AnnuallypayMethod1.click();
	WebDriverWait wait5=new WebDriverWait(driver,30);
    	wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Bind']")));
	
	
	WebElement bind = driver.findElement(By.xpath("//*[@id='Bind']"));
	bind.click();
	
	WebDriverWait wait2=new WebDriverWait(driver,30);
    	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='toMailId']")));
    	
    	// send mail id 	
    WebElement mail =driver.findElement(By.xpath("//input[@id='toMailId']"));
	mail.clear();
	WebElement Topath =driver.findElement(By.xpath("//input[@id='toMailId']"));
	Topath.sendKeys(To);
	
	}
	
	
	
	

}
