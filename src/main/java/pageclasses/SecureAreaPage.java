package pageclasses;

import org.openqa.selenium.By;

import utils.UIActionsUtils;

public class SecureAreaPage {
	
	By heading = By.tagName("h2");

	
	public String getSuccessMessage()
	{
		return UIActionsUtils.getText(heading);
		

	}
	
	
}
