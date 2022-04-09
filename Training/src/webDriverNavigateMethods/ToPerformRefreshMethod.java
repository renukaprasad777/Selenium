package webDriverNavigateMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformRefreshMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.olacabs.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
