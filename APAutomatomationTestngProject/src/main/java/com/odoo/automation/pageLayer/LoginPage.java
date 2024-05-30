package com.odoo.automation.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//------------obj repo --------------
	
	@FindBy(xpath = "//input[@id = 'login']")
	private WebElement email_textbox ;
	
	@FindBy (xpath = "//input[@id = 'password']")
	private WebElement password_textbox ;
	
	@FindBy (xpath = "(//button[@type= 'submit'])[3]")
	private WebElement login_button ;
	
	
	
	
	
	//------------Action Method ----------------
	
	
	public void enter_email (String email)
	{
		email_textbox.sendKeys(email);
	}
	
	public void enter_password (String password)
	{
		password_textbox.sendKeys(password);
	}
	
	public void click_on_loging_button ()
	{
		login_button.click();
	}
	
	
	
	
	
}
