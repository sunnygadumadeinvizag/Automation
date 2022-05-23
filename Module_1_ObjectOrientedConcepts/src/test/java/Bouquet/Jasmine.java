package Bouquet;

public class Jasmine implements Flowers {
    int jasmineCount;
    int jasmineCost;

    @Override
    public void flowerCount(int count) {
        // TODO Auto-generated method stub
        jasmineCount = count;
    }

    @Override
    public void flowerCost(int cost) {
        jasmineCost = cost;
    }

    public int calculateTotalCost() {

        return jasmineCost * jasmineCount;
    }
}
