package ZZZ;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class File_CSV_Read {

    public static void main(String[] args) throws IOException {

        FileReader fReader = new FileReader("");
        CSVReader cReader = new CSVReader(fReader);

        List<String[]> allRows = cReader.readAll();

        Iterator<String[]> rows = allRows.iterator();

        while(rows.hasNext()) {
            for (String row : rows.next()) {
                System.out.println("Row : " + row);
            }
        }




    }


}
