package main;

import define.DefinesMessage;
import model.bean.Labor;
import model.bean.People;
import model.bean.Staff;
import model.bean.Teacher;
import model.dao.LaborDAO;
import model.dao.StaffDAO;
import model.dao.TeacherDAO;
import utils.UtilFunc;

import java.util.ArrayList;

public class EditPeopleFunction {
    public static void function2(ArrayList<People> pList, ArrayList<Teacher> tList,
                                 ArrayList<Labor> lList, ArrayList<Staff> sList) {
        if (pList.size() == 0) {
            UtilFunc.print("Danh sách rỗng");
            return;
        }
        int number = 0;
        do {
            number = UtilFunc.enterNumber("Nhập số thứ tự cán bộ cần chỉnh sửa: ");
            if (number >= pList.size()) {
                UtilFunc.print("Vui lòng nhập < " + pList.size());
            }
        } while (number >= pList.size());
        People people = pList.get(number);
        char id = people.getPeopleId().charAt(0);
        if (id == 'T') {
            TeacherDAO teacherDAO = new TeacherDAO();
            Teacher teacher = teacherDAO.findTeacherByPeopleId(tList, people.getPeopleId());
            if (teacher != null) {
                teacher = teacherDAO.editTeacher(teacher, tList);
                people = new People(teacher.getPeopleId(), teacher.getFullName(),
                        teacher.getYearOfBirth(), teacher.getAddress());
                pList.set(number, people);
                UtilFunc.print(people.toString());
                UtilFunc.print(DefinesMessage.EDIT_SUCCESS);
            } else {
                UtilFunc.print(DefinesMessage.EDIT_LOSE);
            }
        } else if (id == 'S') {
            StaffDAO staffDAO = new StaffDAO();
            Staff staff = staffDAO.findStaffByPeopleId(sList, people.getPeopleId());
            if (staff != null) {
                staff = staffDAO.editStaff(staff, sList);
                people = new People(staff.getPeopleId(), staff.getFullName(),
                        staff.getYearOfBirth(), staff.getAddress());
                pList.set(number, people);
                UtilFunc.print(people.toString());
                UtilFunc.print(DefinesMessage.EDIT_SUCCESS);
            } else {
                UtilFunc.print(DefinesMessage.EDIT_LOSE);
            }
        } else {
            LaborDAO laborDAO = new LaborDAO();
            Labor labor = laborDAO.findLaborByPeopleId(lList, people.getPeopleId());
            if (labor != null) {
                labor = laborDAO.editLabor(labor, lList);
                people = new People(labor.getPeopleId(), labor.getFullName(),
                        labor.getYearOfBirth(), labor.getAddress());
                pList.set(number, people);
                UtilFunc.print(people.toString());
                UtilFunc.print(DefinesMessage.EDIT_SUCCESS);
            } else {
                UtilFunc.print(DefinesMessage.EDIT_LOSE);
            }
        }
    }
}
