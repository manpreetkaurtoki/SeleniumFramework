package pageclasses;

import org.openqa.selenium.By;

import utils.UIActionsUtils;

public class LoginPage {

	By usernameInput = By.id("username");
	By passwordInput = By.id("password");
	By submitBtn = By.xpath("//button[@type='submit']");

	public void enterUsername(String username) {
		UIActionsUtils.enterText(usernameInput, username);
	}

	public void enterPassword(String password) {
		UIActionsUtils.enterText(passwordInput, password);

	}

	public void clickonSubmit() {
		UIActionsUtils.click(submitBtn);

	}
	
}
