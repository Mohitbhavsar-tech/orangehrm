package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Clickscroll extends BaseClass
{
public static void main(String[] args) {

	LaunchBrowser("chrome");
	driver.get("https://realestateautomation.agilecrm.com/");
	 driver.findElement(By.name("email")).sendKeys("automation@yopmail.com");
	    driver.findElement(By.name("password")).sendKeys("Test1234");
	  WebElement signInbutton =    driver.findElement(By.xpath("//input[@value='Sign In']"));	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",signInbutton);
	// Print domain of current page
	System.out.println(js.executeScript("return document.domain;"));
	System.out.println(js.executeScript("return document.URL;"));
	Util.waitForElementToVisible(driver.findElement(By.id("add-portlet")));

	js.executeScript("window.scrollBy(0,1000);");
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	}

}
