package testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



import utilities.DriverClass;

public class LoginTestCase extends DriverClass {
	static WebDriver driver;
	
	public static void main(String args[])
	{
		driver=Init_Driver();
		driver.get("http://demo.testfire.net/login.jsp");
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("Demo1234");
		driver.findElement(By.xpath("//input[@name=\"btnSubmit\"]")).click();
		String expURL="http://demo.testfire.net/bank/main.jsp";
		String actURL=driver.getCurrentUrl();
		Assert.assertEquals(actURL, expURL, "InCorrect Main Page");
	}
}
