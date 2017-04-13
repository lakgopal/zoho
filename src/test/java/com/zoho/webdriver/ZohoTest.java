package com.zoho.webdriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.zoho.webdriver.WebDriverBuilder;
import com.zoho.webdriver.pages.ZohoBugTracker;
import com.zoho.webdriver.pages.ZohoHomePage;
import com.zoho.webdriver.pages.ZohoLoginPage;

public class ZohoTest {

	public WebDriver driver;

	public ZohoTest() {
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
	
	@Test
	public void verifySignin()
	{
	  ZohoBugTracker mainPage = new ZohoBugTracker(driver);
	  mainPage.load();
	  ZohoLoginPage zohologinpage = mainPage.login();
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  ZohoHomePage zohohomepage = zohologinpage.Signin("autotestzoho@gmail.com", "AutoTest123");
	  
	  }

}
