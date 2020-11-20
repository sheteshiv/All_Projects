package com.la.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class laListeners extends ExtentReportListener implements ITestListener {
	
	private static ExtentReports report;

	public void onTestStart(ITestResult result) {

		System.out.println("Execution of testCase started on UAT");
		
		
		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("TestCase completed succuesfully");
		
	}

	public void onTestFailure(ITestResult result) {

		System.out.println("Fail");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {

		System.out.println("Execution of test started on UAT");
		
		report = setup();
		
	}

	public void onFinish(ITestContext context) {

		System.out.println("Execution got completed on UAT");
		report.flush();
		System.out.println("Generated Report...");
		
	}

}
