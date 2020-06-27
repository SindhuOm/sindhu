package Trail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
     driver.get("http://magento.com");
     Actions ac =new Actions(driver);
     ac.moveToElement(driver.findElement(By.partialLinkText("Products"))).perform();
   //  ac.click(driver.findElement(By.linkText("Page Builder"))).perform(); // this method is through mover over step
     driver.findElement(By.linkText("Page Builder")).click();  // this is the direct way to click
     
 
	}

}
