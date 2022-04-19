package org.softAssert;

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
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdactinnHotel extends BaseClass
{
	public static WebDriver driver;
    @BeforeClass
    private void beforeclass() throws InterruptedException 
    {
	
	browserLaunch();
	implicitlywait(1000);
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
    @Test(priority=-1)
    private void test1() throws InterruptedException 
    {
    	SoftAssert s=new SoftAssert();
    	launchUrl("http://adactinhotelapp.com");
    	String currenturl = currenturl();
    	boolean contains = currenturl.contains("adctinhotelapp");
    	s.assertTrue(contains);
	    System.out.println("test1");
	    
	    Loginpage l=new Loginpage();
	    
	    sendKeys(l.getUsername(), "karthikeyan0511"); 
	    String attribute = getAttribute(l.getUsername());
	    //actual vs expected
	    s.assertEquals(attribute, "karthikeyan051");
	    
	    sendKeys(l.getPassword(),"9750765850");
	    String password = getAttribute(l.getPassword());
	    s.assertEquals(password, "9750765850");
	    Thread.sleep(5000);
	    
	    buttonclick(l.getLoginbutton());	    
	    
	     s.assertAll();
	     

    }
    @Test(priority=1)
    public void test2() throws InterruptedException
	{
    	SoftAssert k=new SoftAssert();
		SearchHotel s=new SearchHotel();
		selectbyIndex(s.getLocation(), 5);
		String attribute = s.getAttribute(s.getLocation());
		System.out.println(attribute);
	    k.assertEquals(attribute, "London");
		
		
		selectbyIndex(s.getHotel(), 3);
		String hotel = getAttribute(s.getHotel());
		k.assertEquals(hotel, "Hotel Hervey");
		
		selectbyIndex(s.getRoomtype(), 2);
		String roomtype = getAttribute(s.getRoomtype());
		k.assertEquals(roomtype, "Double");
		
		selectbyIndex(s.getNumrooms(), 1);
		String numofrooms = getAttribute(s.getNumrooms());
		System.out.println(numofrooms);
		k.assertEquals(numofrooms, "2");
		
		
		s.getCheckindate().clear();
		sendKeys(s.getCheckindate(),"08/04/2022");
		String checkindate = getAttribute(s.getCheckindate());
		
		k.assertEquals(checkindate,"08/04/2022");
		
		s.getCheckoutdate().clear();
		sendKeys(s.getCheckoutdate(), "10/04/2022");
		
		selectbyIndex(s.getAdults(), 3);
		selectbyIndex(s.getChildren(), 2);
		k.assertAll();
		Thread.sleep(6000);
	}


}
		
		
		
	


