package com.utility.la;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.configuration.la.Config;

public class ExcelUtil {

	public static FileInputStream filei;
	public static FileOutputStream fileo;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	public static void gotoFilePath(String filepath,String sheetName)
	{
		try {
		filei = new FileInputStream(filepath);
		  

		
		wb = new XSSFWorkbook(filei);
		
		sheet = wb.getSheet(sheetName);
		
		
		
	}
	catch (Exception e) {
		e.getMessage();
		
	}
	}
	public static String readData(int rowNum,int cellNum)
	
	
	
	{
		
		String readIt = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		
		System.out.println(readIt);
		
		return readIt;
	}
	
	
	
	
	public static void writeData(int resultRow,int resultCell,String result) throws IOException
	
	{
		try {
		row = sheet.getRow(resultRow);
		cell = row.getCell(resultCell);
		
		if (cell==null) {
			
			cell = row.createCell(resultCell);
			cell.setCellValue(result);
			
		}
		
		else {
			cell.setCellValue(result);
		}
		
		fileo= new FileOutputStream(Config.filePaths);
		
		wb.write(fileo);
		
		
	}
		
		catch (IOException e) {
			
			throw new RuntimeException("Not able to update the file"+e.getMessage());
		}
finally {
	fileo.flush();
}

	

	/*
	public static  Object[][] filePath(String filePath,  String sheetName) {

		
		try {
			filei = new FileInputStream(filePath);
		  

		
			wb = new XSSFWorkbook(filei);
			
		}
		catch (IOException e) {
			e.printStackTrace();
			
			throw new RuntimeException("Not able to find the file"+e.getMessage());
		}
			try {
			sheet = wb.getSheet(sheetName);

		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i = 0; i < sheet.getLastRowNum(); i++) {

			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {

				data[i][j] = sheet.getRow(i + 1).getCell(j+1).toString();

			}

		}

		return data;

		}
	
		catch(Exception e)
		{
			
			throw new RuntimeException("Unexpected Invocation Exception"+e.getMessage());
			
		}
	}
	
/*
	public static void writeData(int rows, int cells, String result, String filePaths) {

		row = sheet.getRow(rows);
		cell = row.getCell(cells);

		if (cell == null) {

			cell = row.createCell(cells);
			cell.setCellValue(result);
		}

		else {

			cell.setCellValue(result);
		}
		try {
			fileo = new FileOutputStream(filePaths);

			wb.write(fileo);

		} catch (IOException e) {

			e.printStackTrace();

			throw new RuntimeException("Not able to update the data in the file" + filePaths);
		}

		finally {
			try {
				fileo.flush();
			}

			catch (IOException e) {
				e.getMessage();

			}
		}
*/
	}
}

