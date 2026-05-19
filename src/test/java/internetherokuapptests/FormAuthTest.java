package internetherokuapptests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.ExcelDataProvider;
import pageclasses.DragDropPage;
import pageclasses.DropDownPage;
import pageclasses.JSAlertPage;
import pageclasses.LoginPage;
import pageclasses.SecureAreaPage;
import pageclasses.WelcomeToInternet;

public class FormAuthTest extends BaseTest {
	@DataProvider(name = "loginData")
	public Object[][] getData() {
		return new Object[][] { { "user1", "pass1" }, { "tomsmith", "SuperSecretPassword!" }, { "admin", "admin123" } };
	}

	@Test(dataProvider = "ExcelLoginData", dataProviderClass = ExcelDataProvider.class)
	public void loginSuccesTest(String username, String password) {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickFormAuth();
		LoginPage loginObj = new LoginPage();
		loginObj.enterUsername(username);
		loginObj.enterPassword(password);
		loginObj.clickonSubmit();

		SecureAreaPage headObj = new SecureAreaPage();
		String compareHeading = headObj.getSuccessMessage();
		System.out.println(compareHeading);
		System.out.println("logged in");
		Assert.assertTrue(compareHeading.contains("Secure Area"));
	}

	@Test(invocationCount = 2)
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
		Assert.assertEquals(dragDropObj.getDragDropHeading(), "A");
	}

	@Test
	public void jsAlerts() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickJSAlert();

		JSAlertPage alertObj = new JSAlertPage();
		alertObj.clickJsAlertBtn();
		Assert.assertEquals(alertObj.getAlertText(), "You successfully clicked an alert");

	}

	@Test
	public void jsConfirmCancelAlert() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickJSAlert();
		JSAlertPage alertObj = new JSAlertPage();
		alertObj.clickJsConfirmDismissAlert();

		Assert.assertEquals(alertObj.getAlertText(), "You clicked: Cancel");

	}

	@Test
	public void jsConfirmAcceptAlert() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickJSAlert();
		JSAlertPage alertObj = new JSAlertPage();
		alertObj.clickJsConfirmAcceptAlertBtn();
		Assert.assertEquals(alertObj.getAlertText(), "You clicked: Ok");

	}

	@Test
	public void jsPromptCancelAlert() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickJSAlert();

		JSAlertPage alertObj = new JSAlertPage();
		alertObj.clickJsPromptCancelAlert();

		Assert.assertEquals(alertObj.getAlertText(), "You entered: null");

	}

	@Test
	public void jsPromptAcceptAlert() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickJSAlert();

		JSAlertPage alertObj = new JSAlertPage();
		alertObj.clickJsPromptAcceptAlert();
		String expected = "Hello Manpreet";
		alertObj.sendData(expected);

		Assert.assertEquals(alertObj.getAlertText(), "You entered: " + expected);

	}
	
	@Test(dataProvider = "ExcelLoginData", dataProviderClass = ExcelDataProvider.class)
	public void excelData(String usr, String password)
	{
		
	System.out.println(usr);
		System.out.println(password);
	}
}
