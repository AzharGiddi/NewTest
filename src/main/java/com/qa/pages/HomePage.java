package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	
	@FindBy(name="email")
	WebElement textBoxUname;
	
	@FindBy(name="password")
	WebElement textBoxPwd;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement btnLogin;
	
	
	
	public HomePage() {
	super();	
	PageFactory.initElements(driver, this);
	
	}
	
	public void launchpage() {
		
		super.init();
		driver.get("https://www.google.co.in");
		
	}
	
	public void waitforPageLoad(){
		
		
		
		
	}
	
}
