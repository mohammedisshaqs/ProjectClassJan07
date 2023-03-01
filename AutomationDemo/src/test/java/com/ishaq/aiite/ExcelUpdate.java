package com.ishaq.aiite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUpdate {
public static void main(String[] args) throws IOException {
	File file=new File("D:\\AIITE Automation\\Book1.xlsx");
	FileInputStream fis=new FileInputStream(file);
	Workbook wk=new XSSFWorkbook(fis);
	Sheet sheet = wk.getSheet("Project Jan");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(7);
	cell.setCellValue("ATBB");
	FileOutputStream fos=new FileOutputStream(file);
	
	wk.write(fos);
	wk.close();
	
}
}
