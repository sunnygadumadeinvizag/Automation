package h6;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEG {
    public static void main(String args[]) {
        LinkedHashSet<String> h = new LinkedHashSet<String>();


        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");


        System.out.println(h);
        System.out.println("List contains India or not:" + h.contains("India"));


        h.remove("Australia");
        System.out.println("List after removing Australia:" + h);


        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}


