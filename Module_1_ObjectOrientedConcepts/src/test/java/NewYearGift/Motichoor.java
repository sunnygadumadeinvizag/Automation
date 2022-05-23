package NewYearGift;

class Motichoor implements Sweets {
    private int motiChoorCount;
    private double motiChoorCost;

    @Override
    public double costOfSweets(double motiChoorCost, int motiChoorCount) {
        return motiChoorCost * motiChoorCount;
    }

    @Override
    public double getCost() {

        return motiChoorCost;
    }

    public void setCost(double motiChoorCost) {
        this.motiChoorCost = motiChoorCost;
    }

    @Override
    public int getCount() {

        return motiChoorCount;
    }

    public void setCount(int motiChoorCount) {
        this.motiChoorCount = motiChoorCount;
    }

}
