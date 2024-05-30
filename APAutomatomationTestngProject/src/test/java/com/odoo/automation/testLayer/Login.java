package com.odoo.automation.testLayer;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.odoo.automation.pageLayer.HomePage;
import com.odoo.automation.pageLayer.LoginPage;
import com.odoo.automation.testBase.TestBase;

public class Login extends TestBase {

	@Test
	public void varify_user_should_login_using_valid_credential () throws InterruptedException
	{
		
		String expected_result = "https://ap-automation.odoo.com/my";
		
		HomePage HomePage_obj = new HomePage (driver);
		LoginPage LoginPage_obj = new LoginPage(driver);
		
		HomePage_obj.clicl_on_signin_link();
		LoginPage_obj.enter_email("raj@gmail.com");
		LoginPage_obj.enter_password("12345");
		LoginPage_obj.click_on_loging_button();
		Thread.sleep(3000);
		
		String actual_result = driver.getCurrentUrl();
		Assert.assertEquals(actual_result, expected_result);
		
		
	}
}
