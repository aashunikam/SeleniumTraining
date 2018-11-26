package com.testAnnotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import xls.ShineXlsReader;

public class Param_ExcelDataProvider {
	
	@Test(dataProvider="getData")
	public void testCase1(String uName,String pass){
		System.out.println("UserName:"+uName+"Password:"+pass);
	}
	
	
	@DataProvider
	public Object[][] getData(){
		
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
