package HT1_LambdaExpressionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeesByNameUsingCollections {

    String name;
    int age;

    public SortEmployeesByNameUsingCollections(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SortEmployeesByName{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<SortEmployeesByNameUsingCollections> sortEmployeesByNames = new ArrayList<>();
        sortEmployeesByNames.add(new SortEmployeesByNameUsingCollections(1, "Prince"));
        sortEmployeesByNames.add(new SortEmployeesByNameUsingCollections(2, "Naman"));
        sortEmployeesByNames.add(new SortEmployeesByNameUsingCollections(4, "Ishan"));
        sortEmployeesByNames.add(new SortEmployeesByNameUsingCollections(5, "Manik"));
        sortEmployeesByNames.add(new SortEmployeesByNameUsingCollections(3, "Rahul"));

        System.out.println("without lambda expression");
        Collections.sort(sortEmployeesByNames, new Comparator<SortEmployeesByNameUsingCollections>() {
            @Override
            public int compare(SortEmployeesByNameUsingCollections o1, SortEmployeesByNameUsingCollections o2) {
                return o2.name.compareTo(o1.name);
            }
        });

        for (SortEmployeesByNameUsingCollections sortEmployeesByName : sortEmployeesByNames) {
            System.out.println(sortEmployeesByName);
        }
        System.out.println("with lambda expression");

//        sortEmployeesByNames.stream().sorted((o1, o2) -> o2.name.compareTo(o1.name)).forEach(a-> System.out.println(a));
        sortEmployeesByNames.stream().sorted((o1, o2) -> {
            if (o2.age > o1.age) {
                return 1;
            } else if (o1.age > o2.age) {
                return -1;
            } else {
                return 0;
            }
        }).forEach(a -> System.out.println(a));

    }
}
