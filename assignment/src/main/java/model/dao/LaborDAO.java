package model.dao;

import model.bean.Labor;
import utils.UtilFunc;

import java.util.ArrayList;
import java.util.Scanner;

public class LaborDAO {
    private static final Scanner SCANNER = new Scanner(System.in);

    public Labor insertLabor(int role) {
        Labor labor = new Labor();
        labor.insertPeople();
        labor.setPeopleId("L" + labor.getPeopleId());
        return labor;
    }

    public Labor findLaborByPeopleId(ArrayList<Labor> lList, String peopleId) {
        Labor labor = null;
        for (Labor l : lList) {
            if (l.getPeopleId().equals(peopleId)) {
                labor = l;
                lList.remove(l);
                break;
            }
        }
        return labor;
    }

    public Labor editLabor(Labor labor, ArrayList<Labor> lList) {
        UtilFunc.print("Nhập các thông tin cần chỉnh sửa: ");
        UtilFunc.print("Nhập họ tên: ");
        labor.setFullName(SCANNER.nextLine());
        labor.setYearOfBirth(UtilFunc.enterNumber("Nhập năm sinh: "));
        UtilFunc.print("Nhập quê quán: ");
        labor.setAddress(SCANNER.nextLine());
        labor.setNumberOfWorkdays(UtilFunc.enterNumber("Nhập số ngày làm việc: "));
        labor.setPriceOfWorkday(UtilFunc.enterNumber("Đơn giá: "));
        labor.setSalary(labor.getNumberOfWorkdays() * labor.getPriceOfWorkday());

        lList.add(labor);

        return labor;
    }

    public boolean addLaborIntoList(Labor labor, int k, ArrayList<Labor> list) {
        return true;
    }

    public boolean deleteLabor(Labor labor, ArrayList<Labor> list) {
        return true;
    }

    public void showLaborList(ArrayList<Labor> list) {
    }

    public double calculateOFWage(Labor labor) {
        return 0.0d;
    }

}
