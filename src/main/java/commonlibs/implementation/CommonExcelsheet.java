package commonlibs.implementation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import commonlibs.contracts.Iexcelsheet;

public class CommonExcelsheet implements Iexcelsheet{
	XSSFSheet sheet1;
	XSSFWorkbook wb;
	
	public CommonExcelsheet(String ExcelPath) {
		try {
			File src = new File(ExcelPath);
			FileInputStream fis = new FileInputStream(src);
			 wb = new XSSFWorkbook(fis); // for XLSX files we have to use XSSFworkbook class, for XLS files we have to use HSSFWorkbook
			
		}  catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	

	@Override
	public String getdatafromExcel(int Sheetno, int Rowno, int Colno) throws Exception {
		sheet1 = 	wb.getSheetAt(Sheetno);
		String data = sheet1.getRow(Rowno).getCell(Colno).getStringCellValue();
		return data;
	}

}
