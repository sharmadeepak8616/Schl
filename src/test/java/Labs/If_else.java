package Labs;

public class If_else {

    public static void main(String[] args) {

        int a = 10;


/*        if (a%2 == 0 ) {
            System.out.println(a + " is even");
        } else {
            System.out.println(a + " is odd");
        }*/


        int num = 12;
        if (num%2 == 0 && num%3 == 0) {
            System.out.println("SIX");
        } else if (num%3 == 0) {
            System.out.println("THREE");
        } else if (num%2 == 0) {
            System.out.println("TWO");
        } else {
            System.out.println("Number is " + num);
        }

        System.out.println("Out of if-else");
    }
}
