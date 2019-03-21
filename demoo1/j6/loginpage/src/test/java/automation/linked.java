package automation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class linked

{
XSSFWorkbook wb;
XSSFSheet sheet1;
private int row;
 public linked(String excelpath)
 {
	try
	{
		File src = new File("C:\\Seleniumfolder\\TestData.xlsx");

	FileInputStream fis = new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
	}
	
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
		
	}
	public String getData(int sheetNumber,int row,int column)
	{
		sheet1 =wb.getSheetAt(sheetNumber);
		String data= sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}
		public int getRowCount(int sheetIndex)
		{
			wb.getSheetAt(sheetIndex).getLastRowNum();
			row = row+1;
			return row;
		}
	
 }
