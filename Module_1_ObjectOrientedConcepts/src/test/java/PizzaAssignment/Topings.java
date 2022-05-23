package PizzaAssignment;

public enum Topings {

    TOMATO(10),
    CORN(20),
    MUSHROOMS(30);

    int cost;


    Topings(int cost) {
        this.cost = cost;

    }

    public int getToppingCost() {
        return cost;
    }
}
