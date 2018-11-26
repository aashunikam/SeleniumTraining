package com.testAnnotations;

import org.testng.annotations.DataProvider;

import xls.ShineXlsReader;

public class DataPool {
	
	@DataProvider
	public Object[][] getData1(){
		Object obj1[][]=new Object[3][2];
		
		obj1[0][0]="U1";
		obj1[0][1]="P1";
		
		obj1[1][0]="U2";
		obj1[1][1]="P2";
		
		obj1[2][0]="U3";
		obj1[2][1]="P3";
		
		return obj1;
	}
	
	@DataProvider
	public Object[][] getData2(){
		
		ShineXlsReader xls=new ShineXlsReader("TestData.xlsx");
		int rowCount = xls.getRowCount("Sheet1");
		int colCount = xls.getColumnCount("Sheet1");
		Object obj[][]=new Object[rowCount-1][colCount];
		
		for(int i=2;i<=rowCount;i++){
			for(int j=0;j<colCount;j++){
				obj[i-2][j]=xls.getCellData("Sheet1", j, i);
			}
		}
		return obj;
	}

}
