package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mousehover extends BaseClass{

	public static void main(String[] args) {
		LaunchBrowser("chrome");
		driver.get("https://www.redbus.in/");
		WebElement redRailMenu=driver.findElement(By.id("redRail"));
		Actions act = new Actions(driver);
		act.moveToElement(redRailMenu).click().build().perform();
		driver.quit();
	}

}
