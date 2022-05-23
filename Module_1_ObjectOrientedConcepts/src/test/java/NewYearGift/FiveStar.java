package NewYearGift;

public class FiveStar implements Chocolates {
    private int fiveStarCount;
    private double fiveStarCost;

    @Override
    public double costOfChocolate(double fiveStarCost, int fiveStarCount) {

        return fiveStarCost * fiveStarCount;
    }

    @Override
    public double getCost() {

        return fiveStarCost;
    }

    public void setCost(double fiveStarCost) {
        this.fiveStarCost = fiveStarCost;
    }

    @Override
    public int getCount() {

        return fiveStarCount;
    }

    public void setCount(int fiveStarCount) {
        this.fiveStarCount = fiveStarCount;
    }

}
