package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleRadioCheckbox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Vinay\\Ranjani\\WebDriverFiles\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

			//handling multiple check boxes
			System.out.println("Going for check box selection");
			List<WebElement> check = driver.findElements(By.xpath(".//input[@type='checkbox']"));
			System.out.println("Size is "+check.size());
			for(int i=0;i<check.size();i++)
			{
				String s = check.get(i).getAttribute("id");
				System.out.println(s);
				if(s.equalsIgnoreCase("sing"))
				{
					check.get(i).click();
					//break;
				}
			}
			
			//handling multiple radio buttons
		List<WebElement> radio = driver.findElements(By.xpath(".//input[@name='lang' and @type='radio']"));
		System.out.println("Length is  "+radio.size());
		for(WebElement r :radio)
		{
			String val =r.getAttribute("value");
			System.out.println(val);
			if(val.equals("JAVA"))
			{
				r.click();
				//Use break if we need to stop loop after this click
				
			}
		}
		
	
		
		
		
		
		//driver.close();
	}

}
