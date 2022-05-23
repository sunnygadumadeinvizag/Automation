package h3;

import java.util.HashMap;
import java.util.Scanner;

public class PersonDetails {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HashMap<String, Integer> map = new HashMap<>();    //create an empty hash map

        Scanner sc = new Scanner(System.in);     //Here i will take input from user
        System.out.println("Enter the number please");

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();     //Take name as input form user
            int phoneNum = sc.nextInt();       //take phone number as input from user


            map.put(name, phoneNum);        //store the name and phone no in hashmap
            sc.nextLine();
        }
        System.out.println(map);

        while (sc.hasNext()) {

            String name = sc.nextLine();
            if (map.containsKey(name)) {              //If it contains name ex sam number and name is present or not

                System.out.println(name + "=" + map.get(name));    //to get value of sam
            } else {
                System.out.println("Not Found");
            }
        }

    }
}
