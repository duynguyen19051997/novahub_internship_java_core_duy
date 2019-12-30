package model.dao;

import define.DefineOfficials;
import model.bean.Labor;
import model.bean.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherDAO {
    public static final Scanner SCANNER = new Scanner(System.in);

    public Teacher insertTeacher(int roleOfOfficial) {
        Teacher teacher = new Teacher();
        teacher.insertPeople();
        teacher.setPeopleId("T" + teacher.getPeopleId());
        teacher.setLevel(roleOfOfficial);
        teacher.setAllowance(DefineOfficials.ALLOWANCE_LIST[roleOfOfficial]);
        teacher.setSalary(teacher.computeSalaryTeacher());
        return teacher;
    }

    public boolean addTeacherIntoList(Teacher teacher, int k, ArrayList<Teacher> list) {
        return true;
    }

    public boolean editTeacher(Teacher newTeacher, int k, ArrayList<Teacher> list) {
        return true;
    }

    public boolean deleteTeacher(Teacher teacher, ArrayList<Teacher> list) {
        return true;
    }

    public void showTeacherList(ArrayList<Teacher> list) {
    }

    public double calculateOFWage(Teacher teacher) {
        return 0.0d;
    }
}
