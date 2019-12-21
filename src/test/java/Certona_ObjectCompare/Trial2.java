package Certona_ObjectCompare;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trial2 {

    public static void main(String[] args)throws Exception {

        File file = new File("C:\\Schl\\CertonaFiles\\1Home_Teacher_Actual.txt");
        //File file = new File("C:\\Schl\\CertonaFiles\\test_0604.txt");
        File fileExp = new File("C:\\Schl\\CertonaFiles\\1Home_Teacher_Expected.txt");
        //File fileExp = new File("C:\\Schl\\CertonaFiles\\test1.txt");
        //Scanner sc = new Scanner(file);
        Scanner scExp = new Scanner(fileExp);
        Pattern pattern = Pattern.compile("(.*):(.*)");

        boolean a = scExp.hasNextLine();
        //boolean b = sc.hasNextLine();


        while (scExp.hasNextLine()) {
            //System.out.println("Next line in actual file : " + sc.hasNextLine());
            Matcher matcherExp = pattern.matcher(scExp.nextLine());
            String tagExp = "";
            String valueExp = "";
            while (matcherExp.find()) {
//                System.out.print("Start index: " + matcher.start());
//                System.out.print(" End index: " + matcher.end() + " ");
//                System.out.println(matcher.find());
                tagExp = matcherExp.group(1);
                valueExp = matcherExp.group(2);
                System.out.println(tagExp + " -- " + valueExp);
                //System.out.println(matcherExp.group(1));
                //System.out.println(matcherExp.group(2).trim());
                //System.out.println("---------------------");
            }
            //System.out.println( "TAG : " + tagExp);
        //}

        //String tagExp = "pagetype";
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                //System.out.println(sc.nextLine());
                String line = sc.nextLine();
                //System.out.println("Line : " + line);
                //Matcher matcher = pattern.matcher(scExp.nextLine());
                if (line.trim().startsWith(tagExp.trim())) {
                    System.out.println(tagExp + " is starts at " + line + "\n");
                    break;
                }

    /*
                if (line.toLowerCase().trim().contains(tagExp.trim().toLowerCase())) {
                    System.out.println(tagExp + " is contains at " + line);
                    break;
                }
    */

    /*
                Pattern pattern1 = Pattern.compile("^" + tagExp);
                Matcher matcher1 = pattern1.matcher(line);
                System.out.println(matcher1.find());
                while (matcher1.find()) {
                    System.out.println(matcher1.group(0));
                    System.out.println("1 - Matched line :  " + line);
                }

                Pattern pattern2 = Pattern.compile(".*" + tagExp + ":.*");
                Matcher matcher2 = pattern2.matcher(line);
                System.out.println(matcher2.find());
                while (matcher2.find()) {
                    System.out.println(matcher2.group(0));
                    System.out.println("2 - Matched line :  " + line);
                }
    */




            }


        }

    }
}
