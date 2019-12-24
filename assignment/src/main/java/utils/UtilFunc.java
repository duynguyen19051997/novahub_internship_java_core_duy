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
                number = Integer.parseInt(SCANNER.nextLine());
                if (number < 0) {
                    print("Vui lòng nhập < 0");
                    check = true;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return number;
    }

    public static int enterFunction(int end) {
        int number = 0;
        do {
            print("Vui lòng chọn chức năng: ");
            try {
                number = Integer.parseInt(SCANNER.nextLine());
                if (number > 9 || number < 0) {
                    print("Vui lòng nhập từ 0 đến " + end);
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
                print("Vui lòng nhập loại cán bộ: \n");
                print("Giảng viên: 0.Cử nhân, 1.Thạc sĩ, 2.Tiến sĩ\n");
                print("Nhân viên hành chính, 3.Trưởng phòng, 4.Phó phòng, 5.Nhân viên\n");
                print("6.Lao động thời vụ\n");
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
