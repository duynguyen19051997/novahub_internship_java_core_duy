package main;

import define.DefinesMessage;
import model.bean.Labor;
import model.bean.People;
import model.bean.Staff;
import model.bean.Teacher;

import java.util.ArrayList;

public class DeleteAllPeopleFunction {
    public static void function5(ArrayList<People> pList, ArrayList<Teacher> tList,
                                 ArrayList<Labor> lList, ArrayList<Staff> sList) {
        sList.removeAll(sList);
        tList.removeAll(tList);
        lList.removeAll(lList);
        pList.removeAll(pList);
        System.out.println(DefinesMessage.DELETE_SUCCESS);
    }
}
