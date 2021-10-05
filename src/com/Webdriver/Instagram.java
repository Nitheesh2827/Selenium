package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nithe\\eclipse-workspace\\Selenium revision\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement Id = driver.findElement(By.xpath("//input[@name='username']"));
		Id.sendKeys("nitheesh2827");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("Nandhuuu5");
		
		WebElement login = driver.findElement(By.xpath("//div[contains(text(),'Log In')]"));
		login.click();
		Thread.sleep(5000);
		
		WebElement savepass = driver.findElement(By.xpath("//button[text()='Not Now']"));
		savepass.click();
		
		Thread.sleep(8000);
		
		WebElement notification = driver.findElement(By.xpath("//button[text()='Not Now']"));
		notification.click();
		
		WebElement msg = driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]/*[1]"));
		msg.click();
		Thread.sleep(7000);
		WebElement boys = driver.findElement(By.xpath("//div[text()='Hoddy boys...']"));
		boys.click();
		WebElement message = driver.findElement(By.xpath("//textarea[@placeholder='Message...']"));
		message.sendKeys("***");
		
		WebElement send = driver.findElement(By.xpath("(//button[@type='button'])[7]"));
		send.click();
		
		WebElement mut = driver.findElement(By.xpath("//div[contains(text(),'muthu_kmr_')]"));
		mut.click();
		
		WebElement message2 = driver.findElement(By.xpath("//textarea[@placeholder='Message...']"));
		message2.sendKeys("I am sending this msg using selenium");
		
		WebElement send2 = driver.findElement(By.xpath("(//button[@type='button'])[12]"));
		send2.click();
	}

}
