package javaBasicExercises;

import java.util.Scanner;

public class ReverseInt {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        boolean check = true;
        int number = 0;
        do {
            System.out.print("Enter your number: ");
            try {
                number = Integer.parseInt(SCANNER.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        int temp = number, reverseNumber = 0;
        while (temp != 0) {
            reverseNumber = reverseNumber * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Result: " + reverseNumber);
    }
}
