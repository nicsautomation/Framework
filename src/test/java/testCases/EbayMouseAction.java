package testCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class EbayMouseAction extends BaseTestClass{
	@Test()
	public void ebayMouseAction() throws InterruptedException {
		driver.get(ebayURL);
		System.out.println("mouse action");
		Actions action =new Actions(driver);
		
		//Mouse Hover
		//action.moveToElement(ep.Toy).perform();
		
		//Right Click
		//action.moveToElement(ep.Toy).contextClick().build().perform();
		
		//Double Click
		//action.doubleClick(ep.Toy).perform();
		
		//Ctrl+a
		ep.Search.sendKeys("Remote");
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
	}
	

}
