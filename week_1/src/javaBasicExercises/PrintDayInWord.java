package assignment;

import java.util.Scanner;

public class PrintDayInWord {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert number: ");
        int day = Integer.valueOf(SCANNER.nextLine());
        System.out.println("Day is " + day);
        switch (day) {
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("TUESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
                break;
            case 8:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
        System.out.println("DONE");
    }
}
