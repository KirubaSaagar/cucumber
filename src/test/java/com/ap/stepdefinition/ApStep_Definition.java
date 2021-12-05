package com.ap.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.ap.testrunner.ApTestRunner;
import com.baseclass.nov.Base_Class;
import com.helper.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApStep_Definition extends Base_Class{
	
	public static WebDriver driver = ApTestRunner.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("^user Launched The Application$")
	public void user_Launched_The_Application() throws Throwable {
	   
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
		
		getURL(url);
				
		implicitWait(30);
	}

	@Then("^user Click On The SignIn Button And It Navigates To The SignIn Page$")
	public void user_Click_On_The_SignIn_Button_And_It_Navigates_To_The_SignIn_Page() throws Throwable {

		ClickOnElement(pom.getInstanceHp().getSignin_btn()); 
		
	}

	@When("^user Enter The Email In Email Address Field$")
	public void user_Enter_The_Email_In_Email_Address_Field() throws Throwable {
	    
		String username = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\Kiruba Saagar-TestCases.xlsx", 0, 23, 5);
		
		inputValueElement(pom.getInstanceLogin().getEmail(), username); 
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
	   
		String password = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\Kiruba Saagar-TestCases.xlsx", 0, 24, 5);
		
		inputValueElement(pom.getInstanceLogin().getPassword(), password); 
		
	}

	@Then("^user Click On The Signin Button And It Navigates To The Account Signedin HomePage$")
	public void user_Click_On_The_Signin_Button_And_It_Navigates_To_The_Account_Signedin_HomePage() throws Throwable {
	    
		ClickOnElement(pom.getInstanceLogin().getLogin_btn()); 

	}

	@When("^user Hover over To The Women Section$")
	public void user_Hover_over_To_The_Women_Section() throws Throwable {
	    
		mouseActionsSelect("moveto", pom.getInstanceAp().getWomen()); 

	}

	@Then("^user Clicked Tshirts In women Tops Section And It Navigates to Tshirt Page$")
	public void user_Clicked_Tshirts_In_women_Tops_Section_And_It_Navigates_to_Tshirt_Page() throws Throwable {
	    
		ClickOnElement(pom.getInstanceAp().getTshirt()); 

	}

	@When("^user Hover Over To The QuickView And Clicked On It$")
	public void user_Hover_Over_To_The_QuickView_And_Clicked_On_It() throws Throwable {
	   
		scrollUpAndDown(pom.getInstanceDp().getDress());
		
		mouseActionsSelect("moveto", pom.getInstanceDp().getImage()); 
			
		mouseActionsSelect("click", pom.getInstanceDp().getQuickview()); 
			
	    switchToFrame(pom.getInstanceDp().getFrame());
	}

	@When("^user Select The Size$")
	public void user_Select_The_Size() throws Throwable {
		
	    dropdown(pom.getInstanceDp().getSize(), "byvalue", "2"); 

	   
	}

	@When("^user Select The Color$")
	public void user_Select_The_Color() throws Throwable {
	    
	    ClickOnElement(pom.getInstanceDp().getColor()); 

	}

	@When("^user Click On The Add To Cart Button$")
	public void user_Click_On_The_Add_To_Cart_Button() throws Throwable {
	 
	    ClickOnElement(pom.getInstanceDp().getAddtocart()); 
	    
	    defaultContent(); 


	}

	@Then("^user Click On The Proceed To Checkout Button And It Navigates To The Order Page$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_And_It_Navigates_To_The_Order_Page() throws Throwable {
	    
		ClickOnElement(pom.getInstanceDp().getPtc()); 

	}

	@Then("^user Click On The Proceed To Checkout Button And It Navigates To The Shipping Page$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_And_It_Navigates_To_The_Shipping_Page() throws Throwable {
	 
		ClickOnElement(pom.getInstanceSum().getPtc1()); 

	}

	@When("^user Click On The Proceed To Checkout Button$")
	public void user_Click_On_The_Proceed_To_Checkout_Button() throws Throwable {
	   
		ClickOnElement(pom.getInstanceAdd().getPtc2()); 

	}

	@When("^user Clicked The Terms Of Service Radio Button$")
	public void user_Clicked_The_Terms_Of_Service_Radio_Button() throws Throwable {
	    
		ClickOnElement(pom.getInstanceSh().getTerms()); 

	}

	@Then("^user Clicked The Proceed To Checkout Button And It Navigates To The Payment Page$")
	public void user_Clicked_The_Proceed_To_Checkout_Button_And_It_Navigates_To_The_Payment_Page() throws Throwable {
	
		ClickOnElement(pom.getInstanceSh().getPtc3()); 

	}

	@When("^user Clicked The Pay By Check$")
	public void user_Clicked_The_Pay_By_Check() throws Throwable {
		
		ClickOnElement(pom.getInstancePay().getPayment()); 

	    
	}

	@Then("^user Clicked The I Confirm My Order Button And It Navigates To The Order Confirmation Page$")
	public void user_Clicked_The_I_Confirm_My_Order_Button_And_It_Navigates_To_The_Order_Confirmation_Page() throws Throwable {

		ClickOnElement(pom.getInstancePay().getFinalcheckout());

	}

}
