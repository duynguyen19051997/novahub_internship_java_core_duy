package javaBasicExercises;

import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinel {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int NUMBER = -1;

    public static void main(String[] args) {
        int number = 0;
        boolean check = true;
        do {
            System.out.print("Enter your number: ");
            try {
                number = Integer.parseInt(SCANNER.nextLine());
                if (number == NUMBER) {
                    System.out.println("Bye");
                    check = false;
                } else {
                    System.out.println("Your number: " + number);
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while(check);
    }
}
