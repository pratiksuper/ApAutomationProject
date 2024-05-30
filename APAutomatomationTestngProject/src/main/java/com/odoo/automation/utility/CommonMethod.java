package com.odoo.automation.utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.odoo.automation.testBase.TestBase;

public class CommonMethod  extends TestBase{

	
	
	public static void  capture_screenshot (String filename ) 
	{
		
		try {

			String path = "E:\\github_folder\\ApAutomationProject\\APAutomatomationTestngProject\\ScreenShot\\";
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(path + filename + "img");
			FileHandler.copy(src, des);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public static WebElement  waitforElementPresence(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static WebElement waitfortheelementtobeclickeable(WebElement element)
	
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
}
