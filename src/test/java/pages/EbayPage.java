package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayPage {
	public EbayPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	 
	@FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/ul/li[8]/a")
	public WebElement Toy;
	
}
