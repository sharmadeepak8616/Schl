package ZZZ;
import org.testng.Assert;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;

public class try1 {
/*
    public static void main(String[] args) {
*/
/*//*
/[20, 10, 40, 44, 32]
//Return from method : 44
        int[] a = {20,10,40,44,32};
        System.out.println(maxNumberInArray(a));


        int[] b = {0,-2,-3, 3}  ;
        System.out.println(maxNumberInArray(b));

        int[] numbers ={20,10,4,44};

        Array_Sort(numbers);*//*


        System.out.println("Hello world!");
        double a = 15.24900002;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(a));
        //Assert.assertEquals("a", "a");
        int[] b = {0,-2,-3, 3};
        HashMap<Integer, Integer[]> map = new HashMap<Integer, Integer[]>();
        map.put(1, b);

    }


    public static int maxNumberInArray(int[] a){
        int max = -2147483648; //minimum value of integer
        int num = a[0];
        for(int i=0; i<a.length;i++){

            if(a[i]>=max){
                max = a[i];

            }

        }
        for(int i=1; i<a.length;i++){

            if(a[i]>=num){
                num = a[i];

            }

        }
        System.out.println("Number " + num);
        return max;
    }


    public static void Array_Sort(int[] a) {

        int arrayLength = a.length;
        System.out.println("Sorted Array:: ");
        for (int j = 0; j < arrayLength; j++) {
            for (int i = j; i>0; i--) {

                if (a[i] < a[i - 1]) {
                    int b = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = b;
                }
                else{
                    break;
                }

            }

        }
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }

*/

}