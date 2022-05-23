package HT1_LambdaExpressionAssignment;

import HT1_LambdaExpressionAssignment.Utilities.TreeMapReverseOrderSortingInterface;

import java.util.*;

public class TreeMapDescendingOrderSortByValues {

    public static void sortByValueWithoutLambda(TreeMap<Integer, String> integerStringTreeMap) {
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(integerStringTreeMap.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Map.Entry<Integer, String> entry1 : entryList) {
            System.out.println(entry1);
        }


    }

    public static void sortByValueWithLambda(TreeMap<Integer, String> integerStringTreeMap) {


        TreeMapReverseOrderSortingInterface sortingInterface = (map) -> {
            List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());

            Collections.sort(entryList, new Comparator<Map.Entry<Integer, String>>() {
                @Override
                public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });

            for (Map.Entry<Integer, String> entry1 : entryList) {
                System.out.println(entry1);
            }
        };

        sortingInterface.sortMapByValue(integerStringTreeMap);
    }

    public static void main(String[] args) {
        TreeMap<Integer, String> integerStringTreeMap = new TreeMap<>();
        integerStringTreeMap.put(1, "Prince");
        integerStringTreeMap.put(2, "Naman");
        integerStringTreeMap.put(4, "Ishan");
        integerStringTreeMap.put(5, "Manik");
        integerStringTreeMap.put(3, "Rahul");

        System.out.println("without lambda");
        sortByValueWithoutLambda(integerStringTreeMap);

        System.out.println("with lambda");
        sortByValueWithLambda(integerStringTreeMap);
    }
}
