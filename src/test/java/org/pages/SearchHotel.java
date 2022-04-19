package org.pages;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass
{
	public SearchHotel() 
	{
		PageFactory.initElements(driver, this);
	}
	
   @FindBy(xpath="//select[@name='location']")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotel;

	public WebElement getHotel() {
		return hotel;
	}
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomtype;
    public WebElement getRoomtype() 
	{
		return roomtype;
	} 
    
    @FindBy(xpath="//select[@name='room_nos']")
    private WebElement numrooms;
	public WebElement getNumrooms() 
	{
		return numrooms;
	}
	@FindBy(id="datepick_in")
    private WebElement checkindate;

	public WebElement getCheckindate() {
		return checkindate;
	}
     @FindBy(id="datepick_out")
	private WebElement checkoutdate;
	public WebElement getCheckoutdate() 
	{
		return checkoutdate;
	}
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement Adults;

	public WebElement getAdults() {
		return Adults;
	}
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement Children;
	public WebElement getChildren() {
		return Children;
	}
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbutton;

	public WebElement getSearchbutton() 
	{
		return searchbutton;
	}
	
	
	
	
	
	
}
