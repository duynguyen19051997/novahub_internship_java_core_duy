package main;

import model.bean.People;
import model.dao.PeopleDAO;

import java.util.ArrayList;
import java.util.Comparator;

public class ShowPeopleListBySalaryFunction {
    public static void function6(ArrayList<People> pList) {
        ArrayList<People> peopleList = pList;
        PeopleDAO peopleDAO = new PeopleDAO();
        peopleList.sort(new Comparator<People>() {
            @Override
            public int compare(People people1, People people2) {
                return Double.compare(people1.getSalary(), people2.getSalary());
            }
        });
        System.out.println("Danh sách cán bộ hiển thị theo lương ");
        peopleDAO.showPeople(peopleList);
    }
}
