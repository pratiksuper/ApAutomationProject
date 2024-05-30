package com.odoo.automation.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAcccountPage {
	
	
	public MyAcccountPage (WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}

	
	//-----------obj repo ---------------------
	
	@FindBy (xpath = "//body[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")
	private WebElement shop_link ;
	
	@FindBy (xpath = "(//a[@class = 'text-primary text-decoration-none'])[3]")
	private WebElement hp_laptop_link ;
	
	@FindBy (xpath = "//a[@id= 'add_to_cart']")
	private WebElement add_to_cart_button ;
	
	@FindBy (xpath = "//span[contains(text(),'My Cart')]")
	private WebElement my_cart_link ;
	
	@FindBy (xpath = "//a[@name = 'website_sale_main_button']")
	private WebElement checkout_button ;
	
	@FindBy (xpath = "//input[@id = 'sale1']")
	private WebElement your_refference_textbox ;
	
	@FindBy (xpath = "//textarea[@id = 'sale2']")
	private WebElement give_us_your_feedback_textbox ;
	
	@FindBy (xpath = "//a[@name= 'website_sale_main_button']")
	private WebElement contineu_checkout_button ;
	
	@FindBy (xpath = "//button[@name= 'o_payment_submit_button']")
	private WebElement pay_now_button ;
	
	//------------------- Contact us Scenario -------------
	
	@FindBy (xpath = "//body[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/span[1]")
	private WebElement contact_us_link ;
	
	//---------------------------inquiry form ---------------------
	@FindBy (xpath = "//body[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/span[1]")
	private WebElement enquiry_link ;
	
	

	//----------------Action Method ----------------
	
	public void click_on_shop_link() 
	{
		shop_link.click();
	}
	public void click_on_hp_laptop_link()
	{
		hp_laptop_link.click();
	}
	
	public void click_on_add_to_cart_button()
	{
		add_to_cart_button.click();
	}
	public void click_on_my_cart_link()
	{
		my_cart_link.click();
	}
	public void click_on_checkout_button()
	{
		checkout_button.click();
	}
	public void enter_your_refference_textbox(String your_reffernece)
	{
		your_refference_textbox.sendKeys(your_reffernece);
	}
	public void enter_give_us_your_feedback_textbox (String your_feedback)
	{
		give_us_your_feedback_textbox.sendKeys(your_feedback);
	}
	public void click_on_contineu_checkout_button()
	{
		contineu_checkout_button.click();
	}
	public void click_on_pay_now_button ()
	{
		pay_now_button.click();
	}
	
	
	//---------------------Contact us Scenario ---------------
	
	public void click_on_contact_us  ()
	{
		contact_us_link.click();
	}
	

	//---------------------------inquiry form ---------------------
	
	
	public void click_on_enquiry_link ()
	{
		enquiry_link.click();
	}
	
	
	
}
