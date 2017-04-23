package com.zoho.webdriver.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZohoHomePage {
  private WebDriver driver;
  
  public ZohoHomePage(WebDriver driver)
  {
    this.driver = driver;
  }
  
  public ZohoProjectPage gotoProjectpage()
  { 
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions
        .elementToBeClickable(By.cssSelector("#projlist_1082520000000015005_active"))).isDisplayed();

    WebElement clickproj = driver.findElement(By.cssSelector("#projlist_1082520000000015005_active"));
    clickproj.click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    ZohoProjectPage zohoprojectpage = new ZohoProjectPage(driver);
    return zohoprojectpage;
  }

}
