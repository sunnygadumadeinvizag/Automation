package Pizza;

public class Standard implements PizzaBases{

    private int count;

    @Override
    public int getCost() {
        return PizzaBasePrices.PIZZA_BASE_STANDARD_COST_PRICE;
    }

}
