package LocalServerAPIs.Utils;

import org.testng.annotations.Test;

import java.io.IOException;

public class ExcelUtilsTest{
    @Test
public static void runExcelData() throws IOException {
    ExcelUtils excelUtils = new ExcelUtils();
    excelUtils.getRowCount();
}

}
