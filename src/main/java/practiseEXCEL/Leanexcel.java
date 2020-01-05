package practiseEXCEL;

import java.io.IOException;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Leanexcel {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("./data/learnexcel.xlsx");
		XSSFSheet findsheet = wbook.getSheetAt(1);
		
			//int rowCount = findsheet.getLastRowNum();
			//System.out.println(rowCount);
			//short colCount = findsheet.getRow().getLastCellNum();
			//System.out.println(colCount);
			for (int i = 0; i <=3; i++) {
				XSSFRow row1 = findsheet.getRow(i);
				for (int k = 0; k < 3; k++) {
					XSSFCell cell = row1.getCell(k);
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
			}
			
		}
		
	}
		




