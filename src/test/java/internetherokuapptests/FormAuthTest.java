package internetherokuapptests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.DropDownPage;
import pageclasses.LoginPage;
import pageclasses.SecureAreaPage;
import pageclasses.WelcomeToInternet;

public class FormAuthTest extends BaseTest {

	@Test
	public void loginSuccesTest() {
		WelcomeToInternet entryObj = new WelcomeToInternet(driver, wait);
		entryObj.clickFormAuth();

		LoginPage loginObj = new LoginPage(driver, wait);
		loginObj.enterUsername();
		loginObj.enterPassword();
		loginObj.clickonSubmit();

		SecureAreaPage headObj = new SecureAreaPage(driver, wait);
		String compareHeading = headObj.getSuccessMessage();
		Assert.assertTrue(compareHeading.contains("Secure Area"));
		System.out.println("Login successfully");

	}

	@Test
	public void dropdownfunc() {
		WelcomeToInternet entryObj = new WelcomeToInternet(driver, wait);
		entryObj.clickDropdown();
		
		DropDownPage dropdownObj = new DropDownPage(driver, wait);
		dropdownObj.getDropDownItem(2);
	

	}
}
