package PizzaAssignment;

public class Pizza {

    private String pizzaBase;
    private String[] toppings;

    Pizza(String pizzaBase, String[] toppings) {

        this.pizzaBase = pizzaBase;
        this.toppings = toppings;

    }

    private int calculateToppingsCost() {
        int cost = 0;
        for (String topping : toppings) {
            System.out.println(topping.toLowerCase().trim());
            switch (topping.toLowerCase().trim()) {

                case "tomato":
                    cost += Topings.TOMATO.getToppingCost();
                    break;
                case "corn":
                    cost += Topings.CORN.getToppingCost();
                    break;
                case "mushrooms":
                    cost += Topings.MUSHROOMS.getToppingCost();

                    break;
                default:
                    System.out.println("Toppings not available");
            }
        }
        return cost;
    }

    private int getBaseCost() {

        if (pizzaBase.equalsIgnoreCase("standard")) {
            return PizzaBase.STANDARD.getBaseCost();
        } else if (pizzaBase.equalsIgnoreCase("softbase")) {
            return PizzaBase.SOFTBASE.getBaseCost();
        } else {
            System.out.println("Base not available");
            return 0;
        }
    }

    public int getPizzaCost() {
        System.out.println(getBaseCost());
        System.out.println(calculateToppingsCost());
        return getBaseCost() + calculateToppingsCost();
    }
}



