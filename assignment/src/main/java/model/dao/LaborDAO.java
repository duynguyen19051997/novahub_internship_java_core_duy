package model.dao;

import model.bean.Labor;

import java.util.ArrayList;

public class LaborDAO {
    public Labor insertLabor(int role) {
        Labor labor = new Labor();
        labor.insertPeople();
        labor.setPeopleId("L" + labor.getPeopleId());
        return labor;
    }

    public boolean addLaborIntoList(Labor labor, int k, ArrayList<Labor> list) {
        return true;
    }

    public boolean editLabor(Labor newLabor, int k, ArrayList<Labor> list) {
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
