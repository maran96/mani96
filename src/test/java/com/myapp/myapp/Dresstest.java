package com.myapp.myapp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dresstest {
             Dressobjects dp;
 public Dresstest() {
	dp=new Dressobjects();
}
    /* @Test(priority=0)
	public void verifycount() {
		}*/
	@Test(priority=1)
	public void verifycheckbox() {
		dp.dressestab().click();
		Assert.assertTrue(dp.elementFound(dp.sbox()),"failed");
		Assert.assertTrue(dp.elementFound(dp.mbox()),"failed");
		Assert.assertTrue(dp.elementFound(dp.lbox()),"failed");
		dp.dressestab().click();
		String a=dp.pc().getText();
		System.out.println(a);
		int s=dp.list().size();
		String b=Integer.toString(s);
		System.out.println(b);
		Assert.assertTrue(a.contains(b),"failed");
		
			}
	@Test(priority=2)
	public void	verifycart() {
		
		dp.dressestab().click();
		dp.elmt().click();
		dp.add().click();
		dp.procd().click();
		System.out.println(dp.getTxtAttribute(dp.cp()));
		Assert.assertTrue(dp.getTxtAttribute(dp.cp()).contains("1"),"failed");
	}
	

}
