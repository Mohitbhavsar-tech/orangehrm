package com.OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass {
	public static void login(String Username,String Password)
	{
	driver.findElement(By.id("txtUsername")).sendKeys(Username);
	driver.findElement(By.id("txtPassword")).sendKeys(Password);
	driver.findElement(By.id("btnLogin")).click();

}
	public void logout() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Logout")));
	driver.findElement(By.linkText("Logout")).click();
		
	}
}
