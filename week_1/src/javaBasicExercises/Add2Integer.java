package javaBasicExercises;

import java.util.Scanner;

public class Add2Integer {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static int computeSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        int number1 = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Enter second number: ");
        int number2 = Integer.parseInt(SCANNER.nextLine());
        System.out.println(number1 + "+" + number2 + "=" + computeSum(number1, number2));
    }
}
