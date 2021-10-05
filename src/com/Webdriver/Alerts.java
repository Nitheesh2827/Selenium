package com.Webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nithe\\eclipse-workspace\\Selenium revision\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		Thread.sleep(9000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
	}

}
