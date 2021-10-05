package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQa_frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nithe\\eclipse-workspace\\Selenium revision\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		int framecount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(framecount);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame("frame1");
		
		WebElement info = driver.findElement(By.xpath("(//h1[text()='This is a sample page'])[1]"));
		
		String text = info.getText();
		System.out.println(text);
		
		System.out.println("*********");
		
		Thread.sleep(3000);
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame("frame2");
		WebElement info2 = driver.findElement(By.xpath("(//h1[text()='This is a sample page'])[2]"));
		String text2 = info2.getText();
		System.out.println(text2);
		
	}

}
