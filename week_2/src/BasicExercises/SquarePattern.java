package BasicExercises;

import java.util.Scanner;

public class SquarePattern {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your size: ");
        int size = Integer.parseInt(SCANNER.nextLine());
        for(int i = 0; i< size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
