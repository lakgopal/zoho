package com.zoho.webdriver;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.zoho.webdriver.WebDriverBuilder;
import com.zoho.webdriver.pages.ZohoBugPage;
import com.zoho.webdriver.pages.ZohoBugTracker;
import com.zoho.webdriver.pages.ZohoHomePage;
import com.zoho.webdriver.pages.ZohoLoginPage;
import com.zoho.webdriver.pages.ZohoProjectPage;

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
	  ZohoHomePage zohohomepage = zohologinpage.Signin("autotestzoho@gmail.com", "AutoTest123");
	  ZohoProjectPage zohoprojectpage = zohohomepage.gotoProjectpage();
	  }

	
     @Test
     public void verifyBugpage()
     {
       ZohoBugTracker mainPage = new ZohoBugTracker(driver);
       mainPage.load();
       ZohoLoginPage zohologinpage = mainPage.login();
       ZohoHomePage zohohomepage = zohologinpage.Signin("autotestzoho@gmail.com", "AutoTest123");
       ZohoProjectPage zohoprojectpage = zohohomepage.gotoProjectpage();
       ZohoBugPage zohobugpage = zohoprojectpage.gotoBugPage();
       String Actualtext = driver.findElement(By.cssSelector("#fileabugnew")).getText();
       Assert.assertEquals("Both strings are same",Actualtext,"Submit Bug");
     }
     
     
}
