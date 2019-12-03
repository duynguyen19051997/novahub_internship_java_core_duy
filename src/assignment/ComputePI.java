package assignment;

import java.util.Scanner;

public class ComputePI {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert number: ");
        int number = Integer.parseInt(SCANNER.nextLine());
        double result = 0.d;
        for (int i = 1; i <= number; i += 2) {
            if (i % 4 == 1) {
                result += 1.0 / i;
            }
            if (i % 4 == 3) {
                result -= 1.0 / i;
            }
        }
        result *= 4;
        System.out.println("Result: " + result);
        System.out.println("PI: " + Math.PI);
        System.out.println(result / Math.PI * 100);
    }
}
