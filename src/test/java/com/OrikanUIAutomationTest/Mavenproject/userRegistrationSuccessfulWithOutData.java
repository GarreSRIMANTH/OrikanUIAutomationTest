package com.OrikanUIAutomationTest.Mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class userRegistrationSuccessfulWithOutData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
			
		  driver.get("https://orikan-ui-automation-test.azurewebsites.net/");
		  driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("SRIMANTH@G");
		     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1");
		     driver.findElement(By.xpath("//*[@id='confirmPassword']")).sendKeys("1");
		     driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		     //clicking the next button several times
		     driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		     driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		     driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		     driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		     driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		     driver.close();

	}

}
