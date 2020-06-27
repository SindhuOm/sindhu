package Trail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSuite {
	
	WebDriver driver;
	WebDriverWait wait;  
	
	//There are two types of report present, one is ATU report and other is allure
	
	@BeforeMethod
	public void Starttest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://magento.com");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 wait = new WebDriverWait(driver,30);
	}
	@Test(priority=10,dataProvider="Logindetails")
	public void Testing(String user,String password) {
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
		 driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
		 driver.findElement(By.id("email")).sendKeys(user);
		 driver.findElement(By.id("pass")).sendKeys(password);
		 driver.findElement(By.id("send2")).click();
		 wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"), "Invalid login or password."));
		 String dr = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText();
		 System.out.println(dr);	 
		
	}
	
@AfterMethod(alwaysRun=true)
public void AfterEveryTest()
{
	driver.quit();
}
	
@DataProvider(name="Logindetails")
public Object[][] Login(){
	return new Object[][] {
		{"sunstarom@gmail.com","Welcome"}
		
	};
}
		public void type(By locator, String data)
		{
			driver.findElement(locator).sendKeys(data);
			
		}
		public void click(By locator)
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			 wait.until(ExpectedConditions.elementToBeClickable(locator));
			 driver.findElement(locator).click();
		}
	
		public void click1(By locator)
		{
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			driver.findElement(locator).click();
		}
	@Test(priority=20,groups = {"g1"},dependsOnMethods="Testing")
	public void Register() throws InterruptedException {
 Thread.sleep(3000);
        click(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div"));
 		click(By.xpath("//*[@id=\"register\"]/span"));
		type(By.id("firstname"),"Sindhu");
		type(By.id("lastname"),"Omprakash");
		type(By.id("email_address"),"lathasindhu@gmail.com");
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
		
		
	}
}
