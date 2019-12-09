package JavaInterface;

public class MammalInt implements Animal {
    @Override
    public void eat() {
        System.out.println("Mamal eats");
    }

    @Override
    public void travel() {
        System.out.println("Mamal travels");
    }

    @Override
    public void ply(String name) {
        System.out.println("Mamal " + name);
    }

    public void work() {
        System.out.println("Mamal works");
    }

    public static void main(String[] args) {
        MammalInt mm = new MammalInt();
        mm.eat();
        mm.travel();
        mm.work();
        mm.ply("Anh Duy");
    }

}
