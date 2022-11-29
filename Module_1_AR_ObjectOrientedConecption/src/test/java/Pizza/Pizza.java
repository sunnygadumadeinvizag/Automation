package Pizza;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pizza {
    private int costPrice = 0;
    private PizzaBases PizzaBase;

    private List<Toppings> addedToppings = new ArrayList<Toppings>();

    Pizza(PizzaBases PizzaBase){
        this.PizzaBase=PizzaBase;
    }

    public void addToppingsToPizza(Toppings toppings) {
        addedToppings.add(toppings);
    }

    public int costOfPizza() {
        this.costPrice = 0;
        addedToppings.forEach((k) -> {
            this.costPrice = this.costPrice + k.getCost() ;
        });
        this.costPrice=this.PizzaBase.getCost()+this.costPrice;
        return this.costPrice;
    }
}
