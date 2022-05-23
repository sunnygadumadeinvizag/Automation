package Bouquet;

public class Rose implements Flowers {

    int roseCount;
    int roseCost;

    @Override
    public void flowerCount(int count) {
        // TODO Auto-generated method stub
        roseCount = count;
    }

    @Override
    public void flowerCost(int cost) {
        // TODO Auto-generated method stub
        roseCost = cost;
    }

    public int calculateTotalCost() {
        return roseCost * roseCount;
    }

}
