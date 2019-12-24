package main;

import define.DefineOfficials;
import define.DefinesMessage;
import model.bean.Labor;
import model.bean.People;
import model.bean.Staff;
import model.bean.Teacher;
import model.dao.PeopleDAO;
import utils.UtilFunc;

import java.io.*;
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
        boolean message = true;
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
            people = new People(teacher.getPeopleId(), teacher.getFullName(), teacher.getYearOfBirth(),
                    teacher.getAddress());
            if (!peopleDAO.checkPeopleID(pList, people.getPeopleId())) {
                tList.add(teacher);
            }
            System.out.println(teacher.toString());
        } else if (roleOfOfficial == 6) {
            labor = new Labor();
            labor.insertPeople();
            labor.setPeopleId("L" + labor.getPeopleId());
            people = new People(labor.getPeopleId(), labor.getFullName(), labor.getYearOfBirth(),
                    labor.getAddress());
            if (!peopleDAO.checkPeopleID(pList, people.getPeopleId())) {
                lList.add(labor);
            }
            System.out.println(labor.toString());
        } else {
            staff = new Staff();
            staff.insertPeople();
            staff.setPeopleId("S" + staff.getPeopleId());
            staff.setAllowance(DefineOfficials.ALLOWANCE_LIST[roleOfOfficial]);
            staff.setSalary(staff.computeSalaryStaff());
            people = new People(staff.getPeopleId(), staff.getFullName(), staff.getYearOfBirth(),
                    staff.getAddress());
            if (!peopleDAO.checkPeopleID(pList, people.getPeopleId())) {
                sList.add(staff);
            }
            System.out.println(staff.toString());
        }
        showMenuFun1();
        int number = UtilFunc.enterFunction(6, "Vui lòng chọn chức năng: ");
        switch (number) {
            case 1:
                if (peopleDAO.checkPeopleID(pList, people.getPeopleId())) {
                    System.err.println(DefinesMessage.ID_ERROR_MESSAGE);
                    break;
                }
                message = peopleDAO.addPeopleIntoList(people, pList.size(), pList);
                if (message) {
                    System.err.println(DefinesMessage.SUCCESS_MESSAGE);
                } else {
                    System.err.println(DefinesMessage.LOSE_MESSAGE);
                }
                break;
            case 2:
                if (peopleDAO.checkPeopleID(pList, people.getPeopleId())) {
                    System.err.println(DefinesMessage.ID_ERROR_MESSAGE);
                    break;
                }
                message = peopleDAO.addPeopleIntoList(people, 0, pList);
                if (message) {
                    System.err.println(DefinesMessage.SUCCESS_MESSAGE);
                } else {
                    System.err.println(DefinesMessage.LOSE_MESSAGE);
                }
                break;
            case 3:
                if (peopleDAO.checkPeopleID(pList, people.getPeopleId())) {
                    System.err.println(DefinesMessage.ID_ERROR_MESSAGE);
                    break;
                }
                int index = UtilFunc.enterFunction(pList.size(), "Nhập vị trí bạn muốn thêm vào (<= "
                        + pList.size() + "): ");
                message = peopleDAO.addPeopleIntoList(people, index, pList);
                if (message) {
                    System.err.println(DefinesMessage.SUCCESS_MESSAGE);
                } else {
                    System.err.println(DefinesMessage.LOSE_MESSAGE);
                }
                break;
            case 4:
                try {
                    File file = new File("staff.txt");
                    FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    ArrayList<Staff> staffList = (ArrayList<Staff>) ois.readObject();
                    for (Staff s : staffList) {
                        if (!peopleDAO.checkPeopleID(pList, s.getPeopleId())) {
                            sList.add(s);
                            if (peopleDAO.addPeopleIntoList(people, pList.size(), pList)) {
                                System.err.println(DefinesMessage.SUCCESS_MESSAGE);
                            } else {
                                System.err.println(DefinesMessage.LOSE_MESSAGE);
                            }
                        }
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
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
