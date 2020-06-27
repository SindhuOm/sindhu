package Trail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
WebDriverWait wait = new WebDriverWait(driver,30);

driver.get("http://magento.com");
driver.manage().window().maximize();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"register\"]/span")));
driver.findElement(By.xpath("//*[@id=\"register\"]/span")).click();
driver.findElement(By.id("firstname")).sendKeys("Sindhu");
driver.findElement(By.id("lastname")).sendKeys("Omprakash");
driver.findElement(By.id("email_address")).sendKeys("lathasindhu@gmail.com");
Select companyprimary = new Select(driver.findElement(By.id("company_type")));
companyprimary.selectByValue("selling");
Select Role = new Select(driver.findElement(By.id("individual_role")));
Role.selectByVisibleText("Business/sales/marketing/merchandising");
Select Country = new Select(driver.findElement(By.id("country")));
Country.selectByValue("AX");
driver.findElement(By.id("password")).sendKeys("Sindhuom");
driver.findElement(By.id("password-confirmation")).sendKeys("Sindhuom");
//frames :
driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"msp-recaptcha-d84b65fc916e7398083ea5f17089d8f1\"]/div/div/iframe")));
driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
driver.switchTo().defaultContent();
if(!driver.findElement(By.id("agree_terms")).isSelected())
{
driver.findElement(By.id("agree_terms")).click();
}

//Link or Anchor : ( two types: partial link text , a is expanded in inspecting and link text,here a is not expanded )

driver.findElement(By.partialLinkText("Back")).click();
driver.close();




	
	}

}
