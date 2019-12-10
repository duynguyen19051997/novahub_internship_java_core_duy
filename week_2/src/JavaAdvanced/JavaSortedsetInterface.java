package JavaAdvanced;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaSortedsetInterface {
    public static void main(String[] args) {
        // Create the sorted set
        SortedSet set = new TreeSet();

        // Add elements to the set
        set.add("b");
        set.add("c");
        set.add("a");

        System.out.println(set);

        // Iterating over the elements in the set
        Iterator it = set.iterator();

        while (it.hasNext()) {
            // Get element
            Object element = it.next();
            System.out.println(element.toString());
        }
    }
}
