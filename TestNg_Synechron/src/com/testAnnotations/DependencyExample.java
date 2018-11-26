package com.testAnnotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependencyExample {

	@Test(priority=1)
	public void login(){
		System.out.println("Login");
		SoftAssert astr=new SoftAssert();
		astr.assertEquals(true, true);
		astr.assertAll();
	}
	
	@Test(priority=2,dependsOnMethods={"login"})
	public void compose(){
		
		SoftAssert astr=new SoftAssert();
		astr.assertEquals(false, true);
		System.out.println("Compose Email");
		astr.assertAll();
	}
	
	@Test(priority=3,dependsOnMethods={"login","compose"})
	public void SaveEmail(){
		System.out.println("saveEmail");
	}
}
