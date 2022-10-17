package exel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchallData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\Dell\\OneDrive\\Desktop\\autotest.xlsx");
Workbook data=WorkbookFactory.create(file);
Sheet s=data.getSheet("Sheet1");
	int countrow=s.getLastRowNum();
int countcell=s.getRow(0).getLastCellNum();
System.out.println(countrow); //6
System.out.println(countcell);  //7

for(int a=0; a<=countrow; a++) {
	Row r= s.getRow(a);
	for(int b=0; b<countcell; b++) {
		Cell c=r.getCell(b);
		System.out.print(r.getCell(b).getStringCellValue()+" .");
	}
	System.out.println();
}
}
}
