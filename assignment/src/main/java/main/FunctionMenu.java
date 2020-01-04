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
                EditPeopleFunction.function2(pList, tList, lList, sList);
                break;
            case 3:
                DeletePeopleFunction.function3(pList, tList, lList, sList);
                break;
            case 4:
                ShowPeopleListFunction.function4(pList, tList, lList, sList);
                break;
            case 5:
                DeleteAllPeopleFunction.function5(pList, tList, lList, sList);
                break;
            case 6:
                ShowPeopleListBySalaryFunction.function6(pList);
                break;
            case 7:
                UpdateNewBasicSalaryFunction.function7(pList, tList, lList, sList);
                break;
            case 8:
                break;
            case 9:
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

}
