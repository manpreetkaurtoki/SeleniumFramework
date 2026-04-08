package internetherokuapptests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.LoginPage;
import pageclasses.SecureAreaPage;
import pageclasses.WelcomeToInternet;

public class FormAuthTest extends BaseTest {

	@Test
	public void loginSuccesTest() {
		WelcomeToInternet entryObj = new WelcomeToInternet(driver, wait);
		entryObj.ClickFormAuth();

		LoginPage loginObj = new LoginPage(driver, wait);
		loginObj.enterUsername();
		loginObj.enterPassword();
		loginObj.clickonSubmit();
		
		SecureAreaPage headObj= new SecureAreaPage(driver, wait);
		String compareHeading = headObj.getSuccessMessage();
		Assert.assertTrue(compareHeading.contains("Secure Area"));

	}
}
