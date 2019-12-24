package model.bean;

import lombok.*;
import utils.UtilFunc;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Labor extends People {
    private int numberOfWorkdays;
    private int priceOfWorkday;
    private double salary;

    public Labor(String peopleId, String fullName,
                 int yearOfBirth, String address, int numberOfWorkdays, int priceOfWorkday,
                 double salary) {
        super(peopleId, fullName, yearOfBirth, address);
        this.numberOfWorkdays = numberOfWorkdays;
        this.priceOfWorkday = priceOfWorkday;
        this.salary = salary;
    }

    public Labor(String peopleId, String fullName, int yearOfBirth, String address) {
        super(peopleId, fullName, yearOfBirth, address);
    }

    @Override
    public void insertPeople() {
        super.insertPeople();

        this.numberOfWorkdays = UtilFunc.enterNumber("Nhập số ngày làm việc: ");

        this.priceOfWorkday = UtilFunc.enterNumber("Đơn giá: ");

        this.salary = this.numberOfWorkdays * this.priceOfWorkday;
    }
}
