package com.OrangeHRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Clickoperation extends BaseClass {

	public static void main(String[] args) throws AWTException {
		LaunchBrowser("chrome");
		driver.get("https://www.amazon.in/");
	WebElement element= driver.findElement(By.linkText("Best Sellers"));
		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();
		//act.keyDown(Keys.CONTROL).build().perform();
		//act.keyDown(Keys.ENTER).build().perform();
		
		  Robot robot = new Robot(); 
		  robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		  robot.keyRelease(KeyEvent.VK_PAGE_UP);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  
		  
		  String parentTabId = driver.getWindowHandle();
			//Print parent window id
			System.out.println(parentTabId);
			
			//Set<String> windowsId = driver.getWindowHandles();
			Set<String> windowsId = driver.getWindowHandles();
			//Print Set of all window ids
			System.out.println(windowsId);
			for(String Id:windowsId)
			{
				if(!Id.equals(parentTabId))
					System.out.println(Id);
				//Switch to child window
				driver.switchTo().window(Id);
				//driver.switchTo().window(parentTabId);
				System.out.println("Current tab title is:"+driver.getTitle());
				driver.close();
			}
		
		
	}

}
