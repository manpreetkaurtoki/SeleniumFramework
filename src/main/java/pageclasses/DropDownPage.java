package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownPage {
	WebDriver driver;
	WebDriverWait wait;
	By dropdown = By.xpath("//select[@id='dropdown']");

	public DropDownPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public void getDropDownItem(int index) {
		WebElement dropSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
		new Select(dropSelect).selectByIndex(index);

	}

}
