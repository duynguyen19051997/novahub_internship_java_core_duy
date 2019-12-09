package JavaAbstraction;

public class Salary extends Employee {
    private double salary;   // Annual salary

    public Salary(String name, String address, int number) {
        super(name, address, number);
    }

    public Salary() {
        super();
    }

    @Override
    public double computePay() {
        System.out.println("Computing salary pay for " + this.getName());
        return salary / 52;
    }
}
