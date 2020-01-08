package com.myapp.myapp;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
    pageobjects po;
    
	public Tests() {
		po=new pageobjects();
	   
	}
	
	
	@Test
	public void verifytabs() {
		Assert.assertTrue(po.elementFound(po.womentab()),"failed");
		Assert.assertTrue(po.elementFound(po.dressestab()),"failed");
		Assert.assertTrue(po.elementFound(po.tshirttab()), "failed");
	}
	
	@Test
	public void verifywomen() {
		po.womentab().click();
		System.out.println("Women");
		Assert.assertTrue(po.getTitlte().contains("Women"),"failed");
		
		
	}
		@Test
		public void verifydress() {
	po.dressestab().click();
	System.out.println("dress");
	Assert.assertTrue(po.getTitlte().contains("Dress"),"failed"); 
	}
	
	@Test
	public void verifytshirt() {
		po.tshirttab().click();
		System.out.println("tshirt");
		Assert.assertTrue(po.getTitlte().contains("T-shirts"),"failed");
		
	}

	
	@Test 
	public void verifynl( ) {
		po.setemail();
		po.nwl().sendKeys(Keys.ENTER);
		System.out.println("newsletter");
		Assert.assertTrue(po.elementFound(po.sub()),"failed");
		
	}
	


}
