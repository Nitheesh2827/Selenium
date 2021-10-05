package com.Webdriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ordering_dresses {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nithe\\eclipse-workspace\\Selenium revision\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nitheeshkummar@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("selenium");
		driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@title=\"Dresses\"])[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='Evening Dresses']//img[@class='replace-2x']")).click();
		driver.findElement(By.xpath("//a[@title='Printed Dress'][normalize-space()='Printed Dress']")).click();
		WebElement quantity = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		for (int i = 0; i < 9; i++) {
			quantity.click();

		}
		WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
		Select s = new Select(size);
		s.selectByValue("3");
		driver.findElement(By.xpath("//a[@id='color_24']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Add to cart']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\nithe\\eclipse-workspace\\Selenium revision\\screenshot\\shot1.png");
		FileUtils.copyFileToDirectory(Source, destination);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(
				"//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]"))
				.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement move = driver.findElement(By.xpath("//div[@id='center_column']//form"));
		js.executeScript("window.scrollBy(0,300);");
		
		//Actions A = new Actions(driver);
		//A.moveToElement(move);
		//Thread.sleep(3000);
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File Source1 = ts1.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\nithe\\eclipse-workspace\\Selenium revision\\screenshot\\shot2.png");
		FileUtils.copyFileToDirectory(Source1, destination1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='cgv']")).click();
	    driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    js.executeScript("window.scrollBy(0,300);");
	    
	    TakesScreenshot ts2 =(TakesScreenshot) driver;
	    File src2 = ts2.getScreenshotAs(OutputType.FILE);
	    File dsc2 = new File("C:\\Users\\nithe\\eclipse-workspace\\Selenium revision\\screenshot\\shot3.png");
	    FileUtils.copyFileToDirectory(src2, dsc2);
	    driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
	    js.executeScript("window.scrollBy(0,300);");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    TakesScreenshot ts3=(TakesScreenshot) driver;
	    File scr3 = ts3.getScreenshotAs(OutputType.FILE);
	    File dsc3 = new File("C:\\Users\\nithe\\eclipse-workspace\\Selenium revision\\screenshot\\shot4.png");
	    FileUtils.copyToDirectory(scr3, dsc3);
	    driver.findElement(By.xpath("(//span[normalize-space()='I confirm my order'])[1]")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    TakesScreenshot ts4=(TakesScreenshot) driver;
	    File scr4 = ts4.getScreenshotAs(OutputType.FILE);
	    File dsc4 = new File("C:\\Users\\nithe\\eclipse-workspace\\Selenium revision\\screenshot\\shot4.png");
	    FileUtils.copyToDirectory(scr4, dsc4);
	    
	}

}
