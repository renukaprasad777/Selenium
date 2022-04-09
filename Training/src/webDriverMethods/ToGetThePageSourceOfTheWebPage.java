package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetThePageSourceOfTheWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pizzahut.co.in/");	
		String pageSource = driver.getPageSource();
		System.out.print(pageSource);
	}

}
