package com.Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dress_order {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nithe\\eclipse-workspace\\Selenium revision\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class='login']")).click();
	driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("nitheeshkummar@gmail.com");
	driver.findElement(By.xpath("(//input[@name='passwd'])[1]")).sendKeys("selenium");
	driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//a[@title=\"Dresses\"])[2]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
	Thread.sleep(3000);
	WebElement image = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
	Actions A = new Actions(driver);
	A.moveToElement(image).build().perform();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	A.doubleClick(image).build().perform();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//driver.findElement(By.xpath("//a[@class=\"quick-view\"]")).click();
	//WebElement frame1 = driver.findElement(By.xpath("//iframe[@class=\"fancybox-iframe\"]"));
	//driver.switchTo().frame("fancybox-frame1633024579616");
	//WebElement frm = driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]"));
	//driver.switchTo().frame("frm");
	//frm.click();
	//driver.findElement(By.xpath("(//a[@class=\"product-name\"])[3]"))
	driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
}
}
