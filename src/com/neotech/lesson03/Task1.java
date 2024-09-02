package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	/* 
	 *     TC 1: Facebook login: 
	        Open chrome browser
	        Go to “https://www.facebook.com/”
	        Enter valid username and valid password and click login 
	        User successfully logged in
	 */

	public static final String url = "https://facebook.com";

	public static void main(String[] args) {

		// Using Xpath
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Wick123");

		// the first part of the buttons id never changes so we can use it
		// driver.findElement(By.xpath("//button[contains(@id, 'u_0')]")).click();

		driver.findElement(By.xpath("//button[@name='login']")).click();

		driver.quit();

	}

}
