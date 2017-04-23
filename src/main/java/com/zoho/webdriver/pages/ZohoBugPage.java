package com.zoho.webdriver.pages;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZohoBugPage {
  
private WebDriver driver;
  
  public ZohoBugPage(WebDriver driver)
  {
    this.driver = driver;
  }
  
  public void submitBug()
  {
    WebElement newbug = driver.findElement(By.cssSelector("#fileabugnew"));
    newbug.click();
    WebElement titlearea = driver.findElement(By.cssSelector("#fileabug_subject"));
    titlearea.sendKeys("This is my second bug");
    WebElement dropdown = driver.findElement(By.cssSelector(".select2-choice>div>b"));
    dropdown.click();
   
  }

}
