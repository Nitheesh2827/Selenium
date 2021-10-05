package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nithe\\eclipse-workspace\\Selenium revision\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://m.redbus.in/");
driver.manage().window().maximize();

driver.findElement(By.id("sign-in-icon-down")).click();
driver.findElement(By.xpath("//li[@id='signInLink']")).click();

WebElement page2 = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));

driver.switchTo().frame(page2);

WebElement tex = driver.findElement(By.xpath("//span[text()='Connect using social accounts']"));
String text2 = tex.getText();
System.out.println(text2);

WebElement number = driver.findElement(By.xpath("//input[@type='number']"));
number.sendKeys("9791218335");

WebElement tes = driver.findElement(By.xpath("//div[@class='new-signin-header m-l-44']"));
String text5 = tes.getText();
System.out.println(text5);

driver.switchTo().defaultContent();
Thread.sleep(3000);
driver.findElement(By.xpath("//i[@class='icon-close']")).click();


}
}