package ZZZ;

import java.util.Arrays;

public class Array_Sort {

    public static void main(String[] args) {

        int[] arr1 = {2, 4, 1, 6, 9, 3, 5};
        System.out.println("Original Array : " + Arrays.toString(arr1));
        for (int i = 1; i < arr1.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr1[j] < arr1[j - 1]) {
                    arr1[j] = arr1[j] + arr1[j - 1];
                    arr1[j - 1] = arr1[j] - arr1[j - 1];
                    arr1[j] = arr1[j] - arr1[j - 1];
                }
            }
        }
        System.out.println("Sorted Array : " + Arrays.toString(arr1));

        /**
         * Using single for-loop
         */
        int[] arr = {10, 12, 15, 1, 16, 18, 19, 31, 52, 6, 10};

        System.out.println("Original Array : " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                arr[i] = arr[i] + arr[i - 1];
                arr[i - 1] = arr[i] - arr[i - 1];
                arr[i] = arr[i] - arr[i - 1];
                i = 0;
            }
        }
        System.out.println("Sorted Array : " + Arrays.toString(arr));

    }


}
