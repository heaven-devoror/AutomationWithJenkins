package SeleniumPractice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class HandlingExcelReadWrite {
    public static void main(String[] args) throws IOException {
        // Create an instance of the XSSFWorkbook class.
        Workbook workbook = new XSSFWorkbook();

        // Create a sheet.
        Sheet sheet = workbook.createSheet("My Sheet");

        // Sentence
        String sentence = "I am learning Automation";
        String[] sentencePieces = sentence.split(" ",4);

        for(int i=0;i<sentencePieces.length;i++)
        {
            // Create a row.
            Row row = sheet.createRow(i);

            for(int j=0;j<sentencePieces.length;j++)
            {
                // Create a cell.
                Cell cell = row.createCell(j);

                if(i==0)
                {
                    // Set the value of the cell.
                    cell.setCellValue(sentencePieces[j]);
                }
                if(j==0)
                {
                    cell.setCellValue(sentencePieces[i]);
                }
            }
        }

        // Write the file.
        FileOutputStream fos = new FileOutputStream("C:\\swsetup\\inputOutpuTesting.xlsx");
        workbook.write(fos);
        fos.close();

        // Get the sheet that you want to read.
        sheet = workbook.getSheet("My Sheet");

        // Get the row that you want to read.
        Row row = sheet.getRow(0);

        // Get the cell that you want to read.
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
