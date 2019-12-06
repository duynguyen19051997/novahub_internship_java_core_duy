package javaSpoint;

import java.util.Scanner;

public class JavaException {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        boolean check = true;
        int number = 0;
        do {
            System.out.println("Enter number: ");
            try {
                number = Integer.parseInt(SCANNER.nextLine());
                if (number < 0) {
                    throw new NegativeException("Please number > 0");
                }
                check = false;
            } catch (NumberFormatException | NegativeException e){
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Exceoption");
            }
        } while(check);
        System.out.println("Number: " + number);
    }
}
