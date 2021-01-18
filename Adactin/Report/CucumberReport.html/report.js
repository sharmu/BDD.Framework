$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking functionality in the adactin application",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify the user is able to login the application",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;verify-the-user-is-able-to-login-the-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the valid \"\u003cusername\u003e\"  in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters the valid \"\u003cpassword\u003e\"  in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies whether the Homepage navigates to the Search hotel page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;verify-the-user-is-able-to-login-the-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "booking-functionality-in-the-adactin-application;verify-the-user-is-able-to-login-the-application;;1"
    },
    {
      "cells": [
        "SSS",
        "123"
      ],
      "line": 12,
      "id": "booking-functionality-in-the-adactin-application;verify-the-user-is-able-to-login-the-application;;2"
    },
    {
      "cells": [
        "AAA",
        "222"
      ],
      "line": 13,
      "id": "booking-functionality-in-the-adactin-application;verify-the-user-is-able-to-login-the-application;;3"
    },
    {
      "cells": [
        "SharmiSivakumar",
        "sharmi1234"
      ],
      "line": 14,
      "id": "booking-functionality-in-the-adactin-application;verify-the-user-is-able-to-login-the-application;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Verify the user is able to login the application",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;verify-the-user-is-able-to-login-the-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the valid \"SSS\"  in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters the valid \"123\"  in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies whether the Homepage navigates to the Search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_application()"
});
formatter.result({
  "duration": 10322787560,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SSS",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 1705698051,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 144549067,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 1595354979,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_the_Homepage_navigates_to_the_Search_hotel_page()"
});
formatter.result({
  "duration": 325310296,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#username_show\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LIVE-PC\u0027, ip: \u0027192.168.43.113\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\Live\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:56085}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 2cf06bcbaf308dfb1f58174cf70a1831\n*** Element info: {Using\u003did, value\u003dusername_show}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.isDisplayed(Unknown Source)\r\n\tat com.adactin.pom.BassClass.displayed(BassClass.java:357)\r\n\tat com.adactin.stepdefinition.StepDefinition.user_verifies_whether_the_Homepage_navigates_to_the_Search_hotel_page(StepDefinition.java:49)\r\n\tat ✽.Then User verifies whether the Homepage navigates to the Search hotel page(src/test/java/com/adactin/feature/Adactin.feature:8)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify the user is able to login the application",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;verify-the-user-is-able-to-login-the-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the valid \"AAA\"  in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters the valid \"222\"  in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies whether the Homepage navigates to the Search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_application()"
});
formatter.result({
  "duration": 713102051,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 129358891,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "222",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 110927572,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 878106687,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_the_Homepage_navigates_to_the_Search_hotel_page()"
});
formatter.result({
  "duration": 27960244,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#username_show\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LIVE-PC\u0027, ip: \u0027192.168.43.113\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\Live\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:56085}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 2cf06bcbaf308dfb1f58174cf70a1831\n*** Element info: {Using\u003did, value\u003dusername_show}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.isDisplayed(Unknown Source)\r\n\tat com.adactin.pom.BassClass.displayed(BassClass.java:357)\r\n\tat com.adactin.stepdefinition.StepDefinition.user_verifies_whether_the_Homepage_navigates_to_the_Search_hotel_page(StepDefinition.java:49)\r\n\tat ✽.Then User verifies whether the Homepage navigates to the Search hotel page(src/test/java/com/adactin/feature/Adactin.feature:8)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify the user is able to login the application",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;verify-the-user-is-able-to-login-the-application;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the valid \"SharmiSivakumar\"  in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters the valid \"sharmi1234\"  in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies whether the Homepage navigates to the Search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_application()"
});
formatter.result({
  "duration": 584211347,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SharmiSivakumar",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 159132261,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sharmi1234",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 125776626,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 5012487104,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_the_Homepage_navigates_to_the_Search_hotel_page()"
});
formatter.result({
  "duration": 199421755,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify the user entered search hotel page",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;verify-the-user-entered-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "User selects the \"London\" in the location field",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User selects the \"Hotel Sunshine\" in the hotel field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User selects \"Super Deluxe\"  in the room type field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User selects \"2\"   in the number of room field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User enters \"05/01/2021\"  in the check in date field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enters \"07/01/2021\"  in the check out date field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User selects \"2 - Two\"  in the adults per room field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User selects \"3\"  in the children per room field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User clicks on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User verifies whether search hotel page navigates to select hotel page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 18
    }
  ],
  "location": "StepDefinition.user_selects_the_in_the_location_field(String)"
});
formatter.result({
  "duration": 605655582,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Sunshine",
      "offset": 18
    }
  ],
  "location": "StepDefinition.user_selects_the_in_the_hotel_field(String)"
});
formatter.result({
  "duration": 177090507,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Super Deluxe",
      "offset": 14
    }
  ],
  "location": "StepDefinition.user_selects_in_the_room_type_field(String)"
});
formatter.result({
  "duration": 461267301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 14
    }
  ],
  "location": "StepDefinition.user_selects_in_the_number_of_room_field(String)"
});
formatter.result({
  "duration": 159117600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "05/01/2021",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_in_the_check_in_date_field(String)"
});
formatter.result({
  "duration": 128977696,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "07/01/2021",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_in_the_check_out_date_field(String)"
});
formatter.result({
  "duration": 122087821,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2 - Two",
      "offset": 14
    }
  ],
  "location": "StepDefinition.user_selects_in_the_adults_per_room_field(String)"
});
formatter.result({
  "duration": 2037155378,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 14
    }
  ],
  "location": "StepDefinition.user_selects_in_the_children_per_room_field(String)"
});
formatter.result({
  "duration": 218153633,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_search_button()"
});
formatter.result({
  "duration": 3429062096,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_search_hotel_page_navigates_to_select_hotel_page()"
});
formatter.result({
  "duration": 234891073,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Verify the user entered to select hotel page",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;verify-the-user-entered-to-select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "User clicks on the select radion button",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User clicks on the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User verifies whether select hotel page navigates to book a hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_select_radion_button()"
});
formatter.result({
  "duration": 91192367,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_continue_button()"
});
formatter.result({
  "duration": 1547900465,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_select_hotel_page_navigates_to_book_a_hotel_page()"
});
formatter.result({
  "duration": 365304608,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Verify the user entered to book a hotel page",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;verify-the-user-entered-to-book-a-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "User enters \"Sharmi\"  in the first name field",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "User enters \"Sivakumar\" in the last name field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User enters \"Sathuvachari,Vellore\"  in the billing address field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User enters \"1234567891012345\"  in the credit card no field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User selects \"3\"  in the credit card type field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User selects \"4\"  in the month date field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User selects \"7\" in the year field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User enters \"1234\" in the CCV number field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User clicks on the book now button",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User verifies whether book hotel page navigates to booking confirmation page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sharmi",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_in_the_first_name_field(String)"
});
formatter.result({
  "duration": 1459227902,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sivakumar",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_in_the_last_name_field(String)"
});
formatter.result({
  "duration": 142387001,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sathuvachari,Vellore",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_in_the_billing_address_field(String)"
});
formatter.result({
  "duration": 163669472,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567891012345",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_in_the_credit_card_no_field(String)"
});
formatter.result({
  "duration": 143246158,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 14
    }
  ],
  "location": "StepDefinition.user_selects_in_the_credit_card_type_field(String)"
});
formatter.result({
  "duration": 214752190,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 14
    }
  ],
  "location": "StepDefinition.user_selects_in_the_month_date_field(String)"
});
formatter.result({
  "duration": 210868390,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 14
    }
  ],
  "location": "StepDefinition.user_selects_in_the_year_field(String)"
});
formatter.result({
  "duration": 288405139,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_in_the_CCV_number_field(String)"
});
formatter.result({
  "duration": 110041047,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_book_now_button()"
});
formatter.result({
  "duration": 295478770,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_book_hotel_page_navigates_to_booking_confirmation_page()"
});
formatter.result({
  "duration": 465475119,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Verify the user entered to booking confirmation page",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;verify-the-user-entered-to-booking-confirmation-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 46,
  "name": "User clicks on the logout button",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "User verifies whether the booking conformation page returned to homepage after logout",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_logout_button()"
});
formatter.result({
  "duration": 2409967593,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_the_booking_conformation_page_returned_to_homepage_after_logout()"
});
formatter.result({
  "duration": 2052681299,
  "status": "passed"
});
});