package webDriverManageMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformMaximizeMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.olacabs.com/");
		driver.manage().window().maximize();

	}

}
