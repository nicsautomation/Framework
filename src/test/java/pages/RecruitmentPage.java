package pages;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {
  // private WebDriver driver;
	
	public RecruitmentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}	
	@FindBy(xpath= "//input[@name='username']")
	WebElement Username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath= "//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")
	WebElement SubmitBtn;
	
	@FindBy(tagName="link")
	List<WebElement> TagCount;
	
	@FindBy(xpath="//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]")
	WebElement Recruitment;
	
	
	public void enterUserName(String UName) {
		Username.sendKeys(UName);
	}
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	public void clickSubmitButton() {
		SubmitBtn.click();
	}
	public void linkCount() throws InterruptedException {
		Thread.sleep(2000);
		 System.out.println("The number of links are " + TagCount.size());
	 }
	 public void recruitmentClick() {
		 Recruitment.click();
	 }
}

