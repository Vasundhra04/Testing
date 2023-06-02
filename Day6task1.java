package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6task1 {

	public static void main( String[] args ) throws InterruptedException
	{

		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url="https://demo.opencart.com/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
	    driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
	    driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Vasundhra");
	    driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("V");
	    driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("vasu@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("vasu234");
	    JavascriptExecutor js = (JavascriptExecutor)driver;	
	    js.executeScript("window.scrollBy(0,3000)", "");
	    Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,3000)", "");
	    driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
        
	    
}
}
