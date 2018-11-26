package com.testAnnotations;

import org.testng.annotations.Test;

public class Order {
	
	@Test(priority=1)
	public void login(){
		System.out.println("Login");
	}
	
	@Test(priority=2)
	public void compose(){
		System.out.println("Compose Email");
	}
	
	@Test(priority=3)
	public void SaveEmail(){
		System.out.println("saveEmail");
	}

}
