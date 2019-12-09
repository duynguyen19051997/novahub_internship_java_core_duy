package JavaEncapsulation;

public class RunEncap {
    public static void main(String args[]) {
        EncapTest encap = new EncapTest();
        encap.setName("Anh Duy");
        encap.setAge(20);
        encap.setNumId("123456");

        System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
    }
}
