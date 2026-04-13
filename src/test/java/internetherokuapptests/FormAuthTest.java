package internetherokuapptests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.DragDropPage;
import pageclasses.DropDownPage;
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
		Assert.assertTrue(compareHeading.contains("Secure Area"));
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
		Assert.assertEquals(dragDropObj.getDragDropHeading(), "A");
	}

}
