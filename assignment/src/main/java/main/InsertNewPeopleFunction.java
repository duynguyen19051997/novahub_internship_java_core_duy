package main;

import define.DefineOfficials;
import model.bean.Labor;
import model.bean.People;
import model.bean.Staff;
import model.bean.Teacher;
import model.dao.PeopleDAO;
import utils.UtilFunc;

import java.util.ArrayList;

public class InsertNewPeopleFunction {

    public static void showMenuFun1() {
        System.out.println("========================Menu==========================================");
        System.out.println("1.1. Thêm cán bộ vào cuối danh sách ");
        System.out.println("1.2. Thêm cán bộ vào đầu danh sách ");
        System.out.println("1.3. Thêm cán bộ vào sau vị trí thứ k.");
        System.out.println("1.4. Thêm mới cán bộ vào cuối danh sách từ file staileff.txt");
        System.out.println("1.5. Thêm mới lao động thời vụ danh sách từ file staff.txt");
        System.out.println("1.6.Quay lại mục trước.");
        System.out.println("========================Menu==========================================");
    }

    public static void function1(ArrayList<People> pList, ArrayList<Teacher> tList,
                                 ArrayList<Labor> lList, ArrayList<Staff> sList) {
        int roleOfOfficial = UtilFunc.enterRoleOfOfficial();
        Teacher teacher = null;
        Labor labor = null;
        Staff staff = null;
        People people = null;
        PeopleDAO peopleDAO = new PeopleDAO();
        if (roleOfOfficial <= DefineOfficials.DOCTOR) {
            teacher = new Teacher();
            teacher.insertPeople();
            teacher.setPeopleId("T" + teacher.getPeopleId());
            teacher.setLevel(roleOfOfficial);
            teacher.setAllowance(DefineOfficials.ALLOWANCE_LIST[roleOfOfficial]);
            teacher.setSalary(teacher.computeSalaryTeacher());
            tList.add(teacher);
            people = teacher;
            System.out.println(teacher.toString());
        } else if (roleOfOfficial == 6) {
            labor = new Labor();
            labor.insertPeople();
            labor.setPeopleId("L" + labor.getPeopleId());
            lList.add(labor);
            people = labor;
            System.out.println(labor.toString());
        } else {
            staff = new Staff();
            staff.insertPeople();
            staff.setPeopleId("S" + staff.getPeopleId());
            staff.setAllowance(DefineOfficials.ALLOWANCE_LIST[roleOfOfficial]);
            staff.setSalary(staff.computeSalaryStaff());
            sList.add(staff);
            people = staff;
            System.out.println(staff.toString());
        }
        showMenuFun1();
        int number = UtilFunc.enterFunction(6);
        switch (number) {
            case 2:
                peopleDAO.addPeopleIntoList(people,0, pList);
                for (People p : pList) {
                    System.out.println(p.toString());
                }

                for (Teacher t : tList) {
                    System.out.println(t.toString());
                }
                break;
            case 6:
                FunctionMenu.functionDemo(pList, tList, lList, sList);
                break;
        }
    }

}
