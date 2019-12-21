package Trials;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try0511 {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;
        boolean check = true;

        while (check) {
            choice = askChoice();
            System.out.println("You entered number : " + choice);
            if (choice == 1 ) {
                check = false;
            }
        }
    }

    public static int askChoice() {
        int userInput = 0;
        try {
            System.out.print("Enter number : ");
            userInput = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Pls enter a number");
            userInput = 100;
        }
        return userInput;
    }

}
