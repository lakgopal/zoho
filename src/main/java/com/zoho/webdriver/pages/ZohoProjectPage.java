package com.zoho.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZohoProjectPage {
private WebDriver driver;
  
  public ZohoProjectPage(WebDriver driver)
  {
    this.driver = driver;
  }
  
  public ZohoBugPage gotoBugPage()
  {
    //WebDriverWait wait = new WebDriverWait(driver, 5);
    //wait.until(ExpectedConditions
        //.elementToBeClickable(By.cssSelector("#.fl.pl16.mt1.txtOverflow.fl.oflowh"))).isDisplayed();
    WebElement buglink = driver.findElement(By.cssSelector(".zoho-bugs1.fs17px.fl"));
    buglink.click();
    ZohoBugPage zohobugpage = new ZohoBugPage(driver);
    return zohobugpage;
  }

}
