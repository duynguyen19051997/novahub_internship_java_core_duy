package javaBasicExercises;

import java.util.Scanner;

public class PensionContributionCalculator {
    private static final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
    private static final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
    private static final double EMPLOYEE_RATE_55_TO_60 = 0.13;
    private static final double EMPLOYER_RATE_55_TO_60 = 0.13;
    private static final double EMPLOYEE_RATE_60_TO_65 = 0.075;
    private static final double EMPLOYER_RATE_60_TO_65 = 0.09;
    private static final double EMPLOYEE_RATE_65_ABOVE = 0.05;
    private static final double EMPLOYER_RATE_65_ABOVE = 0.075;

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your salary: ");
        int salary = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(SCANNER.nextLine());

        double employeeRate = 0.d, employerRate = 0.d;
        if (age > 65) {
            employeeRate = salary * EMPLOYEE_RATE_65_ABOVE;
            employerRate = salary * EMPLOYER_RATE_65_ABOVE;
        } else if (age <= 65 && age > 60) {
            employeeRate = salary * EMPLOYEE_RATE_60_TO_65;
            employerRate = salary * EMPLOYER_RATE_60_TO_65;
        } else if (age <= 60 && age > 55) {
            employeeRate = salary * EMPLOYEE_RATE_55_TO_60;
            employerRate = salary * EMPLOYER_RATE_55_TO_60;
        } else {
            employeeRate = salary * EMPLOYEE_RATE_55_AND_BELOW;
            employerRate = salary * EMPLOYER_RATE_55_AND_BELOW;
        }
        System.out.println("The employee's contribution is: " + employeeRate);
        System.out.println("The employer's contribution is: " + employerRate);
        System.out.println("Total: " + (employeeRate + employerRate));
    }
}
