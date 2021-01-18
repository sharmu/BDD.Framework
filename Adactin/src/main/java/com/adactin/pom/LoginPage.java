package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver; 
		
	@FindBy(id = "username")
	WebElement Uname;
	
	@FindBy(id = "password")
	WebElement pword;
	
	@FindBy(id = "login")
	WebElement loginBtn;
	
	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this); 
		
		}
			
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUname() {
		return Uname;
	}

	public WebElement getPword() {
		return pword;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
