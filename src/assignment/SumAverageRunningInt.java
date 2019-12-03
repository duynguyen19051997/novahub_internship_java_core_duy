package assignment;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sumFor = 0, sumWhile = 0, sumDoWhie = 0;
        for (int i = 1; i <= 100; i++) {
            sumFor += i;
        }
        System.out.println("For loop result: " + sumFor);

        int j = 1;
        while (j <= 100) {
            sumWhile += j;
            j++;
        }
        System.out.println("While loop result: " + sumWhile);

        j = 1;
        do {
            sumDoWhie += j;
            j++;
        } while (j <= 100);
        System.out.println("Do while loop result: " + sumDoWhie);
    }
}
