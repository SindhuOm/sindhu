package Trail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
// driver.get("http://magento.com");
//  String dr = driver.getCurrentUrl();
//  System.out.println(dr);
//  //System.out.println(driver.getCurrentUrl());
//  driver.quit();
//  if(dr.startsWith("https"))
//  {
//	  System.out.println("The site is secured ");
//  }
//  
//  if(dr.equals("https://magento.com/"))
//  {
//	  System.out.println("Expected");
//  }
  
   driver.get("http://yahoo.com");
   String dr = driver.getCurrentUrl();
   System.out.println(dr);
   if(dr.startsWith("https"))
   {
	   System.out.println("expected");
   }
   
   if(dr.equals("https://in.yahoo.com/?p=us"))
   {
	   System.out.println("It is working site");
	   
   }
   String title = driver.getTitle();
   System.out.println(title);
   
   driver.quit();
	}

}
