package com.trello.qsp.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exelutility {
public String readStringData(String sheetname,int rowIndex,int cellIndex) throws EncryptedDocumentException, FileNotFoundException, IOException
{
	Workbook workbook = WorkbookFactory.create(new FileInputStream("./src/Testdata/Laptopdata.xlsx"));
	String value = workbook.getSheet(sheetname).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	
	return value;
}
public double readNumericData(String sheetname,int rowIndex,int cellIndex) throws EncryptedDocumentException, FileNotFoundException, IOException
{
	Workbook workbook = WorkbookFactory.create(new FileInputStream("./src/Testdata/Laptopdata.xlsx"));
	double value = workbook.getSheet(sheetname).getRow(rowIndex).getCell(cellIndex).getNumericCellValue();
	
	return value;
}
}
