package com.myapp.myapp;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dressobjects extends BasePage {
	@FindBy(xpath="(//a[@title='Dresses'])[2]")

	private WebElement dresses205;

	private WebElement dresses12123;

	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-s']")
	private WebElement s;
	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-m']")
	private WebElement m;
	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-l']")
	private WebElement l;
	
	@FindBy(xpath="(//a[@title='Printed Dress'])[2]")
	private WebElement fe;
	
	@FindBy(xpath="//p[@id='add_to_cart']//span")
	private WebElement ac;
	
	
	@FindBy(xpath="//a[@title='Proceed to checkout']//span")
	private WebElement cw;
	
	@FindBy(xpath="//span[@title='Close window']")
	private WebElement cwi;
	
	
	@FindBy(xpath="//input[@size='2']")
	private WebElement c;
	
	@FindBy(xpath="//a[@class='product_img_link']")
	private java.util.List<WebElement> co;
	
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement pc;
		
	
	 public Dressobjects() {
		PageFactory.initElements(driver, this);
		
	}
	 public WebElement dressestab() {
			return dresses;
		}
	 public WebElement sbox() {
		 return s;
	 }
	 public WebElement mbox(){
		 return m;
	 }
	 public WebElement lbox(){
		 return l;
	 }
         
	 public WebElement cart(){
		 return fe;
	 }
	 public WebElement elmt(){
		 return fe;
	 }
	public WebElement add() {
		return ac;
	}
	 
	 public WebElement procd() {
		 return cw;
	 }
	
	 
	 
	 public WebElement close() {
		 return cw;
	 }
	 
	  public WebElement cp() {
		  return c;
	  }
	 	
	  public java.util.List<WebElement> list(){
		  return co;
	  }
	  public WebElement pc()
	  {
		  return pc;
	  }
	 
	 

}
