package main;

import model.bean.Labor;
import model.bean.People;
import model.bean.Staff;
import model.bean.Teacher;
import utils.UtilFunc;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static ArrayList<People> PEOPLE_LIST = new ArrayList<People>();
    public static ArrayList<Teacher> TEACHER_LIST = new ArrayList<Teacher>();
    public static ArrayList<Staff> STAFF_LIST = new ArrayList<Staff>();
    public static ArrayList<Labor> LABOR_LIST = new ArrayList<Labor>();

    public static void main(String[] args) {
        FunctionMenu.functionDemo(PEOPLE_LIST, TEACHER_LIST, LABOR_LIST, STAFF_LIST);
    }
}
