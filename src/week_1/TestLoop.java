package week_1;

public class TestLoop {
    public static void main(String[] args) {
        System.out.println("For Loop:");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
        }

        System.out.println("\nWhile Loop:");
        int j = 0;
        while (j < 10) {
            System.out.print(j + "\t");
            ++j;
        }

        System.out.println("\nDo While Loop:");
        int t = 0;
        do {
            System.out.print(t + "\t");
            ++t;
        } while (t < 10);

        System.out.println("\nLoop Controll Statement:");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
            if (i == 5) {
                break;
            }
        }

        System.out.println("\nLoop Controll Statement:");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
            if (i == 5) {
                continue;
            }
            System.out.print("Duy\n");
        }

        System.out.println("Enhanced for loop in JAVA:");
        int[] num = {5, 10, 15, 20, 25, 30};
        for (int i : num) {
            System.out.print(i + "\t");
        }
    }
}
