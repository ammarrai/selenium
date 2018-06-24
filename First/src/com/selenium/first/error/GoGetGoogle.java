package com.selenium.first.error;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoGetGoogle {

	private WebDriver driver;

	@Before
	public void setup() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\dev\\SELENIUM\\chromedriver.exe");
	}

	@Test
	public void ourTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\dev\\SELENIUM\\chromedriver.exe");
		driver.get("https://www.google.com");
	}

	@After
	public void tearDown() throws InterruptedException {

		System.out.println("Successfully opened the website www.Store.Demoqa.com");
		driver.quit();

	}

}
