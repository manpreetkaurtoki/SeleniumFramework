package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomeToInternet {
	WebDriver driver;
	WebDriverWait wait;
	By formAuthlink = By.xpath("//a[text()='Form Authentication']");

	public WelcomeToInternet(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public void ClickFormAuth() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(formAuthlink)).click();
	}
}
