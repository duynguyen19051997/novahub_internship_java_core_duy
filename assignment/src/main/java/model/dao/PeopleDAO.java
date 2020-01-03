package model.dao;

import model.bean.People;
import model.bean.Teacher;

import java.util.ArrayList;

public class PeopleDAO {
    public boolean deleteAll(ArrayList<People> list) {
        return true;
    }

    public boolean addPeopleIntoList(People people, int k, ArrayList<People> list) {
        if (k < 0 || k > list.size()) {
            return false;
        }
        list.add(k, people);
        return true;
    }

    public boolean checkPeopleID(ArrayList<People> list, String peopleId) {
        for (People p : list) {
            if (peopleId.equals(p.getPeopleId())) {
                return true;
            }
        }
        return false;
    }

    public void showPeopleList(ArrayList<People> pList) {
        if (pList.size() <= 0) {
            System.out.println("Danh sách rỗng ");
        } else {
            System.out.println("STT \t Tên \t Năm sinh \t Quê quán ");
            for (People p : pList) {
                System.out.println(p.getPeopleId() + " \t " + p.getFullName()
                        + " \t " + p.getYearOfBirth() + " \t " + p.getAddress());
            }
        }
    }
}
