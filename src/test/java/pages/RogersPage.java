package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class RogersPage{
	public RogersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}	
	
	@FindBy(xpath="//a[@class=\"mr-8\"]")
	WebElement Shop;
	
	@FindBy(xpath="//*[@id=\"mainContent\"]/ng-component/r-choose-phone/dsa-layout/div/div/div[3]/div/div[5]/r-nac-tile/ds-tile/div/div/div[4]/a")
	WebElement Iphone13;
	
	@FindBy(xpath="//*[@id=\"trident-cta-nac\"]/span/span")
	WebElement GetStarted;
	
	public void clickWireless() {
		
		Shop.click();
		Iphone13.click();
		GetStarted.click();
		
	}

}
