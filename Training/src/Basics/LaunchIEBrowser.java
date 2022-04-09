package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIEBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.co.in");
		driver.close();
	}

}
