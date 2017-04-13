package com.zoho.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBuilder {
	private static WebDriver driver = null;

	public static WebDriver getDriver() {
		if (driver == null) {
			
			System.setProperty("webdriver.chrome.driver",
		        "/Users/lakshmigopalakrishna/Downloads/chromedriver");
			driver = new ChromeDriver();
			return driver;
		}
		return driver;
	}
}