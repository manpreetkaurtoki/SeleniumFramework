package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomeToInternet {
	WebDriver driver;
	WebDriverWait wait;
	By formAuthlink = By.xpath("//a[text()='Form Authentication']");
	By dropdownlink = By.xpath("//a[text()='Dropdown']");
	

	public WelcomeToInternet(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public void clickFormAuth() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(formAuthlink)).click();
	}
	public void clickDropdown()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownlink)).click();
	}
}
