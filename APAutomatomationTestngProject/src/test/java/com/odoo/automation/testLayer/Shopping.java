package com.odoo.automation.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.odoo.automation.pageLayer.HomePage;
import com.odoo.automation.pageLayer.LoginPage;
import com.odoo.automation.pageLayer.MyAcccountPage;
import com.odoo.automation.testBase.TestBase;

public class Shopping extends TestBase {

	@Test
	public void user_should_buy_product_succesfully () throws InterruptedException
	{
		HomePage HomepPage_obj = new HomePage(driver);
		LoginPage LoginPage_obj = new LoginPage(driver);
		MyAcccountPage MyAcccountPage_obj = new MyAcccountPage(driver);
		
		String expected_result = "https://ap-automation.odoo.com/shop/confirmation";
		
		HomepPage_obj.clicl_on_signin_link();
		
		LoginPage_obj.enter_email("raj@gmail.com");
		LoginPage_obj.enter_password("12345");
		LoginPage_obj.click_on_loging_button();
		Thread.sleep(3000);
		
		MyAcccountPage_obj.click_on_shop_link();
		Thread.sleep(5000);
		MyAcccountPage_obj.click_on_hp_laptop_link();
		MyAcccountPage_obj.click_on_add_to_cart_button();
	
		MyAcccountPage_obj.click_on_my_cart_link();
		Thread.sleep(3000);
		MyAcccountPage_obj.click_on_checkout_button();
		Thread.sleep(3000);
		MyAcccountPage_obj.enter_your_refference_textbox("good morning");
		MyAcccountPage_obj.enter_give_us_your_feedback_textbox("thank youn");
		MyAcccountPage_obj.click_on_contineu_checkout_button();
		MyAcccountPage_obj.click_on_pay_now_button();
		
		Thread.sleep(15000);
		
		
		  String Actual_result = driver.getCurrentUrl();
		  Assert.assertEquals(Actual_result, expected_result);
		
	}
}
