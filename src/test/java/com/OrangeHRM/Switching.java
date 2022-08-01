package com.OrangeHRM;

import java.util.Set;

import org.openqa.selenium.By;

public class Switching extends BaseClass {

	public static void main(String[] args) {
		LaunchBrowser("chrome");
		driver.get("https://www.flipkart.com/");
		
		//Get parent window id
	      String parentid = driver.getWindowHandle();
	      System.out.println(parentid);
	      Set<String> childid = driver.getWindowHandles();
	      System.out.println(childid);
	      for(String id:childid)
	      {
	    	  if(!id.equals(childid)) {
	    		  System.out.println(id);
	    		  driver.switchTo().window(id);
	    	  }
	      }
	    	  
	      
	}
}
