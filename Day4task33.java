package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4task33 {

	public static void main(String[]  args) throws InterruptedException
	{
		
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url="https://demo.opencart.com/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
       JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,500)", "");
        WebElement Featured = driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
       System.out.println( Featured.isDisplayed());
        
        
        
	}
}
