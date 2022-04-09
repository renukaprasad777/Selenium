package Basics;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Renuka Prasad\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.zomato.com/");
	}

}
