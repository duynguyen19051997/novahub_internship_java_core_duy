package model.dao;

import model.bean.Labor;
import model.bean.Staff;

import java.util.ArrayList;

public class StaffDAO {
    public boolean addStaffIntoList(Staff staff, int k, ArrayList<Staff> list) {
        return true;
    }

    public boolean editStaff(Staff newStaff, int k, ArrayList<Staff> list) {
        return true;
    }

    public boolean deleteStaff(Staff staff, ArrayList<Staff> list) {
        return true;
    }

    public void showStaffList(ArrayList<Staff> list) {
    }

    public double calculateOFWage(Staff staff) {
        return 0.0d;
    }
}
