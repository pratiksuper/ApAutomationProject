package com.odoo.automation.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnquiryPage {

	public EnquiryPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// -------------- obj repo ------------------
	
	@FindBy (xpath = "//input[@id='obij2aulqyau']")
	private WebElement your_name_textbox ;
	
	@FindBy (xpath = "//input[@id='ozp7022vqhe']")
	private WebElement phone_number_tetbox ;
	
	@FindBy (xpath = "//input[@id='oub62hlfgjwf']")
	private WebElement your_email_textbox ;
	
	@FindBy (xpath = "//input[@id='o291di1too2s']")
	private WebElement your_company_textbox;
	
	@FindBy (xpath = "//input[@id='oqsf4m51acj']")
	private WebElement subject_textbox ;
	
	@FindBy (xpath = "//textarea[@id='oyeqnysxh10b']")
	private WebElement your_question ;
	
	@FindBy (xpath = "//a[contains(text(),'Submit')]")
	private WebElement submitte_button ;
	
	@FindBy (xpath = "//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/h5[1]/span[2]")
	private WebElement confirm_massage ;
	
	
	
	// -------------Action method ------------
	
	public void enter_your_name (String your_name)
	{
		your_name_textbox.clear();
		your_name_textbox.sendKeys(your_name);
	}
	
	public void enter_phone_number (String phone_number)
	{
		phone_number_tetbox.clear();
		phone_number_tetbox.sendKeys(phone_number);
	}
	
	public void enter_your_email (String email)
	{
		your_email_textbox.clear();
		your_email_textbox.sendKeys(email);
	}
	
	public void enter_your_company (String your_company_name)
	{
		your_company_textbox.clear();
		your_company_textbox.sendKeys(your_company_name);
	}
	
	public void enter_subject (String subject)
	{
		subject_textbox.clear();
		subject_textbox.sendKeys(subject);
	}
	
	public void enter_your_question (String question)
	{
		your_question.clear();
		your_question.sendKeys(question);
	}
	
	public void click_on_submitte_button ( )
	{
		submitte_button.click();
	}
	
	public String  get_confirm_massage ()
	{
		return confirm_massage.getText();
	}
	
	
	
	
}
