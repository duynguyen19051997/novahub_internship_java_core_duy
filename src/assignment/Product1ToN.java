package assignment;

import java.util.Scanner;

public class Product1ToN {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert number: ");
        int number = Integer.parseInt(SCANNER.nextLine());
        long product = 1;
        for (int i = 2; i <= number; i++) {
            product *= i;
        }
        System.out.println("Result: " + product);
    }
}
