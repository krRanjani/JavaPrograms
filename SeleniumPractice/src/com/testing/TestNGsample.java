package com.testing;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGsample {
	public String URL = "https://www.apple.com/";
	public static WebDriver driver;
	public String E = null;
	public String A = null;

	@BeforeTest
	public void launch() throws InterruptedException
	{
		System.out.println("Launching....");
		System.setProperty("webdriver.gecko.driver","C:\\Vinay\\Ranjani\\WebDriverFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(URL);
		//Thread.sleep(10000);
		 A = driver.getCurrentUrl();
		 System.out.println("Current URL is "+ A);
	}
	  @Test(priority=2)
	  public void click()
	  {
		  driver.manage().window().maximize();
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  @SuppressWarnings("deprecation")
		WebDriverWait wait =  new WebDriverWait(driver,25);
		  WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'/iphone-13-pro/key-features/')]")));
		  ele.click();
		  
		  //driver.findElement(By.xpath("//a[contains(@href,'/iphone-13-pro/key-features/')]")).click();
		  A = driver.getCurrentUrl();
		  E= "https://www.apple.com/iphone-13-pro/key-features/";
		 // System.out.println("Current URL is :"+ A);
		  System.out.println("This is second priority");
		  AssertJUnit.assertEquals(A, E);
		  driver.navigate().back();
		  
	  }
 @Test(priority=3)
  public void verifyLink() {
	  A = driver.getCurrentUrl();
	  E ="https://www.apple.com/";
	 // System.out.println("Current URL is "+ A);
	  System.out.println("This is third priority");
	  Assert.assertEquals(A, E);
	  
  }
 @Test(priority=1)
 public void load() 
 
 {	 System.out.println("This is first priority");
 }

 @AfterTest
	public void close()
	{
	  driver.close();
	}
}