/*
package LocalServerAPIs.Utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelUtils2 {


    public static void getDataFromExcel() throws IOException {

        String excelpath = "C:\\Users\\HusseinAmadu\\Desktop\\Rest-Assured-API-Testing\\src\\main\\ExcelDataFolder\\DataSheet.xlsx";
        FileInputStream fileInputStream = new FileInputStream(excelpath); /// Readable
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        // Using Itrator method
        Iterator iterator = sheet.iterator(); // returns all rows
        while (iterator.hasNext())
        {
            XSSFRow row= (XSSFRow) iterator.next(); // get row
            Iterator cellIterator = row.cellIterator(); // returns all cells

            while (cellIterator.hasNext())
            {
               XSSFCell cell = (XSSFCell) cellIterator.next();// get cell in row
                switch (cell.getCellType())
                {
                    case STRING:
                        System.out.println(cell.getStringCellValue()); break;
                    case NUMERIC:
                        System.out.println(cell.getNumericCellValue());break;
                    case BOOLEAN:
                        System.out.println(cell.getBooleanCellValue());break;
                }
                System.out.println(" | ");
            }
            System.out.println();
        }

    }
}
*/
