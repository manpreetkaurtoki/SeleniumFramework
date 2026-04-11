package pageclasses;

import org.openqa.selenium.By;

import utils.UIActionsUtils;

public class WelcomeToInternet {

	By formAuthlink = By.xpath("//a[text()='Form Authentication']");
	By dropdownlink = By.xpath("//a[text()='Dropdown']");
	By jsAlertLink = By.xpath("//a[text()='JavaScript Alerts']");
	By dragdropLink = By.xpath("//a[text()='Drag and Drop']");

	
	public void clickFormAuth() {
		UIActionsUtils.click(formAuthlink);
	}

	public void clickDropdown() {
		UIActionsUtils.click(dropdownlink);
	}
	public void clickJSAlert()
	{
		UIActionsUtils.click(jsAlertLink);
	}
	public void clickDragDrop()
	{
		UIActionsUtils.click(dragdropLink);
	}

}
