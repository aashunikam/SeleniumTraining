package com.testAnnotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Param_DataProvider {
	
	@Test(priority=1,dataProviderClass=DataPool.class,dataProvider="getData1")
	public void testCase1(String uname,String Password){
	System.out.println("UserName is:"+uname+"Password is: "+Password);	
	
	}
	
	/*@DataProvider
	public Object[][] getData(){
		Object obj1[][]=new Object[3][2];
		
		obj1[0][0]="U1";
		obj1[0][1]="P1";
		
		obj1[1][0]="U2";
		obj1[1][1]="P2";
		
		obj1[2][0]="U3";
		obj1[2][1]="P3";
		
		return obj1;
	}*/

}
