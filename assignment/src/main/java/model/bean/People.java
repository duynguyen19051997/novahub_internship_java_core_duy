package model.bean;

import lombok.*;
import utils.UtilFunc;

import java.util.Scanner;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class People {
    private String peopleId;
    private String fullName;
    private int yearOfBirth;
    private String address;

    public static final Scanner SCANNER = new Scanner(System.in);

    public void insertPeople() {
        UtilFunc.print("Nhập mã cán bộ: ");
        this.peopleId = SCANNER.nextLine();

        UtilFunc.print("Nhập họ tên: ");
        this.fullName = SCANNER.nextLine();

        this.yearOfBirth = UtilFunc.enterNumber("Nhập năm sinh: ");

        UtilFunc.print("Nhập quê quán: ");
        this.address = SCANNER.nextLine();
    }
}
