package pageclasses;

import org.openqa.selenium.By;

import utils.UIActionsUtils;

public class JSAlertPage {

	By jsAlertBtn = By.xpath("//button[text()='Click for JS Alert']");
	By jsConfirmBtn = By.xpath("//button[text()='Click for JS Confirm']");
	By jsPromptBtn = By.xpath("//button[text()='Click for JS Prompt']");
	By compareText = By.xpath("//p[@id='result']");

	public void clickJsAlertBtn() {
		UIActionsUtils.click(jsAlertBtn, "JSAlert Button");
		UIActionsUtils.alertIsPresent();

	}

	public void clickJsConfirmAcceptAlertBtn() {
		UIActionsUtils.click(jsConfirmBtn, "JSConfirm Button Accept alert");
		UIActionsUtils.alertIsPresent();
	}

	public void clickJsConfirmDismissAlert() {
		UIActionsUtils.click(jsConfirmBtn, "JSConfirm Button dismiss alert");
		UIActionsUtils.cancelAlert();
	}

	public void clickJsPromptCancelAlert() {
		UIActionsUtils.click(jsPromptBtn, "JSPrompt button cancel alert");
		UIActionsUtils.cancelAlert();

	}

	public void clickJsPromptAcceptAlert() {
		UIActionsUtils.click(jsPromptBtn, "JSPrompt button accept alert");

	}

	public void sendData(String text) {
		UIActionsUtils.enterTexttoAlert(text);
	}

	public String getAlertText() {

		return UIActionsUtils.getText(compareText);
	}
}
