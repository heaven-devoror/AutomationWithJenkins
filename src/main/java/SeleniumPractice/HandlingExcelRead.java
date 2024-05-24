package SeleniumPractice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HandlingExcelRead {
    public static void main(String[] args) throws IOException {
        // Create an instance of the XSSFWorkbook class.
//        Workbook workbook = new XSSFWorkbook(Files.newInputStream(Paths.get("C:\\swsetup\\inputOutpuTesting.xlsx")));
        String path = "D:\\Book1.xlsx";
        FileInputStream fi = new FileInputStream(path);
        Workbook workbook = new XSSFWorkbook(fi);

        // Get the sheet that you want to read.
        Sheet sheet = workbook.getSheetAt(0);

        // Get the row that you want to read.
        Row row = sheet.getRow(0);

        // Get the cell column that you want to read.
        Cell cell = row.getCell(0);

        // Get the max row
        int lastRow = sheet.getLastRowNum();

        // Get the max column
        int lastCell = cell.getRow().getLastCellNum();

        System.out.println("Last row Number : " + lastRow);
        System.out.println("Last column Number : " + lastCell);

        for(int i=0;i<=lastRow;i++)
        {
            // Get the row that you want to read.
            row = sheet.getRow(i);

            for(int j=0;j<lastCell;j++)
            {
                // Get the cell that you want to read.
                cell = row.getCell(j);

                String value = cell.getStringCellValue();
                System.out.print(value+" ");
            }
            System.out.println();
        }
        // Close the workbook.
        workbook.close();
    }
}
