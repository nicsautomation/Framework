package testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



import utilities.DriverClass;

public class LoginTestCase extends DriverClass {
	static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException
	{
		driver=Init_Driver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String expURL="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList!!!!";
		String actURL= driver.getCurrentUrl();
		Assert.assertEquals(actURL, expURL, "Incorrect Home Page!!!" );
		
		/*
		 * driver.get("http://demo.testfire.net/login.jsp");
		 * driver.findElement(By.id("uid")).sendKeys("jsmith");
		 * driver.findElement(By.id("passw")).sendKeys("Demo1234");
		 * driver.findElement(By.xpath("//input[@name=\"btnSubmit\"]")).click(); String
		 * expURL="http://demo.testfire.net/bank/main.jsp"; String
		 * actURL=driver.getCurrentUrl(); Assert.assertEquals(actURL, expURL,
		 * "InCorrect Main Page");
		 */
	}
}
