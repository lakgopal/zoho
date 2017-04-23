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


  public ZohoHomePage Signin(String string1, String string2) {

    driver.switchTo().frame("zohoiam");
    WebElement userName = driver.findElement(By.cssSelector("input#lid.input.usrbx"));
    userName.sendKeys(string1);
    WebElement password = driver.findElement(By.id("pwd"));
    password.sendKeys(string2);
    WebElement linkElement1 = driver.findElement(By.id("submit_but"));
    linkElement1.click();
    driver.switchTo().defaultContent();
    ZohoHomePage zohohomepage = new ZohoHomePage(driver);
    return zohohomepage;
  }
}
