package ZZZ;

import javax.annotation.Nullable;

public class NullParameter {

    public static void main(String[] args) {

        printName("abcd", "efgh", 10);

        printName("abcd", null, 20);



    }



    public static void printName(String fName, String lName, int age) {
        if (lName == null) {
            System.out.println(fName + " " + age);
        } else {
            System.out.println(fName + " " + lName + " " + age);
        }
    }

}
