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

    public Labor(String peopleId, String fullName,
                 int yearOfBirth, String address, int numberOfWorkdays, int priceOfWorkday,
                 double salary) {
        super(peopleId, fullName, yearOfBirth, address, salary);
        this.numberOfWorkdays = numberOfWorkdays;
        this.priceOfWorkday = priceOfWorkday;
    }

    public Labor(String peopleId, String fullName, int yearOfBirth, String address, double salary) {
        super(peopleId, fullName, yearOfBirth, address, salary);
    }

    public double computeSalaryLabor() {
        return this.numberOfWorkdays * this.priceOfWorkday;
    }

    @Override
    public void insertPeople() {
        super.insertPeople();

        this.numberOfWorkdays = UtilFunc.enterNumber("Nhập số ngày làm việc: ");

        this.priceOfWorkday = UtilFunc.enterNumber("Đơn giá: ");
    }
}
