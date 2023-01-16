package Test_Clasess;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BaseClasses.BaseClass1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class Task_2_VerifyUser {
	WebDriver driver ;
	
	

	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;
	
	 @BeforeClass
	  public void beforeClass() throws InterruptedException {
		 driver=BaseClass1.getChromeDriver();
		 
		 htmlReporter = BaseClass1.gethtmlReporter();
		report = BaseClass1.getExtentReports();
		test = BaseClass1.getTestForReproter("Task_2_VerifyUser");
		 
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  
	  }
  @Test(priority=1)
  public void VerifyUserLogin() throws IOException {
	 
	  
	  
	  
	 
  }

 
	 
  

  @AfterMethod
  public void afterMethod(ITestResult result) throws IOException {

	  /*if(result.getStatus() == ITestResult.SUCCESS){
			test.log(Status.PASS, "Test is passed " + result.getName());
		}
		else
		{
			String path = hp.getScreenShot(driver, result.getName());
			test.log(Status.FAIL, "Test is failed " + result.getName(), 
			MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		}  
		*/			  
  } 
  @AfterClass
  public void afterClass() {
	
	System.out.println("Code is work good");
	
  report.flush();
  driver.quit();  
  
}
}