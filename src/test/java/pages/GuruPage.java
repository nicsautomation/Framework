package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuruPage {
	public GuruPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}	
	
	@FindBy(xpath="html/body/a/img")
	WebElement JMeter;
	
	@FindBy(id="a077aa5e")
	public WebElement DesiredFrame;
	
	public void clickFrameImage() {
		JMeter.click();
	}

}
