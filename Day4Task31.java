package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class Day4Task31 
{
    public static void main( String[] args )
    {
       WebDriverManager.edgedriver().setup();
       WebDriver driver=new EdgeDriver();
       driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
       driver.manage().window().maximize();
       JavascriptExecutor js = (JavascriptExecutor) driver;
       driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Sample");
       driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("pro");
       driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("vasundhravina@gmail.com");
       driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("chotu#9");
       js.executeScript("window.scrollBy(0,2000)", "");
       driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
    }
}
