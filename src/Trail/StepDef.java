package Trail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	 
	 WebDriver driver;
        
	@Given("i should able to login to magento home page")
	public void i_should_able_to_login_to_magento_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("http://magento.com");
	}

	@Given("i should able to slect the user login")
	public void i_should_able_to_slect_the_user_login() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
	}

	@When("i update the user name to be {string}")
	public void i_update_the_user_name_to_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("email")).sendKeys(string);
	   
	}

	@When("i update the password to be {string}")
	public void i_update_the_password_to_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("pass")).sendKeys(string);
	}

	@Then("i should able to get the error message as {string}")
	public void i_should_able_to_get_the_error_message_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
