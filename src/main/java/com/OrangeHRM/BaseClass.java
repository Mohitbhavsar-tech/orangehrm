package com.OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
public static void LaunchBrowser(String browserName) {
	switch(browserName) {
	
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		
	case "Firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
	case "Edge" :
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	    break;
	default :
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
}
}
