package org.pages;


import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass
{
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@type='text']")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement loginbutton;

	public WebElement getLoginbutton() 
	{
		return loginbutton;
	}
	
	
	

}

