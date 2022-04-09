package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentUrlOfThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		String pageUrl = driver.getCurrentUrl();
		System.out.print(pageUrl);

	}

}
