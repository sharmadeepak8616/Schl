package ZZZ;

import java.util.Arrays;

public class Array_Reverse {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = new int[arr1.length];
        System.out.println("Original Array : " + Arrays.toString(arr1));
        for (int i = arr1.length-1 ; i >= 0 ; i--) {
            arr2[arr1.length-1-i]=arr1[i];
        }
        System.out.println("Reverse array : " + Arrays.toString(arr2));

        int[] arr3 = {11,12,13,14,15,16};
        System.out.println("Original Array : " + Arrays.toString(arr3));
        for (int i = 0 ; i < (arr3.length/2) ; i++) {
            arr3[i] = arr3[i] + arr3[arr3.length-1-i];
            arr3[arr3.length-1-i] = arr3[i] - arr3[arr3.length-1-i];
            arr3[i] = arr3[i] - arr3[arr3.length-1-i];
        }
        System.out.println("Reverse array : " + Arrays.toString(arr3));

    }
}
