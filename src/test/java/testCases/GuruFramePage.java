package testCases;

import org.testng.annotations.Test;

public class GuruFramePage extends BaseTestClass {
	@Test()
	public void frameSwitch() {
		driver.get(guruURL);
		driver.switchTo().frame(gp.DesiredFrame);
		gp.clickFrameImage();
		//driver.switchTo().defaultContent();	
	}
	
	

}
