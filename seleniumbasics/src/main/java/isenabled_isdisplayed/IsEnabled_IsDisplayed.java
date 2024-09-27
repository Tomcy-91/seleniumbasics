package isenabled_isdisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_IsDisplayed {
	
	public void verify_isselected()
	{
		boolean isSelected;
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		WebElement gender_field = driver.findElement(By.id("gender-male"));
		isSelected = gender_field.isSelected();
		System.out.println("Gender button before selected :" +isSelected);
		gender_field.click();
		isSelected = gender_field.isSelected();
		System.out.println("Gender button after selected :" +isSelected);
		
	}
	
	public void verify_isEnabled()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		WebElement sub = driver.findElement(By.id("newsletter-subscribe-button"));
		boolean sub_button_enabled = sub.isEnabled();
		System.out.println("Subscription button is enabled :" +sub_button_enabled);
		driver.close();
			
	}
	
	public void verify_isDisplayed()
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement vote_button = driver.findElement(By.id("vote-poll-1"));
		boolean vote_button_displayed = vote_button.isDisplayed();
		System.out.println("Vote button is displayed :" +vote_button_displayed);
		driver.close();
		
	}
	
	public static void main(String args[])
	{
		IsEnabled_IsDisplayed obj = new IsEnabled_IsDisplayed();
		//obj.verify_isselected();
		//obj.verify_isEnabled();
		obj.verify_isDisplayed();
	}

}
