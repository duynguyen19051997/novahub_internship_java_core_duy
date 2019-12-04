package javaBasicExercises;

import java.util.Scanner;

public class CircleComputation {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter radius:");
        double radius = Double.parseDouble(SCANNER.nextLine());
        System.out.println("Are: " + Math.PI * radius * radius);
        System.out.println("Circumference: " + 2.0 * Math.PI * radius);
    }
}
