package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CityPage;
import pages.EbayPage;
import pages.GuruPage;
import pages.LoginPage;
import pages.RecruitmentPage;
import pages.RogersPage;
import utilities.DataDrivenClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTestClass {
	
	 public WebDriver driver;
	 public LoginPage lp; 
	 public CityPage cp;
	 public RecruitmentPage rp;
	 public EbayPage ep;
	 public GuruPage gp;
	 public RogersPage rgp;
	 
	 public DataDrivenClass ddc =new DataDrivenClass();
	 protected String loginURL = ddc.getURL();
	 protected String userName = ddc.getUsername();
	 protected String password = ddc.getPassword();
	 protected String homeURL = ddc.getHomeURL();
	 protected String cityURL =ddc.getCityURL();
	 protected String ebayURL=ddc.getEbayURL();
	 protected String guruURL=ddc.getGuruURL();
	 protected String rogersURL=ddc.getRogersURL();
	 
	 
	 @BeforeClass
	 @Parameters("browser")
	  public void browserSetUp(String browser) {
	  if(browser.equalsIgnoreCase("edge")) { 
		  WebDriverManager.edgedriver().setup();
		  driver= new EdgeDriver(); 
		 
		  }
	  	else if(browser.equalsIgnoreCase("chrome")) {
	  		WebDriverManager.chromedriver().setup(); 
	  		driver= new ChromeDriver(); 
	  		
	  		} 
	  	else {
	  		WebDriverManager.safaridriver().setup();
	  		driver =new SafariDriver(); 
	  		} 
	  driver.manage().window().maximize();
	  lp = new LoginPage(driver);
	  cp = new CityPage(driver);
	  ep = new EbayPage(driver);
	  gp= new GuruPage(driver);
	  rgp = new RogersPage(driver);
	  }
	  
	  @AfterClass 
	  public void closeBrowser() { 
		 //driver.quit();
	  }
}
