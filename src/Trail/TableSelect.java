package Trail;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		WebElement table = driver.findElement(By.id("example")).findElement(By.tagName("tbody"));
		List<WebElement> content = driver.findElements(By.tagName("tr"));
		for(int i = 0;i<content.size();i++)
		{
			System.out.println(content.get(i).getText());
		}
		System.out.println(table.findElements(By.tagName("tr")).get(2).getText());
		System.out.println(table.findElements(By.tagName("td")).get(1).getText());
		// table content can be done by grapping By.xpath of theparticular table selected
		
		}
			
		
		
	//chapter no : 11 

}
