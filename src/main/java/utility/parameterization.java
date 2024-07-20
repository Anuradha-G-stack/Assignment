package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterization {
	public static String getData(int row, int cell,String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\Desktop\\godaddy\\src\\test\\resources\\testData.xlsx");
		return WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();

		
	}

}
