package utils;

import java.util.Scanner;

public class UtilFunc {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static int enterNumber(String text) {
        int number = 0;
        boolean check = false;
        do {
            print(text);
            try {
                int number1 = Integer.parseInt(SCANNER.nextLine());
                if (number1 < 0) {
                    print("Vui lòng nhập > 0");
                    check = true;
                } else {
                    number = number1;
                }
            } catch (NumberFormatException e) {
                check = true;
                System.out.println(e.getMessage());
            }
        } while (check);
        return number;
    }

    public static int enterFunction() {
        int number = 0;
        do {
            print("Vui lòng chọn chức năng: ");
            try {
                number = Integer.parseInt(SCANNER.nextLine());
                if (number > 9 || number < 0) {
                    print("Vui lòng nhập từ 0 đến 9");
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (number > 9 || number < 0);
        return number;
    }

    public static void print(String text) {
        System.out.print(text);
    }

    public static int enterRoleOfOfficial() {
        int number = 0;
        boolean check = true;
        do {
            try {
                print("Nhập loại cán bộ: ");
                number = Integer.parseInt(SCANNER.nextLine());
                if (number >= 0 && number <= 6) {
                    check = false;
                } else {
                    print("Vui lòng nhập từ 0 đến 6");
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return number;
    }
}
