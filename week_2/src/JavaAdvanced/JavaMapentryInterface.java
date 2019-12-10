package JavaAdvanced;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JavaMapentryInterface {
    public static void main(String args[]) throws NullPointerException {
        // Create a hash map
        HashMap<String, Double> hm = new HashMap<String, Double>();

        // Put elements to the map
        hm.put("Anh Duy", 3434.34);
        hm.put("Dinh Long", 123.22);
        hm.put("Minh Hieu", 1378.00);
        hm.put("Quang Linh", 99.22);
        hm.put("Bao Tuyen", -19.08);

        // Get a set of the entries
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        // Get an iterator
        Iterator<Map.Entry<String, Double>> i = set.iterator();

        // Display elements
        while (i.hasNext()) {
            Map.Entry<String, Double> me = i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hm.get("Duy Nguyen");
        hm.put("Duy Nguyen", balance + 1000);
        System.out.println("Duy Nguyen's new balance: " + hm.get("Duy Nguyen"));
    }
}
