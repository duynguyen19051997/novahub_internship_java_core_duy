package BasicExercises;

import java.util.Scanner;

public class CheckerPattern {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your size: ");
        int size = Integer.parseInt(SCANNER.nextLine());
        for (int i = 1; i <= size; i++) {
            int j = 0, row = size - 1;
            if (i % 2 == 1) {
                j = 1; row = size;
                System.out.print(" ");
            }
            for (; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
