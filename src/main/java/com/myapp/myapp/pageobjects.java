package com.myapp.myapp;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjects extends BasePage {
BasePage bp=new BasePage();
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dresses;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")     //(//a[@title='T-shirts'])[2]
	private WebElement tshirts;
	
	@FindBy(xpath="//span[@class='cat-name']")
	private WebElement w;
	
	@FindBy(xpath="//div[@class='content_scene_cat_bg']")
	private WebElement d;
	
	@FindBy(xpath="//div[@class='rte']")
	private WebElement t;
	
	@FindBy(xpath="//input[@id='newsletter-input']")
	private WebElement nl;
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement s;
	
	
	
		
	public pageobjects() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement womentab() {
		return women;
	}
	public WebElement dressestab() {
		return dresses;
	}
	public WebElement tshirttab() {
		return tshirts;
	}
	public WebElement wc() {
		return w;
		
	}
	public WebElement dc() {
		return d;
	}
     public WebElement tc() {
    	 return t;
     }
     
     public WebElement nwl() {
    	 return nl;
     }
     public WebElement sub() {
    	 return s;
     }
     
     public void setemail() {
    	 int ran=new Random().nextInt(5000);
    	 String email="maran"+ran+"@gmail.com";
    	 bp.setText(nl, email);
    	 
     }


}
