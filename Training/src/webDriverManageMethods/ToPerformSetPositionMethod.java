package webDriverManageMethods;

import java.awt.Point;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformSetPositionMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.olacabs.com/");
		
		//Point newPosition = new Point(30,30);
		//driver.manage().window().setPosition(newPosition);
		
		//driver.manage().window().setPosition(new Point(100,200));
		
		

	}

}
