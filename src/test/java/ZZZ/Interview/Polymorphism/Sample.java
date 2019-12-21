package ZZZ.Interview.Polymorphism;

public class Sample {

    public static void main(String[] args) {

        /** General : same name but different form
         * Polymorphism : Run-time and Compile-time
         *
         * Run-time : Method-Overriding (Dynamic) -> InheritancePractice
         * Compile-time : Method-Over-Overriding (Static)
         *
         * Compile-time : Method-Over-Overriding (Static)
         * Different :
         *      number of arguments
         *      different types of arguments
         *      Order of arguments
         */
    }


    public static void add(double a , int b) {   //1-double 1-int
        System.out.println(a+b);
    }

    public static void add(int d, double c) {   //1-int 1-double
        System.out.println(c+d);
    }

}
