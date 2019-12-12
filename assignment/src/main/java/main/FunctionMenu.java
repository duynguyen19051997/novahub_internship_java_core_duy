package main;

import model.bean.Labor;
import model.bean.People;
import model.bean.Staff;
import model.bean.Teacher;
import utils.UtilFunc;

import java.util.ArrayList;
import java.util.Scanner;

public class FunctionMenu {
    public static final Scanner SCANNER = new Scanner(System.in);

    public void showMenu() {
        System.out.println("========================Menu========================");
        System.out.println("1. Thêm mới người lao động.");
        System.out.println("2. Chỉnh sửa thông tin người cán bộ.");
        System.out.println("3. Xóa cán bộ.");
        System.out.println("4. Hiển thị danh sách cán bộ.");
        System.out.println("5. Xóa toàn bộ dữ liệu.");
        System.out.println("6. Hiển thị chi phí lương của tất cả người lao động trong hệ thống. ");
        System.out.println("7. Cập nhật lương cơ bản.");
        System.out.println("8. Nhập danh sách mã cán bộ subscribe lương cơ bản.");
        System.out.println("9. Thoát chương trình.");
    }

    public void function1(ArrayList<People> pList, ArrayList<Teacher> tList,
                          ArrayList<Labor> lList, ArrayList<Staff> sList) {
        int roleOfOfficial = UtilFunc.enterRoleOfOfficial();
        switch (roleOfOfficial) {
            case 0:
            case 1:
            case 2:
                People p = new People();
                p.insertPeople();
                System.out.println(p.toString());
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
