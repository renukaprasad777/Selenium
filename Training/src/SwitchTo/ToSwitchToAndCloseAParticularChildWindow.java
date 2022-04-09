package SwitchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToAndCloseAParticularChildWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String expectedTitle = "Allrecipes | Food, friends, and recipe inspiration";

		driver.get("file:///C:/Users/Renuka%20Prasad/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);

		Set<String> allWindowIds = driver.getWindowHandles();
		for (String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			String actualTitle = driver.getTitle();
			if (expectedTitle.equals(actualTitle)) {
				driver.close();
				break;
			}

		}

	}

}
