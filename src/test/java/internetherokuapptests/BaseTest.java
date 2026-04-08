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

import utils.BaseUtils;

public class BaseTest {
	WebDriver driver;
	WebDriverWait wait;
	

	@BeforeMethod
	public void preReq() throws IOException {
		String browser = "Chrome";
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Safari":
			driver = new SafariDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		case "Explorer":
			driver = new InternetExplorerDriver();
			break;
		}
		driver.navigate().to(BaseUtils.getConfigValue("url"));	
		wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.valueOf(BaseUtils.getConfigValue("wait"))));
	
		System.out.println("entered in pre condition method");
	}

	public void tearDown() {
		driver.quit();
		System.out.println("entered in closing browser method");
	}



}
