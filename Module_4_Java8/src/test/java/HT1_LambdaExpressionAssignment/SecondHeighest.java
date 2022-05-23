package HT1_LambdaExpressionAssignment;

import java.util.*;

public class SecondHeighest {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(
                Arrays.asList(2, 3, 10, 12, 20, 15, 18, 21));
        int n = 2;

        //without lambda
        Collections.sort(integerList);
        System.out.println(integerList.get(integerList.size() - n));

        //with lambda
        Optional<Integer> max = integerList.stream().sorted(Comparator.reverseOrder()).limit(n).skip(n - 1).findFirst();
        System.out.println(max);

    }
}
