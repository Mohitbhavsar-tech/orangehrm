package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginsTestCase extends BaseClass
{

	public static void main(String[] args) 
	{
		LoginsTestCase lt = new LoginsTestCase();
		lt.LaunchBrowser("chrome");
	//System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
 
		driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();
    driver.findElement(By.id("menu_pim_viewPimModule")).click();
    driver.findElement(By.id("menu_pim_addEmployee")).click();
    String firstname="Cyber";
    String lastname="Success";
    driver.findElement(By.id("firstName")).sendKeys("Cyber");
    driver.findElement(By.id("lastName")).sendKeys("Success");
    driver.findElement(By.id("btnSave")).click();
    driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
    driver.findElement(By.id("empsearch[employee_name][empName]")).sendKeys(firstname);
    driver.findElement(By.id("searchBtn")).click();
    WebElement tc1 = driver.findElement(By.xpath("//span[@id=spanMessage\"]"));
    if(tc1.isDisplayed())
    {
    	System.out.print("Test case 1 working as Expected");
    }
    else {
    	System.out.print("Test case 1 not working properly");
    }
	}
}

