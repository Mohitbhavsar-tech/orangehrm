package com.OrangeHRM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Printscreen extends BaseClass{

	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		driver.get("https://www.amazon.in/");
		WebElement dropDownBox = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(dropDownBox);
		select.selectByVisibleText("Appliances");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("washing machine");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> result = driver.findElements(By.xpath("//div[starts-with(@data-cel-widget,'MAIN-SEARCH_RESULTS')]/descendant::h2/a/span"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> result1 = driver.findElements(By.xpath("//span[text()=\"₹\"]/following-sibling)]::span"));

		//List<WebElement> result1 = driver.findElements(By.xpath("//div[(@class=\"a-row a-size-base a-color-base\" )]/descendant::span[3]/span[2]"));
		for(WebElement element:result) {
			String resultDetails=element.getText();
			System.out.println(resultDetails);
		}	


		for(WebElement element1:result1) {
			String resultDetails1=element1.getText();
			System.out.println(resultDetails1);
		}
	}

}  
