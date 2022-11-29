package Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaShop {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Pizzas to order:");
        int noOfPizzas = sc.nextInt();
        sc.nextLine();
        List<Pizza> pizzas = new ArrayList<>();
        int totalCostPrice = 0;
        int i = 1;
        while (i <= noOfPizzas) {
            System.out.print("Enter pizza " + (i++) + " base type(Soft-90$/Standard-60$):");
            PizzaBases BasePz=null;
            String pizzaType = sc.nextLine();
            switch (pizzaType){
                case "Soft":
                    BasePz=new Soft();
                    break;
                case "Standard":
                    BasePz=new Standard();
                    break;
            }
            Pizza pz = new Pizza(BasePz);
            while (true) {
                System.out.print("Enter Topping(Tomato-1$/Corn-2$/Mushrooms-3$):");
                String pizzaTopping = sc.nextLine();
                Toppings topping=null;
                switch (pizzaTopping){
                    case "Tomato":
                        topping=new Tomato();
                        break;
                    case "Corn":
                        topping=new Corn();
                        break;
                    case "Mushrooms":
                        topping=new Mushrooms();
                        break;
                }
                System.out.print("How many " + pizzaTopping + " toppings needed?:");
                int toppingCount = sc.nextInt();
                sc.nextLine();
                topping.setCount(toppingCount);
                pz.addToppingsToPizza(topping);
                System.out.print("Want to add new toppings or exit?(add/exit): ");
                String toppingsDecision = sc.nextLine();
                if ((toppingsDecision).equals("exit")) {
                    break;
                }
            }
            pizzas.add(pz);
            System.out.println("Total Cost Price of pizza " + (i - 1) + ":" + pz.costOfPizza() + "$ only.");
            totalCostPrice = totalCostPrice + pz.costOfPizza();
        }
        System.out.println("Total Cost Price of Pizzas:" + totalCostPrice + "$ only.");
    }
}
