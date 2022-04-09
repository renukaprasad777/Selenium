
package SwitchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToAllChildWindowsAndClose {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("file:///C:/Users/Renuka%20Prasad/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		
		String parentWindowId = driver.getWindowHandle();
		Set<String> windowIds = driver.getWindowHandles();
		windowIds.remove(parentWindowId);
		for (String windowId : windowIds) {
			driver.switchTo().window(windowId);
			driver.close();
			
			}

		}
	}




//-------------------------
//package SwitchTo;
//
//import java.util.Set;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class ToSwitchToAllChildWindowsAndClose {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//
//		String expectedTitle = "Multiple popups";
//		driver.get("file:///C:/Users/Renuka%20Prasad/Downloads/MultipleWindow.html");
//		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
//		Thread.sleep(3000);
//
//		Set<String> windowIds = driver.getWindowHandles();
//		for (String windowId : windowIds) {
//			driver.switchTo().window(windowId);
//			String actualTitle = driver.getTitle();
//			// if (actualTitle.equals(expectedTitle)==false) {
//			if (!actualTitle.equals(expectedTitle)) {
//				driver.close();
//			}
//
//		}
//	}
//
//}

			