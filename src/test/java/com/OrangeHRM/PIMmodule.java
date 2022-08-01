package com.OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PIMmodule extends BaseClass{

	public static void main(String[] args) {

		LaunchBrowser("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com");
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 driver.findElement(By.id("menu_pim_viewPimModule")).click();
		 driver.findElement(By.id("menu_pim_addEmployee")).click();
		 driver.findElement(By.id("firstName")).sendKeys("Vijay");
		 driver.findElement(By.id("lastName")).sendKeys("Patil");
		 driver.findElement(By.id("btnSave")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//input[@id=\"empsearch_employee_name_empName]")).click();

		 driver.findElement(By.xpath("//input[@class=\"ac_input]")).sendKeys("Vijay");

		 driver.findElement(By.xpath("//input[@name=\"_search\"]")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		 WebElement tc1 = driver.findElement(By.linkText("Vijay"));
		 if(tc1.isDisplayed())
		    {
		    	System.out.print("Employee added successfully");
		    }
		    else {
		    	System.out.print("Employee not added successfully");
		    }

				
	}

}
