package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage {
	
	public  WebDriver driver;
	
	@FindBy(xpath = "//img[@class = 'logo']")
	WebElement Myitinerary;
			
	@FindBy(linkText =   "Logout")
	WebElement LogoutBtn;
	
	@FindBy(linkText = "Click here to login again")
	WebElement Clicklog;
	
	@FindBy(id = "login")
	WebElement Returnedlogin; 
	
	
	public BookingConfirmationPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getMyitinerary() {
		return Myitinerary;
	}

	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}
	
	public WebElement getClicklog() {
		return Clicklog;
	}
	
	public WebElement getReturnedlogin() {
		return Returnedlogin;
	}

	
	


}
