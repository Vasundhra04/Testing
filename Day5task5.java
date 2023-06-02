package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5task5 {

	public static void main( String[] args ) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url="https://demo.smart-hospital.in/site/login";
        driver.navigate().to(url);
        driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a/span")).click();
	    
	  //  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3")).click();
	    
	    
	    System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3")).getText());
	    
	   WebElement search= driver.findElement(By.xpath("//*[@id=\"search-btn\"]s"));
	  // System.out.println(openqa.selenium.Dimension dim= search.getSize());
	   System.out.println(search.getCssValue("color"));
	   System.out.println(search.getSize());
	 
}
}
