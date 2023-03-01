package com.ishaq.aiite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\AIITE Automation\\Book1sw.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wbk = new XSSFWorkbook(fis);
		Sheet sheet = wbk.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		//wbk.getSheet("Sheet1").getRow(0).getCell(1);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		
		if (cellType==CellType.STRING){
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			} 
		else if (cellType==CellType.NUMERIC) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-ns");
				String format = sdf.format(dateCellValue);
				System.out.println(format);
				
			} else {
				double numericValue = cell.getNumericCellValue();
				long numericCellValue = (long) numericValue;
				System.out.println(numericCellValue);

			}
			
		}
	}
}
