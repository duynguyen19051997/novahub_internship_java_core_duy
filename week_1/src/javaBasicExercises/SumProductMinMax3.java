package javaBasicExercises;

import java.util.Scanner;

public class SumProductMinMax3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static int enterNumber() {
        System.out.println("Enter number: ");
        return Integer.parseInt(SCANNER.nextLine());
    }

    private static int computeSum(int a, int b, int c) {
        return a + b + c;
    }

    private static int minFunc(int a, int b, int c) {
        return Math.min(c, Math.min(a, b));
    }

    private static int maxFunc(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        int a = enterNumber();
        int b = enterNumber();
        int c = enterNumber();
        System.out.println("Sum: " + computeSum(a, b, c));
        System.out.println("Min: " + minFunc(a, b, c));
        System.out.println("Max: " + maxFunc(a, b, c));
    }
}
