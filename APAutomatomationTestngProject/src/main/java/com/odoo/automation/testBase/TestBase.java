package com.odoo.automation.testBase;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



public class TestBase {
	
	
    @BeforeTest
	public void start ()
	{
		
		
	}
    @AfterTest
	public void end ()
	{
    	
	}
	
	
	public static WebDriver driver ; 
	
	@BeforeMethod
	public void setup ()
	{
		String browser_name = "chrome";
		if (browser_name.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browser_name.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if (browser_name.equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver ();
		}
		else 
		{
			System.out.println("choose the correct browser");
		}
		
		driver.manage().window().maximize();
		driver.get("https://ap-automation.odoo.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
	}
	@AfterMethod
	public void teardown()
	{
	driver.quit();
	
	
	}
	
}
