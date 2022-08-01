package com.OrangeHRM;

import java.util.Set;

import org.openqa.selenium.By;

public class Windowswitch extends BaseClass{

	public static void main(String[] args) {

		LaunchBrowser("chrome");
		driver.get("https://www.redbus.in/");
		driver.findElement(By.linkText("Help"));
		//Get Parent window Id
		String parentTabId = driver.getWindowHandle();
		//Print parent window id
		System.out.println(parentTabId);
		Set<String> windowsId = driver.getWindowHandles();
		//Print Set of all window ids
		System.out.println(windowsId);
		//Iterate set of window ids and switch to child window
		for(String Id:windowsId)
		{
			//check if the current id is not equal to parent id
			if(!Id.equals(parentTabId))
			{
				System.out.println(Id);
				//Switch to child window
				driver.switchTo().window(Id);
				//Print the title of child window
				System.out.println(driver.getTitle());
				//close the child window
				driver.close();
				//Switch back the parent window
				driver.switchTo().window(parentTabId);
				//driver.switchTo().defaultContent();
			}
			}
		System.out.println(driver.getTitle());
	}
}
