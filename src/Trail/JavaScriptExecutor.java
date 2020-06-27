package Trail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);

		driver.get("http://magento.com");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//js.executeScript("alert(\"Hello\")"); - To run the alert message using the java code 
		
		Thread.sleep(3000);
		js.executeScript("h=document.body.scrollHeight");
		while(true) {
			js.executeScript("window.scrollTo(0,h)");
			Thread.sleep(3000);
			js.executeScript("h=h=100");
		}
		}
		
		
	

}
