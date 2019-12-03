package assignment;

import java.util.Scanner;

public class HarmonicSum {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert number: ");
        int number = Integer.parseInt(SCANNER.nextLine());
        float result = 1.f;
        if (number == 0) {
            System.out.println("Insert number uncorrect!");
            return;
        }
        for (int i = 2; i <= number; i++) {
            result += 1.0 / i;
        }
        System.out.println("Result: " + result);
    }
}
