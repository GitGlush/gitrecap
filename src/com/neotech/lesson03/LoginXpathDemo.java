package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpathDemo {

	public static final String url = "https://sis.neotechacademy.com";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		// send the username and password
		// this time we will locate the elements using Xpath

		// /html/body/form/table[1]/tbody/tr/td[2]/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td[3]/input
//		driver.findElement(By.xpath(
//				"/html/body/form/table[1]/tbody/tr/td[2]/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td[3]/input"))
//				.sendKeys("Admin");

		driver.findElement(By.xpath("//input[@id='tUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='tPassword']")).sendKeys("Neotech$123");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='bLogin']")).click();
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		driver.findElement(By.xpath("//input[@name='bLogin']")).click();
		Thread.sleep(3000);

		// click on the Students link
		driver.findElement(By.xpath("//a[contains(text(),'Students')]")).click();
		Thread.sleep(3000);

		driver.quit();
	}

}
