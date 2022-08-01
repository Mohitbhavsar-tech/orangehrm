package com.OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples extends BaseClass{

	public static void main(String[] args) {
		LaunchBrowser("chrome");
		driver.navigate().to("https:opensource-demo.orangehrmlive.com");
		Login_Automation.Logintest("Admin","admin123");
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		//Locate emp status Dropdown
		WebElement empStatusDropDown=driver.findElement(By.id("empsearch_employee_status"));
	
		//create instance of select class and pass the  reference of dropdown menu in it.
		Select select = new Select(empStatusDropDown);
		
		//Select the drop down value by index
		select.selectByIndex(1);
		
		
		//Select dropdown value by text
		select.selectByVisibleText("Full-Time Permanent");
		
		//select dropdown by value
		select.selectByValue("2");
		
		//Deselect dropdown by index
		//select.deselectByIndex(1);

		//Deselect dropdown by value
		select.deselectByValue("2");
		
		driver.findElement(By.id("welcome")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Logout")).click();
		
		
		
	}

}
