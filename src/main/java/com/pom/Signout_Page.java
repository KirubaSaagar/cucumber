package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signout_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement signout_Button;

	public Signout_Page(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignout_Button() {
		return signout_Button;
	}

}
