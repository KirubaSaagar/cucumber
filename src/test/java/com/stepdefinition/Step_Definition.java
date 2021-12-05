package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Ada.Helper.Ada_FRM;
import com.Adactin.sdp.Pom_Adactin;
import com.TestRunner.TestRunner;
import com.baseclass.nov.Base_Class;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class{
	
	public static WebDriver driver = TestRunner.driver;
	
	public static Pom_Adactin pom = new Pom_Adactin(driver);
	
	@Before
	public void beforeHooks(Scenario s) {

		String name = s.getName();
		
		System.out.println("Name : "+name);
	}
	
	@After
	public void afterHooks(Scenario s) throws Throwable {

		if (s.isFailed()) {
			
			screenShotName("Failedimage");
			
		}
		
		String status = s.getStatus();
		
		System.out.println("Status : "+status);
	}
	
	@Given("^user Launched The Application$")
	public void user_Launched_The_Application() throws Throwable {
		
		String url = Ada_FRM.getInstanceAdaFRM().getInstanceAdaCr().getUrl();
	   
		getURL(url);
		
		implicitWait(50);
	}
	
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
	   
		inputValueElement(pom.getInstanceLp().getUsername(), username);
	
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
	  
		inputValueElement(pom.getInstanceLp().getPassword(), password);

		
	}


	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	  
		ClickOnElement(pom.getInstanceLp().getLoginbutton());
	}
	
	@When("^user Select The \"([^\"]*)\" Hotel Location$")
	public void user_Select_The_Hotel_Location(String location) throws Throwable {
	
		dropDownSelectByValue(pom.getInstanceSear().getLocation(), location);

		
	}


	@When("^user Select The \"([^\"]*)\" Hotel$")
	public void user_Select_The_Hotel(String hotel) throws Throwable {
	   
		dropdown(pom.getInstanceSear().getHotels(), "byvalue", hotel);
	
	}
	
	@When("^user Select The \"([^\"]*)\" Hotel Room Type$")
	public void user_Select_The_Hotel_Room_Type(String type) throws Throwable {
		
		dropdown(pom.getInstanceSear().getRoomtype(), "byvalue", type);

	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		
		dropdown(pom.getInstanceSear().getRoomnos(), "byvalue", "3");


	}

	@When("^user Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {
		
	String checkInDate = Ada_FRM.getInstanceAdaFRM().getInstanceAdaCr().getCheckInDate();
		
	inputValueElement(pom.getInstanceSear().getCheckindate(), checkInDate);
	   
	}

	@When("^user Select The Check Out Date$")
	public void user_Select_The_Check_Out_Date() throws Throwable {
		
    String checkOutDate = Ada_FRM.getInstanceAdaFRM().getInstanceAdaCr().getCheckOutDate();
		
	inputValueElement(pom.getInstanceSear().getCheckoutdate(), checkOutDate);
	  
	}

	@When("^user Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {
		
		dropdown(pom.getInstanceSear().getAdults(), "byvalue", "2");
	    
	}

	@When("^user Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
		
		dropdown(pom.getInstanceSear().getChild(), "byvalue", "2");
	
	}

	@Then("^user Click On The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
	 
		ClickOnElement(pom.getInstanceSear().getSearch_button());

	}

	@When("^user Select The Select Radio Button$")
	public void user_Select_The_Select_Radio_Button() throws Throwable {
		
		ClickOnElement(pom.getInstanceSel().getRadiobutton());
    
	}

	@Then("^user Click On The Continue Button And It Navigates To The Book Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page() throws Throwable {
	   
		ClickOnElement(pom.getInstanceSel().getContinuebutton());

	}

	@When("^user Enter The Firstname In FirstName Field$")
	public void user_Enter_The_Firstname_In_FirstName_Field() throws Throwable {
	   
		String firstname = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\AdactinTestCases-KirubaSaagar.xlsx", 0, 19, 5);
		
		inputValueElement(pom.getInstanceBh().getFirstname(), firstname );
	}

	@When("^user Enter The Lastname In LastName Field$")
	public void user_Enter_The_Lastname_In_LastName_Field() throws Throwable {
	 
		String lastname = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\AdactinTestCases-KirubaSaagar.xlsx", 0, 20, 5);
		
		inputValueElement(pom.getInstanceBh().getLastname(), lastname);
	}

	@When("^user Enter The Address In Billing Address Field$")
	public void user_Enter_The_Address_In_Billing_Address_Field() throws Throwable {
	   
		String address = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\AdactinTestCases-KirubaSaagar.xlsx", 0, 21, 5);
		
		inputValueElement(pom.getInstanceBh().getAddress(), address);
	}

	@When("^user Enter The Credit Card Number In Credit Card Number Field$")
	public void user_Enter_The_Credit_Card_Number_In_Credit_Card_Number_Field() throws Throwable {
	   
		String cardNumber = Ada_FRM.getInstanceAdaFRM().getInstanceAdaCr().getCardNumber();
		
		inputValueElement(pom.getInstanceBh().getCreditcardno(), cardNumber);
	}

	@When("^user Select The Credit Card Type$")
	public void user_Select_The_Credit_Card_Type() throws Throwable {
		
		dropdown(pom.getInstanceBh().getCardtype(), "byvalue", "MAST");
	   
	}

	@When("^user Select The Month In Expiry Date$")
	public void user_Select_The_Month_In_Expiry_Date() throws Throwable {
	   
		dropdown(pom.getInstanceBh().getMonth(), "byvalue", "12");

	}

	@When("^user Select The Year In Expiry Date$")
	public void user_Select_The_Year_In_Expiry_Date() throws Throwable {
	   
		dropdown(pom.getInstanceBh().getYear(), "byvalue", "2022");

	}

	@When("^user Enter The CVV Number$")
	public void user_Enter_The_CVV_Number() throws Throwable {
		
		String cvv = Ada_FRM.getInstanceAdaFRM().getInstanceAdaCr().getCVV();
		
		inputValueElement(pom.getInstanceBh().getCvv(), cvv);
	    
	}

	@Then("^user Click On The BookNow Button And It Navigates To The Booking Confirmation Page$")
	public void user_Click_On_The_BookNow_Button_And_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {
	
		ClickOnElement(pom.getInstanceBh().getBooknow_button());

	}

	@Then("^the User Click On LogoutButton And It Navigates To The Logout Successfull Page$")
	public void the_User_Click_On_LogoutButton_And_It_Navigates_To_The_Logout_Successfull_Page() throws Throwable {
	 
		ClickOnElement(pom.getInstanceBh().getLogout_button());

	}

	
	

}
