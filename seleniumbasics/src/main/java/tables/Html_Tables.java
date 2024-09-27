package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices/nse");
		WebElement show_more_field = driver.findElement(By.id("showMoreLess"));
		show_more_field.click();
		WebElement table_data = driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(table_data.getText());
		WebElement single_row_data = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
		System.out.println(single_row_data.getText());
		List<WebElement> row = table_data.findElements(By.tagName("tr"));
		int rowcount = row.size();
		for ( int i=0;i<rowcount;i++)
		{
			List<WebElement> column = row.get(i).findElements(By.tagName("td"));
			int columncount = column.size();
			
			
			for( int j=0;j<columncount;j++)
			{
				String celldata = column.get(j).getText();
				if (celldata.equals("NIFTY BANK"))
				{
					System.out.println("Last thread is :" +column.get(1).getText());
				}
			}
		}
		driver.close();

	}

}
