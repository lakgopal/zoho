package com.zoho.webdriver.pages;

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

}
