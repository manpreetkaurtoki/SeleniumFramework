package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;
	By username = By.id("username");
	By password = By.id("password");
	By submitBtn = By.xpath("//button[@type='submit']");

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public void enterUsername() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys("tomsmith");
	}

	public void enterPassword() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("SuperSecretPassword!");

	}

	public void clickonSubmit() {
		wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();

	}
}
