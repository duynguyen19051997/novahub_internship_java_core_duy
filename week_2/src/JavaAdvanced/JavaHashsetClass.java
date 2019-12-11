package JavaAdvanced;

import java.util.HashSet;

public class JavaHashsetClass {
    public static void main(String[] args) {
        // create a hash set
        HashSet<String> hs = new HashSet();

        // add elements to the hash set
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        System.out.println(hs);
    }
}
