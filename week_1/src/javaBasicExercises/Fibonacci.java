package assignment;

import java.util.Scanner;

public class Fibonacci {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert number: ");
        int number = Integer.parseInt(SCANNER.nextLine());
        int a = 0, b = 1, c = 0, i = number;
        float average = 0.f;
        while (i != 0) {
            a = b;
            b = c;
            c = a + b;
            average += c;
            System.out.print(c + " ");
            i--;
        }
        average /= number;
        System.out.println("\nAverage: " + average);
    }
}
