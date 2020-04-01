package com.qa.TestUtil;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.base.TestBase;
import org.apache.commons.io.FileUtils;
public class TestUtil extends TestBase{

	
	public void takescreenshot() throws IOException {
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"/ScreenShots/"+System.currentTimeMillis()+".png"));
		
		
	}
	
	
}
