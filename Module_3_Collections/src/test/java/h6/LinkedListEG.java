package h6;

import java.util.*;


public class LinkedListEG {


    public static void main(String args[]) {

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Good morning");
        ll.add("my");
        ll.add("name");
        ll.add("is");
        ll.add("Ravi");
        ll.add(5, "Prasad");
        ll.addLast("bonjour");
        ll.addFirst("bon nuit");


        System.out.println(ll);
        ll.set(0, "Happy");
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}

