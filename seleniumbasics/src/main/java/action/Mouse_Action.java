package action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action {
	
	public void verify_rightclick()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions action = new Actions(driver);
		action.contextClick(rightclick).build().perform();
		driver.close();
	}
	
	public void verify_mousehover()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/");
		WebElement item = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		Actions mousehover = new Actions(driver);
		mousehover.moveToElement(item).build().perform();
	}
	
	public void verify_draganddrop()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions dragdrop = new Actions(driver);
		dragdrop.dragAndDrop(drag, drop).build().perform();
	}
	
	public void verify_draganddropusing_offset()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://demoqa.com/dragabble");
		WebElement dragmebox = driver.findElement(By.id("dragBox"));
		Actions dragme = new Actions(driver);
		dragme.dragAndDropBy(dragmebox, 100, 150).build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mouse_Action obj = new Mouse_Action();
		//obj.verify_rightclick();
		//obj.verify_mousehover();
		//obj.verify_draganddrop();
		obj.verify_draganddropusing_offset();
	}
	
	
}
