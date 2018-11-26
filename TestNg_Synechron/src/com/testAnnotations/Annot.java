package com.testAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annot {

	@BeforeMethod
	public void bMethod(){
		System.out.println("OpenBrowser,Login");
	}
	
	@AfterMethod
	public void aMethod(){
		System.out.println("Close Browser");
	}
	
	@BeforeClass
	public void bClass(){
		System.out.println("Start Server.....");
	}
	
	@AfterClass
	public void aClass(){
		System.out.println("Stop Server");
	}
	
	@Test
	public void testCase1(){
		System.out.println("Compose Email");
	}
	
	@Test
	public void testCase2(){
		System.out.println("Save Email");
	}
	
	@Test
	public void testCase3(){
		System.out.println("Delete Email");
	}
	

}
