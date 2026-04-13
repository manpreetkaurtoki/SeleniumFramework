package internetherokuapptests;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import manager.DriverManager;
import manager.ExtentManager;
import manager.ExtentTestManager;
import utils.BaseUtils;
import utils.WaitUtils;

public class BaseTest {
	WebDriverWait wait;

	@BeforeSuite
	public void initialise() throws IOException
	{
		ExtentManager.initReport();
	}
	
	@BeforeMethod
	public void preReq(Method method) throws IOException {
		ExtentTestManager.createTest(method.getName());
		DriverManager.initDriver();
		DriverManager.getDriver();
		WaitUtils.initWait();
		DriverManager.goToUrl(BaseUtils.getConfigValue("url"));
	}
	
	@AfterMethod
	public void endTest()
	{
		DriverManager.quitDriver();
		System.out.println("entered in closing browser method");
	}
	
	
	@AfterSuite
	public void tearDown() {
		ExtentManager.flushReport();
		
	}


}
