package settings;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Xls_Reader {
	//public static String filename = System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\xlsx\\Suite.xlsx";

	public  FileInputStream in = null;
	public  FileOutputStream fileOut =null;
	public Workbook workbook=null;
	public Sheet sheet=null;
	public Row row=null;
	public Cell cell=null;
	
public Xls_Reader(String excelname) {
		
		
		try {
			
			FileInputStream in = new FileInputStream(new File(System.getProperty("user.dir")+"\\Datafile\\"+excelname));
			//fis = new FileInputStream(path);
			
			String fileExtensionName = excelname.substring(excelname.indexOf("."));

	        if(fileExtensionName.equals(".xlsx")){
	        workbook = new XSSFWorkbook(in);
	        }
	        else if(fileExtensionName.equals(".xls")){
	            workbook = new HSSFWorkbook(in);
	        }	        
	        sheet = workbook.getSheetAt(0);
			in.close();
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}	


		// returns the row count in a sheet

		public int getRowCount(String sheetName){
			int index = workbook.getSheetIndex(sheetName);
			if(index==-1)
				return 0;
			else{
			sheet = workbook.getSheetAt(index);
			int number=sheet.getLastRowNum()+1;
			return number;
			}
			
		}
		
		
		
		
		
		// returns the data from a cell
		
		
		public String getCellData(String sheetName,String colName,int rowNum){
			try{
				if(rowNum <=0)
					return "";
			
			int index = workbook.getSheetIndex(sheetName);
			int col_Num=-1;
			if(index==-1)
				return "";
			
			sheet = workbook.getSheetAt(index);
			row=sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++){
				//System.out.println(row.getCell(i).getStringCellValue().trim());
				if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
					col_Num=i;
			}
			if(col_Num==-1)
				return "";
			
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(rowNum-1);
			if(row==null)
				return "";
			cell = row.getCell(col_Num);
			
			if(cell==null)
				return "";
			//System.out.println(cell.getCellType());
			cell.setCellType(CellType.STRING);
			
			//System.out.println(row.getCell(col_Num));
			 return cell.getStringCellValue();
			 
			/* int cel_Type = cell.getCellType();                           
             switch(cel_Type) {
             case 0: System.out.print("in Numeric : "+cell.getNumericCellValue()+ " ");
                   // Double d=cell.getNumericCellValue();
                    String celldata = String.valueOf(cell.getNumericCellValue());
                    return celldata ;
                   
                    
             case 1:System.out.print("in string : "+cell.getStringCellValue()+" ");
                     return cell.getStringCellValue();
                    
                     
             case 4: System.out.print(cell.getBooleanCellValue()+" ");
                     Boolean b=cell.getBooleanCellValue();
                     String celldata1=String.valueOf(b);                     
                    return celldata1;
            
             default:
                     String test="default";
                     return test;
             }*/
		
			
			}
			catch(Exception e){
				
				e.printStackTrace();
				return "row "+rowNum+" or column "+colName +" does not exist in xls";
			}
			
		}
		
		
	
		
				
	
}
