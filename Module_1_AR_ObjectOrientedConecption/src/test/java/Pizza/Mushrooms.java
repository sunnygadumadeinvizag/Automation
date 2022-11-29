package Pizza;

public class Mushrooms implements Toppings{

    private int count;

    @Override
    public int getCost() {
        return getCount()*ToppingPrices.TOPPINGS_MUSHROOMS_COST_PRICE;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public void setCount(int count) {
        this.count=count;
    }
}
