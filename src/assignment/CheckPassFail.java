package assignment;

import java.util.Scanner;

public class CheckPassFail {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert number: ");
        int mark = Integer.valueOf(SCANNER.nextLine());
        System.out.println("The mark is: " + mark);
        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}
