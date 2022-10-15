package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CityPage {
	public CityPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}	
	
	@FindBy(xpath="//span[@class='txtSign']")
	WebElement Login;
	
	public void clickLogin() throws InterruptedException {
		Thread.sleep(2000);
		Login.click();
	}

}
