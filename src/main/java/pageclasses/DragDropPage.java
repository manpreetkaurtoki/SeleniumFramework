package pageclasses;

import org.openqa.selenium.By;

import utils.UIActionsUtils;

public class DragDropPage {
	By boxA = By.xpath("//div[@id='column-a']");
	By boxB = By.xpath("//div[@id='column-b']");
	By header = By.xpath("//div[@id='column-b']/header[text()='A']");
	
public void performDragandDrop()
{
	UIActionsUtils.dragAndDrop(boxA, boxB);
	
}
public String getDragDropHeading() {

	return UIActionsUtils.getText(header);
}
}
