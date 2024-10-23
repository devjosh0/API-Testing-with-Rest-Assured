package LocalServerAPIs.Utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {



    public void getRowCount() throws IOException {

            String excelpath = "C:\\Users\\HusseinAmadu\\Desktop\\Rest-Assured-API-Testing\\src\\main\\ExcelDataFolder\\DataSheet.xlsx";
        FileInputStream fileInputStream = new FileInputStream(excelpath); /// Readable
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");


        //Using For Loop
         int rows = sheet.getLastRowNum();
         int col = sheet.getRow(1).getLastCellNum();
         for (int r =0; r<=rows; r++){
             XSSFRow row = sheet.getRow(r);
             for (int c =0; c < col; c++){
               XSSFCell cell = row.getCell(c);
               switch (cell.getCellType())
               {
                   case STRING:
                       System.out.println(cell.getStringCellValue()); break;
                   case NUMERIC:
                       System.out.println(cell.getNumericCellValue());break;
                   case BOOLEAN:
                       System.out.println(cell.getBooleanCellValue());break;
               }
             }
             System.out.println();
         }

    }
}
