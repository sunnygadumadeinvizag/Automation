package HT1_LambdaExpressionAssignment;

import java.util.*;

public class TreeMapEmployeeSortingByName {


    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Prince", 31);
        map.put("Ishan", 28);
        map.put("Manik", 29);
        map.put("Naman", 30);
        map.put("Dinesh", 33);


        TreeSet<String> keys = new TreeSet<>(map.keySet());
        Iterator iterator = keys.descendingIterator();

        System.out.println("without lambda");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("with lambda");
        keys.stream().sorted(Comparator.reverseOrder()).forEach(a -> System.out.println(a));


    }


}

