package Trail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
 driver.get("http://magento.com");
 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 WebDriverWait wait = new WebDriverWait(driver,30);
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
 driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
 driver.findElement(By.id("email")).sendKeys("lathasindhu@gmail.com");
 driver.findElement(By.id("pass")).sendKeys("Welcome123");
 driver.findElement(By.id("send2")).click();
 wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"), "Invalid login or password."));
 String dr = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText();
 System.out.println(dr);
 driver.close();
 
 
 
 
// WebDriver driver = new ChromeDriver();
// driver.get("http://magento.com");
// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
// WebElement dr = driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div"));
// System.out.println(dr.getAttribute("class"));
// System.out.println(dr.getCssValue("background-image"));
// driver.close();
	}
}
