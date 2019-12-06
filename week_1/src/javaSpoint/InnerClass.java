package javaSpoint;

public class InnerClass {
    
    private static class Inner_demo {
        public void print() {
            System.out.println("Inner class demo");
        }
    }

    private static void printMethod() {
        class ClassInnerMethod {
            public void print() {
                System.out.println("Class inner method");
            }
        }
        ClassInnerMethod cim = new ClassInnerMethod();
        cim.print();
    }

    public static void main(String[] args) {
        Inner_demo inner = new Inner_demo();
        inner.print();
        printMethod();
    }
}
