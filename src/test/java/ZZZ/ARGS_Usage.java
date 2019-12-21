package ZZZ;

public class ARGS_Usage {

    public static void main(String[] args) {

        int[] a = {1,2,3,4};
        printArrayValue(1,2,3,4);

        int[] b = {1,2};
        printArrayValue(10,20);

        printArrayValue(12, 23);

    }



    public static void printArrayValue(int... list) {
        for (int i=0; i < list.length ; i++) {
            System.out.print(list[i]+ " ");
        }
        System.out.println();
    }


}
