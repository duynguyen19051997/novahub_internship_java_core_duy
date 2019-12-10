package JavaAdvanced;

import java.util.HashMap;
import java.util.Map;

public class JavaMapInterface {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Anh Duy", "8");
        m1.put("Khanh Linh", "31");
        m1.put("Quang Nam", "12");
        m1.put("Viet Nam", "14");

        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);
    }
}
