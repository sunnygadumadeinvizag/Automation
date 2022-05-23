package PizzaAssignment;

public enum PizzaBase {

    STANDARD(100),
    SOFTBASE(200);

    int cost;


    PizzaBase(int cost) {
        this.cost = cost;

    }

    public int getBaseCost() {
        return cost;
    }
}
