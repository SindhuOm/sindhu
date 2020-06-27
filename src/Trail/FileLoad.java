package Trail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileLoad {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.naukri.com/");
driver.findElement(By.id("file_upload")).sendKeys("C:\\Users\\SindhuGajappan\\Downloads\\Steps to Install anaconda.docx");
Thread.sleep(30000);
driver.findElement(By.id("block")).click();
driver.switchTo().alert().dismiss();

	}

}
