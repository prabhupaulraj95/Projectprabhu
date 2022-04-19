package org.parameters;

import java.util.Date;

import org.Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pages.Loginpage;
import org.pages.SearchHotel;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdactinHotel2 extends BaseClass
{
	public static WebDriver driver;
    @BeforeClass
    private void beforeclass() throws InterruptedException 
    {
	
	browserLaunch();
	implicitlywait(5000);
	System.out.println("beforeclass");
    }
    @AfterClass
    private void afterclass() 
    {
    	//quit();
		System.out.println("afterclass");

	}
    @BeforeMethod
    private void beforemethod() 
    {
		Date d=new Date();
		System.out.println("Starting Time:"+d);
		System.out.println("Beforemethod");
    }
    @AfterMethod
    private void Aftermethod() 
    {
		Date d=new Date();
		System.out.println("Ending Time:"+d);
		System.out.println("Aftermethod");
    }
    @Parameters({"username","password"})
    @Test
    private void test1(String user,String pass) throws InterruptedException 
    {
    	launchUrl("http://adactinhotelapp.com");
	    System.out.println("test1");
	    Loginpage l=new Loginpage(); 
	    sendKeys(l.getUsername(),user);  
	    sendKeys(l.getPassword(),pass);
	    
	    buttonclick(l.getLoginbutton());
	    Thread.sleep(5000); 
	   }
 
	}



		
		
		
	


