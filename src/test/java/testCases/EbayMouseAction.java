package testCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class EbayMouseAction extends BaseTestClass{
	@Test()
	public void ebayMouseAction() throws InterruptedException {
		driver.get(ebayURL);
		System.out.println("mouse action");
		Actions action =new Actions(driver);
		//action.moveToElement(ep.Toy).perform();
		action.moveToElement(ep.Toy).contextClick().build().perform();
	}
	

}
