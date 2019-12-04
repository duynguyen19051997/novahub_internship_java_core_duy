package week_1;

public class SportTest {
    public static void main(String[] args) {
        Sport sport = new Sport();
        sport.type = Sport.SportType.football;
        System.out.println("Sport is " + sport.type);
    }
}
