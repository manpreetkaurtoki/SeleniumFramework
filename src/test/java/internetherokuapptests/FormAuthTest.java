package internetherokuapptests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.DragDropPage;
import pageclasses.DropDownPage;
import pageclasses.JSAlertPage;
import pageclasses.LoginPage;
import pageclasses.SecureAreaPage;
import pageclasses.WelcomeToInternet;

public class FormAuthTest extends BaseTest {
	@Test
	public void loginSuccesTest() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickFormAuth();
		LoginPage loginObj = new LoginPage();
		loginObj.enterUsername("tomsmith");
		loginObj.enterPassword("SuperSecretPassword!");
		loginObj.clickonSubmit();

		SecureAreaPage headObj = new SecureAreaPage();
		String compareHeading = headObj.getSuccessMessage();
		System.out.println(compareHeading);
		System.out.println("logged in");
		AssertJUnit.assertTrue(compareHeading.contains("Secure Area"));
	}
	@Test
	public void dropdownfunc() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickDropdown();

		DropDownPage dropdownObj = new DropDownPage();
		dropdownObj.getDropDownItem(2);

	}

	@Test
	public void dragAndDrop() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickDragDrop();

		DragDropPage dragDropObj = new DragDropPage();
		dragDropObj.performDragandDrop();
		AssertJUnit.assertEquals(dragDropObj.getDragDropHeading(), "A");
	}
	@Test
	public void jsAlerts() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickJSAlert();

		JSAlertPage alertObj = new JSAlertPage();
		alertObj.clickJsAlertBtn();
		AssertJUnit.assertEquals(alertObj.getAlertText(), "You successfully clicked an alert");
		
	}

	@Test
	public void jsConfirmCancelAlert() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickJSAlert();
		JSAlertPage alertObj = new JSAlertPage();
		alertObj.clickJsConfirmDismissAlert();

		AssertJUnit.assertEquals(alertObj.getAlertText(), "You clicked: Cancel");
		
	}

	@Test
	public void jsConfirmAcceptAlert() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickJSAlert();
		JSAlertPage alertObj = new JSAlertPage();
		alertObj.clickJsConfirmAcceptAlertBtn();

		AssertJUnit.assertEquals(alertObj.getAlertText(), "You clicked: Ok");
		
	}

	@Test
	public void jsPromptCancelAlert() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickJSAlert();

		JSAlertPage alertObj = new JSAlertPage();
		alertObj.clickJsPromptCancelAlert();

		AssertJUnit.assertEquals(alertObj.getAlertText(), "You entered: null");
		
	}

	@Test
	public void jsPromptAcceptAlert() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickJSAlert();

		JSAlertPage alertObj = new JSAlertPage();
		alertObj.clickJsPromptAcceptAlert();
		String expected = "Hello Manpreet";
		alertObj.sendData(expected);

		AssertJUnit.assertEquals(alertObj.getAlertText(), "You entered: " + expected);
		
	}
}
