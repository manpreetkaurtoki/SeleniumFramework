package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UIActionsUtils {
	public static String getText(By locator) {
		return WaitUtils.visibilityOfElementLocated(locator).getText();

	}

	public static void enterText(By locator, String text) {

		WaitUtils.visibilityOfElementLocated(locator).sendKeys(text);
	}

	public static void click(By locator) {
		WaitUtils.elementToBeClickable(locator).click();

	}
	public static void selectByIndex(WebElement element, int index) {
        Select dropdown = new Select(element);
        dropdown.selectByIndex(index);
    }
}
