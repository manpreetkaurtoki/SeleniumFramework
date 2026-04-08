package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecureAreaPage {
	
	WebDriver driver;
	WebDriverWait wait;
	By heading = By.tagName("h2");

	public SecureAreaPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	public String getSuccessMessage()
	{
		WebElement header= wait.until(ExpectedConditions.visibilityOfElementLocated(heading));
		return header.getText();
		
	}

	
}
