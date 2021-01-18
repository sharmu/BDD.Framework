package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	
	public  WebDriver driver;
		
		
	@FindBy(id ="username_show")
	WebElement namedisplayed;
	
	@FindBy(id = "location")
	WebElement selectloc;
	
	@FindBy(id = "hotels")
	WebElement selecthtl;
	
	@FindBy(id = "room_type")
	WebElement selectrtype;
	
	@FindBy(id = "room_nos")
	WebElement selectrooms;
	
	@FindBy(id ="datepick_in")
	WebElement senddatein;
	
	@FindBy(id = "datepick_out")
	WebElement senddateout;
	
	@FindBy(id = "adult_room")
	WebElement selectAdultroom;
	
	@FindBy(id = "child_room")
	WebElement selectchild; 
	
	@FindBy(id = "Submit")
	WebElement subBtn;
	
	public SearchHotelPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getNamedisplayed() {
		return namedisplayed;
	}

	public WebElement getSeectloc() {
		return selectloc;
	}

	public WebElement getSelecthtl() {
		return selecthtl;
	}

	public WebElement getSelectrtype() {
		return selectrtype;
	}

	public WebElement getSelectrooms() {
		return selectrooms;
	}

	public WebElement getSenddatein() {
		return senddatein;
	}

	public WebElement getSenddateout() {
		return senddateout;
	}

	public WebElement getSelectAdultroom() {
		return selectAdultroom;
	}

	public WebElement getSelectchild() {
		return selectchild;
	}

	public WebElement getSubBtn() {
		return subBtn;
	}

	
}
