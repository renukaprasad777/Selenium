package Basics;

import org.openqa.selenium.opera.OperaDriver;

public class LaunchOperaBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver","C:\\Users\\Renuka Prasad\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		OperaDriver driver=new OperaDriver();
		driver.get("https://www.zomato.com/");
		 
	}

}
