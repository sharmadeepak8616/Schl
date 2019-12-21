package Certona_ObjectCompare;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trial {

    public static void main(String[] args)throws Exception {

        //File file = new File("C:\\Schl\\CertonaFiles\\1Home_Teacher_Expected.txt");
        //File file = new File("C:\\Schl\\CertonaFiles\\test.txt");
        File file = new File("C:\\Users\\deepasha\\Downloads\\test.txt");
        File fileExp = new File("C:\\Schl\\CertonaFiles\\1Home_Teacher_Expected.txt");

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }



    }


}
