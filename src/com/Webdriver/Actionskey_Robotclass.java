package com.Webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionskey_Robotclass {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nithe\\eclipse-workspace\\Selenium revision\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement normalclick = driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]"));
       Actions A = new Actions(driver);
       
       A.click(normalclick).build().perform();
       
       WebElement rightclick = driver.findElement(By.xpath("//div[contains(text(),'WILDHORN RFID')]"));
       A.contextClick(rightclick).build().perform();
       
       Robot R = new Robot();
       
       R.keyPress(KeyEvent.VK_DOWN);
       R.keyRelease(KeyEvent.VK_DOWN);
       
       Thread.sleep(1000);
       
       R.keyPress(KeyEvent.VK_ENTER);
       R.keyRelease(KeyEvent.VK_ENTER);
}
}