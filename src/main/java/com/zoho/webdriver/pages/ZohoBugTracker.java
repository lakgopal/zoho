package com.zoho.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZohoBugTracker {

	private WebDriver driver;

	public ZohoBugTracker(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void load() {
		driver.get("https://www.zoho.com/bugtracker/");
	}

	public String getTitle() {
		return driver.getTitle();
	}
	
	public ZohoLoginPage login()
	{
	  driver.get("https://www.zoho.com/bugtracker/");
	  driver.findElement(By.linkText("LOGIN")).click();
	  ZohoLoginPage zohologinpage = new ZohoLoginPage(driver);
	  return zohologinpage;
	}

}
