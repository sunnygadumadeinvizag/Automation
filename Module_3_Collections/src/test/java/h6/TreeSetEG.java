package h6;

import java.util.TreeSet;

public class TreeSetEG {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<String>();

        ts.add("hello");
        ts.add("My");
        ts.add("Name");
        ts.add("is");
        ts.add("Ravi");
        ts.add("Prasad");

        System.out.println("Initial TreeSet " + ts);

        ts.remove("Prasad");

        System.out.println("After removing element " + ts);

        ts.pollFirst();

        System.out.println("After removing first " + ts);

        ts.pollLast();

        System.out.println("After removing last " + ts);
    }
}
