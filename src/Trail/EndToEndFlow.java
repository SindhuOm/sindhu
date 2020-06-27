package Trail;

import java.awt.Desktop.Action;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EndToEndFlow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =  new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//WebDriverWait wait = new WebDriverWait(driver,30);

driver.get("https://demo.openemr.io/a/openemr");
driver.findElement(By.id("authUser")).sendKeys("admin");
driver.findElement(By.id("clearPass")).sendKeys("pass");
driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[1]/div[5]/button")).click();
Actions ac = new Actions(driver);
ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/div"))).perform();

driver.findElement((By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[2]/div"))).click();
Thread.sleep(3000);
driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"framesDisplay\"]/div[3]/iframe")));
Select dr = new Select(driver.findElement(By.xpath("//*[@id=\"form_title\"]")));
dr.selectByValue("Mr.");
driver.findElement(By.id("form_fname")).sendKeys("Omprakash");
driver.findElement(By.id("form_lname")).sendKeys("srinivasalu");
Date dt = new Date();
SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
System.out.println(sf.format(dt));
driver.findElement(By.id("form_DOB")).click();
driver.findElement(By.id("form_DOB")).clear();
Thread.sleep(2000);
driver.findElement((By.className("xdsoft_today"))).click();
Select dr1 = new Select(driver.findElement(By.xpath("//*[@id=\"form_sex\"]")));
dr1.selectByValue("Female");
driver.findElement(By.id("create")).click();
driver.switchTo().defaultContent();
driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"modalframe\"]")));
driver.findElement(By.xpath("/html/body/center/input")).click();
Thread.sleep(3000);
driver.switchTo().alert().accept();

	}

}




//1. Navigate onto https://demo.openemr.io/a/openemr
//2. Update username as admin
//3. Update password as pass
//4. Click on login button
//5. Navigate onto Patient/Client
//6. Choose New/Search
//7. Add the firstname, lastname
//8. Update DOB as today's date
//9. Update the Sex
//10. Click on the create new patient button above the form
//11. Click on confirm create new patient button
//Validate
//1. Alert message
//2. Happy birthday message
//12. Close the Birthday wishes message
//13. Choose Billy Smith from Menu bar at the right corner
//14. Click on Log Out