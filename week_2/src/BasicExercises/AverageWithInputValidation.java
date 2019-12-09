package BasicExercises;

import java.util.Scanner;

public class AverageWithInputValidation {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static int NUMBER_STUDENTS = 4;

    public static void main(String[] args) {
        double avarage = 0.d;
        int number = 0;
        boolean check = true;
        for (int i = 1; i <= NUMBER_STUDENTS; i++) {
            do {
                try {
                    System.out.print("Enter student " + i + ": ");
                    number = Integer.parseInt(SCANNER.nextLine());
                    if (number >= 1 && number <= 100) {
                        check = false;
                        avarage += number;
                    }
                } catch (NumberFormatException e) {
                    check = true;
                    System.out.println(e.getMessage());
                }
            } while (check);
        }
        System.out.println("Avarage: " + avarage / 4.0);
    }
}
