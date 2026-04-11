package internetherokuapptests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.DragDropPage;
import pageclasses.WelcomeToInternet;

public class DragDropTest extends BaseTest {
	@Test
	public void dragAndDrop() {
		WelcomeToInternet entryObj = new WelcomeToInternet();
		entryObj.clickDragDrop();

		DragDropPage dragDropObj = new DragDropPage();
		dragDropObj.performDragandDrop();
		Assert.assertEquals(dragDropObj.getDragDropHeading(), "A");
	}

}
