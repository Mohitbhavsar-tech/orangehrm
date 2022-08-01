package com.OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Util extends BaseClass {
	public static void waitForElementToClick(By element) {
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(element));

}
	public static void waitForElementToVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public static void fluentWait(final WebElement element) {
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
				wait.until(new Function<WebDriver,WebElement>(){
					public WebElement apply(WebDriver driver) {
						System.out.println("Checking the element availability to perform action...");
						return element;
					}
				});
	}
	public static void validate(String actualResult, String expectedResult) throws Exception {
		if(actualResult.equals(expectedResult)) {
System.out.println("Successfully done the validation...");		
	}else {
		throw new Exception("failed to verify actual and expected result :\n actualResult :"+actualResult+"+expectedResult :"+expectedResult);
	}
	}
}
