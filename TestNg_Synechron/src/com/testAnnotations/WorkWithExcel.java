package com.testAnnotations;

import org.testng.annotations.Test;

import xls.ShineXlsReader;

public class WorkWithExcel {
	
	@Test
	public void workwithExcel(){
		ShineXlsReader xls=new ShineXlsReader("TestData.xlsx");
		int rowCount = xls.getRowCount("Sheet1");
		int columnCount = xls.getColumnCount("Sheet1");
		System.out.println("Row Count:"+rowCount);
		System.out.println("coulumn Count:"+columnCount); 
		
		for(int i=2;i<=rowCount;i++)
		{
			for(int j=0;j<columnCount;j++){
				
				String cellData=xls.getCellData("Sheet1", j, i);
				System.out.println(cellData);
				 
			}
		}
	}

}
