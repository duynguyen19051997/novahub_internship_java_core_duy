package model.bean;

import lombok.*;

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
    private double salary;

    public Teacher(int peopleId, String fullName, int yearOfBirth, String address) {
        super(peopleId, fullName, yearOfBirth, address);
    }

    public Teacher(int peopleId, String fullName, int yearOfBirth, String address,
                   String faculty, int level, int allowance, int lessionOfMonth,
                   int coefficientsSalary, int yearOfService, double salary) {
        super(peopleId, fullName, yearOfBirth, address);
        this.faculty = faculty;
        this.level = level;
        this.allowance = allowance;
        this.lessionOfMonth = lessionOfMonth;
        this.coefficientsSalary = coefficientsSalary;
        this.yearOfService = yearOfService;
        this.salary = salary;
    }

    @Override
    public People insertPeople() {
        return super.insertPeople();
    }
}
