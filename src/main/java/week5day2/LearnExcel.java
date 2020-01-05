package week5day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("./data/Book1.xlsx");
		XSSFSheet wsheet = wbook.getSheetAt(0);
		int rowCount = wsheet.getLastRowNum();
		System.out.println(rowCount);
		short colCount = wsheet.getRow(3).getLastCellNum();
		System.out.println(colCount);
	    
		for (int j = 3; j <= rowCount; j++) {
			 XSSFRow row= wsheet.getRow(j);
		
	     for (int i = 0; i <colCount ; i++) {
			XSSFCell cell = row.getCell(i);
			String value = cell.getStringCellValue();
			System.out.print(value + " ");
		}
	     System.out.println();
		}
	}

}
