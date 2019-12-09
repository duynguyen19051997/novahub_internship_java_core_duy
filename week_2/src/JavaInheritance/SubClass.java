package JavaInheritance;

public class SubClass extends SuperClass {
    int num = 10;

    // display method of sub class
    public void display() {
        System.out.println("This is the display method of subclass");
    }

    public SubClass(int num) {
        super(num);
    }

    public SubClass() {
    }

    public void my_method() {
        // Instantiating subclass
        SubClass sub = new SubClass();

        // Invoking the display() method of sub class
        sub.display();

        // Invoking the display() method of superclass
        super.display();

        // printing the value of variable num of subclass
        System.out.println("value of the variable named num in sub class:" + sub.num);

        // printing the value of variable num of superclass
        System.out.println("value of the variable named num in super class:" + super.num);
    }

    public static void main(String args[]) {
        SubClass obj = new SubClass(25);
        obj.my_method();
    }
}
