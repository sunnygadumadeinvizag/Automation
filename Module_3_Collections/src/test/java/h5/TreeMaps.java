package h5;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMaps {

    Map<String, String> map1 = new TreeMap<String, String>();

    public boolean getIsTwithinRange(int t) {
        boolean tFlag = false;
        int minT = 1;
        int maxT = 100;

        if (t >= minT && t <= maxT) {
            tFlag = true;
        }
        return tFlag;
    }

    public boolean getIsQwithinRange(int q) {
        boolean qFlag = false;
        int minQ = 1;
        int maxQ = 100;

        if (q >= minQ && q <= maxQ) {
            qFlag = true;
        }
        return qFlag;
    }

    public void aQuery(String x, String y) {
        map1.put(x, y);
    }

    public void bQuery(String x) {
        if (map1.containsKey(x)) {
            System.out.print(map1.get(x) + " ");
        } else {
            System.out.print("-1 ");
        }
    }

    public void cQuery() {
        System.out.print(map1.size() + " ");
    }

    public void dQuery(String x) {
        if (map1.containsKey(x)) {
            map1.remove(x);

        }
    }

    public void eQuery() {
        for (String treeKey : map1.keySet()) {
            System.out.print(treeKey + " ");
        }
    }

    public void userOperations() {
        try {
            //Declaring variables
            int t, q;
            String query;

            Scanner scan = new Scanner(System.in);
            System.out.println("Please provide test cases :");

            t = scan.nextInt();
            scan.nextLine();
            if (getIsTwithinRange(t) == false) {
                throw new Exception("T is not within range");
            }

            for (int i = 0; i < t; i++) {
                System.out.println();
                System.out.println("Please provide number of queries :");
                q = scan.nextInt();
                scan.nextLine();

                if (getIsQwithinRange(q) == false) {
                    throw new Exception("Q is not within range");
                }
                System.out.println("Please provide query : ");
                query = scan.nextLine();

                String[] queryList = query.split(" ");
                int counter = 0;
                while (counter < queryList.length) {
                    if (queryList[counter].matches("^[A-Za-z]*$")) {
                        switch (queryList[counter].toLowerCase()) {
                            case "a":
                                counter++;
                                String x = queryList[counter];
                                counter++;
                                String y = queryList[counter];
                                aQuery(x, y);
                                counter++;
                                break;

                            case "b":
                                counter++;
                                String z = queryList[counter];
                                bQuery(z);
                                counter++;
                                break;

                            case "c":
                                cQuery();
                                counter++;
                                break;

                            case "d":
                                counter++;
                                String p = queryList[counter];
                                dQuery(p);
                                counter++;

                                break;
                            case "e":
                                eQuery();
                                counter++;
                                break;
                        }
                    }
                }

                map1.clear();
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void main(String[] args) {
        TreeMaps ht = new TreeMaps();
        ht.userOperations();
    }
}

