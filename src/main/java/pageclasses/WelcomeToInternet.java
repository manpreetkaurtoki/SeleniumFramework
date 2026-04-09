package pageclasses;

import org.openqa.selenium.By;

import utils.UIActionsUtils;

public class WelcomeToInternet {

	By formAuthlink = By.xpath("//a[text()='Form Authentication']");
	By dropdownlink = By.xpath("//a[text()='Dropdown']");

	public void clickFormAuth() {
		UIActionsUtils.click(formAuthlink);
	}

	public void clickDropdown() {
		UIActionsUtils.click(dropdownlink);
	}
}
