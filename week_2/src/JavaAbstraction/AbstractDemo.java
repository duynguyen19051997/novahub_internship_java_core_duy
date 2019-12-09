package JavaAbstraction;

public class AbstractDemo {
    public static void main(String [] args) {
        /* Following is not allowed and would raise error */
        Employee e = new Employee("George W.", "Houston, TX", 43) {
            @Override
            public double computePay() {
                return 0;
            }
        };
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
        Employee e1 = new Salary("Anh Duy", "Quang Nam", 10);
        e1.computePay();
    }
}
