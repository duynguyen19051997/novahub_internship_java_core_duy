package JavaAdvanced;

public class JavaGenericsMethods {
    public static <E> void printArray(E[] input) {
        System.out.print("Printf Array: ");
        for (E e : input) {
            System.out.print(e + "\t");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (max.compareTo(y) < 0) {
            max = y;
        }
        if (max.compareTo(z) < 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] doubleArray = {1.2, 2.3, 3.4, 5.9};
        Character[] characterArray = {'C', 'B'};

        printArray(characterArray);
        printArray(doubleArray);
        printArray(intArray);
        System.out.println(maximum(1, 2, 3));
    }

}
