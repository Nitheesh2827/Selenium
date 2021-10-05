package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class muthu {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nithe\\eclipse-workspace\\Selenium revision\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size); // findElements //tagName
		
		driver.switchTo().frame("singleframe");
		WebElement input1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		input1.sendKeys("Hello Cutie");
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement nestedframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		nestedframe.click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);

		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrames.html']"));
		driver.switchTo().frame(innerframe);
		
		Thread.sleep(3000);
		WebElement input2 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		input2.sendKeys("Hello sweety");
	}

}
