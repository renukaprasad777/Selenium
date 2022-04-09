package webDriverNavigateMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformToStringMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.olacabs.com/");
		driver.navigate().to("https://www.uber.com/");
	}

}
