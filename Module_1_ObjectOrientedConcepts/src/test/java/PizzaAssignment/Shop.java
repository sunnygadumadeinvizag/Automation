package PizzaAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose the pizza base from below options");
        System.out.println("SoftBase Or Standard");
        String pizzabase = s.nextLine();
        System.out.println("Choose the pizza toppings from below options");
        System.out.println("Tomato or Corn or Mushrooms");
        System.out.println("Please enter comma separated values eg:'Tomato,Corn'");
        String toppingsStr = s.nextLine();
        String[] toppings = toppingsStr.trim().split(",");

        System.out.println(Arrays.toString(toppings));

        Pizza p = new Pizza(pizzabase, toppings);
        System.out.println(p.getPizzaCost());


    }
}
