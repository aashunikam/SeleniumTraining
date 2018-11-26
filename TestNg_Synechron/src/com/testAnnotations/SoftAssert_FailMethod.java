package com.testAnnotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_FailMethod {

	@Test
	public void testCase1(){
		String ExpStr="Pune";
		String ActStr="Poona";
		System.out.println("A");
		SoftAssert ass=new SoftAssert();
		if(!ExpStr.equals(ActStr))
		{
			ass.fail("String not Match");	
		}
		System.out.println("B");
		ass.assertAll();
		System.out.println("C");
	}
}
