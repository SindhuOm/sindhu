package Trail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://www.echoecho.com/javascript4.htm");
Thread.sleep(5000);
//driver.findElement(By.name("B1")).click();
//driver.switchTo().alert().accept();
driver.findElement(By.name("B2")).click();
Thread.sleep(5000);
driver.switchTo().alert().dismiss();
	}

}
