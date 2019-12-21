package Practice;

import java.util.Arrays;

public class Prac_String {

    public static void main(String[] args) {

        String myName = "Deepak Sharma";

        //length
        int nameLength = myName.length();
        System.out.println("Length of my name: " + nameLength);

        //find character at a particular index
        char index4Char = myName.charAt(4);
        System.out.println("Character at index 4: " + index4Char);

        //Compare two Strings (equals)
        String myOtherName = "deepak sharma";
        boolean checkNames = myName.equals(myOtherName);
        System.out.println("Are my names equal: " + checkNames);

        boolean checkNamesIgnoreCases = myName.equalsIgnoreCase(myOtherName);
        System.out.println("Are my names equal (ignoring cases): " + checkNamesIgnoreCases);

        //find if something present in the string
        String sentence = "Today is dec 21, saturday and we are having our lab session";






        boolean containsSaturday = sentence.contains("Saturday");
        System.out.println("Sentence contains Saturday: " + containsSaturday);

        //subString
        //split

        String[] splitBy_a = sentence.split("a");
        //{"Tod" , "y is dec 21, s" , "turd" , "y " , "nd we " , "re h" , "ving our l", "b session"};
        System.out.println(Arrays.toString(splitBy_a));


    }



}
