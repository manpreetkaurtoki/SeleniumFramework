package internetherokuapptests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import manager.DriverManager;
import utils.BaseUtils;
import utils.WaitUtils;

public class BaseTest {
	WebDriverWait wait;

	@BeforeMethod
	public void preReq() throws IOException {
		DriverManager.initDriver();
		DriverManager.getDriver();
		WaitUtils.initWait();
		DriverManager.goToUrl(BaseUtils.getConfigValue("url"));
	}

	public void tearDown() {
		DriverManager.getDriver();
		System.out.println("entered in closing browser method");
	}

}
