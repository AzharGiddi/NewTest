package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(ip);
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void init() {
		
		String Browser = prop.getProperty("browser");
		
		switch(Browser) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium-3.14.0\\Drivers\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "ff":
			break;
			default:
				System.out.println("Browser not available");
		
		}
		
		driver.get(prop.getProperty("url"));
	}
}
