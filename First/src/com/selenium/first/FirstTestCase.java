package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		String baseUrl = "https://www.google.com";
		wd.get(baseUrl);
		WebElement element = wd.findElement(By.name("q"));
		element.sendKeys("Bananas");
		element.submit();
		
		System.out.println("Successfully opened the website www.Store.Demoqa.com");

		Thread.sleep(5000);

		wd.quit();
	}
}
