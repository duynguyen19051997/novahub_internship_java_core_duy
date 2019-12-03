package week_1;

public class UserTest {
    public static void main(String[] args) {
        User user = new User(10, "duynguyen", "Quang Nam");
        user.setAddress("Da Nang");
        System.out.println(user.getAddress());
    }
}
