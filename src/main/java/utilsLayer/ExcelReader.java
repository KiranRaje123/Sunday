//package utilsLayer;
//
//	import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//	public class ExcelReader {
//		XSSFWorkbook workbook;
//	public ExcelReader( String FilePath) throws IOException
//	{
//		File f=new File(FilePath);
//		FileInputStream fis=new FileInputStream(f);
//		 workbook=new XSSFWorkbook(fis);
//	}
//	public int getTotalRowsCount(int sheetindex)
//	{
//		  return workbook.getSheetAt(sheetindex).getLastRowNum()+1;
//		
//	}
//	public int getTotalColumnsCount(int sheetindex)
//	{
//		  return workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
//		
//	}
//	public Object getSpecificData(int sheetindex,int Rows,int cells)
//	{
//	   XSSFCell cell=	workbook.getSheetAt(sheetindex).getRow(Rows).getCell(cells);
//	      if (cell==null)
//	      {
//	    	  return "";     
//	    	  
//	      }
//	      
//	      if(cell!=null)
//	      {
//	    	  if(cell.getCellType()==XSSFCell.CELL_TYPE_STRING)
//	    	  {
//	    		 return  cell.getStringCellValue();
//	    		  
//	    	  }
//	    	  else if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
//	    	  {
//	    		  return cell.getRawValue();
//	    	  }
//	    	  else if(cell.getCellType()==XSSFCell.CELL_TYPE_BOOLEAN)
//	    	  {
//	    		  return cell.getBooleanCellValue();
//	    	  }
//	    	  else if(cell.getCellType()==XSSFCell.CELL_TYPE_FORMULA)
//	    	  {
//	    		  return cell.getCellFormula();
//	    	  }
//	      }
//	      return null;
//	      
//	    }
//
//	public Object[][] getAllSheetData(int sheetindex)
//	{
//		 int colm=getTotalColumnsCount(sheetindex);
//		 int rows=getTotalRowsCount(sheetindex);
//		 
//		 Object[][] data=new Object[rows][colm];
//		  for(int i=0;i<rows;i++)
//		  {
//			  for(int j=0;j<colm;j++)
//			  {
//				   data[i][j]= getSpecificData(sheetindex, i, j);
//			  }
//		
//		 }
//		  return data;
//	}

//	}



