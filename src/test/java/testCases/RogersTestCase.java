package testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class RogersTestCase extends BaseTestClass {
	@Test()
	public void RogersIphone() throws InterruptedException {
		driver.get(rogersURL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		rgp.clickWireless();
	}
}
