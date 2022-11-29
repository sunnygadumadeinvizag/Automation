package Pizza;

public class Soft implements PizzaBases{

    private int count;

    @Override
    public int getCost() {
        return PizzaBasePrices.PIZZA_BASE_SOFT_COST_PRICE;
    }

}
