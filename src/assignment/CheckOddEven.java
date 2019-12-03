package assignment;

import java.util.Scanner;

public class CheckOddEven {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert number: ");
        int number = Integer.valueOf(SCANNER.nextLine());
        System.out.println("The number is: " + number);
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        System.out.println("Done");

    }
}
