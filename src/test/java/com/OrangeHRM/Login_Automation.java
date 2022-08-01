package com.OrangeHRM;

import java.io.InterruptedIOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Automation extends BaseClass{
	public static void Logintest(String Username,String Password)
	{
	driver.findElement(By.id("txtUsername")).sendKeys(Username);
	driver.findElement(By.id("txtPassword")).sendKeys(Password);
	driver.findElement(By.id("btnLogin")).click();
	//driver.findElement(By.id("welcome")).click();
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Thread.sleep(2000);
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Logout")));
//	driver.findElement(By.linkText("Logout")).click();
	
	}
	
	public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","D:\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
	//driver = new ChromeDriver();
		Login_Automation la = new Login_Automation();
		la.LaunchBrowser("chrome");
	//driver.get("https://opensource-demo.orangehrmlive.com/");
	//Logintest("Admin","admin123");

}
	public void logout() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Logout")));
	driver.findElement(By.linkText("Logout")).click();
		
	}
}