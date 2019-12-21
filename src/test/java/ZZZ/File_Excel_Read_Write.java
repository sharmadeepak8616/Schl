package ZZZ;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;

public class File_Excel_Read_Write {

    public static void main(String[] args) throws IOException {

        File src = new File("");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh = wb.getSheetAt(0);

        int totalRow = sh.getLastRowNum();
        int totalColumn = sh.getRow(0).getLastCellNum();

        //READ
        String val = sh.getRow(0).getCell(0).getStringCellValue();

        //WRITE
        sh.getRow(0).createCell(1).setCellValue("newSetValue");
        File out = new File("");
        FileOutputStream fout = new FileOutputStream(out);
        wb.write(fout);
        fout.close();





    }


}
