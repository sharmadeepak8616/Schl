package ZZZ;

import java.util.Arrays;
import java.util.HashMap;

public class JavaTry {
    public static int countUniqueValues (int [] arr) {
        Arrays.sort(arr);
        int result = 1;
        for (int i = 0; i< arr.length; i++) {
            int j =0;
            for (j = 0; j< i; j++) {
                if (arr[i] == arr[j]);
                break;
            }
            if (i == j) {
                result++;
                System.out.println(result);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] demoArray = {19,-1,1,5,1,7,2,2,0,3};
        //int[] demoArray = {19,-1,1,5,1,7,2,2,0,3};
        System.out.println("Final ans " + countUniqueValues(demoArray));


    }
}
