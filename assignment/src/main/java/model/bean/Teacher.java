package model.bean;

import define.DefineOfficials;
import lombok.*;
import utils.UtilFunc;

import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Teacher extends People {
    private String faculty;
    private int level;
    private int allowance;
    private int lessionOfMonth;
    private int coefficientsSalary;
    private int yearOfService;

    private static final Scanner SCANNER = new Scanner(System.in);

    public Teacher(String peopleId, String fullName, int yearOfBirth, String address, double salary) {
        super(peopleId, fullName, yearOfBirth, address, salary);
    }

    public Teacher(String peopleId, String fullName, int yearOfBirth, String address,
                   String faculty, int level, int allowance, int lessionOfMonth,
                   int coefficientsSalary, int yearOfService, double salary) {
        super(peopleId, fullName, yearOfBirth, address, salary);
        this.faculty = faculty;
        this.level = level;
        this.allowance = allowance;
        this.lessionOfMonth = lessionOfMonth;
        this.coefficientsSalary = coefficientsSalary;
        this.yearOfService = yearOfService;
    }

    public double computeSalaryTeacher() {
        return (this.coefficientsSalary * DefineOfficials.BASIC_SALARY + this.allowance + this.lessionOfMonth * 45);
    }


    @Override
    public void insertPeople() {
        super.insertPeople();

        UtilFunc.print("Nhập khoa:");
        this.faculty = SCANNER.nextLine();

        this.lessionOfMonth = UtilFunc.enterNumber("Nhập số tiết dạy trong tháng: ");

        this.coefficientsSalary = UtilFunc.enterNumber("Nhập hệ số lương: ");

        this.yearOfService = UtilFunc.enterNumber("Nhập số năm làm việc: ");
    }
}
