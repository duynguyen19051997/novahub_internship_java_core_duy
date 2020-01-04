package define;

public class DefineOfficials {
    public static final int BACHELOR = 0;
    public static final int MASTER = 1;
    public static final int DOCTOR = 2;
    public static final int MANAGER = 3;
    public static final int DEPUTY_HEAD = 4;
    public static final int STAFF = 5;
    public static final int LABOR = 6;

    public int BASIC_SALARY = 200;

    public static final String[] OFFICIALS_LIST = {"Bachelor", "Master", "Doctor", "Manager",
            "Deputy Head", "Staff", "Labor"};
    public int[] ALLOWANCE_LIST = {300, 900, 2000, 1000, 600, 400};

    public void updateNewBasicSalary(int newBasicSalary) {
        this.BASIC_SALARY = newBasicSalary;
    }

    public static boolean updateAllowanceList(int k, int[] ALLOWANCE_LIST) {
        return true;
    }
}
