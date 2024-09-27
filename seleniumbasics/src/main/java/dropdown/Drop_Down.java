package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		WebElement drop_down1 = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select (drop_down1);
		select.selectByIndex(2);
		WebElement drop_down2 = driver.findElement(By.id("dropdowm-menu-2"));
		Select select1 = new Select (drop_down2);
		select1.selectByValue("maven");
		WebElement drop_down3 = driver.findElement(By.id("dropdowm-menu-3"));
		Select select2 = new Select (drop_down3);
		select2.selectByVisibleText("CSS");
		driver.close();
	}

}
