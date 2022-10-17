package exel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\Dell\\OneDrive\\Desktop\\autotest.xlsx");
Workbook data=WorkbookFactory.create(file);

Sheet s=data.getSheet("Sheet1");
int rowcount=s.getLastRowNum();
int cellcount=s.getRow(0).getLastCellNum();

System.out.println(rowcount); //5
System.out.println(cellcount); //6

for(int i=0; i<=rowcount; i++) {
	Row r=s.getRow(i);
	
	for(int j=0; j<cellcount; j++) {
		Cell c=r.getCell(j);

	System.out.print(r.getCell(j).getStringCellValue()+" ,");
	
}
System.out.println();
}

}
}
