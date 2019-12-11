package model.bean;

import lombok.*;

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

    public Staff(int peopleId, String fullName,
                 int yearOfBirth, String address, int department,
                 int numberOfWorkdays, int coefficientsSalary, int allowance,
                 int position, int yearOfService) {
        super(peopleId, fullName, yearOfBirth, address);
        this.department = department;
        this.numberOfWorkdays = numberOfWorkdays;
        this.coefficientsSalary = coefficientsSalary;
        this.allowance = allowance;
        this.position = position;
        this.yearOfService = yearOfService;
    }

    public Staff(int peopleId, String fullName, int yearOfBirth, String address) {
        super(peopleId, fullName, yearOfBirth, address);
    }
}
