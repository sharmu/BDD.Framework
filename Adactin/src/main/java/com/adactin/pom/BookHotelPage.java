package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage {
	
	public  WebDriver driver;
	
	
	@FindBy(xpath = "//img[@class = \"logo\"]")
	WebElement Logopic;
	
	@FindBy(id = "first_name")
	WebElement EnterFN;
	
	@FindBy(id = "last_name" )
	WebElement EnterLN;
	
	@FindBy(id = "address")
	WebElement EnterAdd;
	
	@FindBy(id = "cc_num")
	WebElement EnterCN;
	
	@FindBy(id = "cc_type")
	WebElement SelectCT;
	
	@FindBy(id = "cc_exp_month")
	WebElement SelectMth;
	
	@FindBy(id = "cc_exp_year")
	WebElement SelectYer;
	
	@FindBy(id = "cc_cvv")
	WebElement EnterCnum;
	
	@FindBy(id = "book_now")
	WebElement ClickBookBtn;
	
	public BookHotelPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	public WebElement getLogopic() {
		return Logopic;
	}

	public WebElement getEnterFN() {
		return EnterFN;
	}

	public WebElement getEnterLN() {
		return EnterLN;
	}

	public WebElement getEnterAdd() {
		return EnterAdd;
	}

	public WebElement getEnterCN() {
		return EnterCN;
	}

	public WebElement getSelectCT() {
		return SelectCT;
	}

	public WebElement getSelectMth() {
		return SelectMth;
	}

	public WebElement getSelectYer() {
		return SelectYer;
	}

	public WebElement getEnterCnum() {
		return EnterCnum;
	}

	public WebElement getClickBookBtn() {
		return ClickBookBtn;
	}

	
	

}
