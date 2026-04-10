package pageclasses;

import org.openqa.selenium.By;

import utils.UIActionsUtils;

public class JSAlertPage {

	By jsAlertBtn = By.xpath("//button[text()='Click for JS Alert']");
	By jsConfirmBtn = By.xpath("//button[text()='Click for JS Confirm']");
	By jsPromptBtn = By.xpath("//button[text()='Click for JS Prompt']");
	By compareText = By.xpath("//p[@id='result']");

	public void clickJsAlertBtn() {
		UIActionsUtils.click(jsAlertBtn);
		UIActionsUtils.alertIsPresent();

	}

	public void clickJsConfirmAcceptAlertBtn() {
		UIActionsUtils.click(jsConfirmBtn);
		UIActionsUtils.alertIsPresent();
	}

	public void clickJsConfirmDismissAlert() {
		UIActionsUtils.click(jsConfirmBtn);
		UIActionsUtils.cancelAlert();
	}

	public void clickJsPromptCancelAlert() {
		UIActionsUtils.click(jsPromptBtn);
		UIActionsUtils.cancelAlert();
	

	}

	public void sendData(String text) {
		 UIActionsUtils.enterTexttoAlert(text);
	}

	public String getAlertText() {

		return UIActionsUtils.getText(compareText);
	}
}
