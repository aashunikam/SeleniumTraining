package com.testAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsserExample {
	
	@Test
	public void testCase1(){
		int Explinks=10;
		int Actlinks=12;
		System.out.println("A");
		try{
			Assert.assertEquals(Actlinks, Explinks);	
		}
		catch(Throwable t){
			System.out.println(t.getMessage());
		}
		System.out.println("B");
	}

}
