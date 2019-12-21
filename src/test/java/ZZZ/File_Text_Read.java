package ZZZ;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File_Text_Read {

    public static void main(String[] args) throws IOException {
/*
        FileReader fr = new FileReader("C:\\Users\\deepasha\\Desktop\\3TeacherDesk_Teacher_Expected.txt");

        int i;
        while ((i=fr.read()) != -1) {
            System.out.print((char) i);
        }
*/

        File file = new File("C:\\Users\\deepasha\\Desktop\\3TeacherDesk_Teacher_Expected.txt");

        Scanner scan = new Scanner(file);

        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }


    }


}
