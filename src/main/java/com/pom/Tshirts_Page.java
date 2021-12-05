package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirts_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
	private WebElement tshirts;
	
	public Tshirts_Page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getTshirts() {
		return tshirts;
	}

	public WebElement getTshirtsimg() {
		return tshirtsimg;
	}

	@FindBy(xpath="//img[@width='250']")
	private WebElement tshirtsimg;

}
