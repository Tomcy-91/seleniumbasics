package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class BrowserLauch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();//driver is a reference variable to represent WebDriver
		driver.manage().window().maximize();//To maximize full screen..wedriver methods
		driver.get("https://selenium.qabible.in/");

	}

}
