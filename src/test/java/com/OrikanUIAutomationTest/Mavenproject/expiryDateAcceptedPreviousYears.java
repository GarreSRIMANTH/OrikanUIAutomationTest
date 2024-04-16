package com.OrikanUIAutomationTest.Mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class expiryDateAcceptedPreviousYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
			
		  driver.get("https://orikan-ui-automation-test.azurewebsites.net/");
		  driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("SRIMANTH@G");
		     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1");
		     driver.findElement(By.xpath("//*[@id='confirmPassword']")).sendKeys("1");
		     driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		     //clicking the next button two times
		     driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		     driver.manage().window().maximize();
		     //navigated to payment page
		     //Enter the past year in expiry date filed
		     driver.findElement(By.xpath("//*[@id='cardExpiryYear']")).sendKeys("2022");		 

	}

}
