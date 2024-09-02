package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException  {

		//Do I need to re-attach the libraries?
			//No, we already added the external jar files (language bindings)
		
		
		
		//we want to go to the neotechacademy URL
		driver.get("https://www.neotechacademy.com/");
		
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.neotechacademy.com/";
		
		
		if(actualURL.equals(expectedURL))
		{
			System.out.println("Title: " + driver.getTitle());
		}
		else
		{
			System.out.println("The URL is wrong!");
		}
		
		//I can use Thread.sleep(); to stop the code for some seconds so that I can see the page
		Thread.sleep(5000);
		
		//closing the browser
		driver.quit();
		
		

	}

}
