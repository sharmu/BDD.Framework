package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.pom.BassClass;
import com.adactin.utility.Filereadermanager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/com/adactin/feature/Adactin.feature", 
                              glue = "com\\adactin\\stepdefinition",
                              plugin = //{"pretty","html:Report/CucumberReport.html","json:Report/Cucumber.json",
                          {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Report/CucumberExtentReport.html"},
                              //tags = {"@SmokeTest"}, //  @SmokeTest to run particular scenario in feature 
                              monochrome = true,
                              dryRun = false, strict = true)

public class TestRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws IOException {
		String browserName = Filereadermanager.getfileinstance().getconinstance().BrowserName();
		driver = BassClass.getdriver(browserName);
		
		
	} 
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}

}
 

