package com.TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Ada.Helper.Ada_FRM;
import com.baseclass.nov.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
		
		glue = "com.stepdefinition",
		
		monochrome = true,
		
		dryRun = false,
		
		strict = true,
		
		//tags = ("@smoketest, @sanitytest"),
		
		//tags = ("~@regressiontest"),
		
		plugin = {
				
				"html:Report/HtmlReport",
				
				"json:JsonReport/Report.json",
				
				"pretty",
				
				"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent.html"
				
		}
		
		)

public class TestRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		
		String browser = Ada_FRM.getInstanceAdaFRM().getInstanceAdaCr().getBrowserType();
		
		driver = Base_Class.getBrowser(browser);
				
	}
	
	@AfterClass
	public static void tear_Down() {

		driver.close();
		
	}

}
