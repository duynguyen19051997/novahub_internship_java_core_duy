package week_1;

public class JavaVariablesTypes {
    private static final int MAX = 1000;

    public static void checkAge() {
        int age = 0;
        age += 22;
        System.out.println(age);
    }

    public static void main(String[] args) {
        int a = 5, b = 10, c = 99;
        double pi = 3.14d;
        System.out.println(a + "\t" + b + "\t" + c + "\t" + pi);
        checkAge();
        System.out.println(MAX);
    }
}
