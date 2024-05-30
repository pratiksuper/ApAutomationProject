package com.odoo.automation.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.odoo.automation.pageLayer.EnquiryPage;
import com.odoo.automation.pageLayer.HomePage;
import com.odoo.automation.pageLayer.LoginPage;
import com.odoo.automation.pageLayer.MyAcccountPage;
import com.odoo.automation.testBase.TestBase;

public class EnquiryForm  extends TestBase{

	@Test
	public void enquiry_form_successfully_submitted () throws InterruptedException
	{
		String expected_result = "Your message has been sent successfully";	
		
		HomePage homepage_obj = new HomePage (driver);
		LoginPage login_obj = new LoginPage(driver);
		MyAcccountPage MyAccountPage_obj = new MyAcccountPage (driver);
		EnquiryPage EnquiryPage_obj = new EnquiryPage(driver);
		
		homepage_obj.clicl_on_signin_link();
		
		login_obj.enter_email("raj@gmail.com");
		login_obj.enter_password("12345");
		login_obj.click_on_loging_button();
		
		MyAccountPage_obj.click_on_enquiry_link();
		Thread.sleep(3000);
		EnquiryPage_obj.enter_your_name("pawan");
		EnquiryPage_obj.enter_phone_number("7845169466");
		EnquiryPage_obj.enter_your_email("pawan@gamil.com");
		EnquiryPage_obj.enter_your_company("hexaware technology");
		EnquiryPage_obj.enter_subject("salary increament");
		EnquiryPage_obj.enter_your_question("how much hike did i expect");
		EnquiryPage_obj.click_on_submitte_button();
		
		String actual_result = EnquiryPage_obj.get_confirm_massage();		
		
		Assert.assertEquals(actual_result, expected_result);
		
		
		
	}
}
