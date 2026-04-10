package internetherokuapptests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.JSAlertPage;
import pageclasses.WelcomeToInternet;

public class JSAlertTest extends BaseTest {
	@Test
	public void jsAlerts() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickJSAlert();

		JSAlertPage alertObj = new JSAlertPage();
		alertObj.clickJsAlertBtn();
		Assert.assertEquals(alertObj.getAlertText(), "You successfully clicked an alert");
		System.out.println(alertObj.getAlertText());
	}

	@Test
	public void jsConfirmCancelAlert() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickJSAlert();
		JSAlertPage alertObj = new JSAlertPage();
		alertObj.clickJsConfirmDismissAlert();

		Assert.assertEquals(alertObj.getAlertText(), "You clicked: Cancel");
		System.out.println(alertObj.getAlertText());
	}

	@Test
	public void jsConfirmAcceptAlert() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickJSAlert();
		JSAlertPage alertObj = new JSAlertPage();
		alertObj.clickJsConfirmAcceptAlertBtn();

		Assert.assertEquals(alertObj.getAlertText(), "You clicked: Ok");
		System.out.println(alertObj.getAlertText());
	}

	@Test
	public void jsPromptCancelAlert() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickJSAlert();

		JSAlertPage alertObj = new JSAlertPage();
		alertObj.clickJsPromptCancelAlert();

		Assert.assertEquals(alertObj.getAlertText(), "You entered: null");
		System.out.println(alertObj.getAlertText());
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
		System.out.println(alertObj.getAlertText());
	}

}
