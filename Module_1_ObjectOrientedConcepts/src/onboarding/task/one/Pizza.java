package onboarding.task.one;

import java.util.HashMap;

public class Pizza {
    private String BaseType;
    private int costPrice = 0;

    public Pizza(String BaseType) {
        this.BaseType = BaseType;
    }

    private HashMap<String, Integer> addedToppings = new HashMap<>();

    public void addToppingsToPizza(String toppingType, int toppingCount) {
        addedToppings.put(toppingType, addedToppings.get(toppingType) == null ? toppingCount : (addedToppings.get(toppingType) + toppingCount));
    }

    public int costOfPizza() {
        this.costPrice = this.costPrice + PizzaBase.pizzaBaseType.get(this.BaseType);
        addedToppings.forEach((k, v) -> {
            this.costPrice = this.costPrice + Toppings.toppingType.get(k) * v;
        });
        return this.costPrice;
    }
}
