package javaSpoint;

import other.Animals;

public class JavaPacket implements Animals {
    public static void main(String[] args) {
        JavaPacket javaPacket = new JavaPacket();
        javaPacket.eat();
        System.out.println(javaPacket.insert());
    }

    @Override
    public void eat() {
        System.out.println("Java Packet");
    }

    @Override
    public String insert() {
        return "Nguyen Vu Anh Duy";
    }
}
