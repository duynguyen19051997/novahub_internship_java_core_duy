package javaBasicExercises;

import java.util.Scanner;

public class Swap2Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number: ");
        int b = Integer.parseInt(scanner.nextLine());
        int c = a;
        a = b;
        b = c;
        System.out.println(a + "\t" + b);
    }
}
