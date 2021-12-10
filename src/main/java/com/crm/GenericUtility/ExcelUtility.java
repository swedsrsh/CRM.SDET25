package com.crm.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String getToStringExcelData(String sheetname, int rowno,  int column) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream(Ipathconstant.Excel_path);
		Workbook workbook = WorkbookFactory.create(file);
		return workbook.getSheet(sheetname).getRow(rowno).getCell(column).toString();
	}
}

