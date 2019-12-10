package JavaAdvanced;

import java.util.*;

public class CollectionsInterfaceDemo {
    public static void main(String[] args) {
        /* ArrayList */
        List<String> l1 = new ArrayList<>();
        l1.add("Duy Nguyen");
        l1.add("Khanh Linh");
        l1.add("Novahup");
        System.out.print("List: ");
        System.out.println(l1);
        System.out.println(l1.hashCode());

        /* LinkedList */
        List<String> l2 = new LinkedList<>();
        l2.add("Anh Duy");
        l2.add("Dai Hoc Back Khoa");
        System.out.println(l2.contains("Anh Duy"));
        System.out.println("LinkedList: " + l2);
        System.out.println(l2.hashCode());

        /* HashSet */
        Set<String> s1 = new HashSet<>();
        s1.add("Do Dang Tuyen");
        System.out.println(s1.size());
        System.out.println(s1.isEmpty());
        System.out.println("Hash Set: " + s1);

        /* HashMap */
        Map m1 = new HashMap();
        m1.put("Anh Duy", 2);
        m1.put("Quang Nam", "A");
        System.out.println(m1);
    }
}
