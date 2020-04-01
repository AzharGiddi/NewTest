package com.qa.TestCases;

import org.testng.annotations.Test;

import com.qa.pages.HomePage;

public class HomePageTest {

	@Test
	public void Log() {
		
		HomePage homePage = new HomePage();
		homePage.launchpage();
	}
	
	
	
}
