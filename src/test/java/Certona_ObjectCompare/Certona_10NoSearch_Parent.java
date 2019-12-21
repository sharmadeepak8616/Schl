package Certona_ObjectCompare;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Certona_10NoSearch_Parent {

    public static void main(String[] args) throws Exception {

        String pathActualFile = "C:\\Schl\\CertonaFiles\\Home_Teacher_now.txt";
        String pathExpFile = "C:\\Schl\\CertonaFiles\\1Home_Teacher_Expected.txt";

        File file = new File(pathActualFile);
        File fileExp = new File(pathExpFile);
        Scanner scExp = new Scanner(fileExp);
        Pattern pattern = Pattern.compile("(.*):(.*)");

        String foundLine = "";
        String foundLineIgnoreCases = "";
        String tagExp = "";
        String valueExp = "";
        String tag = "";
        String value = "";
        List<String> tagsIgnoredCases = new ArrayList<String>();
        List<String> tagsMissedInCertonUI = new ArrayList<String>();

        while (scExp.hasNextLine()) {
            String lineExp = scExp.nextLine();
            boolean foundTag = false;
            boolean foundTagIgnoreCases = false;
            Matcher matcherExp = pattern.matcher(lineExp);
            while (matcherExp.find()) {
                tagExp = matcherExp.group(1);
                valueExp = matcherExp.group(2);
            }
            Scanner sc = new Scanner(file);
            String line = "";
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    tag = matcher.group(1);
                    value = matcher.group(2);
                }
                if (tag.trim().equals(tagExp.trim())) {
                    foundLine = line;
                    foundTag = true;
                    break;
                } else if (tag.trim().equalsIgnoreCase(tagExp.trim())) {
                    foundLineIgnoreCases = line;
                    foundTagIgnoreCases = true;
                    tagsIgnoredCases.add(tagExp);
                    break;
                }
/*
                if (line.trim().startsWith(tagExp.trim())) {
                    foundLine = line;
                    foundTag = true;
                    break;
                } else if (line.toLowerCase().trim().startsWith(tagExp.toLowerCase().trim())) {
                    foundLineIgnoreCases = line;
                    foundTagIgnoreCases = true;
                    tagsIgnoredCases.add(tagExp);
                    break;
                }
*/
            }
            if (foundTag) {
                System.out.println("FOUND - " + tagExp + " is found at line.");
                System.out.println("Expected value : " + valueExp);
                System.out.println("Line : " + foundLine + "\n");
            } else if (foundTagIgnoreCases) {
                System.out.println("**IGNORECASES found - " + tagExp + " is found at line.");
                System.out.println("Expected tag : " + tagExp);
                System.out.println("Expected value : " + valueExp);
                System.out.println("Line : " + foundLineIgnoreCases + "\n");
            }else {
                System.out.println("**NOT found in Certona UI - " + tagExp + "\n");
                tagsMissedInCertonUI.add(tagExp);
            }
        }

        System.out.println("----------------------------------------------------");
        System.out.println("Tags present with cases mismatch");
        System.out.println(tagsIgnoredCases);

        System.out.println("----------------------------------------------------");
        System.out.println("Tags NOT present in certona UI object");
        System.out.println(tagsMissedInCertonUI);

        System.out.println("----------------------------------------------------");
        System.out.println("Tags extra present in Certona UI Object :");
        FileDifference.findExtraInCertonaUIObject(pathActualFile, pathExpFile);

    }
}
