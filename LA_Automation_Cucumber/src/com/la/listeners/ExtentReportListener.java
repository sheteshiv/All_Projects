package com.la.listeners;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;

public class ExtentReportListener {
	
	
	public static ExtentHtmlReporter report =null;
	public static ExtentReports extent = null;
	public static ExtentTest test =null;
	
	
	public static ExtentReports setup() 
	{
		String reportPath = "./reports/Extent_Report.html";
		
		report  = new ExtentHtmlReporter(reportPath);
		
		report.config().setDocumentTitle("Automation Test Report");
		report.config().setReportName("Automation Test Report");
		report.config().setTheme(Theme.DARK);
		
		System.out.println("Extent report location initialized...");
		
		report.start();
		
		extent = new ExtentReports();
		
		extent.attachReporter(report);
		extent.setSystemInfo("Application", "Lease Acclerator");
		extent.setSystemInfo("Operating System", System.getProperty("os.name"));
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		return extent;
		
	}

	public static void testStepHandle(String testStatus,WebDriver driver,ExtentTest extenttest,Throwable throwable) 
	
	{
		switch (testStatus) {
		
		case "FAIL":
			
			extenttest.fail(MarkupHelper.createLabel("Test case failed ", ExtentColor.RED));
			extenttest.error(throwable.fillInStackTrace());
			
			try {
				
				
			extenttest.addScreenCaptureFromPath(takeScreenshot(driver), "NO");
			}
			
			catch (IOException e) {
				e.printStackTrace();
			}
			if (driver!=null) {
				
				driver.quit();
				
			}
			
			break;
			
		case "PASS":
			
			extenttest.pass(MarkupHelper.createLabel("Test case passed", ExtentColor.GREEN));
			break;

		default:
			break;
	}
	}
		
		public static String takeScreenshot(WebDriver driver) throws IOException  {
			
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File file = ts.getScreenshotAs(OutputType.FILE);
			
			String dest = "C:\\Users\\TLP 62\\Documents\\Shiv\\My Work\\LA_Automation_Cucumber\\Screenshots\\"+ getCurrentDateTime()+ ".png";
			
			File target = new File(dest);
			
			FileUtils.copyFile(file, target);
			
			return dest;
			
			//System.out.println("Screenshot taken");
			
						
		}
		
		public static String getCurrentDateTime() {
			
			
			String str = null;
			
			try {
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
			
			Date date = new Date();
			str = dateFormat.format(date);
			str= str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
			}
			
			catch (Exception e) {
				// TODO: handle exception
			}
			return str;
			
		}
		
	}













