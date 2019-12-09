package JavaEncapsulation;

public class EncapTest {
    private String name;
    private String numId;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EncapTest(String name, String numId, int age) {
        this.name = name;
        this.numId = numId;
        this.age = age;
    }

    public EncapTest() {
    }
}
