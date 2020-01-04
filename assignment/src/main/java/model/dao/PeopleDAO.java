package model.dao;

import define.DefineOfficials;
import model.bean.People;
import model.bean.Staff;
import model.bean.Teacher;

import java.util.ArrayList;
import java.util.Comparator;

public class PeopleDAO {
    private static final TeacherDAO TEACHER_DAO = new TeacherDAO();
    private static final StaffDAO STAFF_DAO = new StaffDAO();

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

    public void showPeople(ArrayList<People> pList) {
        if (pList.size() <= 0) {
            System.out.println("Danh sách rỗng ");
        } else {
            System.out.println("STT \t Tên \t Năm sinh \t Quê quán \t Lương ");
            for (People p : pList) {
                System.out.println(p.getPeopleId() + " \t " + p.getFullName() + " \t "
                        + p.getYearOfBirth() + " \t " + p.getAddress() + " \t " + p.getSalary());
            }
        }
    }

    public void showPeopleList(ArrayList<People> pList, ArrayList<Teacher> tList,
                               ArrayList<Staff> sList) {
        if (pList.size() <= 0) {
            System.out.println("Danh sách rỗng ");
        } else {
            System.out.println("C1-5 nếu là GV: Khoa, trình độ, phụ cấp, số tiết, hệ số lương");
            System.out.println("C1-5 nếu là nhân viên: phòng ban, chức vụ, phụ cấp, số ngày công, hệ số lương");
            System.out.println("STT \t Tên \t Năm sinh \t Quê quán \t Loại \t C1 \t C2 \t C3 \t C4 \t C5");
            for (People p : pList) {
                char id = p.getPeopleId().charAt(0);
                if (id == 'T') {
                    Teacher t = TEACHER_DAO.findTeacherByPeopleId(tList, p.getPeopleId());
                    if (t != null) {
                        System.out.println(t.getPeopleId() + " \t " + t.getFullName()
                                + " \t " + t.getYearOfBirth() + " \t " + t.getAddress() + " \t " +
                                "GV"
                                + " \t " + t.getFaculty()
                                + " \t " + DefineOfficials.OFFICIALS_LIST[t.getLevel()]
                                + " \t " + t.getAllowance()
                                + " \t " + t.getLessionOfMonth()
                                + " \t " + t.getCoefficientsSalary()
                        );
                    }
                } else if (id == 'S') {
                    Staff s = STAFF_DAO.findStaffByPeopleId(sList, p.getPeopleId());
                    if (s != null) {
                        System.out.println(s.getPeopleId() + " \t " + s.getFullName()
                                + " \t " + s.getYearOfBirth() + " \t " + s.getAddress() + " \t " +
                                "NV"
                                + " \t " + s.getDepartment()
                                + " \t " + DefineOfficials.OFFICIALS_LIST[s.getPosition()]
                                + " \t " + s.getAllowance()
                                + " \t " + s.getNumberOfWorkdays()
                                + " \t " + s.getCoefficientsSalary()
                        );
                    }
                }
            }
        }
    }

    public void showPeopleListWithSortABC(ArrayList<People> pList, ArrayList<Teacher> tList,
                                          ArrayList<Staff> sList) {
        ArrayList<People> peopleList = pList;
        peopleList.sort(new Comparator<People>() {
            public int compare(People people1, People people2) {
                return people1.getFullName().compareTo(people2.getFullName());
            }
        });
        System.out.println("Danh sách cán bộ được sắp xếp theo chiều tăng dần bảng chữ cái ");
        showPeopleList(peopleList, tList, sList);
    }

    public void showPeopleListWithSortSalary(ArrayList<People> pList, ArrayList<Teacher> tList, ArrayList<Staff> sList) {
        ArrayList<People> peopleList = pList;
        peopleList.sort(new Comparator<People>() {
            @Override
            public int compare(People people1, People people2) {
                return (Double.compare(people1.getSalary(), people2.getSalary()));
            }
        });
        System.out.println("Danh sách cán bộ được sắp xếp tăng dần theo lương ");
        showPeopleList(peopleList, tList, sList);
    }

    public void searchPeopleByName(ArrayList<People> pList, ArrayList<Teacher> tList, ArrayList<Staff> sList, String search) {
        ArrayList<People> peopleList = new ArrayList<>();
        for (People p : pList) {
            String name = p.getFullName().toLowerCase();
            if (name.contains(search)) {
                peopleList.add(p);
            }
        }
        System.out.println("Kết quả tìm kiếm với từ khóa '" + search + "'");
        showPeopleList(peopleList, tList, sList);
    }

    public void searchPeopleByYearOfBirth(ArrayList<People> pList, ArrayList<Teacher> tList, ArrayList<Staff> sList, int year) {
        ArrayList<People> peopleList = new ArrayList<>();
        for (People p : pList) {
            if (p.getYearOfBirth() == year) {
                peopleList.add(p);
            }
        }
        System.out.println("Kết quả tìm kiếm theo năm sinh " + year + "");
        showPeopleList(peopleList, tList, sList);
    }
}
