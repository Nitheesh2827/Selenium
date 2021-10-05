package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Drivers {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nithe\\eclipse-workspace\\Selenium revision\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/watch?v=3wnG9k3VbVE");
	String Url = driver.getCurrentUrl();
	System.out.println(Url +"");
	String Title = driver.getTitle();
	System.out.println(Title +"");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.navigate().to("https://attendance.focusedumatics.com/cosec/Default/Default#/ESS/12/12050/12050");
	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().back();
	WebElement find = driver.findElement(By.xpath("//input[@id=\"search\"]"));
	find.sendKeys("Selenium");
	WebElement find2 = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
	find2.click();
	}

}
