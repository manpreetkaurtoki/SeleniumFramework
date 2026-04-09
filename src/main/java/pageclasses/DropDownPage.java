package pageclasses;

import org.openqa.selenium.By;

public class DropDownPage {
	By dropdown = By.xpath("//select[@id='dropdown']");

	
	public void getDropDownItem(int index) {
		//WebElement dropSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
		//new Select(dropSelect).selectByIndex(index);

	}

}
