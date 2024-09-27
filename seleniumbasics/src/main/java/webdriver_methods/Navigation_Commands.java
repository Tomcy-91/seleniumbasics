package webdriver_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Commands {
	
	public static void main(String args[])
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/");
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
	}

}
