package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
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

	public static boolean alertIsPresent() {

		try {
			Alert alert = WaitUtils.alertIsPresent();
			alert.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}

	}

	public static boolean cancelAlert() {

		try {
			Alert alert = WaitUtils.alertIsPresent();
			alert.dismiss();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}

	}

	public static void enterTexttoAlert(String text) {

		try {
			Alert alert = WaitUtils.alertIsPresent();
			alert.sendKeys(text);
			alert.accept();

		} catch (NoAlertPresentException e) {

		}

	}

	public static void dragAndDrop(By source, By target) {
		WebElement sourceA = WaitUtils.find(source);
		WebElement sourceB = WaitUtils.find(target);
		WaitUtils.find(target);
		WaitUtils.actions().dragAndDrop(sourceA, sourceB).perform();

	}
}
