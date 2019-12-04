package week_1;

public class TestOperator {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 15, d = 20;
        ++a;
        --b;
        b *= b * c;
        d /= a;
        b = (a == c) ? a : b;
        int t = d % b;
        int e = (t >= d) ? t : a;
        System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + t + "\t" + e);
    }
}
