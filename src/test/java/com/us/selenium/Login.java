package com.us.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@name= 'username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		Thread.sleep(5000);
		driver.close();
		//driver.quit();
}
}
