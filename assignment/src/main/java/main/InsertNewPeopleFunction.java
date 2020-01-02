package main;

import define.DefineOfficials;
import define.DefinesMessage;
import model.bean.Labor;
import model.bean.People;
import model.bean.Staff;
import model.bean.Teacher;
import model.dao.LaborDAO;
import model.dao.PeopleDAO;
import model.dao.StaffDAO;
import model.dao.TeacherDAO;
import utils.UtilFunc;

import java.io.*;
import java.util.ArrayList;

public class InsertNewPeopleFunction {

    public static void showMenuFun1() {
        System.out.println("======================================Menu======================================");
        System.out.println("1.1. Thêm cán bộ vào cuối danh sách ");
        System.out.println("1.2. Thêm cán bộ vào đầu danh sách ");
        System.out.println("1.3. Thêm cán bộ vào sau vị trí thứ k.");
        System.out.println("1.4. Thêm mới cán bộ vào cuối danh sách từ file staff.txt");
        System.out.println("1.5. Thêm mới lao động thời vụ danh sách từ file labor.txt");
        System.out.println("1.6.Quay lại mục trước.");
        System.out.println("======================================Menu======================================");
    }

    public static void function1(ArrayList<People> pList, ArrayList<Teacher> tList,
                                 ArrayList<Labor> lList, ArrayList<Staff> sList) {
        boolean message = true;
        People people = null;
        PeopleDAO peopleDAO = new PeopleDAO();
        int k = -1;
        showMenuFun1();
        int number = UtilFunc.enterFunction(6, "Vui lòng chọn chức năng: ");
        switch (number) {
            case 1:
                k = 0;
            case 2:
                k = pList.size();
            case 3:
                int roleOfOfficial = UtilFunc.enterRoleOfOfficial();
                if (roleOfOfficial <= DefineOfficials.DOCTOR) {
                    TeacherDAO teacherDAO = new TeacherDAO();
                    Teacher teacher = teacherDAO.insertTeacher(roleOfOfficial);
                    people = new People(teacher.getPeopleId(), teacher.getFullName(), teacher.getYearOfBirth(),
                            teacher.getAddress());
                    if (!peopleDAO.checkPeopleID(pList, people.getPeopleId())) {
                        tList.add(teacher);
                    }
                    System.out.println(teacher.toString());
                } else if (roleOfOfficial == 6) {
                    LaborDAO laborDAO = new LaborDAO();
                    Labor labor = laborDAO.insertLabor(roleOfOfficial);
                    people = new People(labor.getPeopleId(), labor.getFullName(), labor.getYearOfBirth(),
                            labor.getAddress());
                    if (!peopleDAO.checkPeopleID(pList, people.getPeopleId())) {
                        lList.add(labor);
                    }
                    System.out.println(labor.toString());
                } else {
                    StaffDAO staffDAO = new StaffDAO();
                    Staff staff = staffDAO.insertStaff(roleOfOfficial);
                    people = new People(staff.getPeopleId(), staff.getFullName(), staff.getYearOfBirth(),
                            staff.getAddress());
                    if (!peopleDAO.checkPeopleID(pList, people.getPeopleId())) {
                        sList.add(staff);
                    }
                    System.out.println(staff.toString());
                }
                if (peopleDAO.checkPeopleID(pList, people.getPeopleId())) {
                    System.err.println(DefinesMessage.ID_ERROR);
                    break;
                }
                if (k == -1) {
                    k = UtilFunc.enterFunction(pList.size(), "Nhập vị trí bạn muốn thêm vào (<= "
                            + pList.size() + "): ");
                }
                message = peopleDAO.addPeopleIntoList(people, k, pList);
                if (message) {
                    System.out.println(DefinesMessage.ADD_SUCCESS);
                } else {
                    System.out.println(DefinesMessage.ADD_LOSE);
                }
            case 4:
                break;
            case 5:
                break;
            case 6:
                FunctionMenu.functionDemo(pList, tList, lList, sList);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
        for (People p : pList) {
            System.out.println(p.toString());
        }
    }

}
