package com.OrikanUIAutomationTest.Mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class emailCheckWithCapitalLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();		
		  driver.get("https://orikan-ui-automation-test.azurewebsites.net/");
		  driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("SRIMANTH@G");
		    WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
		    passwordField.sendKeys(Keys.TAB);
		    //Email Id provided in the capital letters is accepted and the test case is passed

	}

}
