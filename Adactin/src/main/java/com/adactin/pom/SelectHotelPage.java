package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	
	public  WebDriver driver;
	
	@FindBy(xpath = "//img[@class = 'logo']")
	WebElement Logopic;
	
	
	@FindBy(id ="radiobutton_0")
	WebElement ClickradioBtn;
	
	
	@FindBy(id = "continue")
	WebElement ClickcontinueBtn;
	
	

	public SelectHotelPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getLogopic() {
		return Logopic;
	}
	
	public WebElement getClickradioBtn() {
		return ClickradioBtn;
	}
	public WebElement getClickcontinueBtn() {
		return ClickcontinueBtn;
	}
	


}
