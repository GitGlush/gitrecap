package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static final String url = "https://sis.neotechacademy.com";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		// send the username and password
		driver.findElement(By.id("tUsername")).sendKeys("Admin");
		driver.findElement(By.id("tPassword")).sendKeys("Neotech$123");

		Thread.sleep(3000);

		driver.findElement(By.id("bLogin")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Students")).click();

		Thread.sleep(3000);

		driver.quit();

	}

}
