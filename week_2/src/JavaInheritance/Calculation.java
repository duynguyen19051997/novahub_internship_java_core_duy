package JavaInheritance;

public class Calculation {
    private int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int add(int x, int y) {
        this.z = x + y;
        return this.z;
    }

    public int sub(int x, int y) {
        this.z = x - y;
        return this.z;
    }

    public Calculation(int z) {
        this.z = z;
    }

    public Calculation() {
    }
}
