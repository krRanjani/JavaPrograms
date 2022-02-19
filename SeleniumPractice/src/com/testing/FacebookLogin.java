package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookLogin {
	
	public static WebDriver driver;
	static String URL ="https://www.facebook.com/";
	
	@BeforeTest
	public static void launchBrowser()
	{
		System.out.println("Launching FB");
		System.setProperty("webdriver.chrome.driver","C:\\Vinay\\Ranjani\\WebDriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
	}
	
	/*@Test (priority=1)
	public void createAccount()
	{
		driver.findElement(By.xpath(".//a[@role='button']")).click();
		
	}*/
	@Test(priority=2)
	public static void fbLogin() throws InterruptedException
	{
		driver.findElement(By.xpath(".//input[@name='email']")).sendKeys("ranju.jce@gmail.com");
		driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("December@1984");
		driver.findElement(By.xpath(".//*[@id='u_0_d_jb']|.//*[@name='login']")).click();
		System.out.println("Page title is "+driver.getTitle());
			
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
