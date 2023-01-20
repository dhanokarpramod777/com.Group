package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass1{

public static WebDriver getChromeDriver() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://13.127.85.212/JBM0300DEMO/General/Forms/LoginV2.aspx");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		return driver;

}
static ExtentHtmlReporter htmlReporter;
static ExtentReports report;
static ExtentTest test;

public static ExtentTest getTestForReproter(String useCase) {
	return test=report.createTest(useCase);
	
}
public static ExtentHtmlReporter gethtmlReporter() {
	if(htmlReporter==null) {
		htmlReporter = new ExtentHtmlReporter("ExtentReporter.html");
	}
	return htmlReporter;	
}

public static ExtentReports getExtentReports() {
	
	if(report==null) {
		report = new ExtentReports();
		report.attachReporter(htmlReporter);
	}
	
	return report;
	
}


}


