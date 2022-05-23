package h1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        ArrayList[] n = new ArrayList[20000];
        System.out.print("Enter number of lines: ");
        Scanner sc = new Scanner(System.in);
        int linecount = sc.nextInt();
        sc.nextLine();

        List<List<Integer>> lines = new ArrayList<List<Integer>>();
        System.out.println("Enter lines:");
        for (int i = 0; i < linecount; i++) {


            List<Integer> line = new ArrayList<>();
            String[] newline = sc.nextLine().split(" ");
            for (String str : newline) {
                line.add(Integer.parseInt(str));
            }
            lines.add(line);
        }
        System.out.print("Enter number of  queries: ");
        int querycount = sc.nextInt();
        sc.nextLine();

        List<List<Integer>> queries = new ArrayList<List<Integer>>();
        System.out.println("Enter queries:");
        for (int i = 0; i < querycount; i++) {

            List<Integer> query = new ArrayList<>();
            String[] newquery = sc.nextLine().split(" ");
            for (String str : newquery) {
                query.add(Integer.parseInt(str));
            }

            queries.add(query);
        }

        System.out.println("Final Result:");
        for (List ls : queries) {
            try {
                System.out.println(ls.get(0) + " " + ls.get(1) + " = " + (lines.get((Integer) ls.get(0) - 1).get((Integer) ls.get(1))));
            } catch (Exception ie) {
                System.out.println("Error!");
            }
        }
    }

}

