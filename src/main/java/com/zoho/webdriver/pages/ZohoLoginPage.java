package com.zoho.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZohoLoginPage {

	private WebDriver driver;

	public ZohoLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void login(String string1, String string2) {
		WebElement userName = driver.findElement(By.id("lid"));
		userName.sendKeys(string1);
		WebElement password = driver.findElement(By.id("pwd"));
		password.sendKeys(string2);
		WebElement linkElement1 = driver.findElement(By.className("mobile-login"));
		linkElement1.click();
	}
}
