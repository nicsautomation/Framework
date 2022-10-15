package testCases;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

public class LoginTestCase extends BaseTestClass {
	
  @Test()
	public void login() throws InterruptedException {
  		driver.get(loginURL);
  		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
  		//Thread.sleep(2000);
  		lp.enterUserName(userName);
  		lp.enterPassword(password);
  		lp.clickSubmitButton();
  		String expURL=homeURL;
  		String actURL= driver.getCurrentUrl();
  		Assert.assertEquals(actURL, expURL, "Incorrect Home Page!!!" );
		lp.linkCount();
  }
}