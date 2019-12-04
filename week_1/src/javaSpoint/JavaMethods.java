package javaSpoint;

public class JavaMethods {
    public static boolean isGreaterThan(int a, int b) {
        return a >= b;
    }

    public static int minFunc(int a, int b) {
        return (b < a) ? b : a;
    }

    public static float minFunc(double a, double b) {
        return (float) ((b < a) ? b : a);
    }

    public static void main(String[] args) {
        System.out.println(isGreaterThan(5, 5));
        System.out.println(minFunc(5, 6));
        System.out.println(minFunc(7.5, 7.4));
    }
}
