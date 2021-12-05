package com.Runner.Adactin;

import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Ada.Helper.Ada_FRM;
import com.Adactin.sdp.Pom_Adactin;
import com.baseclass.nov.Base_Class;

public class Testng_Adactin extends Base_Class{
	
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	
	public static Pom_Adactin pom = new Pom_Adactin(driver);
	
	@BeforeClass
	private void urlLaunch() throws Throwable {

	String url = Ada_FRM.getInstanceAdaFRM().getInstanceAdaCr().getUrl();
		
		getURL(url);
		
		implicitWait(50);

	}
	
	@Test
	private void login() throws IOException {

	String username = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\AdactinTestCases-KirubaSaagar.xlsx", 0, 6, 5);
		
		inputValueElement(pom.getInstanceLp().getUsername(), username);
		
		String password = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\AdactinTestCases-KirubaSaagar.xlsx", 0, 7, 5);
		
		inputValueElement(pom.getInstanceLp().getPassword(), password);
		
		ClickOnElement(pom.getInstanceLp().getLoginbutton());
	}

	@Test(groups = "Hotel", priority = 1)
	private void hotelSearch() throws Throwable {

	dropdown(pom.getInstanceSear().getLocation(), "byvalue", "New York");
		
		dropdown(pom.getInstanceSear().getHotels(), "byvalue", "Hotel Sunshine");
		
		dropdown(pom.getInstanceSear().getRoomtype(), "byvalue", "Deluxe");
		
		dropdown(pom.getInstanceSear().getRoomnos(), "byvalue", "3");
		
		String checkInDate = Ada_FRM.getInstanceAdaFRM().getInstanceAdaCr().getCheckInDate();
		
		inputValueElement(pom.getInstanceSear().getCheckindate(), checkInDate);
		
		String checkOutDate = Ada_FRM.getInstanceAdaFRM().getInstanceAdaCr().getCheckOutDate();
		
		inputValueElement(pom.getInstanceSear().getCheckoutdate(), checkOutDate);
		
		dropdown(pom.getInstanceSear().getAdults(), "byvalue", "2");
		
		dropdown(pom.getInstanceSear().getChild(), "byvalue", "2");
		
		ClickOnElement(pom.getInstanceSear().getSearch_button());
				
		ClickOnElement(pom.getInstanceSel().getRadiobutton());
		
		ClickOnElement(pom.getInstanceSel().getContinuebutton());
		

	}
	
	@Test(groups = "Hotel", priority = 2)
	private void bookHotel() throws Throwable {

String firstname = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\AdactinTestCases-KirubaSaagar.xlsx", 0, 19, 5);
		
		inputValueElement(pom.getInstanceBh().getFirstname(), firstname );
		
		String lastname = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\AdactinTestCases-KirubaSaagar.xlsx", 0, 20, 5);
		
		inputValueElement(pom.getInstanceBh().getLastname(), lastname);
		
		String address = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\AdactinTestCases-KirubaSaagar.xlsx", 0, 21, 5);
		
		inputValueElement(pom.getInstanceBh().getAddress(), address);
		
		String cardNumber = Ada_FRM.getInstanceAdaFRM().getInstanceAdaCr().getCardNumber();
		
		inputValueElement(pom.getInstanceBh().getCreditcardno(), cardNumber);
		
		dropdown(pom.getInstanceBh().getCardtype(), "byvalue", "MAST");
		
		dropdown(pom.getInstanceBh().getMonth(), "byvalue", "12");
		
		dropdown(pom.getInstanceBh().getYear(), "byvalue", "2022");
		
		String cvv = Ada_FRM.getInstanceAdaFRM().getInstanceAdaCr().getCVV();
		
		inputValueElement(pom.getInstanceBh().getCvv(), cvv);
		
		ClickOnElement(pom.getInstanceBh().getBooknow_button());
	}
	

	
	@AfterTest
	private void logout() {

		ClickOnElement(pom.getInstanceBh().getLogout_button());
	}
	
	
}
