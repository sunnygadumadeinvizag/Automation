package HT1_LambdaExpressionAssignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingByNameUsingComparator {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Prince", "Amit", "Ayas", "Priyanka", "Ishan", "Naman");


        //sorting in reverse order without lambda
        System.out.println("without lambda");
        stringList.sort(Comparator.naturalOrder());
        System.out.println(stringList);

        //sorting with lambda
        stringList.stream().sorted(Comparator.naturalOrder()).forEach(a -> System.out.println(a));
    }
}
