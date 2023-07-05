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
===================================================================================
package com.trello.qsp.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Fileutility {
	public String readcommondata(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/TestData/Driven.properties1");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
  }
}
=====================================================================================
package com.trello.qsp.Utility;
import java.time.LocalDateTime;
import org.testng.annotations.Test;

public class JavaUtility {
	public String timeStamp() throws Exception {
		return LocalDateTime.now().toString().replace(':', '-');
	}
}
=====================================================================================
  package com.trello.qsp.Utility;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class webdriverUtility {
	public void implicitWait(WebDriver driver) throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	} 
	
	
	public boolean verifyCompleteTitle(WebDriver driver,String expectedTitle) throws Exception 
	{
		return new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.titleIs(expectedTitle));		
	} 
	
	
	public boolean partialTitle(WebDriver driver,String partial ) throws Exception 
  {
		return new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.titleContains(partial));
	}
	
	public WebElement elementVisible(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement visible = wait.until(ExpectedConditions.visibilityOf(element));
		return visible;
	}
	
	public WebElement elementClickble(WebDriver driver, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement clickable = wait.until(ExpectedConditions.elementToBeClickable(element));
		return clickable;	
	}
	
	
	public WebDriver swithframeElwement(WebDriver driver,WebElement frameElement)
	{
		return  driver.switchTo().frame(frameElement);	
	}

  
	public void alertButton(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	
	public void ActiveElementSendkey(WebDriver driver,String value) throws Throwable
	{
		driver.switchTo().activeElement().sendKeys(new Fileutility().readcommondata(value));
     }
	}
