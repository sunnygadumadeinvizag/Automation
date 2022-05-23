package NewYearGift;

public class Perk implements Chocolates {
    private int perkCount;
    private double perkCost;

    @Override
    public double costOfChocolate(double perkCost, int perkCount) {

        return perkCount * perkCost;
    }

    @Override
    public double getCost() {

        return perkCost;
    }

    public void setCost(double perkCost) {
        this.perkCost = perkCost;
    }

    @Override
    public int getCount() {

        return perkCount;
    }

    public void setCount(int perkCount) {
        this.perkCount = perkCount;
    }

}
