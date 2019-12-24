package main;

import model.bean.Labor;
import model.bean.People;
import model.bean.Staff;
import model.bean.Teacher;

import java.util.ArrayList;

public class Demo {
    public static ArrayList<People> PEOPLE_LIST = new ArrayList<People>();
    public static ArrayList<Teacher> TEACHER_LIST = new ArrayList<Teacher>();
    public static ArrayList<Staff> STAFF_LIST = new ArrayList<Staff>();
    public static ArrayList<Labor> LABOR_LIST = new ArrayList<Labor>();

    public static void main(String[] args) {
        while (true) {
            FunctionMenu.functionDemo(PEOPLE_LIST, TEACHER_LIST, LABOR_LIST, STAFF_LIST);
            System.out.println(PEOPLE_LIST.size());
            System.out.println(TEACHER_LIST.size());
            System.out.println(STAFF_LIST.size());
            System.out.println(LABOR_LIST.size());
        }
    }
}
