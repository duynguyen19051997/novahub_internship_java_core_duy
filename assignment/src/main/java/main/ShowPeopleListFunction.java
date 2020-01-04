package main;

import model.bean.Labor;
import model.bean.People;
import model.bean.Staff;
import model.bean.Teacher;
import model.dao.PeopleDAO;
import utils.UtilFunc;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowPeopleListFunction {
    private static final Scanner SCANNER = new Scanner(System.in);

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
        showMenuFunction4();
        int number = UtilFunc.enterFunction(5, "Vui lòng chọn chức năng: ");
        switch (number) {
            case 1:
                peopleDAO.showPeopleList(pList, tList, sList);
                break;
            case 2:
                peopleDAO.showPeopleListWithSortSalary(pList, tList, sList);
                break;
            case 3:
                peopleDAO.showPeopleListWithSortABC(pList, tList, sList);
                break;
            case 4:
                System.out.println("Nhập tên bạn muốn tìm: ");
                String search = SCANNER.nextLine();
                peopleDAO.searchPeopleByName(pList, tList, sList, search);
                break;
            case 5:
                int year = UtilFunc.enterNumber("Nhập năm sinh để tìm kiếm: ");
                peopleDAO.searchPeopleByYearOfBirth(pList, tList, sList, year);
                break;
        }
    }
}
