package testCases;

import org.testng.annotations.Test;
import org.testng.Assert;

public class RecruitmentTestCase extends BaseTestClass {
	
  @Test()
	public void login() throws InterruptedException {
  		driver.get(loginURL);
  		Thread.sleep(2000);
  		lp.enterUserName(userName);
  		lp.enterPassword(password);
  		lp.clickSubmitButton();
  		String expURL=homeURL;
  		String actURL= driver.getCurrentUrl();
  		Assert.assertEquals(actURL, expURL, "Incorrect Home Page!!!" );
		lp.linkCount();
		Thread.sleep(2000);
		rp.recruitmentClick();
  }
}