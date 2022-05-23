package h6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListEG {

    public static void main(String[] args) {
        String str = "hello";
        char[] c = str.toCharArray();


        for (int i = 0; i <= c.length - 1; i++)
            System.out.print(c[i]);
        ArrayList<Character> al = new ArrayList<Character>();
        for (Character s : c) {
            al.add(s);

        }
        System.out.println();
        Collections.reverse(al);
        ListIterator<Character> li = al.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next());
        }

    }
}
