package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	/*
	 * Open chrome browser
		Go to "https://demo.guru99.com/test/newtours/"
		Click on Register Link
		Fill out ALL required info
		Click Submit
		User successfully registered
		(Create the script using different locators)
	 */

	public static final String url = "https://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {

		// create a webdriver object for browser interaction
		WebDriver driver = new ChromeDriver();

		// go to the url
		driver.get(url);

		// how do we find the web elements?
		// driver.findElement(--locator--);

		driver.findElement(By.partialLinkText("REGIS")).click();

		Thread.sleep(2000);

//		WebElement register = driver.findElement(By.linkText("REGISTER"));
//		register.click();

		// lets fill out the form

		driver.findElement(By.name("firstName")).sendKeys("John");
		driver.findElement(By.name("lastName")).sendKeys("Wick");
		driver.findElement(By.name("phone")).sendKeys("555 555 5555");
		driver.findElement(By.name("userName")).sendKeys("jwick@gmail.com");

		// fill in the address info

		driver.findElement(By.name("address1")).sendKeys(" 123 Main St");
		driver.findElement(By.name("city")).sendKeys("NYC");
		driver.findElement(By.name("state")).sendKeys("NY");
		driver.findElement(By.name("postalCode")).sendKeys("44444");

		// fill in the user info

		driver.findElement(By.id("email")).sendKeys("jonh.wick");
		driver.findElement(By.name("password")).sendKeys("Wick123!");
		driver.findElement(By.name("confirmPassword")).sendKeys("Wick123!");

		// submit the form by clicking on the submit button

		driver.findElement(By.name("submit")).click();

		Thread.sleep(1000);

		// lets verify the successful submit

		String expectedUrl = "https://demo.guru99.com/test/newtours/register_sucess.php";
		String actualUrl = driver.getCurrentUrl();

		if (expectedUrl.equals(actualUrl)) {
			System.out.println("Test was successful!");
		} else {
			System.out.println("Test failed!");
		}

		driver.quit();
	}

}
