package model.bean;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class People {
    private int peopleId;
    private String fullName;
    private int yearOfBirth;
    private String address;
}
