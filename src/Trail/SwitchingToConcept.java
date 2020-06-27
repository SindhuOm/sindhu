package Trail;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchingToConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		driver.get("http://google.com");
//		driver.findElement(By.linkText("Gmail")).click();
//	    driver.findElement(By.linkText("Sign in")).click();	
//	    Set<String> child1 =  driver.getWindowHandles();
//	    driver.switchTo().window((String) child1.toArray()[1]);
//	    driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("lathasindhu");
//	    driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
//	    Set<String> child = driver.getWindowHandles();
//		   driver.switchTo().window((String) child.toArray()[0]);
//	   driver.findElement(By.linkText("For Work")).click();
//	   Set<String> child2 = driver.getWindowHandles();
//	   driver.switchTo().window((String) child2.toArray()[2]);
//	   driver.findElement(By.linkText("Get started")).click();
           
	    
//	    // switch window concepts :
//	    // single window handle comes with (WindowHandle)
//	    String parentwindow = driver.getWindowHandle();
//	    //to switch to parent window then 
//	    driver.switchTo().window(parentwindow);
//	    
//	  //WindowHandles
//	    Set<String> str = driver.getWindowHandles();
//	    driver.switchTo().window((String) str.toArray()[1]);
	   
	   // HDFC Banking
	   
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frameset/frame[2]")));
		driver.findElement(By.partialLinkText("Terms and Conditions")).click();
		driver.switchTo().defaultContent();
		Set<String> page2 = driver.getWindowHandles();
		driver.switchTo().window((String) page2.toArray()[1]);
		driver.findElement(By.linkText("HDFC Life")).click();
		driver.close();
		
		
		
	   
	}

}
