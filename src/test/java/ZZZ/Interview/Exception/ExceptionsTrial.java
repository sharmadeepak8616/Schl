package ZZZ.Interview.Exception;

public class ExceptionsTrial {


    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0]=1;
        arr[1]=2;

        try {
            System.out.println(arr[0]);
            System.out.println("happy");
            Thread.sleep(2000);
        } catch (ArrayIndexOutOfBoundsException e) {

            try {

            }catch (Exception e1) {
                e1.printStackTrace();
            }

            e.printStackTrace();
            System.out.println("Array index is greater than max");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception within the sleep method");
        } finally {
            System.out.println("In finally block");
        }

        final int a = 10;
        System.out.println(a);



        /** finally vs final
         * finally is related to the try-catch. Tt's a block that will surely execute whether try-block will thrown any exception or not.
         * final : It's a keyword to create constant variable.
         */




    }
}
