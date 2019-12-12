package BasicExercises;

import java.util.Scanner;

public class TriangularPattern {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void drawPictureA(int t) {
        System.out.println("A:");
        for (int row = 1; row <= t; row++) {
            for (int col = 1; col <= t; col++) {
                if (row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawPictureB(int t) {
        System.out.println("B:");
        for (int row = 1; row <= t; row++) {
            for (int col = 1; col <= t; col++) {
                if (row + col <= t + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawPictureC(int t) {
        System.out.println("C:");
        for (int row = 1; row <= t; row++) {
            for (int col = 1; col <= t; col++) {
                if (row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawPictureD(int t) {
        System.out.println("D:");
        for (int row = 1; row <= t; row++) {
            for (int col = 1; col <= t; col++) {
                if (row + col >= t + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your size: ");
        int size = Integer.parseInt(SCANNER.nextLine());
        drawPictureA(size);
        drawPictureB(size);
        drawPictureC(size);
        drawPictureD(size);
    }
}
