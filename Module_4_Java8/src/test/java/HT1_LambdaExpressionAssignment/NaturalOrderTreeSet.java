package HT1_LambdaExpressionAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NaturalOrderTreeSet {


    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Prince", "Amit", "Ayas", "Priyanka", "Ishan", "Naman");
        Set<String> names = new TreeSet<>(stringList);

        System.out.println("without lambda");
        for (String name : names) {
            System.out.println(name);
        }

        //with lambda
        System.out.println("with lambda");
        names.forEach(a -> System.out.println(a));
    }


}
