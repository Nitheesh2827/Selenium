package com.Webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nithe\\eclipse-workspace\\Selenium revision\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/windows");
	driver.manage().window().maximize();
	WebElement win1 = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
	win1.click();
	Thread.sleep(2000);
	Set<String> handles = driver.getWindowHandles();
    Iterator<String> ite = handles.iterator();	
    while (ite.hasNext()) {
		String next = (String) ite.next();
		String title = driver.switchTo().window(next).getTitle();
		System.out.println(title);
		
	}
    
    System.out.println("############");
    
    WebElement win2 = driver.findElement(By.xpath("//h3[text()='New Window']"));
	String text = win2.getText();
	System.out.println(text);
    String s ="The Internet";
    for (String Page : handles) {
    	if (driver.switchTo().window(Page).getTitle().equals(s)) {
    		break;	
		}
	}
    WebElement open = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
	String text2 = open.getText();
	System.out.println(text2);
	}
}

