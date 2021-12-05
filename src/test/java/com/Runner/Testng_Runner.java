package com.Runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.nov.Base_Class;
import com.helper.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class Testng_Runner extends Base_Class{
	
public static WebDriver driver = Base_Class.getBrowser("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@BeforeClass
	private void urlLaunch() throws Throwable {

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
		
		getURL(url);
		
		implicitWait(30);
				
	}
	
	@BeforeMethod
	private void signin() throws IOException {

		ClickOnElement(pom.getInstanceHp().getSignin_btn()); 
		
		String username = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\Kiruba Saagar-TestCases.xlsx", 0, 23, 5);
		
		inputValueElement(pom.getInstanceLogin().getEmail(), username); 
				
		String password = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\Kiruba Saagar-TestCases.xlsx", 0, 24, 5);
		
		inputValueElement(pom.getInstanceLogin().getPassword(), password); 
			
		ClickOnElement(pom.getInstanceLogin().getLogin_btn()); 
	}
	
	@Test(priority = -1)
	private void Women() {

		mouseActionsSelect("moveto", pom.getInstanceAp().getWomen()); 
		
		ClickOnElement(pom.getInstanceAp().getTshirt()); 
			
		scrollUpAndDown(pom.getInstanceDp().getDress());
			
		mouseActionsSelect("moveto", pom.getInstanceDp().getImage()); 
			
		mouseActionsSelect("click", pom.getInstanceDp().getQuickview()); 
			
	    switchToFrame(pom.getInstanceDp().getFrame());
	        
	    dropdown(pom.getInstanceDp().getSize(), "byvalue", "2"); 
	        
	    ClickOnElement(pom.getInstanceDp().getColor()); 
	        
	    ClickOnElement(pom.getInstanceDp().getAddtocart()); 
	    
	    defaultContent(); 
	    	
		ClickOnElement(pom.getInstanceDp().getPtc()); 
			
		ClickOnElement(pom.getInstanceSum().getPtc1()); 
			
		ClickOnElement(pom.getInstanceAdd().getPtc2()); 
			
		ClickOnElement(pom.getInstanceSh().getTerms()); 
			
		ClickOnElement(pom.getInstanceSh().getPtc3()); 
			
		ClickOnElement(pom.getInstancePay().getPayment()); 
			
		ClickOnElement(pom.getInstancePay().getFinalcheckout());
			
		scrollUpAndDown(pom.getInstancePay().getBack());
	}
	
	@Test
	private void tshirts() {
		
		ClickOnElement(pom.getInstanceTshirt().getTshirts());
		
	}
	
	
	@AfterMethod
	private void signingOff() {

		ClickOnElement(pom.getInstanceSignout().getSignout_Button());
	}
	
	
	
@AfterClass
private void closingSession() {

	quit();
	
}


}
