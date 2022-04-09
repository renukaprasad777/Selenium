package webDriverManageMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformSetSizeMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.olacabs.com/");
		
		Dimension newSize=new Dimension(500, 500);
		driver.manage().window().setSize(newSize);
		
		
		
		
		
		//setSize
	//	Dimension newSize= new Dimension(500, 500);
		//driver.manage().window().setSize(newSize);
		
		//setPosition		
		//Point newPosition=new Point(50,50);
		//driver.manage().window().setPosition(newPosition);
		

	}

}
