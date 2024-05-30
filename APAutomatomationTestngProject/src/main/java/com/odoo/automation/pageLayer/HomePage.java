package com.odoo.automation.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	   public HomePage (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	
	
	//-------------obj repo ------------
	
	@FindBy(xpath = "//a[@class= 'o_navlink_background_hover btn btn-sm d-flex align-items-center h-100 rounded-0 border-0 border-start px-3 text-reset o_border_contrast']")
    private WebElement Sign_in_link ;	
	
	
	//------------Action Method ----------------
	
	public void clicl_on_signin_link ()
	{
		Sign_in_link.click();
	}
	
	
	
	
}
