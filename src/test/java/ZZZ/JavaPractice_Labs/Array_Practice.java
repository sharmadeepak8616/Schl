package ZZZ.JavaPractice_Labs;

import java.util.Arrays;

public class Array_Practice {

    public static void main(String[] args) {

        /**
         * Array is a list of same-datatype.
         *
         * {1 , 2, 3, 4, 5}
         * {"a", "b", "c", "d", "e"}
         *
         * Declare an Array :
         * Syntax -> <dataType>[] <arrayName> = new <dataType>[lengthOfArray];
         * Example -> int[] arr1 = new int[5];  (last index = 4)
         * Example -> double[] arr2 = new double[8];    (last index = 7)
         *
         *
         * Syntax -> <dataType>[] <arrayName> = {val1, val2, val3, val4};
         * Example -> String[] arr3 = {"ab" , "cd" , "ef" , "gh", "ij"}
         *
         */

/*        String[] arr3 = new String[5];
        arr3[0] = "abcd";
        arr3[1] = "efgh";
        arr3[4] = "happy";
        arr3[0] = "peace";

        System.out.println(arr3[2]);

        System.out.println(arr3.length);

        String stringToAbbreviate = "Good morning";
        String[] stringArray = stringToAbbreviate.split("\\s");
        String abbreviatedString = "";

        for (int i = 0; i < stringArray.length; i++)
            abbreviatedString += stringArray[i].charAt(0);

        System.out.println(abbreviatedString.toUpperCase());*/

/*        int[] arr = {12, 43, 45, 65, 23, 1};
        double result = 0;
        for(int i = 0; i <= arr.length-1 ; i++) {
            int a = arr[i];
            result = result + a;
        }
        double avg = result/arr.length;
        System.out.println(avg);*/

        //"good mor" "i" "g"
        String words = "good morning";
        String[] splitWords = words.split(" ");
        System.out.println(Arrays.toString(splitWords));
        String ab = Arrays.toString(splitWords);
        System.out.println("magic".contains(ab));












    }
}
