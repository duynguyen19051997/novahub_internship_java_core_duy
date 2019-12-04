package assignment;

import java.util.Scanner;

public class ExtractDigits {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert number: ");
        int number = Integer.parseInt(SCANNER.nextLine());
        while (number != 0) {
            int t = number % 10;
            System.out.print(t + " ");
            number /= 10;
        }
    }
}
