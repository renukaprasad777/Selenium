package webDriverMethods;

import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformManageMethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		//driver.manage().window().fullscreen();
		Dimension sizeOfWindow = driver.manage().window().getSize();
		//getSize()
		System.out.println(sizeOfWindow.getHeight());
		System.out.println(sizeOfWindow.getWidth());
		
		//getPosition()
		System.out.println(driver.manage().window().getPosition().getX());
		System.out.println(driver.manage().window().getPosition().getY());
		
		//setSize
		Dimension newSize= new Dimension(500, 500);
		driver.manage().window().setSize(newSize);
		
		//setPosition		
		Point newPosition=new Point(50,50);
		//driver.manage().window().setPosition(newPosition);
			
		
	}
}
