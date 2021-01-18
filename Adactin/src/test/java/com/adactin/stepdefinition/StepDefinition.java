package com.adactin.stepdefinition;



import org.junit.Assert;
import com.adactin.pom.BassClass;
//import com.adactin.pom.BookHotelPage;
//import com.adactin.pom.BookingConfirmationPage;
//import com.adactin.pom.LoginPage;
//import com.adactin.pom.SearchHotelPage;
//import com.adactin.pom.SelectHotelPage;
import com.adactin.utility.Filereadermanager;
import com.adactin.utility.PageObjectManager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;


public class StepDefinition extends BassClass {
	
	PageObjectManager pom = new PageObjectManager(driver);

	/*
	 * String expected = "SharmiSivakumar"; String actual = "SharmiSivakumar" ;
	 */
	@Before
	public void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("Scenario:  "+name);
		
	}
	
	@After
	public void afterHooks(Scenario scenario) throws Throwable {
		 String status = scenario.getStatus();
		 System.out.println("    Scenariostatus:         "+status);
		 if (scenario.isFailed()) {
			 screenshot(scenario.getName());
		 }
		
		
	}
	
	@Given("^User launches the adactin application$")
	public void user_launches_the_adactin_application() throws Throwable {
		System.out.println("User launches th adactin application");
	    
	}

	@When("^User log into the applcation$")
	public void user_log_into_the_applcation() throws Throwable {
		System.out.println("User log into the application");
	    
	}

	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {
		// getdriver("chrome");
		// geturl("https://www.adactinhotelapp.com/");

		String url = Filereadermanager.getfileinstance().getconinstance().getUrl();
		geturl(url);

	}

	@When("^User enters the valid \"([^\"]*)\"  in the username field$")
	public void user_enters_the_valid_in_the_username_field(String username) throws Throwable {
		//LoginPage Lp = new LoginPage(driver);
		inputvalueonelement(pom.getLogin().getUname(), username);

	}

	@When("^User enters the valid \"([^\"]*)\"  in the password field$")
	public void user_enters_the_valid_in_the_password_field(String password) throws Throwable {
		//LoginPage Pw = new LoginPage(driver);
		inputvalueonelement(pom.getLogin().getPword(), password);

	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		//LoginPage LBtn = new LoginPage(driver);
		clickonelement(pom.getLogin().getLoginBtn());

	}

	@Then("^User verifies whether the Homepage navigates to the Search hotel page$")
	public void user_verifies_whether_the_Homepage_navigates_to_the_Search_hotel_page() throws Throwable {
		//SearchHotelPage SearchHotel = new SearchHotelPage(driver);
		displayed(pom.getSearchH().getNamedisplayed());
		Assert.assertEquals(false, true);
		System.out.println("Element found in SearchHotelPage");

	}
	
	@When("^User selects the \"([^\"]*)\" in the location field$")
	public void user_selects_the_in_the_location_field(String value ) throws Throwable {
		//SearchHotelPage SearchHotel = new SearchHotelPage(driver);
		dropdown(pom.getSearchH().getSeectloc(), value, "byvalue");
	   
	}

	@When("^User selects the \"([^\"]*)\" in the hotel field$")
	public void user_selects_the_in_the_hotel_field(String value) throws Throwable {
		//SearchHotelPage SearchHotel = new SearchHotelPage(driver);
		dropdown(pom.getSearchH().getSelecthtl(), value, "byvalue");
	    
	}

	@When("^User selects \"([^\"]*)\"  in the room type field$")
	public void user_selects_in_the_room_type_field(String value) throws Throwable {
		//SearchHotelPage SearchHotel = new SearchHotelPage(driver);
		dropdown(pom.getSearchH().getSelectrtype(), value, "byvalue");
	    
	}

	@When("^User selects \"([^\"]*)\"   in the number of room field$")
	public void user_selects_in_the_number_of_room_field(String value) throws Throwable {
		//SearchHotelPage SearchHotel = new SearchHotelPage(driver);
		dropdown(pom.getSearchH().getSelectrooms(), value, "byvalue");
	    
	}

	@When("^User enters \"([^\"]*)\"  in the check in date field$")
	public void user_enters_in_the_check_in_date_field(String value) throws Throwable {
		//SearchHotelPage SearchHotel = new SearchHotelPage(driver);
		inputvalueonelement(pom.getSearchH().getSenddatein(), value);
	   
	}

	@When("^User enters \"([^\"]*)\"  in the check out date field$")
	public void user_enters_in_the_check_out_date_field(String value) throws Throwable {
		//SearchHotelPage SearchHotel = new SearchHotelPage(driver);
		 inputvalueonelement(pom.getSearchH().getSenddateout(), value);
	    
	}

	@When("^User selects \"([^\"]*)\"  in the adults per room field$")
	public void user_selects_in_the_adults_per_room_field(String value  ) throws Throwable {
		//SearchHotelPage SearchHotel = new SearchHotelPage(driver);
		dropdown(pom.getSearchH().getSelectAdultroom(), value , "byvisibletext");
	    
	}

	@When("^User selects \"([^\"]*)\"  in the children per room field$")
	public void user_selects_in_the_children_per_room_field(String value) throws Throwable {
		//SearchHotelPage SearchHotel = new SearchHotelPage(driver);
		dropdown(pom.getSearchH().getSelectchild(), value , "byindex");
	    
	}

	@When("^User clicks on the search button$")
	public void user_clicks_on_the_search_button() throws Throwable {
	   //SearchHotelPage SearchHotel = new SearchHotelPage(driver);
	   clickonelement(pom.getSearchH().getSubBtn());
		    
	}

	@Then("^User verifies whether search hotel page navigates to select hotel page$")
	public void user_verifies_whether_search_hotel_page_navigates_to_select_hotel_page() throws Throwable {
	   //SelectHotelPage selectHotel1 = new  SelectHotelPage(driver);
	   displayed(pom.getSelectH().getLogopic());
	   
	   System.out.println("Logo Found in Select Hotel Page");
			    
	}
	
	@When("^User clicks on the select radion button$") 
	 public void  user_clicks_on_the_select_radion_button() throws Throwable {
	    //SelectHotelPage selectHotel2 = new SelectHotelPage(driver);
	    clickonelement(pom.getSelectH().getClickradioBtn());
	 
	  }
	 
	 @When("^User clicks on the continue button$") 
	 public void user_clicks_on_the_continue_button() throws Throwable { 
	   // SelectHotelPage selectHotel2 = new SelectHotelPage(driver);
	    clickonelement(pom.getSelectH().getClickcontinueBtn());
	  
	  }
	 
	  @Then("^User verifies whether select hotel page navigates to book a hotel page$" )
	  public void user_verifies_whether_select_hotel_page_navigates_to_book_a_hotel_page() throws Throwable {
	      // BookHotelPage bookHotel = new BookHotelPage(driver);
	       displayed(pom.getBookH().getLogopic());
	       System.out.println("Logo found in BookHotelPage");
	  
	  }
	  
	  @When("^User enters \"([^\"]*)\"  in the first name field$")
	  public void user_enters_in_the_first_name_field(String value) throws Throwable {
		  	 //BookHotelPage bookHotel = new BookHotelPage(driver);
			 inputvalueonelement(pom.getBookH().getEnterFN(), value );
		  	     
	  }

	  @When("^User enters \"([^\"]*)\" in the last name field$")
	  public void user_enters_in_the_last_name_field(String value) throws Throwable {
		     //BookHotelPage bookHotel = new BookHotelPage(driver);
			 inputvalueonelement(pom.getBookH().getEnterLN(), value);
	      
	  }

	  @When("^User enters \"([^\"]*)\"  in the billing address field$")
	  public void user_enters_in_the_billing_address_field(String value) throws Throwable {
		     //BookHotelPage bookHotel = new BookHotelPage(driver);
			 inputvalueonelement(pom.getBookH().getEnterAdd(), value);
		     
	  }

	  @When("^User enters \"([^\"]*)\"  in the credit card no field$")
	  public void user_enters_in_the_credit_card_no_field(String value) throws Throwable {
		    // BookHotelPage bookHotel = new BookHotelPage(driver);
			 inputvalueonelement(pom.getBookH().getEnterCN(), value);
			      
	  }

	  @When("^User selects \"([^\"]*)\"  in the credit card type field$")
	  public void user_selects_in_the_credit_card_type_field(String value) throws Throwable {
		      //BookHotelPage bookHotel = new BookHotelPage(driver);
			  dropdown(pom.getBookH().getSelectCT(), value, "byindex");
		      
	  }

	  @When("^User selects \"([^\"]*)\"  in the month date field$")
	  public void user_selects_in_the_month_date_field(String value) throws Throwable {
		     // BookHotelPage bookHotel = new BookHotelPage(driver);
			  dropdown(pom.getBookH().getSelectMth(), value, "byindex");
			      
	  }

	  @When("^User selects \"([^\"]*)\" in the year field$")
	  public void user_selects_in_the_year_field(String value) throws Throwable {
		    // BookHotelPage bookHotel = new BookHotelPage(driver);
		     dropdown(pom.getBookH().getSelectYer(), value, "byindex");
			      
	  }

	  @When("^User enters \"([^\"]*)\" in the CCV number field$")
	  public void user_enters_in_the_CCV_number_field(String value) throws Throwable {
		     //BookHotelPage bookHotel = new BookHotelPage(driver);
			 inputvalueonelement(pom.getBookH().getEnterCnum(), value);
			      
	  }

	  @When("^User clicks on the book now button$")
	  public void user_clicks_on_the_book_now_button() throws Throwable {
		   // BookHotelPage bookHotel = new BookHotelPage(driver);
		    clickonelement(pom.getBookH().getClickBookBtn()); 
			      
	  }

	  @Then("^User verifies whether book hotel page navigates to booking confirmation page$")
	  public void user_verifies_whether_book_hotel_page_navigates_to_booking_confirmation_page() throws Throwable {
		    //BookingConfirmationPage confirmationPage = new BookingConfirmationPage(driver);
		    displayed(pom.getBookC().getMyitinerary());
		    System.out.println("MyItinerary element is found in conformation page");
							  
	  }
	  
	  @When("^User clicks on the logout button$") 
	  public void user_clicks_on_the_logout_button() throws Throwable { 
		    //BookingConfirmationPage confirmationPage = new BookingConfirmationPage(driver);
		    clickonelement(pom.getBookC().getLogoutBtn());
		  
	  }
	  
	  @Then("^User verifies whether the booking conformation page returned to homepage after logout$" )
	 public void user_verifies_whether_the_booking_conformation_page_returned_to_homepage_after_logout () throws Throwable {
		    //BookingConfirmationPage confirmationPage = new BookingConfirmationPage(driver);
		    clickonelement(pom.getBookC().getClicklog());
		    displayed(pom.getBookC().getReturnedlogin());
			System.out.println("User returned to HomePage");
					  
	  }	
	  
	 
}
				  
	    
				  
				  
				 
	  


	  
	  
	  



	/*
	 * @When("^User enters the valid username in the username field$") public void
	 * user_enters_the_valid_username_in_the_username_field() throws Throwable {
	 * LoginPage Lp = new LoginPage(driver); inputvalueonelement(Lp.getUname(),
	 * "SharmiSivakumar");
	 * 
	 * }
	 * 
	 * @When("^User enters the valid password in the password field$") public void
	 * user_enters_the_valid_password_in_the_password_field() throws Throwable {
	 * LoginPage Pw = new LoginPage(driver); inputvalueonelement(Pw.getPword(),
	 * "sharmi1234");
	 * 
	 * }
	 * 
	 * @When("^User clicks on the login button$") public void
	 * user_clicks_on_the_login_button() throws Throwable { LoginPage LBtn = new
	 * LoginPage(driver); clickonelement(LBtn.getLoginBtn());
	 * 
	 * }
	 * 
	 * @Then("^User verifies whether the Homepage navigates to the Search hotel page$"
	 * ) public void
	 * user_verifies_whether_the_Homepage_navigates_to_the_Search_hotel_page()
	 * throws Throwable { SearchHotelPage SearchHotel = new SearchHotelPage(driver);
	 * displayed(SearchHotel.getNamedisplayed());
	 * System.out.println("Element found in SearchHotelPage");
	 * 
	 * }
	 * 
	 * @When("^User selects the location in the location field$") public void
	 * user_selects_the_location_in_the_location_field() throws Throwable {
	 * SearchHotelPage SearchHotel = new SearchHotelPage(driver);
	 * dropdown(SearchHotel.getSeectloc(), "London", "byvalue"); }
	 * 
	 * @When("^User selects the hotel in the hotel field$") public void
	 * user_selects_the_hotel_in_the_hotel_field() throws Throwable {
	 * SearchHotelPage SearchHotel = new SearchHotelPage(driver);
	 * dropdown(SearchHotel.getSelecthtl(), "Hotel Sunshine", "byvalue"); }
	 * 
	 * @When("^User selects room type in the room type field$") public void
	 * user_selects_room_type_in_the_room_type_field() throws Throwable {
	 * SearchHotelPage SearchHotel = new SearchHotelPage(driver);
	 * dropdown(SearchHotel.getSelectrtype(), "Super Deluxe", "byvalue" ); }
	 * 
	 * @When("^User selects number of rooms  in the number of room field$") public
	 * void user_selects_number_of_rooms_in_the_number_of_room_field() throws
	 * Throwable { SearchHotelPage SearchHotel = new SearchHotelPage(driver);
	 * dropdown(SearchHotel.getSelectrooms(), "2", "byvalue"); }
	 * 
	 * @When("^User enters an arrive date to the hotel in the check in date field$")
	 * public void
	 * user_enters_an_arrive_date_to_the_hotel_in_the_check_in_date_field() throws
	 * Throwable { SearchHotelPage SearchHotel = new SearchHotelPage(driver);
	 * inputvalueonelement(SearchHotel.getSenddatein(), "05/01/2021");
	 * 
	 * }
	 * 
	 * @When("^User enters depature date from the hotel in the check out date field$"
	 * ) public void
	 * user_enters_depature_date_from_the_hotel_in_the_check_out_date_field() throws
	 * Throwable { SearchHotelPage SearchHotel = new SearchHotelPage(driver);
	 * inputvalueonelement(SearchHotel.getSenddateout(), "07/01/2021"); }
	 * 
	 * @When("^User selects number of adults per room in the adults per room field$"
	 * ) public void
	 * user_selects_number_of_adults_per_room_in_the_adults_per_room_field() throws
	 * Throwable { SearchHotelPage SearchHotel = new SearchHotelPage(driver);
	 * dropdown(SearchHotel.getSelectAdultroom(), "2 - Two", "byvisibletext"); }
	 * 
	 * @When("^User selects number of childern per room in the children per room field$"
	 * ) public void
	 * user_selects_number_of_childern_per_room_in_the_children_per_room_field()
	 * throws Throwable { SearchHotelPage SearchHotel = new SearchHotelPage(driver);
	 * dropdown(SearchHotel.getSelectchild(), "3", "byindex"); }
	 * 
	 * @When("^User clicks on the search button$") public void
	 * user_clicks_on_the_search_button() throws Throwable { SearchHotelPage
	 * SearchHotel = new SearchHotelPage(driver);
	 * clickonelement(SearchHotel.getSubBtn());
	 * 
	 * }
	 * 
	 * @Then("^User verifies whether search hotel page navigates to select hotel page$"
	 * ) public void
	 * user_verifies_whether_search_hotel_page_navigates_to_select_hotel_page()
	 * throws Throwable { SelectHotelPage selectHotel2 = new
	 * SelectHotelPage(driver); displayed(selectHotel2.getLogopic());
	 * System.out.println("Logo Found in Select Hotel Page");
	 * 
	 * }
	 * 
	 * @When("^User clicks on the select radion button$") public void
	 * user_clicks_on_the_select_radion_button() throws Throwable { SelectHotelPage
	 * selectHotel2 = new SelectHotelPage(driver);
	 * clickonelement(selectHotel2.getClickradioBtn());
	 * 
	 * }
	 * 
	 * @When("^User clicks on the continue button$") public void
	 * user_clicks_on_the_continue_button() throws Throwable { SelectHotelPage
	 * selectHotel2 = new SelectHotelPage(driver);
	 * clickonelement(selectHotel2.getClickcontinueBtn());
	 * 
	 * }
	 * 
	 * @Then("^User verifies whether select hotel page navigates to book a hotel page$"
	 * ) public void
	 * user_verifies_whether_select_hotel_page_navigates_to_book_a_hotel_page()
	 * throws Throwable { BookHotelPage bookHotel = new BookHotelPage(driver);
	 * displayed(bookHotel.getLogopic());
	 * System.out.println("Logo found in BookHotelPage");
	 * 
	 * }
	 * 
	 * @When("^User enters first name in the first name field$") public void
	 * user_enters_first_name_in_the_first_name_field() throws Throwable {
	 * BookHotelPage bookHotel = new BookHotelPage(driver);
	 * inputvalueonelement(bookHotel.getEnterFN(), "Sharmi");
	 * 
	 * }
	 * 
	 * @When("^User enters last name in the last name field$") public void
	 * user_enters_last_name_in_the_last_name_field() throws Throwable {
	 * BookHotelPage bookHotel = new BookHotelPage(driver);
	 * inputvalueonelement(bookHotel.getEnterLN(), "Sivakumar");
	 * 
	 * }
	 * 
	 * @When("^User enters billing address in the billing address field$") public
	 * void user_enters_billing_address_in_the_billing_address_field() throws
	 * Throwable { BookHotelPage bookHotel = new BookHotelPage(driver);
	 * inputvalueonelement(bookHotel.getEnterAdd(), "Sathuvachari,Vellore"); }
	 * 
	 * @When("^User enters credit card no in the credit card no field$") public void
	 * user_enters_credit_card_no_in_the_credit_card_no_field() throws Throwable {
	 * BookHotelPage bookHotel = new BookHotelPage(driver);
	 * inputvalueonelement(bookHotel.getEnterCN(), "1234567891012345");
	 * 
	 * }
	 * 
	 * @When("^User selects credit card type in the credit card type field$") public
	 * void user_selects_credit_card_type_in_the_credit_card_type_field() throws
	 * Throwable { BookHotelPage bookHotel = new BookHotelPage(driver);
	 * dropdown(bookHotel.getSelectCT(), "3", "byindex"); }
	 * 
	 * @When("^User selects month and date of expiry date in the expiry date field$"
	 * ) public void
	 * user_selects_month_and_date_of_expiry_date_in_the_expiry_date_field() throws
	 * Throwable { BookHotelPage bookHotel = new BookHotelPage(driver);
	 * dropdown(bookHotel.getSelectMth(), "4", "byindex");
	 * dropdown(bookHotel.getSelectYer(), "7", "byindex"); }
	 * 
	 * @When("^User enters CCV number in the CCV number field$") public void
	 * user_enters_CCV_number_in_the_CCV_number_field() throws Throwable {
	 * BookHotelPage bookHotel = new BookHotelPage(driver);
	 * inputvalueonelement(bookHotel.getEnterCnum(), "1234"); }
	 * 
	 * @When("^User clicks on the book now button$") public void
	 * user_clicks_on_the_book_now_button() throws Throwable { BookHotelPage
	 * bookHotel = new BookHotelPage(driver);
	 * clickonelement(bookHotel.getClickBookBtn());
	 * 
	 * }
	 * 
	 * @Then("^User verifies whether book hotel page navigates to booking confirmation page$"
	 * ) public void
	 * user_verifies_whether_book_hotel_page_navigates_to_booking_confirmation_page(
	 * ) throws Throwable { BookingConfirmationPage confirmationPage = new
	 * BookingConfirmationPage(driver);
	 * displayed(confirmationPage.getMyitinerary());
	 * System.out.println("MyItinerary element is found in conformation page"); }
	 * 
	 * @When("^User clicks on the logout button$") public void
	 * user_clicks_on_the_logout_button() throws Throwable { BookingConfirmationPage
	 * confirmationPage = new BookingConfirmationPage(driver);
	 * clickonelement(confirmationPage.getLogoutBtn());
	 * 
	 * }
	 * 
	 * @Then("^User verifies whether the booking conformation page returned to homepage after logout$"
	 * ) public void
	 * user_verifies_whether_the_booking_conformation_page_returned_to_homepage_after_logout
	 * () throws Throwable {
	 * 
	 * BookingConfirmationPage confirmationPage = new
	 * BookingConfirmationPage(driver);
	 * clickonelement(confirmationPage.getClicklog());
	 * displayed(confirmationPage.getReturnedlogin());
	 * System.out.println("User returned to HomePage");
	 * 
	 * 
	 * }
	 * 
	 */
//}
