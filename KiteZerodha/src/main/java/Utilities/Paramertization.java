package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Paramertization {

	
	public  static String getdata(int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file =new FileInputStream("\\C:\\Users\\Dell\\eclipse-workspace\\KiteZerodha\\src\\main\\resources\\testdata.xlsx");
               return	WorkbookFactory.create(file).getSheet("sheet1").getRow(row).getCell(cell).getStringCellValue();
	}
}
