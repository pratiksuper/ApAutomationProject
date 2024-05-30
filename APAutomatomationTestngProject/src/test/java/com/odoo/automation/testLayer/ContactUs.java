package com.odoo.automation.testLayer;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.odoo.automation.pageLayer.ContactUsPage;
import com.odoo.automation.pageLayer.HomePage;
import com.odoo.automation.pageLayer.LoginPage;
import com.odoo.automation.pageLayer.MyAcccountPage;
import com.odoo.automation.testBase.TestBase;

public class ContactUs extends TestBase {

	
	@Test
	public void user_should_contact_succesfully () throws InterruptedException
	{
		
		 String expected_result = "Your message has been sent successfully";
		 
		HomePage homepage_obj = new HomePage (driver);
		LoginPage login_obj = new LoginPage(driver);
		MyAcccountPage MyAccountPage_obj = new MyAcccountPage (driver);
		ContactUsPage ContactUsPage_obj = new ContactUsPage(driver);
		
		homepage_obj.clicl_on_signin_link();
		
		login_obj.enter_email("raj@gmail.com");
		login_obj.enter_password("12345");
		login_obj.click_on_loging_button();
		
		MyAccountPage_obj.click_on_contact_us();
	
		
		ContactUsPage_obj.enter_name("pawan");
		ContactUsPage_obj.entre_phone_number("9937303819");
		ContactUsPage_obj.enter_email("pawan@gmail.com");
		ContactUsPage_obj.enter_company("HCL Technology");
		ContactUsPage_obj.enter_Subject("Releted to salary increment ");
		ContactUsPage_obj.enter_question("What is my current package");
		ContactUsPage_obj.click_on_submitte_button();
		Thread.sleep(3000);
		String actual_result = ContactUsPage_obj.get_confirmation();
		
		Assert.assertEquals(actual_result, expected_result);
	}
}
