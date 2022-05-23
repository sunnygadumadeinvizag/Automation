package HT1_LambdaExpressionAssignment;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ReverseOrderTreeSet {

    public static void main(String[] args) {
        TreeSet<Integer> integerSet = new TreeSet<>();
        integerSet.add(2);
        integerSet.add(10);
        integerSet.add(8);
        integerSet.add(12);
        integerSet.add(20);
        integerSet.add(15);

        System.out.println("without lambda");
        Iterator<Integer> iterator = integerSet.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("================");
        System.out.println("with lambda");

        integerSet.stream().sorted(Comparator.reverseOrder()).forEach(a -> System.out.println(a));


    }
}
