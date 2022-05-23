package HT1_LambdaExpressionAssignment;

import java.util.*;

public class ReverseOrderUsingComparator {


    public static void main(String args[]) {
        List<Integer> integerList = Arrays.asList(20, 30, 15, 17, 22, 35);

        //sorting in reverse order without lambda
        integerList.sort(Comparator.reverseOrder());
        System.out.println(integerList);

        //sorting with lambda
        integerList.stream().sorted(Comparator.reverseOrder()).forEach(a -> System.out.println(a));


    }
}
