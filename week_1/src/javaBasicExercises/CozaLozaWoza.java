package assignment;

public class CozaLozaWoza {
    public static void main(String[] args) {
        int start = 1, end = 110;
        for (int i = start; i <= end; i++) {
            boolean check = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                check = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                check = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                check = true;
            }
            if (!check) {
                System.out.print(i);
            }
            if (i % 11 == 0) {
                System.out.print("\n");
            } else {
                System.out.print(" ");
            }
        }
    }
}
