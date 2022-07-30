package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public static String getdata(String sheetName, int row, int cell) {

		String value = null;

		try {
			FileInputStream file = new FileInputStream("./ExcelData/ExcelData.xlsx");

			Workbook workbook = WorkbookFactory.create(file);

			value = workbook.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();

		} catch (Exception e) {

			System.out.println(e);
		}

		return value;
	}

	public String data() {

		return ExcelData.getdata("data", 1, 0);
	}

	
}
