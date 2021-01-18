  Feature: Booking functionality in the adactin application
  
  Background:
  Given User launches the adactin application
  When User log into the applcation

  Scenario Outline: Verify the user is able to login the application
    Given User launches the application
    When User enters the valid "<username>"  in the username field
    And User enters the valid "<password>"  in the password field
    And User clicks on the login button
    Then User verifies whether the Homepage navigates to the Search hotel page
    
    Examples:
    |username|password|
    |SSS|123|
    |AAA|222|
    |SharmiSivakumar|sharmi1234|

  Scenario: Verify the user entered search hotel page
    When User selects the "London" in the location field
    And User selects the "Hotel Sunshine" in the hotel field
    And User selects "Super Deluxe"  in the room type field
    And User selects "2"   in the number of room field
    And User enters "05/01/2021"  in the check in date field
    And User enters "07/01/2021"  in the check out date field
    And User selects "2 - Two"  in the adults per room field
    And User selects "3"  in the children per room field
    And User clicks on the search button
    Then User verifies whether search hotel page navigates to select hotel page

  Scenario: Verify the user entered to select hotel page
    When User clicks on the select radion button
    And User clicks on the continue button
    Then User verifies whether select hotel page navigates to book a hotel page

  Scenario: Verify the user entered to book a hotel page
    When User enters "Sharmi"  in the first name field
    And User enters "Sivakumar" in the last name field
    And User enters "Sathuvachari,Vellore"  in the billing address field
    And User enters "1234567891012345"  in the credit card no field
    And User selects "3"  in the credit card type field
    And User selects "4"  in the month date field
    And User selects "7" in the year field
    And User enters "1234" in the CCV number field
    And User clicks on the book now button
    Then User verifies whether book hotel page navigates to booking confirmation page

  Scenario: Verify the user entered to booking confirmation page
    When User clicks on the logout button
    Then User verifies whether the booking conformation page returned to homepage after logout
    
    
    
    
    
    
