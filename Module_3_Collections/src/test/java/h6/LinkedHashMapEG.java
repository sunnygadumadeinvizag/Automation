package h6;


import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapEG {
    public static void main(String args[]) {
        // HashMap Declaration
        LinkedHashMap<Integer, String> lhmap =
                new LinkedHashMap<Integer, String>();

        //Adding elements to LinkedHashMap
        lhmap.put(22, "Abey");
        lhmap.put(33, "Dawn");
        lhmap.put(1, "Sherry");
        lhmap.put(2, "Karon");
        lhmap.put(100, "Jim");

        System.out.println(lhmap.containsKey(100));
        System.out.println(lhmap.containsValue("JIM"));
        System.out.println(lhmap);
        for (Map.Entry<Integer, String> m : lhmap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        Iterator<Map.Entry<Integer, String>> m = lhmap.entrySet().iterator();
        while (m.hasNext()) {

            Entry<Integer, String> c = m.next();
            System.out.println(c.getKey() + " " + c.getValue());

        }
    }
}
