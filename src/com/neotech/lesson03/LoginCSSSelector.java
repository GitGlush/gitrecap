package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCSSSelector {

	public static final String url = "https://sis.neotechacademy.com";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		
		driver.findElement(By.cssSelector("input#tUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#tPassword")).sendKeys("Neotech$123");

		Thread.sleep(3000);

		driver.findElement(By.cssSelector("input.buttonBig")).click();

		Thread.sleep(3000);

		driver.findElement(By.cssSelector("a[href*='Personal.aspx']")).click();

		Thread.sleep(3000);

		driver.quit();
	}

}
