package main;

import model.bean.People;
import model.bean.Teacher;

public class Demo {
    public static void main(String[] args) {
        People test = new Teacher(1, "Anh Duy", 1997, "Quang Nam",
                "IT", "HS", 12, 153,
                1, 5);
        System.out.println(test.getAddress());
        System.out.println(test.toString());
    }
}
