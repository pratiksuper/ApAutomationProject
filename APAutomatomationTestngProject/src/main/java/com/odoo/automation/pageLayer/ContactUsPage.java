package com.odoo.automation.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

	public ContactUsPage (WebDriver driver )
	{
		PageFactory.initElements(driver , this);
	}
	
     
	  //------------ obj repo ----------------
	
	  @FindBy (xpath = "//input[@id = 'contact1']")
      private WebElement name_textbox ;
	  
	  @FindBy (xpath = "//input[@id = 'contact2']")
	  private WebElement phone_number_textbox ;
	  
	  @FindBy (xpath = "//input[@id = 'contact3']")
	  private WebElement email_textbox ;
	  
	  @FindBy (xpath = "//input[@id = 'contact4']" )
	  private WebElement company_textbox ;
	
	  @FindBy (xpath = "//input[@id = 'contact5']")
	  private WebElement Subject_textbox ;
	 
	  @FindBy (xpath = "//textarea[@id = 'contact6']")
	  private WebElement question_textbox ;
	  
	  @FindBy (xpath = "//a[@class= 'btn btn-primary s_website_form_send']")
	  private WebElement submitte_button ;
	  
	  @FindBy (xpath = "//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/h5[1]/span[2]")
	  private WebElement confirmation_massage ;
	  
	  
	
	//-------------------action method -------------
	
	  public void enter_name (String name)
	  { 
		  name_textbox.clear();
		  name_textbox.sendKeys(name);
	  }
	  
	  public void entre_phone_number (String phone_number )
	  {
		  phone_number_textbox.clear();
		  phone_number_textbox.sendKeys(phone_number);
	  }
	  
	  public void enter_email (String email)
	  {
		  email_textbox.clear();
		  email_textbox.sendKeys(email);
	  }
	  
	  public void enter_company (String company )
	  {
		  company_textbox.clear();
		  company_textbox.sendKeys(company);
	  }
	  
	  public void enter_Subject (String subject)
	  {
		  Subject_textbox.clear();
		  Subject_textbox.sendKeys(subject);
	  }
	
	 public void enter_question (String question)
	 {
		 question_textbox.clear();
		 question_textbox.sendKeys(question);
	 }
	 
	 public void click_on_submitte_button ()
	 {
		 submitte_button.click();
	 }
	 
	 public String get_confirmation ()
	 {
		 return confirmation_massage.getText();
		 
	 }
	
}
