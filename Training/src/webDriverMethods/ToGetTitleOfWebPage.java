package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitleOfWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pizzahut.co.in/");	
		String pageTitle = driver.getTitle();
		System.out.print(pageTitle);
	}

}
