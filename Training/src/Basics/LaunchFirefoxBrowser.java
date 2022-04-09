package Basics;

import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Renuka Prasad\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.zomato.com/");
		

	}

}
