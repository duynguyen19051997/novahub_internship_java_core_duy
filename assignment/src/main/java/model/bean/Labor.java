package model.bean;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Labor extends People {
    private int numberOfWorkdays;
    private int priceOfWorkday;

    public Labor(int peopleId, String fullName,
                 int yearOfBirth, String address, int numberOfWorkdays, int priceOfWorkday) {
        super(peopleId, fullName, yearOfBirth, address);
        this.numberOfWorkdays = numberOfWorkdays;
        this.priceOfWorkday = priceOfWorkday;
    }

    public Labor(int peopleId, String fullName, int yearOfBirth, String address) {
        super(peopleId, fullName, yearOfBirth, address);
    }
}
