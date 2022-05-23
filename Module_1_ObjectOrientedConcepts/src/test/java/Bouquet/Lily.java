package Bouquet;

public class Lily implements Flowers {

    int lilyCount;
    int lilyCost;

    @Override
    public void flowerCount(int count) {
        // TODO Auto-generated method stub
        lilyCount = count;
    }

    @Override
    public void flowerCost(int cost) {
        // TODO Auto-generated method stub

        lilyCost = cost;
    }

    public int calculateTotalCost() {

        return lilyCost * lilyCount;
    }

}
