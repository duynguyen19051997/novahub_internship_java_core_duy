package JavaInheritance;

public class MyCalculation extends Calculation {
    public int myAdd(int x, int y) {
        this.setZ(x + y);
        return this.getZ();
    }

    public static void main(String[] args) {
        MyCalculation mc = new MyCalculation();
        mc.setZ(5);
        System.out.println(mc.getZ());
        System.out.println(mc.sub(4, 5));
        System.out.println(mc.add(1,2));
        System.out.println(mc.myAdd(4,6));
        System.out.println(mc.getZ());
    }
}
