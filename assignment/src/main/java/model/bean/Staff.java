package model.bean;

import define.DefineOfficials;
import lombok.*;
import utils.UtilFunc;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Staff extends People {
    private int department;
    private int numberOfWorkdays;
    private int coefficientsSalary;
    private int allowance;
    private int position;
    private int yearOfService;
    private double salary;

    public Staff(String peopleId, String fullName,
                 int yearOfBirth, String address, int department,
                 int numberOfWorkdays, int coefficientsSalary, int allowance,
                 int position, int yearOfService, double salary) {
        super(peopleId, fullName, yearOfBirth, address);
        this.department = department;
        this.numberOfWorkdays = numberOfWorkdays;
        this.coefficientsSalary = coefficientsSalary;
        this.allowance = allowance;
        this.position = position;
        this.yearOfService = yearOfService;
        this.salary = salary;
    }

    public Staff(String peopleId, String fullName, int yearOfBirth, String address) {
        super(peopleId, fullName, yearOfBirth, address);
    }

    public double computeSalaryStaff() {
        return this.coefficientsSalary * DefineOfficials.BASIC_SALARY + this.allowance + this.numberOfWorkdays * 30;
    }

    @Override
    public void insertPeople() {
        super.insertPeople();
        this.department = UtilFunc.enterNumber("Nhập phòng ban:");
        this.numberOfWorkdays = UtilFunc.enterNumber("Nhập số ngày công: ");
        this.coefficientsSalary = UtilFunc.enterNumber("Nhập hệ số lương: ");
        this.yearOfService = UtilFunc.enterNumber("Số năm làm việc: ");
    }
}
