package com.testAnnotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

	
	@Test
	public void testCase1(){
		int Explinks=10;
		int Actlinks=12;
		System.out.println("A");
		SoftAssert ass=new SoftAssert();
		ass.assertEquals(Actlinks, Explinks);	
		ass.assertEquals("Pune", "Poona");	
		System.out.println("B");
		
		ass.assertAll();
		System.out.println("C");
	}
}
