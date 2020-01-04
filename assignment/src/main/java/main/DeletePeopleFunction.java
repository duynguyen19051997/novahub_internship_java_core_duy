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

public class DeletePeopleFunction {
    public static void function3(ArrayList<People> pList, ArrayList<Teacher> tList,
                                 ArrayList<Labor> lList, ArrayList<Staff> sList) {
        if (pList.size() == 0) {
            UtilFunc.print("Danh sách rỗng");
            return;
        }
        int number = 0;
        do {
            number = UtilFunc.enterNumber("Nhập số thứ tự cán bộ cần xóa:  ");
            if (number >= pList.size()) {
                UtilFunc.print("Vui lòng nhập < " + pList.size());
            }
        } while (number >= pList.size());
        People people = pList.get(number);
        pList.remove(people);
        char id = people.getPeopleId().charAt(0);
        if (id == 'T') {
            TeacherDAO teacherDAO = new TeacherDAO();
            Teacher teacher = teacherDAO.findAndDeleteTeacherByPeopleId(tList, people.getPeopleId());
            if (teacher != null) {
                UtilFunc.print(DefinesMessage.DELETE_SUCCESS);
            } else {
                UtilFunc.print(DefinesMessage.DELETE_LOSE);
            }
        } else if (id == 'S') {
            StaffDAO staffDAO = new StaffDAO();
            Staff staff = staffDAO.findAndDeleteStaffByPeopleId(sList, people.getPeopleId());
            if (staff != null) {
                UtilFunc.print(DefinesMessage.DELETE_SUCCESS);
            } else {
                UtilFunc.print(DefinesMessage.DELETE_LOSE);
            }
        } else {
            LaborDAO laborDAO = new LaborDAO();
            Labor labor = laborDAO.findAndDeleteLaborByPeopleId(lList, people.getPeopleId());
            if (labor != null) {
                UtilFunc.print(DefinesMessage.DELETE_SUCCESS);
            } else {
                UtilFunc.print(DefinesMessage.DELETE_LOSE);
            }
        }
    }
}
