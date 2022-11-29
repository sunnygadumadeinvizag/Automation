package Pizza;

public class Tomato implements Toppings{

    private int count;

    @Override
    public int getCost() {
        return getCount()*ToppingPrices.TOPPINGS_TOMATO_COST_PRICE;
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
