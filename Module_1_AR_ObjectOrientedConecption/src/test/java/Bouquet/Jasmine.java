package Bouquet;

public class Jasmine implements Flowers{
    private int count=0;

    @Override
    public int getCost() {
        return this.count*JASMINE_COST_PRICE;
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
