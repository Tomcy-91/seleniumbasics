package webdriver_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();//driver is a reference variable to represent WebDriver
		driver.manage().window().maximize();//To maximize full screen..wedriver methods
		driver.get("https://selenium.qabible.in/");
		String tittle=driver.getTitle();// to get the tittle of the web page
		System.out.println("The tittle of the web page is " + tittle);
		String currenturl= driver.getCurrentUrl();
		System.out.println("Current url of the web page is :" +currenturl);
		String handleid = driver.getWindowHandle();
		System.out.println(" Handle id of the web page is :" +handleid );
		String sourcecode= driver.getPageSource();// to get source code of the web page
		System.out.println(sourcecode);
		driver.close();
		
		
	}

}
