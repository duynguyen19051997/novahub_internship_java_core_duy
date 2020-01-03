package model.dao;

import define.DefineOfficials;
import model.bean.Staff;
import model.bean.Teacher;
import utils.UtilFunc;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffDAO {
    private static final Scanner SCANNER = new Scanner(System.in);

    public Staff insertStaff(int roleOfOfficial) {
        Staff staff = new Staff();
        staff.insertPeople();
        staff.setPeopleId("S" + staff.getPeopleId());
        staff.setAllowance(DefineOfficials.ALLOWANCE_LIST[roleOfOfficial]);
        staff.setSalary(staff.computeSalaryStaff());
        return staff;
    }

    public Staff findStaffByPeopleId(ArrayList<Staff> sList, String peopleId) {
        Staff staff = null;
        for (Staff s : sList) {
            if (s.getPeopleId().equals(peopleId)) {
                staff = s;
                sList.remove(s);
                break;
            }
        }
        return staff;
    }

    public Staff editStaff(Staff staff, ArrayList<Staff> sList) {
        UtilFunc.print("Nhập các thông tin cần chỉnh sửa: ");
        UtilFunc.print("Nhập họ tên: ");
        staff.setFullName(SCANNER.nextLine());
        staff.setYearOfBirth(UtilFunc.enterNumber("Nhập năm sinh: "));
        UtilFunc.print("Nhập quê quán: ");
        staff.setAddress(SCANNER.nextLine());
        staff.setDepartment(UtilFunc.enterNumber("Nhập phòng ban:"));
        staff.setNumberOfWorkdays(UtilFunc.enterNumber("Nhập số ngày công: "));
        staff.setCoefficientsSalary(UtilFunc.enterNumber("Nhập hệ số lương: "));
        staff.setYearOfService(UtilFunc.enterNumber("Số năm làm việc: "));
        staff.setSalary(staff.computeSalaryStaff());

        sList.add(staff);

        return staff;
    }

    public boolean addStaffIntoList(Staff staff, int k, ArrayList<Staff> list) {
        return true;
    }

    public boolean deleteStaff(Staff staff, ArrayList<Staff> list) {
        return true;
    }

    public void showStaffList(ArrayList<Staff> list) {
        if (list.size() <= 0) {
            System.out.println("Danh sách nhân viên rỗng ");
        } else {
            System.out.println("Danh sách thông tin cán bộ giáo viên ");
            System.out.println("STT \t Tên \t Năm sinh \t Quê quán \t Loại \t Phòng ban \t Chức vụ " +
                    " \t Phụ cấp \t Số ngày công \t Hệ số lương");
            for (Staff s : list) {
                System.out.println(s.getPeopleId() + " \t " + s.getFullName()
                        + " \t " + s.getYearOfBirth() + " \t " + s.getAddress() + " \t " +
                        "NV"
                        + " \t " + s.getDepartment()
                        + " \t " + DefineOfficials.OFFICIALS_LIST[s.getPosition()]
                        + " \t " + s.getAllowance()
                        + " \t " + s.getNumberOfWorkdays()
                        + " \t " + s.getCoefficientsSalary());
            }
        }
    }

    public double calculateOFWage(Staff staff) {
        return 0.0d;
    }

}
