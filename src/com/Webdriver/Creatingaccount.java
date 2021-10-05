package com.Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Creatingaccount {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nithe\\eclipse-workspace\\Selenium revision\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement mail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		mail.sendKeys("nitheeshkummar@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		
		driver.findElement(By.xpath("(//input[@name='id_gender'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Nitheesh");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("selenium");
		
		WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
		Select s = new Select(days);
		s.selectByValue("27");
		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select s1 = new Select(month);
		s1.selectByIndex(5);
		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select s2 = new Select(year);
        s2.selectByValue("1998");
        driver.findElement(By.xpath("//input[@id='optin']")).click();
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Nitheesh");
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("kumar");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("focus");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("20 anna nagar");
        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Singanallur");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Coimbatore");
        Thread.sleep(5000);
        WebElement state = driver.findElement(By.xpath("//select[@name=\"id_state\"]"));
        Select s3 = new Select(state);
        s3.selectByValue("3");
        driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("00000");
        driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("nothing");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8883578808");
        driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("6381777357");
        WebElement address2 = driver.findElement(By.xpath("//input[@name='alias']"));
        address2.clear();
        address2.sendKeys("round building");
        driver.findElement(By.xpath("//button[@name='submitAccount']")).click();

	}

}
