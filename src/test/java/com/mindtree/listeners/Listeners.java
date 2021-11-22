package com.mindtree.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.mindtree.reusablecomponent.Base;
import com.mindtree.utilities.ExtentReporterNG;
import com.mindtree.utilities.Screenshot;

public class Listeners extends Base implements ITestListener {

	ExtentReports extent = ExtentReporterNG.extentReportGenerator();

	String screenshotPath = null;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			driver=initializeDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test = extent.createTest(result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		
	}
	

	public void onTestFailure(ITestResult result) {

		try {
			screenshotPath = Screenshot.getScreenshot(result.getName());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		test.fail(result.getClass().getName() + " test failed",
				MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());

		// test.addScreenCaptureFromBase64String(getScreenshot(result.getMethod().getMethodName()),result.getMethod().getMethodName());
        driver.close();
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getName());

		try {
			screenshotPath = Screenshot.getScreenshot(result.getName());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		test.info(driver.getTitle());

		test.pass(driver.getClass().getCanonicalName() + " test successful",
				MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        driver.close();
	}

}
