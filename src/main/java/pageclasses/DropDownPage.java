package pageclasses;

import org.openqa.selenium.By;

import utils.UIActionsUtils;
import utils.WaitUtils;

public class DropDownPage {
	By dropdown = By.xpath("//select[@id='dropdown']");

	public void getDropDownItem(int index) {

		UIActionsUtils.selectByIndex(WaitUtils.visibilityOfElementLocated(dropdown), index);
	}

}
