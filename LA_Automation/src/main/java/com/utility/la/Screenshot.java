package com.utility.la;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static WebDriver driver;
	
	public static void takeScreenshot(String destinationPath) throws IOException {
		
		
		TakesScreenshot ts = (TakesScreenshot)driver ;
		
		File file = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File(destinationPath));
		
		System.out.println("Screenshot taken");
		
		
		
	}

}
