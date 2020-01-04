package main;

import define.DefineOfficials;
import model.bean.Labor;
import model.bean.People;
import model.bean.Staff;
import model.bean.Teacher;
import model.dao.StaffDAO;
import model.dao.TeacherDAO;
import utils.UtilFunc;

import java.util.ArrayList;

public class UpdateNewBasicSalaryFunction {
    public static void function7(ArrayList<People> pList, ArrayList<Teacher> tList,
                                 ArrayList<Labor> lList, ArrayList<Staff> sList) {
        DefineOfficials defineOfficials = new DefineOfficials();
        TeacherDAO teacherDAO = new TeacherDAO();
        StaffDAO staffDAO = new StaffDAO();

        int newBasicSalary = UtilFunc.enterNumber("Nhập lương cơ bản mới ");
        defineOfficials.updateNewBasicSalary(newBasicSalary);
        System.out.println(defineOfficials.BASIC_SALARY);
        for (People p : pList) {
            char id = p.getPeopleId().charAt(0);
            if (id == 'T') {
                Teacher teacher = teacherDAO.findTeacherByPeopleId(tList, p.getPeopleId());
                if (teacher != null) {
                    p.setSalary(teacher.computeSalaryTeacher(teacher));
                    System.out.println(teacher.computeSalaryTeacher(teacher));
                }
            } else if (id == 'S') {
                Staff staff = staffDAO.findStaffByPeopleId(sList, p.getPeopleId());
                if (staff != null) {
                    p.setSalary(staff.computeSalaryStaff());
                }
            }
        }
    }
}
