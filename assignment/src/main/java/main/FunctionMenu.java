package main;

import define.DefineOfficials;
import model.bean.Labor;
import model.bean.People;
import model.bean.Staff;
import model.bean.Teacher;
import utils.UtilFunc;

import java.util.ArrayList;
import java.util.Scanner;

public class FunctionMenu {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void functionDemo(ArrayList<People> pList, ArrayList<Teacher> tList,
                                    ArrayList<Labor> lList, ArrayList<Staff> sList) {
        FunctionMenu functionMenu = new FunctionMenu();

        functionMenu.showMenu();
        int number = UtilFunc.enterFunction(6, "Vui lòng chọn chức năng: ");

        switch (number) {
            case 1:
                InsertNewPeopleFunction.function1(pList, tList, lList, sList);
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

    public void showMenu() {
        System.out.println("======================================Menu======================================");
        System.out.println("1. Thêm mới người lao động.");
        System.out.println("2. Chỉnh sửa thông tin người cán bộ.");
        System.out.println("3. Xóa cán bộ.");
        System.out.println("4. Hiển thị danh sách cán bộ.");
        System.out.println("5. Xóa toàn bộ dữ liệu.");
        System.out.println("6. Hiển thị chi phí lương của tất cả người lao động trong hệ thống.");
        System.out.println("7. Cập nhật lương cơ bản.");
        System.out.println("8. Nhập danh sách mã cán bộ subscribe lương cơ bản.");
        System.out.println("9. Thoát chương trình.");
        System.out.println("======================================Menu======================================");
    }

    public void function1(ArrayList<People> pList, ArrayList<Teacher> tList,
                          ArrayList<Labor> lList, ArrayList<Staff> sList) {
        int roleOfOfficial = UtilFunc.enterRoleOfOfficial();
        switch (roleOfOfficial) {
            case 0:
            case 1:
            case 2:
                Teacher teacher = new Teacher();
                teacher.insertPeople();
                teacher.setLevel(roleOfOfficial);
                teacher.setAllowance(DefineOfficials.ALLOWANCE_LIST[roleOfOfficial]);
                teacher.setSalary(teacher.computeSalaryTeacher());
                System.out.println(teacher.getFullName());
                System.out.println(teacher.toString());
                break;
        }
    }

    public void function2() {
    }

    public void function3() {
    }

    public void function4() {
    }

    public void function5() {
    }

    public void function6() {
    }

    public void function7() {
    }

    public void function8() {
    }

    public void function9() {
    }
}
