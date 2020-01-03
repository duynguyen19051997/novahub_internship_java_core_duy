package main;

import model.bean.Labor;
import model.bean.People;
import model.bean.Staff;
import model.bean.Teacher;
import model.dao.LaborDAO;
import model.dao.PeopleDAO;
import model.dao.StaffDAO;
import model.dao.TeacherDAO;
import utils.UtilFunc;

import java.util.ArrayList;

public class ShowPeopleListFunction {
    public static void showMenuFunction4() {
        System.out.println("======================================Menu======================================");
        System.out.println("4.1 Hiển thị danh sách hiện tại.");
        System.out.println("4.2 Hiển thị danh sách sau khi đã sắp xếp tăng dần theo lương.");
        System.out.println("4.3 Hiển thị danh sách sau khi đã sắp xếp tên theo thứ tự chữ cái.");
        System.out.println("4.4 Tìm kiếm cán bộ theo tên");
        System.out.println("4.5 Tìm kiếm cán bộ theo năm sinh");
        System.out.println("======================================Menu======================================");
    }

    public static void function4(ArrayList<People> pList, ArrayList<Teacher> tList,
                                 ArrayList<Labor> lList, ArrayList<Staff> sList) {
        PeopleDAO peopleDAO = new PeopleDAO();
        TeacherDAO teacherDAO = new TeacherDAO();
        LaborDAO laborDAO = new LaborDAO();
        StaffDAO staffDAO = new StaffDAO();
        showMenuFunction4();
        int number = UtilFunc.enterFunction(5, "Vui lòng chọn chức năng: ");
        switch (number) {
            case 1:
                peopleDAO.showPeopleList(pList);
                teacherDAO.showTeacherList(tList);
                staffDAO.showStaffList(sList);
                break;
        }
    }
}
