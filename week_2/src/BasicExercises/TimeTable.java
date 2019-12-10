package BasicExercises;

import java.util.Scanner;

public class TimeTable {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your size: ");
        int size = Integer.parseInt(SCANNER.nextLine());
        System.out.print("*\t|\t");
        for (int i = 1; i <= size; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 1; i <= size; i++) {
            System.out.print(i + "\t|\t");
            for (int j = i; j <= size * i; j += i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
