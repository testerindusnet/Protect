package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoTest{  
	
	public static WebDriver driver;
	
	
public static void main(String args[]){
	
	
	/*String s1="Debleena sen";
	String s3="Debleena Sen"  ;
	if(s1.equalsIgnoreCase(s3))
		
	System.out.println("ok");
	else
		System.out.println("error");*/
	
	/*
	 String s1= "20/05/1995";
	String s2= "20-05-1995";
	String dob1=s1.replaceAll("/", "-");
	if(dob1.equalsIgnoreCase(s2))
	{
		System.out.println("ok");
	}
		else
		{
			System.out.println("error");
	}
		*/
	
	
	String s11="£8160.00";  
	int s12=s11.indexOf("£");
	int s13=s12+1;
	String s14= s11.substring(s13);
	System.out.println(s14);
	
  
	

            }

	                  }