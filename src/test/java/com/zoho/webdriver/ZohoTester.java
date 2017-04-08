package com.zoho.webdriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.zoho.webdriver.WebDriverBuilder;
import com.zoho.webdriver.pages.ZohoBugTracker;

public class ZohoTester {

	public WebDriver driver;

	public ZohoTester() {
		driver = WebDriverBuilder.getDriver();
	}

	@Before
	public void setup() {
		driver.manage().deleteAllCookies();

	}

	@Test
	public void verifyTitle() {
		ZohoBugTracker homePage = new ZohoBugTracker(driver);
		homePage.load();
		String title = homePage.getTitle();
		Assert.assertEquals("Online bug tracking and issue management software - Zoho BugTracker", title);
	}

}
