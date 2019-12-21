package ZZZ.JavaPractice_Labs.Methods;

import java.util.Arrays;

public class Try1 {

    public static void main(String[] args) {

        String a = "abcd";
        a.toUpperCase();
        a.length();
        System.out.println(Arrays.toString("abcd".split("\\s")));
        printFibonacciSequence(4,2);
        /*System.out.println("Line 1");
        String abcd = reverseString("Sample");
        System.out.println(abcd);
        System.out.println(reverseString("Peace"));
        System.out.println("Line 2");

        int[] ab = {1,2,3,4,5};
        int[] cd = {1,2,3,4,5,6,7,8,9,0};
        int[] reverseAB = reverseIntArray(ab);
        for (int i = 0 ; i < reverseAB.length ; i++) {
            System.out.print(reverseAB[i]);
        }
        System.out.println("\n");
        //System.out.println(Arrays.toString(reverseIntArray(ab)));
        //System.out.println(Arrays.toString(reverseIntArray(cd)));*/

    }

    public static void printFibonacciSequence (int startNumber, int totalNumInSeries)
    {
        if (totalNumInSeries < 1)
            System.out.println("Unable to execute. Total number in series must be greater than 0");
        else if (startNumber < 0)
            System.out.println("Unable to execute. Start number must be positive integer or 0");
        else
            System.out.println(Arrays.toString(getFobanacciSequence(startNumber, totalNumInSeries)));
    }

    /**
     * 9. Create fibonacci series for given start number and given length of series
     *  *         Eg: Input to method : start = 1 , totalNumInSeries = 6
     *  *               Output/Return from method : [1, 1, 2, 3, 5, 8, 13]
     *
     */
    public static int[] getFobanacciSequence(int startNumber, int totalNumInSeries)
    {
        int[] fibonacciSequence = new int[totalNumInSeries + 1];

        fibonacciSequence[0] = startNumber;
        fibonacciSequence[1] = fibonacciSequence[0];

        for (int i = 2; i <= totalNumInSeries; i++)
            fibonacciSequence[i] = fibonacciSequence[i-1] + fibonacciSequence[i-2];

        return fibonacciSequence;
    }

    public static String reverseString(String input) {
        //String input = "Happy";
        String reversedInput = "";
        for (int i = input.length()-1 ; i>=0 ; i--) {
            reversedInput = reversedInput + input.charAt(i);
        }
        //System.out.println(reversedInput);
        return reversedInput;
    }

    public static int[] reverseIntArray(int[] input) {
        //String input = "Happy";
        //input = {11,12,13,14,15};
        //reverseInput = {15,14,13,12,11};
        int[] reversedInput = new int[input.length]; // inputLen=5; reverseLength=5

        for (int i = input.length-1 ; i>=0 ; i--) {  //Start value of i = 4
            reversedInput[reversedInput.length-1-i] = input[i];  //i=4 , rIndex[0]
                                                                //i=3 , rIndex[1]
                                                                //i=0 , rIndex[4]
        }
        //System.out.println(reversedInput);
        return reversedInput;
    }

}
