package model.dao;

import define.DefineOfficials;
import model.bean.Teacher;
import utils.UtilFunc;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherDAO {
    public static final Scanner SCANNER = new Scanner(System.in);

    public Teacher findTeacherByPeopleId(ArrayList<Teacher> tList, String peopleId) {
        Teacher teacher = null;
        for (Teacher t : tList) {
            if (t.getPeopleId().equals(peopleId)) {
                teacher = t;
                tList.remove(t);
                break;
            }
        }
        return teacher;
    }

    public Teacher editTeacher(Teacher teacher, ArrayList<Teacher> tList) {
        UtilFunc.print("Nhập các thông tin cần chỉnh sửa: ");
        UtilFunc.print("Nhập họ tên: ");
        teacher.setFullName(SCANNER.nextLine());

        teacher.setYearOfBirth(UtilFunc.enterNumber("Nhập năm sinh: "));

        UtilFunc.print("Nhập quê quán: ");
        teacher.setAddress(SCANNER.nextLine());

        UtilFunc.print("Nhập khoa: ");
        teacher.setFaculty(SCANNER.nextLine());

        teacher.setLessionOfMonth(UtilFunc.enterNumber("Nhập số tiết dạy trong tháng: "));

        teacher.setCoefficientsSalary(UtilFunc.enterNumber("Nhập hệ số lương: "));

        teacher.setYearOfService(UtilFunc.enterNumber("Nhập số năm làm việc: "));

        teacher.setSalary(teacher.computeSalaryTeacher());

        tList.add(teacher);

        return teacher;
    }

    public Teacher insertTeacher(int roleOfOfficial) {
        Teacher teacher = new Teacher();
        teacher.insertPeople();
        teacher.setPeopleId("T" + teacher.getPeopleId());
        teacher.setLevel(roleOfOfficial);
        teacher.setAllowance(DefineOfficials.ALLOWANCE_LIST[roleOfOfficial]);
        teacher.setSalary(teacher.computeSalaryTeacher());
        return teacher;
    }

    public boolean deleteTeacher(Teacher teacher, ArrayList<Teacher> list) {
        return true;
    }

    public void showTeacherList(ArrayList<Teacher> list) {
    }

    public double calculateOfWage(Teacher teacher) {
        return 0.0d;
    }
}
