package JavaAdvanced;

public class JavaGenericsClass<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public JavaGenericsClass(T t) {
        this.t = t;
    }

    public JavaGenericsClass() {
    }

    @Override
    public String toString() {
        return "JavaGenericsClass{" +
                "t=" + t +
                '}';
    }

    public static void main(String[] args) {
        JavaGenericsClass<Integer> test1 = new JavaGenericsClass<>(5);
        System.out.println(test1.toString());

        JavaGenericsClass<Double> test2 = new JavaGenericsClass<>();
        test2.setT(4.25);
        System.out.println(test2.toString());

        JavaGenericsClass<String> test3 = new JavaGenericsClass<>("Anh Duy");
        test3.setT("Nguyen Vu Anh Duy");
        System.out.println(test3.toString());
    }
}
