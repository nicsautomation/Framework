package testCases;

import java.util.Iterator;
import java.util.Set;    
import org.testng.annotations.Test;

public class PracticeWindowHandle extends BaseTestClass {
	@Test()
	public void WindowsHandlePractice() throws InterruptedException {
		driver.get(cityURL);
		cp.clickLogin();
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();

		// Here we will check if child window has other child windows and will fetch the URL of the child window
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				String cityActURL= driver.getCurrentUrl();
				System.out.println("Login URL:"+cityActURL);
			}
		}
	}
}

