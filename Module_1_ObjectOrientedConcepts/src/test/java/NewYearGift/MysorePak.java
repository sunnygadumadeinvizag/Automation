package NewYearGift;

public class MysorePak implements Sweets {
    private int mysorePakCount;
    private double mysorePakCost;

    @Override
    public double costOfSweets(double mysorePakCost, int mysorePakCount) {
        return mysorePakCost * mysorePakCount;
    }

    @Override
    public double getCost() {

        return mysorePakCost;
    }

    public void setCost(double mysorePakCost) {
        this.mysorePakCost = mysorePakCost;
    }

    @Override
    public int getCount() {

        return mysorePakCount;
    }

    public void setCount(int mysorePakCount) {
        this.mysorePakCount = mysorePakCount;
    }

}
