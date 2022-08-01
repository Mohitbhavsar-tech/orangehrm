package com.OrangeHRM;

import org.openqa.selenium.By;

public class ActionclassExample extends BaseClass{

	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		driver.get("https://realestateautomation.agilecrm.com");
		driver.findElement(By.name("email")).sendKeys("automation@yopmail.com");
	    driver.findElement(By.name("password")).sendKeys("Test1234");
	    driver.findElement(By.xpath("//input[@value='sign In']")).submit();
	    driver.findElement(By.id("dealsmenu")).click();
	    //Source Element
	    Util.waitForElementToClick(By.id("5003049292070912"));
	    //Destination Element
	}

}
