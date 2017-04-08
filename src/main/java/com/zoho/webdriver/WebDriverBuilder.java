package com.zoho.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBuilder {
	private static WebDriver driver = null;

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\surya\\Downloads\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.firefox.bin",
					"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			driver = new ChromeDriver();
			return driver;
		}
		return driver;
	}
}