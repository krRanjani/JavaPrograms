package com.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Vinay\\Ranjani\\WebDriverFiles\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String URL = "https://www.google.com/";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
