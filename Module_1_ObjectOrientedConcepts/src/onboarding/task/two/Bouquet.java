package onboarding.task.two;

import java.util.HashMap;

public class Bouquet {
    private int costPrice = 0;
    private HashMap<String, Integer> addedFlowers = new HashMap<>();

    public void addFlowersToBouquet(String flowerType, int flowerCount) {
        addedFlowers.put(flowerType, addedFlowers.get(flowerType) == null ? flowerCount : (addedFlowers.get(flowerType) + flowerCount));
    }

    public int costOfBouquet() {
        addedFlowers.forEach((k, v) -> {
            this.costPrice = this.costPrice + Flowers.flowerType.get(k) * v;
        });
        return this.costPrice;
    }
}
