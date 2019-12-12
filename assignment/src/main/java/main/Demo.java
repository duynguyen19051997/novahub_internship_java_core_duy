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
        FunctionMenu functionMenu = new FunctionMenu();

        functionMenu.showMenu();
        int number = UtilFunc.enterFunction();

        switch (number) {
            case 1:
                functionMenu.function1(PEOPLE_LIST, TEACHER_LIST, LABOR_LIST, STAFF_LIST);
                break;
            case 2:
                functionMenu.function2();
                break;
            case 3:
                functionMenu.function3();
                break;
            case 4:
                functionMenu.function4();
                break;
            case 5:
                functionMenu.function5();
                break;
            case 6:
                functionMenu.function6();
                break;
            case 7:
                functionMenu.function7();
                break;
            case 8:
                functionMenu.function8();
                break;
            case 9:
                functionMenu.function9();
                break;
        }
    }
}
