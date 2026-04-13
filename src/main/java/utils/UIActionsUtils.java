package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import manager.ExtentTestManager;

public class UIActionsUtils {
	public static String getText(By locator) {
		String uitext = WaitUtils.visibilityOfElementLocated(locator).getText();

		return uitext;

	}

	public static void enterText(By locator, String text) {

		WaitUtils.visibilityOfElementLocated(locator).sendKeys(text);
		ExtentTestManager.log.info("Entered Text : " + text);
	}

	public static void enterPassword(By locator, String text) {

		WaitUtils.visibilityOfElementLocated(locator).sendKeys(text);
		ExtentTestManager.log.info("Entered Password : " + "********");
	}

	public static void click(By locator, String text) {
		WaitUtils.elementToBeClickable(locator).click();
		ExtentTestManager.log.info(text + " has been clicked");

	}

	public static void selectByIndex(WebElement element, int index) {
		Select dropdown = new Select(element);
		dropdown.selectByIndex(index);
		ExtentTestManager.log.info(index + " index has been selected from the dropdown");
	}

	public static boolean alertIsPresent() {

		try {
			Alert alert = WaitUtils.alertIsPresent();
			alert.accept();
			ExtentTestManager.log.info("Alert has been popped up");
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}

	}

	public static boolean cancelAlert() {

		try {
			Alert alert = WaitUtils.alertIsPresent();
			alert.dismiss();
			ExtentTestManager.log.info("Alert has been dismissed");
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
			ExtentTestManager.log.info("Text has been entered to alert");
		} catch (NoAlertPresentException e) {

		}

	}

	public static void dragAndDrop(By source, By target) {
		WebElement sourceA = WaitUtils.find(source);
		WebElement sourceB = WaitUtils.find(target);
		WaitUtils.find(target);
		WaitUtils.actions().dragAndDrop(sourceA, sourceB).perform();
		ExtentTestManager.log.info("Source A is dragged to B");
	}
}
