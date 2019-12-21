package Certona_ObjectCompare;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileDifference {

    public static void findExtraInCertonaUIObject(String pathActualFile, String pathExpFile) throws Exception {

        File file = new File(pathExpFile);
        File fileExp = new File(pathActualFile);
        Scanner scExp = new Scanner(fileExp);
        Pattern pattern = Pattern.compile("(.*):(.*)");

        String tagExp = "";
        List<String> tagsExtraInCertonUI = new ArrayList<String>();

        while (scExp.hasNextLine()) {
            String lineExp = scExp.nextLine();
            boolean foundTag = false;
            Matcher matcherExp = pattern.matcher(lineExp);
            while (matcherExp.find()) {
                tagExp = matcherExp.group(1);
            }
            Scanner sc = new Scanner(file);
            String line = "";
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                if (line.toLowerCase().trim().startsWith(tagExp.toLowerCase().trim())) {
                    foundTag = true;
                    break;
                }
            }
            if (!foundTag) {
                if (!tagExp.startsWith("filter")) {
                    //System.out.println("**Extra in Certona UI Object - \"" + tagExp + "\" not present in implementation pdf");
                    //System.out.println("Extra line in Certona UI Object -> " + lineExp + "\n");
                    tagsExtraInCertonUI.add(tagExp);
                }
            }
        }
        System.out.println(tagsExtraInCertonUI);
    }
}
