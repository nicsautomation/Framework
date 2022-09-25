package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverClass {

	static WebDriver driver;
	
	public static WebDriver Init_Driver() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		return driver;	
	}
}
