package webelementcommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements_Commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		WebElement gender = driver.findElement(By.id("gender-female"));
		gender.click();
		WebElement firstname = driver.findElement(By.id("FirstName"));
		firstname.sendKeys("Tomcy");
		WebElement lastname = driver.findElement(By.id("LastName"));
		lastname.sendKeys("Thomas");
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("thomcythomas@gmail.com");
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("Password");
		WebElement confirmpassword = driver.findElement(By.id("ConfirmPassword"));
		confirmpassword.sendKeys("Password");
		WebElement register = driver.findElement(By.id("register-button"));
		register.click();
		WebElement firstname1 = driver.findElement(By.id("FirstName"));
		firstname1.clear();//clear the value from a field
		String firstname2 = driver.findElement(By.id("FirstName")).getAttribute("class");
		System.out.println(firstname2);
		WebElement sub_button  = driver.findElement(By.id("newsletter-subscribe-button"));
		System.out.println(sub_button.getCssValue("display"));
		System.out.println(sub_button.getSize());
		WebElement search = driver.findElement(By.id("small-searchterms"));
		System.out.println(search.getTagName());
		WebElement confirm_pswd = driver.findElement(By.xpath("//label[@for='ConfirmPassword']"));
		System.out.println(confirm_pswd.getText());
		
		
		driver.close();
	}

}
