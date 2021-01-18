package com.adactin.utility;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotelPage;
import com.adactin.pom.BookingConfirmationPage;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SelectHotelPage;

public class PageObjectManager {
	
	
	public static WebDriver driver;
	
	private LoginPage login;
	private SearchHotelPage searchH;
	private SelectHotelPage selectH;
	private BookHotelPage bookH;
	private BookingConfirmationPage bookC;
	
	
	public PageObjectManager(WebDriver ldriver) {
		PageObjectManager.driver = ldriver;
		
	}
	
	
	public LoginPage getLogin() {
		 login = new LoginPage(driver);
		return login;
	}
	public SearchHotelPage getSearchH() {
		searchH = new SearchHotelPage(driver);
		return searchH;
	}
	public SelectHotelPage getSelectH() {
		selectH = new SelectHotelPage(driver);
		return selectH;
	}
	public BookHotelPage getBookH() {
		bookH = new BookHotelPage(driver); 
		return bookH;
	}
	public BookingConfirmationPage getBookC() {
		bookC = new BookingConfirmationPage(driver);
		return bookC;
	}
	

}
